package com.cs.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import com.cs.Driver.DriverManager;

public final class HomePageTests extends BaseTest {

	
	
	@Test
	public void test3() {
			
		DriverManager.getDriver().findElement(By.name("q")).sendKeys("training", Keys.ENTER);

	
//		Driver.driver.findElement(By.name("q")).sendKeys("training", Keys.ENTER);
//		driver.findElement(By.name("q")).sendKeys("training", Keys.ENTER);
	}
}
