package com.Mini_Project;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.ScreenshotException;
import org.openqa.selenium.support.ui.Select;

public class base_class {
	
	public static WebDriver driver;
	
    public static WebDriver get_Driver(String type) {
    	if (type.equalsIgnoreCase("chrome")) {
    		System.setProperty("webdriver.chrome.driver", 
    				System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
    		
    		driver = new ChromeDriver();
    		
			
		}else if (type.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", 
					System.getProperty("user.dir") + "\\Driver\\chromedriver.exe" );
			
		}
    	
    	driver.manage().window().maximize();
		return driver;
    	
    }
    
    public static void Inputvalues(WebElement element, String value) {
    	element.sendKeys(value);

	}
    
    public static void clickOnElement(WebElement element) {
    	element.click();

	}
    
    public static void geturl(String url) {
    	driver.get(url);

	}
    
    public static void waitForSeconds(int a) {
    	driver.manage().timeouts().implicitlyWait(a, TimeUnit.SECONDS);

	}
	
	public static void actionsMethod(WebElement move) {
		Actions act = new Actions(driver);
		act.moveToElement(move).perform();

	}
	
	public static void frame_Into(WebElement frame) {
		driver.switchTo().frame(frame);

	}
	
	public static void frame_Out() {
		
		driver.switchTo().defaultContent();
		

	}
	
	public static void Sleep(int a) throws InterruptedException {
		Thread.sleep(a);

	}
	
	public static void dropdown(WebElement element, String type, String Value ) {
		Select s = new Select(element);
		
		if (type.equalsIgnoreCase("byIndex")) {
			int parseInt = Integer.parseInt(type);
			s.deselectByIndex(parseInt);
			
		}else if (type.equalsIgnoreCase("byValue")) {
			s.selectByValue(type);
			
		}else if (type.equalsIgnoreCase("byVisibleText")); {
			s.selectByVisibleText(type);
			
		}
		 

		
	}
	public static void Takescreenshot(String file) throws Exception{
		TakesScreenshot shot = (TakesScreenshot) driver;
		File sou = shot.getScreenshotAs(OutputType.FILE);
		File Des = new File(System.getProperty("user.dir") + "\\Screenshot\\" + file);
		FileUtils.copyFile(sou, Des);
		

	}
	public static void scroll_Down() {
		JavascriptExecutor js = (JavascriptExecutor) driver ;
		js.executeScript("window.scroll(0, 500)", " ");

	}

	}
	
	


