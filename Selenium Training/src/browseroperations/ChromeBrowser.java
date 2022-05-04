package browseroperations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {
	public static void main(String[] args) {
		
		String path1=".\\executable\\chromedriver.exe";
		String path2=System.getProperty("user.dir")+"\\executable\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",path2);
		ChromeDriver driver=new ChromeDriver();
	}

}
