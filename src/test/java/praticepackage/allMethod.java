package praticepackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class allMethod {

	@BeforeSuite
	public void Bs() {
		System.out.println("BeforeSuite");
	}
	@BeforeClass
public void Bc() {
		System.out.println("BeforeClass");
	}
	@BeforeTest
public void Bt() {
		System.out.println("BeforeTest");
	}
	@Test
public void tt() {
		System.out.println("Test");
	}
	@Test
	public void Test2() {
		System.out.println("test2");
	}
	@AfterClass
public void Ac() {
		System.out.println("AfterClass");
	}
	@AfterTest
public void At() {
		System.out.println("AfterTest");
	}
	@AfterSuite
public void As() {
		System.out.println("AfterSuite");
	}
	@BeforeMethod
public void Bm() {
		System.out.println("BeforeMethod");
	}
	
	@AfterMethod
public void Am() {
		System.out.println("AfterMethod");
	}
	
}
