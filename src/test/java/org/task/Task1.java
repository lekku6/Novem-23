package org.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.pom.LoginPoja;
import org.testng.Assert;
import org.testng.Base;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Task1 extends Base {
	@Test(dataProvider="login")
	private void tc1(String s1,String s2) throws InterruptedException {
		
			

		browserLaunch();
		miniMax();
		lanunChrome("https://www.facebook.com/login/");
		String actutal = driver.getTitle();
		System.out.println(actutal);
		LoginPoja l=new LoginPoja();
		fill(l.getUser(), s1);
		fill(l.getPass(), s2);
		btnClick(l.getBtnLog());
		Thread.sleep(2000);
	    /* String cur = driver.getCurrentUrl();
	     System.out.println(cur);
		Assert.assertEquals(cur, "https://www.facebook.com/login/device-based/regular/login/?login_attempt=1&lwv=100");
		System.out.println("succccc....");*/
		
		
		
		
		
	}
	@DataProvider(name="login")
	private Object[][] loginData() {
		return new Object [][] {
			{"Greens","green@123"},
			{"Anil","Anil@123"}
			
		};
		

	}

}
