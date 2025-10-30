package utills;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	
	public static String[][] readExcelData(String filename) throws IOException {
		//To locate the workbook
		XSSFWorkbook excelName = new XSSFWorkbook("./DataExcel/"+filename+".xlsx");
		
		//To locate the sheet
		XSSFSheet sheet = excelName.getSheet("Sheet1");
		
		//To count number of rows
		int rowCount = sheet.getPhysicalNumberOfRows();
		System.out.println("The Row Count is: " +rowCount);
		
		//To get row count excluding header 
		int lastRowNum = sheet.getLastRowNum();
		System.out.println("The Row count excluding header: " +lastRowNum);
		
		//To get column count
		short colCount = sheet.getRow(0).getLastCellNum();
		System.out.println("The column count is: " +colCount);
		
		//To retrieve data
		String[][] rcdata = new String[rowCount][colCount];
		for(int i =1; i<rowCount;i++) {
			XSSFRow row = sheet.getRow(i);
			for(int j = 0;j<colCount;j++) {
				String allData = row.getCell(j).getStringCellValue();
				rcdata[i-1][j]=allData;
				
			}
			
		}
		excelName.close();
		return rcdata;
	}

}
