package org.selenium.integration.java;

//import java.sql.Driver;
import java.util.List;
//import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumIntegration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver _driver=new ChromeDriver();
		_driver.manage().window().maximize();
		try {
		_driver.navigate().to("http://leaftaps.com/opentaps");
		_driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		_driver.findElement(By.id("password")).sendKeys("crmsfa");
		_driver.findElement(By.className("decorativeSubmit")).click();
		List<WebElement> anchortag = _driver.findElements(By.tagName("a"));
		anchortag.size();
		anchortag.get(1).click();
		//_driver.findElement(By.xpath("//img[@src='/opentaps_images/integratingweb/crm.png']")).click();
		_driver.findElement(By.linkText("Create Lead")).click();
		_driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Cognizant");
		_driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Bahulayan");
		_driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Aswin");
		Select select=new Select(_driver.findElement(By.id("createLeadForm_dataSourceId")));
		select.selectByVisibleText("Conference");
		Select Marketingcamp=new Select(_driver.findElement(By.id("createLeadForm_marketingCampaignId")));
		Marketingcamp.selectByIndex(1);
		//WebElement findElement = _driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		List<WebElement> allmarketcampaignoptions = Marketingcamp.getOptions();
		for (WebElement a : allmarketcampaignoptions) {
			System.out.println(a.getText());
		}
		}
		catch (org.openqa.selenium.NoSuchElementException e) {
			// TODO: handle exception
			System.out.println("No such Element found");
			throw new RuntimeException();
		}
	}

}
