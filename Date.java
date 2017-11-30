package WebElements;

import java.util.List;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Date {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.gecko.driver","D:\\WorkSpace\\SR\\WebElements\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("http://demo.guru99.com/selenium");

        //Find the date time picker control

        WebElement dateBox = driver.findElement(By.xpath("//form//input[@name='bdaytime']"));

        //Fill date as mm/dd/yyyy as 09/25/2013

        dateBox.sendKeys("09252013"); Thread.sleep(3000);
        dateBox.sendKeys(" 0245PM");  

        //Press tab to shift focus to time field

        dateBox.sendKeys(Keys.TAB);Thread.sleep(3000);

        //Fill time as 02:45 PM

       
        Thread.sleep(3000);
        
        
        driver.findElement(By.xpath("/html/body/form/input[2]")).submit();

        Thread.sleep(3000);
        
        driver.quit();

	}

}
