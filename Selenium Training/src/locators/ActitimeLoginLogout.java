package locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeLoginLogout {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a=".\\executable\\chromedriver.exe";
		String b=("webdriver.chrome.driver");
		System.setProperty(b, a);
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		
		String expectedTitle=("actiTIME - Login");
		String actualTitle=driver.getTitle();
		
		if (actualTitle.equals(expectedTitle)) {
			System.out.println("Login page open succesfully..");
		}else {
			System.out.println("login page title not open or its title got changed");
		}
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		driver.findElement(By.id("logoutLink")).click();
		
		driver.close();
		}
		
		
	}
