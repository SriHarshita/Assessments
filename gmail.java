package myproject;

//import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;//import org.openqa.selenium.interactions.Actions;

public class gmail {
    static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sriharshita.silla\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.gmail.com/");
        driver.manage().window().maximize();
        driver.findElement(By.id("identifierId")).sendKeys("sriharshitasilla");
       // driver
        driver.findElement(By.className("CwaK9")).click();
        Thread.sleep(1000);
        driver.findElement(By.name("password")).sendKeys("sriharsi12");
        Thread.sleep(1000);
        driver.findElement(By.className("CwaK9")).click();
    //    Actions action = new Actions("driver");
    //    action.moveToElement()      mouse
        String ar = driver.getTitle();
        String er = "gmail";
        if(ar.equalsIgnoreCase(er))
        {
        	System.out.print("Test runs successfully");
        }
        else
        {
        	System.out.print("Test fail");
        }
	}

}
