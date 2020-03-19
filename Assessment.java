package myproject;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assessment {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sriharshita.silla\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		//open the website
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		
		//cookie 
		driver.findElement(By.id("cookie_action_close_header")).click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		//partial link text
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div/div/div/div[2]/div/form/fieldset/div[2]/a")).click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		//link
	    WebElement link = driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div/div/div/div[2]/div/form/fieldset/div[5]/a"));
		link.click();
		//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.navigate().to("https://www.toolsqa.com/automation-practice-form/");
		
		//firstname field
		WebElement fname = driver.findElement(By.name("firstname"));
		fname.sendKeys("Harshitha");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		//lastname field
		WebElement lname = driver.findElement(By.id("lastname"));
		lname.sendKeys("Silla");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		//gender radio button
		WebElement gender = driver.findElement(By.id("sex-1"));
		gender.click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		//radio button
		driver.findElement(By.id("exp-3")).click();
	//	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		//date
		driver.findElement(By.id("datepicker")).sendKeys("09/02/2020");
	//	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		//checkboxes
		driver.findElement(By.id("profession-0")).click();
	//	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.findElement(By.id("profession-1")).click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	//	driver.findElement(By.name("profession")).click();
		
		//uploading image
		WebElement uploadElement = driver.findElement(By.id("photo"));
		uploadElement.sendKeys("C:\\Users\\sriharshita.silla\\Pictures\\Screenshots\\Screenshot (4).png");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		//downloading files
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div/div/div/div[2]/div/form/fieldset/div[25]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div/div/div/div[2]/div/form/fieldset/div[26]/a")).click();
	//	driver.findElement(By.xpath("//*[@id=\"cp_id_fbcbd-1\"]/div[2]/div/div[2]/img")).click();
        WebElement check1 = driver.findElement(By.id("tool-0"));
        check1.click();
        Select dropdwn = new Select(driver.findElement(By.id("continents")));
        dropdwn.selectByValue("AUS");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        Select multiple1 = new Select(driver.findElement(By.id("continentsmultiple")));
    //    multiple1.selectByVisibleText("Asia");
        multiple1.selectByValue("SA");
        multiple1.selectByValue("AUS");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        Select multiple = new Select(driver.findElement(By.id("selenium_commands")));
        multiple.selectByVisibleText("Navigation Commands");
        multiple.selectByVisibleText("Switch Commands");
    	driver.findElement(By.id("buttonwithclass")).submit();
	}

}
