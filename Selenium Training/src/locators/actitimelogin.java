package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class actitimelogin {

	public static void main(String[] args) {
		String a=".\\executable\\chromedriver.exe";
		String b=("webdriver.chrome.driver");
		System.setProperty(b, a);
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.actitime.com/login.do");
		
		String expectedTitle=("actiTIME - Login");
		String actualTitle=driver.getTitle();
		if (actualTitle.equals(expectedTitle)) {
			System.out.println("login page open successfully");
		}else {
			System.out.println("login page not open or its title got changed");
		}
		WebElement usernameinputfield=driver.findElement(By.id("username"));
		usernameinputfield.sendKeys("jitu123");
		
		usernameinputfield.clear();
		usernameinputfield.sendKeys("admin");
		
		WebElement passwordinputfield=driver.findElement(By.name("pwd"));
		passwordinputfield.sendKeys("manager");
		
		WebElement loginButton=driver.findElement(By.id("loginButton"));
		loginButton.click();
		
		driver.close();
		}
		 
	}
