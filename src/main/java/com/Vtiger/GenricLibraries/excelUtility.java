package com.Vtiger.GenricLibraries;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

import com.mysql.cj.result.Row;


public class excelUtility extends JavaUtility {

public Object[][] exceldata() throws EncryptedDocumentException, IOException {
	FileInputStream fis=new FileInputStream("src/test/resources/testdata (2).xlsx");
	Workbook wb=WorkbookFactory.create(fis);
	Sheet sh = wb.getSheet("new");

	int lastrow = sh.getLastRowNum()+1;
	System.out.println(lastrow);
	short lastcell = sh.getRow(0).getLastCellNum();
	Object [][] obj=new Object[lastrow][lastcell];
	for(int i=0;i<lastrow;i++) {
		for(int j=0;j<lastcell;j++) {
			obj[i][j]=sh.getRow(i).getCell(j).getStringCellValue();
		}
	}
	return obj;
}
public String readDataFromExcel(String SheetName, int RowNo, int ColumnNo) throws Throwable

{
	FileInputStream fi = new FileInputStream(ipathConstant.EXCELFILE_PATH);
	Workbook wb = WorkbookFactory.create(fi);
	String value = wb.getSheet(SheetName).getRow(RowNo).getCell(ColumnNo).getStringCellValue();
	
	return value;
}

public String writeDataIntoExcel(String SheetName, int RowNo, int ColumnNo,String Date)  throws Throwable
{
FileInputStream fi = new FileInputStream(ipathConstant.EXCELFILE_PATH);
Workbook wb = WorkbookFactory.create(fi);
wb.getSheet(SheetName).getRow(RowNo).getCell(ColumnNo).setCellValue(Date);
FileOutputStream fos = new FileOutputStream(ipathConstant.EXCELFILE_PATH);
 wb.write(fos);	
 return Date;
}

/**This is used to get last row count
 * @author Suraj
 * @return
 * @throws EncryptedDocumentException
 * @throws IOException
 */

public int getLastRowNum(String sheetName) throws Throwable{
	FileInputStream fi = new FileInputStream(ipathConstant.EXCELFILE_PATH);
	Workbook wb = WorkbookFactory.create(fi);
	Sheet sh = wb.getSheet(sheetName);	
	int count =sh.getLastRowNum();
	return count;
}


public Map<String, String> getList(String sheetName) throws Throwable
{
	FileInputStream fi = new FileInputStream(ipathConstant.EXCELFILE_PATH);
	Workbook wb = WorkbookFactory.create(fi);
	Sheet sh = wb.getSheet(sheetName);	
	int count =sh.getLastRowNum();
	Map<String,String> map=new HashMap<String,String>();
	for(int i=0; i<=count; i++)
	{
		String key=sh.getRow(i).getCell(0).getStringCellValue();
	String value=sh.getRow(i).getCell(1).getStringCellValue();
	map.put(key,value);
	if(key.equals("docemail"))
	{
	value=value+"_"+getRandomNumber();
	}


	
}
	return map;
}

}
