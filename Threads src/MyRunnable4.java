package com.threadswithfile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class MyRunnable4 implements Runnable{

	public void run() {
		File f = new File("D:\\Book1.xlsx");
		try {
			FileInputStream fis = new FileInputStream(f);
			XSSFWorkbook w = new XSSFWorkbook(fis);
			XSSFSheet s = w.getSheet("Sheet1");
			
			String cellData[][] = new String[82][3];

			for (int i = 62; i <=81; i++) {
				Row row = s.getRow(i);
				if (row != null) {
					for (int j = 0; j < 3; j++) {
						Cell cell = row.getCell(j);
						switch (cell.getCellType()) {
						case Cell.CELL_TYPE_NUMERIC:
							cellData[i][j] = String.valueOf(cell.getNumericCellValue());
							if (Double.parseDouble((cellData[i][j])) > 700) {
								System.out.println(cellData[i][j]);
							}
							break;
//						case Cell.CELL_TYPE_STRING:
//							cellData[i][j] = cell.getStringCellValue();
//							break;
						}
					}
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
