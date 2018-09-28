package pattern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestWithoutLaunchingBrowser {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kirti.c.sharma\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setHeadless(true);
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle()); 
	}

}
