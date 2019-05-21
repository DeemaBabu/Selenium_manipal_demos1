package seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class CasestudyDemo5 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\IBMADMIN\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		WebElement link=driver.findElement(By.xpath("//*[contains(text(),'PIM')]"));
		Actions build=new Actions(driver);
		Action moveover=build.moveToElement(link).build();
		moveover.perform();
		build.click();
		//build.sendKeys(link,(Keys.ENTER)).perform();
		//WebElement link1=driver.findElement(By.id("menu_pim_viewEmployeeList"));//not working
		WebElement link1=driver.findElement(By.xpath("//*[contains(text(),'Employee List')]")); // not working
		//WebElement link1=driver.findElement(By.xpath("//*[@id='menu_pim_viewEmployeeList']")); // not working
		//Actions build1=new Actions(driver);
		//build1.sendKeys(Keys.ENTER).perform();*/
		link1.click();
		
	}

}
