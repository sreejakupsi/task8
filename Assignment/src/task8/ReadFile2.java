package task8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadFile2 {

	public static void main(String[] args) {
		ReadFile2 fileObj =new ReadFile2();
		//to find the number of rows and column present in the excel file
		for(int i=0;i<5;i++) {
			for(int j=0;j<3;j++) {
				String value = fileObj.getExcelData("Sheet1", i, j);
				System.out.print(value+" ");
			}
			System.out.println(" ");
		}
	}
	
	
	
	public String getExcelData(String sheetName,int rowNum,int colNum)  {
		String returnValue=null;
		try {
			FileInputStream task8=new FileInputStream("Utils//Task8.xlsx");
			XSSFWorkbook wb =new XSSFWorkbook(task8);
			XSSFSheet s=wb.getSheet(sheetName);
			XSSFRow r=s.getRow(rowNum);
			XSSFCell c=r.getCell(colNum);
			returnValue=ReadFile2.getCellValue(c);
			task8.close();
			wb.close();
				
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		return returnValue;

	}
	//To check the type of the data present in the excel sheet and converts into string after it is read
	public static String getCellValue(XSSFCell c) {
		switch(c.getCellType()) {
		case NUMERIC:
			return String.valueOf(c.getNumericCellValue());
		case BOOLEAN:
			return String.valueOf(c.getBooleanCellValue()) ;
		case STRING:
			return c.getStringCellValue();
		default:
			return c.getStringCellValue();
		}
	}

}


