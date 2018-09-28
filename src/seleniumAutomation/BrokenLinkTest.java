package seleniumAutomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrokenLinkTest {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.setHeadless(true);
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kirti.c.sharma\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

}
