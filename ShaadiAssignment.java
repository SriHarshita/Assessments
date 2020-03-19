package myproject;

import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//import org.openqa.selenium.support.ui.Select;

public class ShaadiAssignment {
    static WebDriver driver;
    
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sriharshita.silla\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shaadi.com");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//login button
		WebElement login = driver.findElement(By.xpath("//*[@id=\"___gatsby\"]/div/div[1]/div[1]/div[2]/a[1]"));
		login.click();
		if(login.isDisplayed()) {
			System.out.println("Login tab is opened");
		}
		
		//signup free
		WebElement signup = driver.findElement(By.xpath("//*[@id=\"frmLogin\"]/div[2]/p/a"));
		signup.click();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		
		WebElement email = driver.findElement(By.name("email"));
		Random randomGenerator = new Random();  
		int randomInt = randomGenerator.nextInt(1000);  
		email.sendKeys("username"+ randomInt +"@gmail.com");
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		System.out.println("email verified value-->"+email.getAttribute("value"));
		
		WebElement pwd = driver.findElement(By.name("password1"));
		int randomInt1 = randomGenerator.nextInt(1000);  
		pwd.sendKeys("userna1"+ randomInt1);
		//pwd.sendKeys("sri12");
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		System.out.println("Password filled in value --> "+ pwd.getAttribute("value"));
		System.out.println("pwd is verified");
		
		new WebDriverWait(driver, 40).until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@class,'postedby')]"))).click();
//	   List<WebElement> relationlist = new WebDriverWait(driver, 40).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@id=\\\"___gatsby\\\"]/div/div[6]/form/div[2]/div[3]/div/div[2]")));
//	        for(WebElement relat:relationlist)
//	            if(relat.getText().contains("Brother")) {
//	            	relat.click();
//	        }	
	     WebElement relation = driver.findElement(By.xpath("//*[@id=\"___gatsby\"]/div/div[6]/form/div[2]/div[3]/div/div[2]/div[3]"));
	     relation.click();
		driver.findElement(By.xpath("//*[@id=\"___gatsby\"]/div/div[6]/form/div[3]/button")).submit();
		
		
		WebElement header = driver.findElement(By.className("form-module--form-title--Ltrmj"));
		String head = header.getText();
//		String hd = "Great! Now some basic details";
		System.out.println("navigated to next page name--->" + head);
		
		//firstname and lastname
		WebElement fname = driver.findElement(By.name("first_name"));
		fname.sendKeys("rina");
		WebElement lname = driver.findElement(By.name("last_name"));
		lname.sendKeys("ayyar");
		System.out.println("firstname is verified value-->"+fname.getAttribute("value"));
		System.out.println("lastname is verified value-->"+lname.getAttribute("value"));
		
		//day
		new WebDriverWait(driver, 40).until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(text(),'Day')]"))).click();
		List<WebElement> daylist = new WebDriverWait(driver, 40).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[contains(@class,'day_options')]")));
        for(WebElement dayi:daylist)
            if(dayi.getText().contains("05")) {
            dayi.click();
//            System.out.println("day verified value --->"+dayi.getText());
        }
		//month
        new WebDriverWait(driver, 40).until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(text(),'Month')]"))).click();
		List<WebElement> monthlist = new WebDriverWait(driver, 40).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[contains(@class,'month_options')]")));
        for(WebElement monthi:monthlist)
            if(monthi.getText().contains("May")) {
            	monthi.click();
//            	System.out.println("month verified value --->"+monthi.getText());
        }
	
		//year
        new WebDriverWait(driver, 40).until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(text(),'Year')]"))).click();
		List<WebElement> yearlist = new WebDriverWait(driver, 40).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[contains(@class,'year_options')]")));
        for(WebElement yeari:yearlist)
            if(yeari.getText().contains("1996")) {
            	yeari.click();
//            	System.out.println("year verified value --->"+yeari.getText());
        }

		//religion
        new WebDriverWait(driver, 40).until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@class,'community_selector')]"))).click();
		List<WebElement> religionlist = new WebDriverWait(driver, 40).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[contains(@class,'community_options')]")));
        for(WebElement religi:religionlist)
            if(religi.getText().contains("Hindu")) {
            	religi.click();
//            	System.out.println("religion verified value --->"+religi.getText());
        }
	
		//language
        new WebDriverWait(driver, 40).until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@class,'mother_tongue_selector')]"))).click();
		List<WebElement> langlist = new WebDriverWait(driver, 40).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[contains(@class,'mother_tongue_options')]")));
        for(WebElement langi:langlist)
            if(langi.getText().contains("Telugu")) {
            	langi.click();
//            	System.out.println("language verified value --->"+langi.getText());
        }
	
		//nation
        new WebDriverWait(driver, 40).until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@class,'countryofresidence_selector')]"))).click();
		List<WebElement> nationlist = new WebDriverWait(driver, 40).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[contains(@class,'countryofresidence_options')]")));
        for(WebElement nati:nationlist)
            if(nati.getText().contains("Indian")) {
            	nati.click();
//            	System.out.println("nation verified value-->"+nati.getText());
        }
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"___gatsby\"]/div/div[6]/form/div[6]/div/div/div[2]/div[1]/div[4]")).click();
		//sign up
		driver.findElement(By.xpath("//*[@id=\"___gatsby\"]/div/div[6]/form/div[7]/button")).submit();
		
		//city selection
		WebElement city = driver.findElement(By.xpath("//input[@id='places']"));
		city.click();
		Thread.sleep(2000);
		city.sendKeys("vizag,Andhra Pradesh,India");
		Thread.sleep(2000);
		city.sendKeys(Keys.CONTROL + "\t"); 
//		System.out.println("city verified value --->"+city.getText());
		Thread.sleep(2000);
		
		//family
		driver.findElement(By.xpath("//*[@id=\"livesWithFamilyOption\"]/div[1]/label/div")).click();
		
		try
		{
		//marital status
		WebElement mari = driver.findElement(By.xpath("//input[@id='maritalStatus']"));
		mari.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@value,'Never Married') and @id='maritalStatus']")).click();
		Thread.sleep(2000);
		mari.sendKeys(Keys.CONTROL + "\t"); 
//		System.out.println("marital status verified value --->"+mari.getText());
		Thread.sleep(2000);
		
		//vegetarian or non
		driver.findElement(By.xpath("//*[@id=\"diet\"]/div[2]/label/div")).click();
		
		//height
		WebElement hei = driver.findElement(By.xpath("//input[@id='height']"));
		hei.click();
		driver.findElement(By.xpath("//div[@data-index='2' and @value='4ft 7in - 139cm']")).click();
		Thread.sleep(2000);
	
		//caste
		WebElement cast = driver.findElement(By.xpath("//input[@id='caste']"));
		cast.click();
		Thread.sleep(2000);
		cast.sendKeys("Porwal");
		Thread.sleep(2000);
		cast.sendKeys(Keys.CONTROL + "\t"); 
		Thread.sleep(2000);
		
		//continue
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"submit-form-basic\"]/span[1]/span")).submit();

		//education level
		WebElement edu = driver.findElement(By.xpath("//*[@id=\"educationLevel\"]"));
		edu.click();
		driver.findElement(By.xpath("//div[@value='Bachelors' and @data-index='3']")).click();
		Thread.sleep(2000);
		
		//education field
		WebElement eduf = driver.findElement(By.xpath("//*[@id=\"educationField\"]"));
		eduf.click();
		driver.findElement(By.xpath("//div[@value='Computers/ IT' and @data-index='6']")).click();
		Thread.sleep(2000);
		
		//college
		WebElement clg = driver.findElement(By.xpath("//input[@id='highestCollege']"));
		clg.click();
		Thread.sleep(2000);
		clg.sendKeys("gmr institute of technology");
		Thread.sleep(2000);
		clg.sendKeys(Keys.CONTROL + "\t"); 
		Thread.sleep(2000);
		
		//job
		WebElement job = driver.findElement(By.xpath("//*[@id=\"workingWith\"]"));
		job.click();
		driver.findElement(By.xpath("//div[@value='Private Company' and @data-index='0']")).click();
		Thread.sleep(2000);
		
		//designation
		WebElement des = driver.findElement(By.xpath("//input[@id='workingAs']"));
		des.click();
		Thread.sleep(2000);
		des.sendKeys("Software Developer / Programmer");
		Thread.sleep(2000);
		des.sendKeys(Keys.CONTROL + "\t"); 
		Thread.sleep(2000);
		
		//company
		WebElement comp = driver.findElement(By.xpath("//input[@id='employer']"));
		comp.click();
		Thread.sleep(2000);
		comp.sendKeys("3Pillar Global");
		Thread.sleep(2000);
		comp.sendKeys(Keys.CONTROL + "\t");
		comp.click();
		Thread.sleep(2000);
		
		//salary
		driver.findElement(By.xpath("//*[@id=\"biodata\"]/div[7]/div[1]/div/div/span/span[3]")).click();
		
		//income
		WebElement inc = driver.findElement(By.xpath("//div[@id='INR 2 Lakh to 4 Lakh' and data-index='2']"));
		inc.click();
		//driver.findElement(By.xpath("//*[@value='Private Company")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"submit-form-biodata\"]/span[1]/span")).submit();
		}
		catch(StaleElementReferenceException e) {
			
		}
		
	}

}
