import exel.Str;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.io.IOException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static ArrayList<Str> allStr = new ArrayList<>();
    public static ArrayList<Long> dbHave = new ArrayList<>();
    private static SessionFactory sessionFactory;

    public static void main(String[] args) throws InterruptedException, IOException {

        if (args.length < 2) {
            System.out.println("Укажите DateFrom и DateTo");
            System.exit(0);
        }

        String dateFrom = args[0];
        String dateTo = args[1];

        Pattern pattern = Pattern.compile("^\\d{4}-\\d{2}-\\d{2}$");
        Matcher matcherFrom = pattern.matcher(dateFrom);
        Matcher matcherTo = pattern.matcher(dateTo);
        if (!matcherFrom.find() | !matcherTo.find()) {
            System.out.println("даты должны быть указаны в формате YYYY-MM-DD");
            System.exit(0);
        }

//        args = new String[]{"2022-12-20", "2022-12-30", "/Users/andrey/Documents/exel/"};

        Properties prop = new Properties();

        prop.setProperty("hibernate.driver_class", "org.postgresql.Driver");
        prop.setProperty("hibernate.connection.url", "jdbc:postgresql://localhost:5432/envylab_wb");
        prop.setProperty("hibernate.connection.username", "[password]");
        prop.setProperty("hibernate.connection.password", "");
        prop.setProperty("dialect", "org.hibernate.dialect.PostgresSQL");
        prop.setProperty("hibernate.connection.driver_class", "org.postgresql.Driver");
        prop.setProperty("hibernate.current_session_context_class", "thread");
        prop.setProperty("hibernate.hbm2ddl.auto", "update");

        Configuration configuration = new Configuration().addAnnotatedClass(Str.class);

        SessionFactory sessionFactory = configuration.addProperties(prop).buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();

        allStr = GetToWb.start(args);

        int i = 0;
        try {
            Transaction transaction = session.beginTransaction();
            Query query = session.createQuery("select rrd_id from Str s where s.rr_dt > '" + args[0] + "' and s.rr_dt < '" + args[1] + " 03:00:01'");
            dbHave.addAll(query.list());
            session.clear();
            for (Str str : allStr) {
                if (!dbHave.contains(str.getRrd_id())) {
                    session.persist(str);
                    i++;
                }
            }
            transaction.commit();
        } finally {
            session.close();
            sessionFactory.close();
        }
        System.out.println("Добавлено в базу: " + i + " строк");
        System.out.println("Запрос: ");
        System.out.println("SELECT * FROM str WHERE rr_dt > '" + args[0] + "' AND rr_dt < '" + args[1] + " 03:00:01';");
    }

}
