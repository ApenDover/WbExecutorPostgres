package exel;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class WriteExel {
    public static void write(String filename, ArrayList<String> headers, ArrayList<Str> strArrayList) throws IOException {
        XSSFWorkbook workbook = new XSSFWorkbook();
        Sheet sheet = CreateSheet.createSheet(workbook, headers);
        CreateHeader.createHeader(workbook, sheet, headers);
        CreateCells.createCells(workbook, sheet, headers, strArrayList);
        try (FileOutputStream outputStream = new FileOutputStream(filename)) {
            workbook.write(outputStream);
        }
        workbook.close();
    }
}
