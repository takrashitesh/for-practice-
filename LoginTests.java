package com.cs.tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import com.cs.Driver.Driver;
import com.cs.Driver.DriverManager;

public final class LoginTests extends BaseTest{

	
	@Test
	public void test1() {

		DriverManager.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		DriverManager.getDriver().findElement(By.name("q")).sendKeys("cyber", Keys.ENTER);
		
//		Driver.driver.findElement(By.name("q")).sendKeys("cyber", Keys.ENTER);
//		driver.findElement(By.name("q")).sendKeys("cyber", Keys.ENTER);
	}
	
	@Test
	public void test2() {
		
		DriverManager.getDriver().findElement(By.name("q")).sendKeys("success", Keys.ENTER);
		
		
//		Driver.driver.findElement(By.name("q")).sendKeys("success", Keys.ENTER);
//		driver.findElement(By.name("q")).sendKeys("success", Keys.ENTER);
	}
	
	
	
	
	
	
	
	
	
}
