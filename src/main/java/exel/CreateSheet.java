package exel;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.util.ArrayList;

public class CreateSheet extends WriteExel {
    public static Sheet createSheet(XSSFWorkbook workbook, ArrayList<String> sheets) {
        Sheet sheet = workbook.createSheet();
        for (int i = 0; i < sheets.size(); i++) {
            sheet.autoSizeColumn(i);
        }
        return sheet;
    }
}
