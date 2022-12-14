package com.Vtiger.GenricLibraries;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.Vtiger.ObjectRepositary.LoginPage;

public class BaseClass {
	static {
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
	}
public WebDriver driver;
public FileUtility flib=new FileUtility();
WebDriverUtility wlib=new WebDriverUtility();
public static WebDriver sdriver;

	@BeforeSuite(groups = {"smokeTest","regressionTest"})
    public void BS()
    {
    	System.out.println("Database Connection");
    }
	
	@BeforeTest(groups = {"smokeTest","regressionTest"})
    public void BT()
    {
    	System.out.println("Execute in Parallel mode");
    	
    }
	
	//@Parameters("BROWSER")
	@BeforeClass(groups = {"smokeTest","regressionTest"})
	public void BC() throws IOException
	{
		
		 System.out.println("Opening the Browser");
		 
		 //-----we changed BROWSER TO Browser----check in respective class-------//
		 String BROWSER=flib.getPropertyKeyValue("browser");
	    
	     if(BROWSER.equalsIgnoreCase("chrome"))
	     {
	    	// WebDriverManager.chromedriver().setup();
	    	 driver=new ChromeDriver();
	     }
	     else if(BROWSER.equalsIgnoreCase("firefox"))
	     {
	    	// WebDriverManager.firefoxdriver().setup();
	    	 driver=new FirefoxDriver();
	     }
	     else if(BROWSER.equalsIgnoreCase("edge"))
	     {
	    	// WebDriverManager.edgedriver().setup();
	    	 driver=new EdgeDriver();
	     }
	     else
	     {
	    	 driver=new ChromeDriver();
	     }
	     sdriver=driver;  
	        //implicit wait
	    	wlib.waitForPageLoad(driver);
			//Maximize the window
			driver.manage().window().maximize();
			
			   
	          
	}
	
	@BeforeMethod(groups = {"smokeTest","regressionTest"})
	public void BM() throws IOException
	{
		System.out.println("Login to Application");
		
		String URL = flib.getPropertyKeyValue("url");
		String UserName = flib.getPropertyKeyValue("username");
		String PassWord = flib.getPropertyKeyValue("password");
		
        driver.get(URL);
		
		LoginPage log=new LoginPage(driver);
	    log.login(UserName, PassWord);
	}
	
	@AfterMethod(groups = {"smokeTest","regressionTest"})
	public void AM()
	{
		System.out.println("Logout to Application");
//		HomePage hp=new HomePage(driver);
//		hp.getAdmiBtn().click();
//		hp.getSignOutLink().click();
	}
	
	@AfterClass(groups = {"smokeTest","regressionTest"})
	public void AC()
	{
		System.out.println("Closing the Browser");
	}
	
	@AfterTest(groups = {"smokeTest","regressionTest"})
	public void AT()
	{
		System.out.println("Executed successfully");
	}
	
	@AfterSuite(groups = {"smokeTest","regressionTest"})
	public void AS()
	{
		System.out.println("Closing the Database");
	}
}
