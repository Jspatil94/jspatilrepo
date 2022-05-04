package browseroperations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path1=".\\executable\\geckodriver.exe";
		String path2=System.getProperty("user.dir")+"\\executable\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver",path2);
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com/");
		//driver.get("https://www.facebook.com/");
		// Get current page source code and print the length in the console 
				String sourceCode=driver.getPageSource();
				System.out.println("Application source code: "+sourceCode);
				System.out.println("Source code length: "+sourceCode.length());
				//Get current url from the application and print in the console 
				System.out.println("Application current URL: "+driver.getCurrentUrl());
				//Get current page title and print in the console 
		System.out.println("Application current Title: "+driver.getTitle());
		if(driver.getTitle().equals("Google")) {
			System.out.println("Google search page opened successfully...");
		}else {
			System.out.println("Either google search page not opened or its title got changed");
	}
		driver.close();
}
}	
	