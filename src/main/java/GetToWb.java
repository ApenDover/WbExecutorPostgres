import com.fasterxml.jackson.databind.ObjectMapper;
import exel.Str;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Properties;

public class GetToWb {
    public static ArrayList<Str> allStr = new ArrayList<>();

    public static ArrayList<Str> start(String args[]) {

        FileInputStream fis;
        Properties property = new Properties();
        String key = "";
        GetToWb g = new GetToWb();
        try {
            String propFileName = "application.properties";
            InputStream inputStream = GetToWb.class.getClassLoader().getResourceAsStream(propFileName);
            property.load(inputStream);
            key = property.getProperty("key");
        } catch (Exception e) {
            System.out.println("prop ERROR: " + e.getMessage());
        }
//            key = "MmQ2M2M1M2ItM2ZjZC00ODBlLTk3MzEtNWZhMjIyMmYwN2Rl";

//        if (args.length < 3) {
//            System.out.println("Укажите DateFrom, DateTo, а также путь папки, в которую сохранить файл");
//            System.exit(0);
//        }
//
//        String dateFrom = args[0];
//        String dateTo = args[1];
//        String path = args[2];
//
//        File file = new File(path);
//        if (!file.exists()) {
//            System.out.println("Указанной папки для сохранения exel не существует");
//            System.exit(0);
//        }

//        Pattern pattern = Pattern.compile("^\\d{4}-\\d{2}-\\d{2}$");
//        Matcher matcherFrom = pattern.matcher(dateFrom);
//        Matcher matcherTo = pattern.matcher(dateTo);
//        if (!matcherFrom.find() | !matcherTo.find()) {
//            System.out.println("даты должны быть указаны в формате YYYY-MM-DD");
//            System.exit(0);
//        }

//        ArrayList<String> headersName = new ArrayList<>();

        int count = 100000;
        String urlString = "https://suppliers-stats.wildberries.ru/api/v1/supplier/reportDetailByPeriod?dateFrom=" + args[0] + "&key=" + key + "&limit=" + count + "&rrdid=0&dateto=" + args[1];
        String result = null;
        try {
            System.out.println("Жду от сервера строки в пределах 100.000 шт.");
            result = SendGetRequest.getHTML(urlString);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

//        String result = "[{\"realizationreport_id\":21099597,\"date_from\":\"2022-12-05T00:00:00Z\",\"date_to\":\"2022-12-11T00:00:00Z\",\"create_dt\":\"2022-12-12T04:58:49Z\",\"suppliercontract_code\":null,\"rrd_id\":9685348357,\"gi_id\":8555890,\"subject_name\":\"Рубашки\",\"nm_id\":6478493,\"brand_name\":\"Envy Lab\",\"sa_name\":\"R42/Черный\",\"ts_name\":\"L\",\"barcode\":\"102*341615*0\",\"doc_type_name\":\"Продажа\",\"quantity\":1,\"retail_price\":5850,\"retail_amount\":1677.95,\"sale_percent\":59,\"commission_percent\":0.23,\"office_name\":\"Электросталь\",\"supplier_oper_name\":\"Продажа\",\"order_dt\":\"2022-12-05T00:00:00Z\",\"sale_dt\":\"2022-12-11T00:00:00Z\",\"rr_dt\":\"2022-12-11T00:00:00Z\",\"shk_id\":6929612566,\"retail_price_withdisc_rub\":2398.5,\"delivery_amount\":0,\"return_amount\":0,\"delivery_rub\":0,\"gi_box_type_name\":\"Без коробов\",\"product_discount_for_report\":59,\"supplier_promo\":0,\"rid\":601194694154,\"ppvz_spp_prc\":0.2503,\"ppvz_kvw_prc_base\":0.1917,\"ppvz_kvw_prc\":-0.0586,\"ppvz_sales_commission\":-140.74,\"ppvz_for_pay\":1846.84,\"ppvz_reward\":0,\"acquiring_fee\":0,\"acquiring_bank\":\"\",\"ppvz_vw\":-140.74,\"ppvz_vw_nds\":-28.15,\"ppvz_office_id\":0,\"ppvz_office_name\":\"Пункт самовывоза (ПВЗ)\",\"ppvz_supplier_id\":0,\"ppvz_supplier_name\":\"\",\"ppvz_inn\":\"\",\"declaration_number\":\"\",\"sticker_id\":\"\",\"site_country\":\"BY\",\"penalty\":0,\"additional_payment\":0,\"srid\":\"83657cd2da5f4e459a0c12e5fd16b355\"},{\"realizationreport_id\":21099597,\"date_from\":\"2022-12-05T00:00:00Z\",\"date_to\":\"2022-12-11T00:00:00Z\",\"create_dt\":\"2022-12-12T04:58:49Z\",\"suppliercontract_code\":null,\"rrd_id\":9685348359,\"gi_id\":8555890,\"subject_name\":\"Платья\",\"nm_id\":13124434,\"brand_name\":\"Envy Lab\",\"sa_name\":\"PR001/белый-бирюзовый\",\"ts_name\":\"(2XL-3XL)\",\"barcode\":\"102*1433955*0\",\"doc_type_name\":\"Продажа\",\"quantity\":0,\"retail_price\":0,\"retail_amount\":0,\"sale_percent\":0,\"commission_percent\":0,\"office_name\":\"Краснодар\",\"supplier_oper_name\":\"Логистика\",\"order_dt\":\"2022-12-11T00:00:00Z\",\"sale_dt\":\"2022-12-11T00:00:00Z\",\"rr_dt\":\"2022-12-11T00:00:00Z\",\"shk_id\":6869258696,\"retail_price_withdisc_rub\":0,\"delivery_amount\":1,\"return_amount\":0,\"delivery_rub\":20,\"gi_box_type_name\":\"Микс\",\"product_discount_for_report\":0,\"supplier_promo\":0,\"rid\":601255889180,\"ppvz_spp_prc\":0,\"ppvz_kvw_prc_base\":0,\"ppvz_kvw_prc\":0,\"ppvz_sales_commission\":0,\"ppvz_for_pay\":0,\"ppvz_reward\":0,\"acquiring_fee\":0,\"acquiring_bank\":\"\",\"ppvz_vw\":0,\"ppvz_vw_nds\":0,\"ppvz_office_id\":0,\"ppvz_office_name\":\"Пункт самовывоза (ПВЗ)\",\"ppvz_supplier_id\":0,\"ppvz_supplier_name\":\"\",\"ppvz_inn\":\"\",\"declaration_number\":\"\",\"sticker_id\":\"\",\"site_country\":\"KZ\",\"penalty\":0,\"additional_payment\":0,\"srid\":\"10.25537754070366182.0.0\"},{\"realizationreport_id\":21099597,\"date_from\":\"2022-12-05T00:00:00Z\",\"date_to\":\"2022-12-11T00:00:00Z\",\"create_dt\":\"2022-12-12T04:58:49Z\",\"suppliercontract_code\":null,\"rrd_id\":9685348410,\"gi_id\":8568020,\"subject_name\":\"Футболки\",\"nm_id\":4118318,\"brand_name\":\"Envy Lab\",\"sa_name\":\"FR01/темно-синий\",\"ts_name\":\"L\",\"barcode\":\"102*301327*0\",\"doc_type_name\":\"Продажа\",\"quantity\":1,\"retail_price\":1890,\"retail_amount\":503.21,\"sale_percent\":63,\"commission_percent\":0.23,\"office_name\":\"Склад Казань\",\"supplier_oper_name\":\"Продажа\",\"order_dt\":\"2022-12-04T00:00:00Z\",\"sale_dt\":\"2022-12-10T00:00:00Z\",\"rr_dt\":\"2022-12-10T00:00:00Z\",\"shk_id\":6883602850,\"retail_price_withdisc_rub\":699.3,\"delivery_amount\":0,\"return_amount\":0,\"delivery_rub\":0,\"gi_box_type_name\":\"Без коробов\",\"product_discount_for_report\":63,\"supplier_promo\":0,\"rid\":601189115701,\"ppvz_spp_prc\":0.2337,\"ppvz_kvw_prc_base\":0.1917,\"ppvz_kvw_prc\":-0.042,\"ppvz_sales_commission\":-29.38,\"ppvz_for_pay\":538.47,\"ppvz_reward\":0,\"acquiring_fee\":0,\"acquiring_bank\":\"\",\"ppvz_vw\":-29.38,\"ppvz_vw_nds\":-5.88,\"ppvz_office_id\":0,\"ppvz_office_name\":\"Пункт самовывоза (ПВЗ)\",\"ppvz_supplier_id\":0,\"ppvz_supplier_name\":\"\",\"ppvz_inn\":\"\",\"declaration_number\":\"\",\"sticker_id\":\"\",\"site_country\":\"BY\",\"penalty\":0,\"additional_payment\":0,\"srid\":\"19411847570069817.0.0\"},{\"realizationreport_id\":21099597,\"date_from\":\"2022-12-05T00:00:00Z\",\"date_to\":\"2022-12-11T00:00:00Z\",\"create_dt\":\"2022-12-12T04:58:49Z\",\"suppliercontract_code\":null,\"rrd_id\":9685348412,\"gi_id\":8568020,\"subject_name\":\"Футболки\",\"nm_id\":78680867,\"brand_name\":\"Envy Lab\",\"sa_name\":\"F03/Хаки\",\"ts_name\":\"M\",\"barcode\":\"102*4584563*0\",\"doc_type_name\":\"Продажа\",\"quantity\":0,\"retail_price\":0,\"retail_amount\":0,\"sale_percent\":0,\"commission_percent\":0,\"office_name\":\"Санкт-Петербург Ш блок 1\",\"supplier_oper_name\":\"Логистика\",\"order_dt\":\"2022-12-10T00:00:00Z\",\"sale_dt\":\"2022-12-10T00:00:00Z\",\"rr_dt\":\"2022-12-10T00:00:00Z\",\"shk_id\":6883602746,\"retail_price_withdisc_rub\":0,\"delivery_amount\":1,\"return_amount\":0,\"delivery_rub\":22.5,\"gi_box_type_name\":\"Микс\",\"product_discount_for_report\":0,\"supplier_promo\":0,\"rid\":601247011248,\"ppvz_spp_prc\":0,\"ppvz_kvw_prc_base\":0,\"ppvz_kvw_prc\":0,\"ppvz_sales_commission\":0,\"ppvz_for_pay\":0,\"ppvz_reward\":0,\"acquiring_fee\":0,\"acquiring_bank\":\"\",\"ppvz_vw\":0,\"ppvz_vw_nds\":0,\"ppvz_office_id\":0,\"ppvz_office_name\":\"Пункт самовывоза (ПВЗ)\",\"ppvz_supplier_id\":0,\"ppvz_supplier_name\":\"\",\"ppvz_inn\":\"\",\"declaration_number\":\"\",\"sticker_id\":\"\",\"site_country\":\"BY\",\"penalty\":0,\"additional_payment\":0,\"srid\":\"40359268070326773.0.0\"},{\"realizationreport_id\":21099597,\"date_from\":\"2022-12-05T00:00:00Z\",\"date_to\":\"2022-12-11T00:00:00Z\",\"create_dt\":\"2022-12-12T04:58:49Z\",\"suppliercontract_code\":null,\"rrd_id\":9685348413,\"gi_id\":8568020,\"subject_name\":\"Футболки-поло\",\"nm_id\":9261084,\"brand_name\":\"Envy Lab\",\"sa_name\":\"SH013/Темно-синий\",\"ts_name\":\"XL\",\"barcode\":\"102*429744*0\",\"doc_type_name\":\"Продажа\",\"quantity\":1,\"retail_price\":3180,\"retail_amount\":877.21,\"sale_percent\":60,\"commission_percent\":0.23,\"office_name\":\"Санкт-Петербург Ш блок 1\",\"supplier_oper_name\":\"Продажа\",\"order_dt\":\"2022-12-03T00:00:00Z\",\"sale_dt\":\"2022-12-11T00:00:00Z\",\"rr_dt\":\"2022-12-11T00:00:00Z\",\"shk_id\":6987175425,\"retail_price_withdisc_rub\":1272,\"delivery_amount\":0,\"return_amount\":0,\"delivery_rub\":0,\"gi_box_type_name\":\"Без коробов\",\"product_discount_for_report\":60,\"supplier_promo\":0,\"rid\":601174536073,\"ppvz_spp_prc\":0.2586,\"ppvz_kvw_prc_base\":0.1917,\"ppvz_kvw_prc\":-0.0669,\"ppvz_sales_commission\":-85.19,\"ppvz_for_pay\":979.44,\"ppvz_reward\":0,\"acquiring_fee\":0,\"acquiring_bank\":\"\",\"ppvz_vw\":-85.19,\"ppvz_vw_nds\":-17.04,\"ppvz_office_id\":0,\"ppvz_office_name\":\"Пункт самовывоза (ПВЗ)\",\"ppvz_supplier_id\":0,\"ppvz_supplier_name\":\"\",\"ppvz_inn\":\"\",\"declaration_number\":\"\",\"sticker_id\":\"\",\"site_country\":\"BY\",\"penalty\":0,\"additional_payment\":0,\"srid\":\"31026159070008544.0.0\"},{\"realizationreport_id\":21099597,\"date_from\":\"2022-12-05T00:00:00Z\",\"date_to\":\"2022-12-11T00:00:00Z\",\"create_dt\":\"2022-12-12T04:58:49Z\",\"suppliercontract_code\":null,\"rrd_id\":9685348416,\"gi_id\":8568020,\"subject_name\":\"Футболки\",\"nm_id\":4051515,\"brand_name\":\"Envy Lab\",\"sa_name\":\"F03/белый\",\"ts_name\":\"S\",\"barcode\":\"102*187652*0\",\"doc_type_name\":\"Продажа\",\"quantity\":0,\"retail_price\":0,\"retail_amount\":0,\"sale_percent\":0,\"commission_percent\":0,\"office_name\":\"Санкт-Петербург Ш блок 1\",\"supplier_oper_name\":\"Логистика\",\"order_dt\":\"2022-12-11T00:00:00Z\",\"sale_dt\":\"2022-12-11T00:00:00Z\",\"rr_dt\":\"2022-12-11T00:00:00Z\",\"shk_id\":6987175271,\"retail_price_withdisc_rub\":0,\"delivery_amount\":1,\"return_amount\":0,\"delivery_rub\":22.5,\"gi_box_type_name\":\"Микс\",\"product_discount_for_report\":0,\"supplier_promo\":0,\"rid\":601255691987,\"ppvz_spp_prc\":0,\"ppvz_kvw_prc_base\":0,\"ppvz_kvw_prc\":0,\"ppvz_sales_commission\":0,\"ppvz_for_pay\":0,\"ppvz_reward\":0,\"acquiring_fee\":0,\"acquiring_bank\":\"\",\"ppvz_vw\":0,\"ppvz_vw_nds\":0,\"ppvz_office_id\":0,\"ppvz_office_name\":\"Пункт самовывоза (ПВЗ)\",\"ppvz_supplier_id\":0,\"ppvz_supplier_name\":\"\",\"ppvz_inn\":\"\",\"declaration_number\":\"\",\"sticker_id\":\"\",\"site_country\":\"BY\",\"penalty\":0,\"additional_payment\":0,\"srid\":\"10914388070365623.0.0\"},{\"realizationreport_id\":21099597,\"date_from\":\"2022-12-05T00:00:00Z\",\"date_to\":\"2022-12-11T00:00:00Z\",\"create_dt\":\"2022-12-12T04:58:49Z\",\"suppliercontract_code\":null,\"rrd_id\":9685348422,\"gi_id\":8568020,\"subject_name\":\"Футболки-поло\",\"nm_id\":8892180,\"brand_name\":\"Envy Lab\",\"sa_name\":\"SH013/Черный\",\"ts_name\":\"M\",\"barcode\":\"102*429732*0\",\"doc_type_name\":\"Продажа\",\"quantity\":1,\"retail_price\":3050,\"retail_amount\":758.74,\"sale_percent\":68,\"commission_percent\":0.08,\"office_name\":\"Электросталь\",\"supplier_oper_name\":\"Корректная продажа\",\"order_dt\":\"2022-11-25T00:00:00Z\",\"sale_dt\":\"2022-12-04T00:00:00Z\",\"rr_dt\":\"2022-12-11T00:00:00Z\",\"shk_id\":6987174921,\"retail_price_withdisc_rub\":976,\"delivery_amount\":0,\"return_amount\":0,\"delivery_rub\":0,\"gi_box_type_name\":\"Без коробов\",\"product_discount_for_report\":68,\"supplier_promo\":0,\"rid\":601095013635,\"ppvz_spp_prc\":0.1855,\"ppvz_kvw_prc_base\":0.0667,\"ppvz_kvw_prc\":-0.1188,\"ppvz_sales_commission\":-115.98,\"ppvz_for_pay\":900.56,\"ppvz_reward\":0,\"acquiring_fee\":13.2,\"acquiring_bank\":\"Ассист 191771941\",\"ppvz_vw\":-129.18,\"ppvz_vw_nds\":-25.84,\"ppvz_office_id\":0,\"ppvz_office_name\":\"Пункт самовывоза (ПВЗ)\",\"ppvz_supplier_id\":0,\"ppvz_supplier_name\":\"\",\"ppvz_inn\":\"\",\"declaration_number\":\"\",\"sticker_id\":\"\",\"site_country\":\"BY\",\"penalty\":0,\"additional_payment\":0,\"srid\":\"19205995069657727.0.0\"},{\"realizationreport_id\":21099597,\"date_from\":\"2022-12-05T00:00:00Z\",\"date_to\":\"2022-12-11T00:00:00Z\",\"create_dt\":\"2022-12-12T04:58:49Z\",\"suppliercontract_code\":null,\"rrd_id\":9685348424,\"gi_id\":8568020,\"subject_name\":\"Футболки-поло\",\"nm_id\":8892180,\"brand_name\":\"Envy Lab\",\"sa_name\":\"SH013/Черный\",\"ts_name\":\"M\",\"barcode\":\"102*429732*0\",\"doc_type_name\":\"Возврат\",\"quantity\":1,\"retail_price\":3050,\"retail_amount\":758.74,\"sale_percent\":68,\"commission_percent\":0.03,\"office_name\":\"Электросталь\",\"supplier_oper_name\":\"Сторно продаж\",\"order_dt\":\"2022-11-25T00:00:00Z\",\"sale_dt\":\"2022-12-04T00:00:00Z\",\"rr_dt\":\"2022-12-11T00:00:00Z\",\"shk_id\":6987174921,\"retail_price_withdisc_rub\":976,\"delivery_amount\":0,\"return_amount\":0,\"delivery_rub\":0,\"gi_box_type_name\":\"Без коробов\",\"product_discount_for_report\":68,\"supplier_promo\":0,\"rid\":601095013635,\"ppvz_spp_prc\":0.1855,\"ppvz_kvw_prc_base\":0.025,\"ppvz_kvw_prc\":-0.1605,\"ppvz_sales_commission\":-156.65,\"ppvz_for_pay\":946.72,\"ppvz_reward\":0,\"acquiring_fee\":0,\"acquiring_bank\":\"\",\"ppvz_vw\":-156.65,\"ppvz_vw_nds\":-31.33,\"ppvz_office_id\":0,\"ppvz_office_name\":\"Пункт самовывоза (ПВЗ)\",\"ppvz_supplier_id\":0,\"ppvz_supplier_name\":\"\",\"ppvz_inn\":\"\",\"declaration_number\":\"\",\"sticker_id\":\"\",\"site_country\":\"BY\",\"penalty\":0,\"additional_payment\":0,\"srid\":\"19205995069657727.0.0\"},{\"realizationreport_id\":21099597,\"date_from\":\"2022-12-05T00:00:00Z\",\"date_to\":\"2022-12-11T00:00:00Z\",\"create_dt\":\"2022-12-12T04:58:49Z\",\"suppliercontract_code\":null,\"rrd_id\":9685348426,\"gi_id\":10142192,\"subject_name\":\"Пуловеры\",\"nm_id\":4855674,\"brand_name\":\"Envy Lab\",\"sa_name\":\"Q22/Черный\",\"ts_name\":\"XL\",\"barcode\":\"102*323113*0\",\"doc_type_name\":\"Продажа\",\"quantity\":0,\"retail_price\":0,\"retail_amount\":0,\"sale_percent\":0,\"commission_percent\":0,\"office_name\":\"Электросталь\",\"supplier_oper_name\":\"Логистика\",\"order_dt\":\"2022-12-11T00:00:00Z\",\"sale_dt\":\"2022-12-11T00:00:00Z\",\"rr_dt\":\"2022-12-11T00:00:00Z\",\"shk_id\":7588935479,\"retail_price_withdisc_rub\":0,\"delivery_amount\":1,\"return_amount\":0,\"delivery_rub\":62.5,\"gi_box_type_name\":\"Микс\",\"product_discount_for_report\":0,\"supplier_promo\":0,\"rid\":601248732602,\"ppvz_spp_prc\":0,\"ppvz_kvw_prc_base\":0,\"ppvz_kvw_prc\":0,\"ppvz_sales_commission\":0,\"ppvz_for_pay\":0,\"ppvz_reward\":0,\"acquiring_fee\":0,\"acquiring_bank\":\"\",\"ppvz_vw\":0,\"ppvz_vw_nds\":0,\"ppvz_office_id\":0,\"ppvz_office_name\":\"Пункт самовывоза (ПВЗ)\",\"ppvz_supplier_id\":0,\"ppvz_supplier_name\":\"\",\"ppvz_inn\":\"\",\"declaration_number\":\"\",\"sticker_id\":\"\",\"site_country\":\"KZ\",\"penalty\":0,\"additional_payment\":0,\"srid\":\"10.21744304570343411.1.0\"},{\"realizationreport_id\":21099597,\"date_from\":\"2022-12-05T00:00:00Z\",\"date_to\":\"2022-12-11T00:00:00Z\",\"create_dt\":\"2022-12-12T04:58:49Z\",\"suppliercontract_code\":null,\"rrd_id\":9685348428,\"gi_id\":9723392,\"subject_name\":\"Толстовки\",\"nm_id\":4846562,\"brand_name\":\"Envy Lab\",\"sa_name\":\"Super1/Черный\",\"ts_name\":\"4XL\",\"barcode\":\"102*327248*0\",\"doc_type_name\":\"Продажа\",\"quantity\":0,\"retail_price\":0,\"retail_amount\":0,\"sale_percent\":0,\"commission_percent\":0,\"office_name\":\"Коледино\",\"supplier_oper_name\":\"Логистика\",\"order_dt\":\"2022-12-11T00:00:00Z\",\"sale_dt\":\"2022-12-11T00:00:00Z\",\"rr_dt\":\"2022-12-11T00:00:00Z\",\"shk_id\":7808952486,\"retail_price_withdisc_rub\":0,\"delivery_amount\":1,\"return_amount\":0,\"delivery_rub\":122.47,\"gi_box_type_name\":\"Микс\",\"product_discount_for_report\":0,\"supplier_promo\":0,\"rid\":0,\"ppvz_spp_prc\":0,\"ppvz_kvw_prc_base\":0,\"ppvz_kvw_prc\":0,\"ppvz_sales_commission\":0,\"ppvz_for_pay\":0,\"ppvz_reward\":0,\"acquiring_fee\":0,\"acquiring_bank\":\"\",\"ppvz_vw\":0,\"ppvz_vw_nds\":0,\"ppvz_office_id\":0,\"ppvz_office_name\":\"Пункт самовывоза (ПВЗ)\",\"ppvz_supplier_id\":0,\"ppvz_supplier_name\":\"\",\"ppvz_inn\":\"\",\"declaration_number\":\"\",\"sticker_id\":\"\",\"site_country\":\"BY\",\"penalty\":0,\"additional_payment\":0,\"srid\":\"12801308570353505.0.0\"}]";

        ObjectMapper objectMapper = new ObjectMapper();
        Str[] arrayStr = new Str[0];
        try {
            arrayStr = objectMapper.readValue(result, Str[].class);
        } catch (IOException e) {
            System.out.println(e.getMessage());
            System.exit(0);
        }
        allStr.addAll(Arrays.asList(arrayStr));

        int p = 99999;

        if (allStr.size() > p) {
            System.out.println("От сервера пришло более 99.999 строк, спрошу следующие 100.000 шт.");
            ArrayList<Str> newAllStr = new ArrayList<>(allStr);
            do {
                newAllStr.clear();
                long lastRrd_id = allStr.get(arrayStr.length - 1).getRrd_id();
                String nextUrlString = "https://suppliers-stats.wildberries.ru/api/v1/supplier/reportDetailByPeriod?dateFrom=" + args[0] + "&key=" + key + "&limit=" + count + "&rrdid=" + lastRrd_id + "&dateto=" + args[1];
                String newResult = null;
                try {
                    newResult = SendGetRequest.getHTML(nextUrlString);
                } catch (Exception e) {
                    System.out.println("Слишком часто обращаемся к серверу. Жду 5 секунд");

                    try {
                        Thread.sleep(5000);
                        newResult = SendGetRequest.getHTML(nextUrlString);
                    } catch (Exception ex) {
                        System.out.println("Слишком часто обращаемся к серверу. Жду 10 секунд");
                        try {
                            Thread.sleep(5000);
                            newResult = SendGetRequest.getHTML(nextUrlString);
                        } catch (Exception exc) {
                            System.out.println("Бесполезняк");
                        }
                    }
                }

                Str[] newArrayStr = new Str[0];
                try {
                    newArrayStr = objectMapper.readValue(newResult, Str[].class);
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
                allStr.addAll(Arrays.asList(newArrayStr));
                newAllStr.addAll(Arrays.asList(newArrayStr));
            } while ((newAllStr.size() > p));
        }

        System.out.println("Всего пришло с WB: " + allStr.size() + " строк");
        return allStr;

//        Field[] fields = Str.class.getDeclaredFields();
//
//        for (Field field : fields) {
//            headersName.add(field.getName());
//        }
//
//        StringBuilder name = new StringBuilder("envyExelFromWb");
//        String format = ".xlsx";
//        if (path.charAt(path.length() - 1) != '/') {
//            path = path + "/";
//        }
//        File exel = new File(path + name + format);
//        int c = 0;
//        while (exel.exists()) {
//            if (!name.toString().endsWith("Wb")) {
//                name = new StringBuilder("envyExelFromWb");
//            }
//            c++;
//            name.append(c);
//            exel = new File(path + name + format);
//        }
//
//        long start = System.currentTimeMillis();
//        System.out.println("Начинаю запись: " + DateTransformer.getDateFromMs(start));
//
//        try {
//            WriteExel.write(exel.getAbsolutePath(), headersName, allStr);
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//        long stop = System.currentTimeMillis();
//        System.out.println("Готово: " + DateTransformer.getDateFromMs(stop));
//        System.out.println(exel.getAbsolutePath());
//        System.out.println(GetDuration.getDurationBreakdown(stop-start));
    }
}
