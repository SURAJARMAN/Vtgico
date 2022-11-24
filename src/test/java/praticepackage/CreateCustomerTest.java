package praticepackage;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateCustomerTest {
@Test(invocationCount=2)
	
	public void createcustomer()
		{
	int ar[]= {1,2,3,4,5};
	System.out.println(ar[2]);
			System.out.println("customer account craeted Sussesfully");
		}
	@Test(dependsOnMethods = "createcustomer")
	
		public void updateCustomer() {
			System.out.println("customer account updated Sussesfully");
		}
	@Test(priority=-1)
	
		public void deleteCustomer() {
			System.out.println("customer account delete Sussesfully");
		}
	@Test(dataProvider ="dataProviderTest" )
	public void accesData(String data1,String data2) {
		
		System.out.println("from"+data1+"to"+data2);
	}
	@DataProvider
	public Object [][] dataProviderTest(){
		Object data[][]=new Object[5][2];
		
		data[0][0]="Banglore";
		data[0][1]="btm";
		
		data[1][0]="Odisha";
		data[1][1]="Bhubaneswar";
		
		data[2][0]="asam";
		data[2][1]="dispur";
		
		data[3][0]="tripura";
		data[3][1]="agartala";
		
		data[4][0]="nahaland";
		data[4][1]="kohima";
		
		return data;
	}
}
