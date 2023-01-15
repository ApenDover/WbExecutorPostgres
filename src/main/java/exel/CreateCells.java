package exel;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFCreationHelper;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.reflections.ReflectionUtils;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Date;
import java.util.Set;

public class CreateCells extends CreateHeader {
    public static void createCells(XSSFWorkbook workbook, Sheet sheet, ArrayList<String> headerList, ArrayList<Str> strArrayList) {

        Set<Method> getters = ReflectionUtils.getAllMethods(Str.class, ReflectionUtils.withModifier(Modifier.PUBLIC), ReflectionUtils.withPrefix("get"));
        ArrayList<Method> allGetters = new ArrayList<>(getters);
        XSSFCellStyle style = workbook.createCellStyle();
        style.setWrapText(true);
        XSSFCreationHelper createHelper = workbook.getCreationHelper();
        style.setDataFormat(createHelper.createDataFormat().getFormat("dd.mm.yyyy"));
        sheet.setDefaultColumnStyle(0, style);

        for (int i = 0; i < strArrayList.size(); i++) {
            sheet.setDefaultColumnStyle(i, style);
            Str str = strArrayList.get(i);
            Row row = sheet.createRow(i + 1);
            Cell cell = row.createCell(0);
            cell.setCellValue(str.getRealizationreport_id());

            for (int p = 1; p < headerList.size(); p++) {
                cell = row.createCell(p);

                try {
                    for (Method m : allGetters) {
                        if (m.getName().toLowerCase().contains(headerList.get(p))) {
                            if (m.getName().endsWith("_dt") | m.getName().toLowerCase().contains("date_")) {
                                cell.setCellStyle(style);
                                Object r = m.invoke(str);
                                if (r != null) {
                                    cell.setCellValue((Date) m.invoke(str));
                                }
                            } else {
//                            System.out.println(m.getName() + " : " + headerList.get(p));
                                Object r = m.invoke(str);
                                if (r != null) {
                                    if (m.invoke(str).getClass().getTypeName().contains("Double"))
                                    {
                                        cell.setCellValue((Double) m.invoke(str));
                                    }
                                    if (m.invoke(str).getClass().getTypeName().contains("String"))
                                    {
                                        cell.setCellValue((String) m.invoke(str));
                                    }
                                    if (m.invoke(str).getClass().getTypeName().contains("Integer"))
                                    {
                                        cell.setCellValue((Integer) m.invoke(str));
                                    }
                                    if (m.invoke(str).getClass().getTypeName().contains("Long"))
                                    {
                                        cell.setCellValue((Long) m.invoke(str));
                                    }

                                } else cell.setCellValue("");
                            }
                        }
                    }
                } catch (IllegalAccessException | InvocationTargetException e) {
                    e.printStackTrace();
                }
            }
            if ((i + 1) % 1000 == 0)
            {
                System.out.println("Записано " + (i + 1) + " строк из " + strArrayList.size());
            }
        }

    }
}
