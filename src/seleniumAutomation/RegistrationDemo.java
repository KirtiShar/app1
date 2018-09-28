package seleniumAutomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RegistrationDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kirti.c.sharma\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.navigate().to("http://demo.automationtesting.in/Register.html");
		//Enter First name & Last name
		driver.findElement(By.cssSelector("input[placeholder='First Name']")).sendKeys("Demo");
		driver.findElement(By.cssSelector("input[placeholder='Last Name']")).sendKeys("Test");
		//Enter Address
		driver.findElement(By.cssSelector("textarea[ng-model='Adress']")).sendKeys("First Cross\nBellandur\nBangalore");
		//Enter EmailID
		driver.findElement(By.cssSelector("input[type='email']")).sendKeys("demo.test@gmail.com");
		//Enter Phone number
		driver.findElement(By.cssSelector("input[type='tel']")).sendKeys("9988776655");
		//Selecting Male option
		driver.findElement(By.cssSelector("input[value='Male']")).click();
		//Selecting Hobbies checkbox
		driver.findElement(By.cssSelector("input[value='Cricket']")).click();
		driver.findElement(By.cssSelector("input[value='Movies']")).click();
		//chose language
		driver.findElement(By.id("msdd")).click();
		driver.findElement(By.linkText("English")).click();
		
		//Selecting skills
		WebElement skillElement = driver.findElement(By.id("Skills"));
		Select skill = new Select(skillElement);
		skill.selectByVisibleText("Java");
		
		//Selecting Country
		WebElement countryElement = driver.findElement(By.id("countries"));
		Select country = new Select(countryElement);
		country.selectByValue("India");
		
		
		//Selecting Country2
		driver.findElement(By.xpath("span[role='presentation']"));
		driver.switchTo().frame("google_osd_static_frame");
		driver.findElement(By.xpath("//li[text()='India']")).click();
		driver.switchTo().defaultContent();
		
		//Select DOB
		WebElement yearElement = driver.findElement(By.id("yearbox"));
		Select year = new Select(yearElement);
		skill.selectByVisibleText("1988");
		
		WebElement monthElement = driver.findElement(By.cssSelector("select[placeholder='Month']"));
		Select month = new Select(monthElement);
		skill.selectByVisibleText("November");
		
		WebElement dayElement = driver.findElement(By.id("daybox"));
		Select day = new Select(dayElement);
		skill.selectByValue("7");
		
		//Enter Password
		driver.findElement(By.id("firstpassword")).sendKeys("Demotest");
		driver.findElement(By.id("secondpassword")).sendKeys("Demotest");
	}

}
