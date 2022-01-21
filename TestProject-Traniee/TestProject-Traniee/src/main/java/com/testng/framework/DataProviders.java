package com.testng.framework;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviders {

	@Test(dataProvider = "exceldata")
	public void printExcelData(String name,String id,String address) {
		System.out.println(name);
	}

	@DataProvider(name = "exceldata")
	public Object[][] getExcelData() {

		File file = new File("./src/test/resources/ExcelData.xlsx");

		Object[][] obj = null;

		try(XSSFWorkbook wb = new XSSFWorkbook(file)) {			

			XSSFSheet sheet = wb.getSheet("Sheet1");

			int numberOfRows = sheet.getPhysicalNumberOfRows();
			
			int numberOfCols = sheet.getRow(0).getLastCellNum();
			
			obj = new Object[numberOfRows][numberOfCols];

			System.out.println("Number of Rows in excel - " + numberOfRows);

			for (int i = 0; i < numberOfRows; i++) {

				Row row = sheet.getRow(i);

				for (int j = 0; j < row.getLastCellNum(); j++) {

					Cell cell = row.getCell(j);

					switch (cell.getCellType()) {

					case STRING:

						obj[i][j] = cell.getStringCellValue();
						break;
						
					case NUMERIC:
						String cellData = String.valueOf(cell.getNumericCellValue());
						obj[i][j] = cellData;
						break;
						
					default:
						break;
					}

				}
			}

		} catch (InvalidFormatException |IOException e) {
			
			
		}
		
		return obj;
	}

}
