package testNGLearning;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FirstDay {
	
	@AfterTest
	@Test
	public void onetest(){
		System.out.println("This is first testng Test");
	}
	
	@BeforeTest
	@Test(groups= {"smoke"})
	public void twotest() {
		System.out.println("This is second testng Test");
	}

}
