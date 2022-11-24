package praticepackage;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Vtiger.GenricLibraries.excelUtility;

public class datafeychfromExcel 
{
	@Test(dataProvider ="Fetchdata")
	public void Achive(String name,String movie ) {
		System.out.println(name+" "+movie);
	}
	
	
@DataProvider
public Object[][] Fetchdata() throws Exception
{
	excelUtility el = new excelUtility();
	            Object[][] value = el.exceldata();
	            
	            return value;
	
}

}
