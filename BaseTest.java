package com.cs.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.cs.Driver.Driver;

public class BaseTest {
	protected BaseTest() {}

	
	@BeforeMethod
	protected void setUp() {
		
		try {
			Driver.initDriver();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
/*		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
*/
		}

	@AfterMethod
	protected void tearDown() {
		Driver.quiDriver();
		
//		driver.quit();
	}
}
