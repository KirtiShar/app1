package pattern;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class B 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kirti.c.sharma\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
		((ChromeDriver) driver).findElementByName("firstname").sendKeys("dare");
		((ChromeDriver) driver).findElementByName("lastname").sendKeys("devil");
		((ChromeDriver) driver).findElementByXPath("//input[@value='Male']").click();
		boolean b=((ChromeDriver) driver).findElementByXPath("//input[@value='Male']").isSelected();
		System.out.println(b);
		DateFormat dateformat = new SimpleDateFormat("dd/MM/yyyy");
		Date date = new Date();
		String todaysDate= dateformat.format(date);
		System.out.println(todaysDate);
		((ChromeDriver) driver).findElementByXPath("//input[@value='2']").click();
		((ChromeDriver) driver).findElementByXPath("//tbody/tr[5]/td[2]/input").sendKeys(todaysDate); 
	}

}
