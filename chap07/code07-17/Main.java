import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.*;
import java.io.*;

public class Main {
  public static void main(String[] args) throws Exception {
    Workbook book = new XSSFWorkbook();
    Sheet sheet = book.createSheet("カート");
    Row row = sheet.createRow(0);
    row.createCell(0).setCellValue("ひのきのぼう");
    row.createCell(1).setCellValue(5);           // 単価
    row.createCell(2).setCellValue(22);          // 数量
    row.createCell(3).setCellFormula("=B1*C1");  // 合計金額
    // Excelファイルとして保存
    try (OutputStream file = new FileOutputStream("workbook.xlsx")) {
      book.write(file);
    }
  }
}
