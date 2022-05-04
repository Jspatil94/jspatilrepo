package browseroperations;

import org.openqa.selenium.chrome.ChromeDriver;

public class openchromebrowser {

	public static void main(String[] args) {
		String path1=(".\\executable\\chromedriver.exe");
		String path2=System.getProperty("user.dir")+"\\executable\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path2);
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://facebook.com/");
		String sourcecode=driver.getPageSource();
		System.out.println("Application source code: "+sourcecode);
		System.out.println("source code length: "+sourcecode.length());
		System.out.println("Application current url: "+driver.getCurrentUrl());
		String pagetitle=driver.getTitle();
		System.out.println("Application current title: "+driver.getTitle());
		System.out.println("current page title length: "+pagetitle.length());
		if (driver.getTitle().equals("Facebook – log in or sign up")) {
			System.out.println("facebook home page open succesfully..");
		}else {
			System.out.println("facebook home page not open or its title got changed");
		}
		driver.close();
	}

}
