package praticepackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.Vtiger.GenricLibraries.BaseClass;
import com.Vtiger.ObjectRepositary.HomePage;
import com.Vtiger.ObjectRepositary.LoginPage;

public class VtigerTest extends BaseClass {
@Test
	public void add() {
	WebDriver driver=new ChromeDriver();
	driver.get("http://localhost:8888/");
	LoginPage L=new LoginPage(driver);
	L.login("admin", "admin");
//	HomePage h=new HomePage(driver);
//	h.homePage();
	System.out.println("Hi Suraj 25 nov");
	System.out.println("hiii");
	System.out.println("hello suraj llll");
	driver.findElement(By.xpath("//a[.='Organizations']/parent::td[@class='tabUnSelected']/a")).click();
	driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
	   driver.findElement(By.name("industry")).click();
	   WebElement k = driver.findElement(By.xpath("//select[@name='industry']"));
	  Select s=new Select(k);
	  List<WebElement> f = s.getOptions();
	  int kk = f.size();
	  System.out.println(kk);
	  for(int i=kk-1;i>=0;i--) {
		  System.out.println(f.get(i).getText());
	  }
	 
	  //String kk = s.getWrappedElement().getText();
	
	  //System.out.println(kk);
	  
	 // System.out.println(s.getWrappedElement().getText());
	  
	}
}
