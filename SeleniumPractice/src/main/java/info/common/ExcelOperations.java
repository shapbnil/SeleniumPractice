package info.common;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelOperations {

	public XSSFSheet readDataFromExcel(String filePath, String sheetName) throws Exception {

		// Read operations File InputStream
		FileInputStream file = new FileInputStream(new File(filePath));

		// Create Workbook instance holding reference to .xlsx file
		XSSFWorkbook workbook = new XSSFWorkbook(file);

		// Get first/desired sheet from the workbook
		XSSFSheet sheet = workbook.getSheet(sheetName);

		// int rows =sheet.getLastRowNum();
		// Rows count
		// Columns count

		// [0][0] = username
		// [0][1] = password
		// [0][2] = DOB

		// [1][0] = user1
		// [1][1] = password1
		// [1][2] = 1/1/1990

		/*
		 * XSSFRow rows = sheet.getRow(1);
		 * 
		 * XSSFCell cell = rows.getCell(0);
		 * 
		 * XSSFRow rows1 = sheet.getRow(2);
		 * 
		 * XSSFCell cell1 = rows1.getCell(1);
		 * 
		 * System.out.println(cell.getStringCellValue());
		 * System.out.println(cell1.getStringCellValue());
		 */
		return sheet;
	}

	public Object[][] getExcelData(XSSFSheet sheet) {

		Object[][] o=new Object[3][2];
		
		//Get Rows count
		int rowsCount = sheet.getLastRowNum()+1;
		int columnsCount;
		Object[][] testData = new Object[rowsCount][sheet.getRow(1).getLastCellNum()];
		
		//Rows
		for (int i = 1; i < rowsCount; i++) {
			XSSFRow row = sheet.getRow(i);
			columnsCount = row.getLastCellNum();

			
			//Columns
			for (int j = 0; j < columnsCount; j++) {
				String data = row.getCell(j).getStringCellValue();
				testData[i][j] = data;
			}
		}
		System.out.println(testData);
		return testData;
	}

	public static void main(String[] args) throws Exception {
		ExcelOperations exce = new ExcelOperations();
		XSSFSheet sheet = exce.readDataFromExcel("C:\\Users\\shapbnil\\Documents\\TestData.xlsx", "UserDetails");
		
		Object[][] data =exce.getExcelData(sheet);
		
		System.out.println(data);
	}
}
