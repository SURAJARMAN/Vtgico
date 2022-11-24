package praticepackage;

import org.testng.annotations.Test;

public class Sample1 {
@Test
	public void Script1() {
		System.out.println("Step1");
	}
@Test(groups = "smoke")

	public void  script2() {
		System.out.println("Step2");
	}
}
