package org.table.operation.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver _brower=new ChromeDriver();
		_brower.get("https://www.timeanddate.com/calendar");
		List<WebElement> months = _brower.findElements(By.xpath("//th/a"));
		List<WebElement> table = _brower.findElements(By.xpath("(//table[contains(@class,'ca ca1')]/tbody)"));
		for(int k=0;k<=table.size()-1;k++)
		{	
			System.out.print(months.get(k).getText());
			System.out.println(" ");
		List<WebElement> tableRow = table.get(k).findElements(By.tagName("tr"));
		for(int i=0;i<=tableRow.size()-1;i++)
		{
		List<WebElement> tableColumn = tableRow.get(i).findElements(By.tagName("td"));
		for(int j=0;j<=tableColumn.size()-1;j++)
		{
			System.out.print(tableColumn.get(j).getText()+" ");
		}
		System.out.println(" ");

		}
		}
		
	}

}
