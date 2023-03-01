package genericlibraries;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 * This class contains reusable methods to perform actions on Excel file
 * @author  sheetName
 * @return
 */
public class Excelutility
{
	private Workbook wb;
	/**
	 * This methods is used to initialize the Excel file
	 * @param excelpath
	 */
	public void excelinitialization(String excelpath) 
	{
		FileInputStream fis=null;
		try {
			fis=new FileInputStream (excelpath);
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
			
		}
	
	try {
		wb=WorkbookFactory.create(fis);
	}
	catch(EncryptedDocumentException |IOException e) {
		e.printStackTrace();
	}
	}
	/**
	 * This method is used to read single data from excel sheet
	 * @param sheetName
	 * @param rowNum
	 * @param cellNum
	 * @return
	 */
	
	public String readDataFromExcel(String sheetName,int rowNum,int cellNum) {
		return wb.getSheet(sheetName).getRow(rowNum).getCell(cellNum).getStringCellValue();
		
	}
	/**
	 * This method is used to read multiplr data from excel
	 * @param sheetName
	 * @return
	 */
	public List<String> readDataFromExcel(String sheetName){
		Sheet sh=wb.getSheet(sheetName);
		List<String> dataList=new ArrayList<>();
		for(int i=0;i<=sh.getLastRowNum();i++) {
			dataList.add(sh.getRow(i).getCell(1).getStringCellValue());
		}
		return dataList;
	}

/**
 * This method is used to close the excel workbook	
 */
public void closeExcel() {
	try {
		wb.close();
	}
	catch(IOException e) {
		e.printStackTrace();
	}
}
}
	
	
	

	
	
	



