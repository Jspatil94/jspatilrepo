package locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActiTimeLoginLogoutWithHomepageValidation {

	public static void main(String[] args) {
		String a=".\\executable\\chromedriver.exe";
		String b=("webdriver.chrome.driver");
		System.setProperty(b, a);
		WebDriver driver=new ChromeDriver();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		
		String expectedTitle=("actiTIME - Login");
		String ActualTitle=driver.getTitle();
		if (ActualTitle.equals(expectedTitle)) {
			System.out.print("Application login page  open succesfully");
		} else {
			System.out.println("login page not opened or its title got changed");
		}
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
		//WebElement logoutButton=driver.findElement(By.id("logoutlink"));
		//explicit wait
		//WebDriverWait wait=new WebDriverWait(driver,20);
		//wait.until(ExpectedConditions.elementToBeClickable(logoutButton));
		
		//homepagetitle validation
		//String actualhomepagetitle=driver.getTitle();
			//System.out.println("actual homepagetitle: "+actualhomepagetitle);
		//String expectedhomepagetitle="actiTIME - Enter Time-Track";
		//if (actualhomepagetitle.equals(expectedhomepagetitle)) {
			//System.out.println("login is succesful and homepage title varified succesfully..");
		//}else {
			//System.out.println("either login failed or homepage title changed");
		//}
		
		//driver.findElement(By.id("logoutButton")).click();
		driver.close();
	}

}
