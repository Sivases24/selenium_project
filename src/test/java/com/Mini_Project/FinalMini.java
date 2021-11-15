package com.Mini_Project;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.Reader.FileReaderManger;
import com.SDPclass.Singleton_design_Pattern;

public class FinalMini extends base_class {

	public static WebDriver driver = base_class.get_Driver("chrome");

	public static Singleton_design_Pattern pom = new Singleton_design_Pattern(driver);

	public static void main(String[] args) throws Exception {

		geturl("http://automationpractice.com/index.php");

		clickOnElement(pom.getInstanceHp().getLogin());

		waitForSeconds(10);
		String username = FileReaderManger.getinstanceFRM().getInstance().getusername();
		
		Inputvalues(pom.getInstanceLogin().getUser(), username);
		
		String password = FileReaderManger.getinstanceFRM().getInstance().getusername();
		Inputvalues(pom.getInstanceLogin().getPass(), password);
		
		clickOnElement(pom.getInstanceLogin().getLog());
		Sleep(3000);

		actionsMethod(pom.getInstanceDresscls().getDress());
		clickOnElement(pom.getInstanceDresscls().getEveDress());
		
		actionsMethod(pom.getInstancePrintdresses().getPdress());
		clickOnElement(pom.getInstancePrintdresses().getQview());
		
		frame_Into(pom.getInstanceFrames().getFrame());
		for (int i = 0; i < 4; i++) {
        clickOnElement(pom.getInstanceFrames().getIcon());		}

		dropdown(pom.getInstanceFrames().getSizes(), "M", "byValue");

		clickOnElement(pom.getInstanceFrames().getColor());
		Sleep(3000);

		WebElement submit = driver.findElement(By.xpath("//button[@name='Submit']"));
		clickOnElement(submit);
		Sleep(3000);

		frame_Out();
		waitForSeconds(10);

		Takescreenshot("img.png");

		clickOnElement(pom.getInstanceCheckout().getCheck());
		Sleep(3000);

		scroll_Down();
		Sleep(3000);
		Takescreenshot("img1.png");

        clickOnElement(pom.getInstanceCheckout2().getCheckout2());		
        Sleep(3000);

		clickOnElement(pom.getInstanceAddcls().getSub());
		Sleep(3000);

		clickOnElement(pom.getInstanceBoxcls().getBox());
		Sleep(3000);

		clickOnElement(pom.getInstanceShipping().getShipping());
		Sleep(3000);

		scroll_Down();
		Sleep(3000);
		Takescreenshot("img2.png");

	    clickOnElement(pom.getInstancePaycls().getPaybank());
	    Sleep(3000);

		clickOnElement(pom.getInstacePayedcls().getPayed());
		Sleep(3000);

		scroll_Down();
		Sleep(3000);
		Takescreenshot("img3.png");

	}
}
