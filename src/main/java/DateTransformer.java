import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTransformer {
    public static long getMsFromDate(String errorDate) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss,SSS");
        Date date = null;
        try {
            date = sdf.parse(errorDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date.getTime();
    }

    public static String getDateFromMs(Long mSeconds) {
        Date date = new Date(mSeconds);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        sdf.format(date);
        return sdf.format(date);
    }
}
