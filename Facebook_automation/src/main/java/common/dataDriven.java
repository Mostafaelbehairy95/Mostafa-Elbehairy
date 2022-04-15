package common;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class dataDriven {
	public static String [][] getData(String TCSS) throws IOException {
		// fileInputStream argument

		FileInputStream file = new FileInputStream("C:\\Users\\mosta\\eclipse-workspace\\Facebook_automation\\Test Driven.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(file);
		XSSFSheet excelSheet = wb.getSheet("Data");
		int noRow = excelSheet.getPhysicalNumberOfRows();
		int noColumn = excelSheet.getRow(0).getLastCellNum();
		String [][] data = new  String [1][noColumn];
		String row;
		DataFormatter formatter = new DataFormatter();
		for(int i = 1; i < noRow; i ++) {
			row = formatter.formatCellValue(excelSheet.getRow(i).getCell(0));
			if(row.equalsIgnoreCase(TCSS)) {
				for(int x = 0; x < noColumn; x ++) {
						data[0][x] = formatter.formatCellValue(excelSheet.getRow(i).getCell(x));
				}
			}
		}
		
		return data;
	}


}
