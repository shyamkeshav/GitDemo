package testNGLearning;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SecondDay {
	
	@Parameters({"URL"})
	@Test(groups= {"smoke"})
	public void twotest(String website) {
		System.out.println("This is second day testng Test");
		System.out.println(website);
	}
}