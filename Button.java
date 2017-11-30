

package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Button {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.gecko.driver","D:\\WorkSpace\\SR\\WebElements\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		driver.get("http://www.google.co.in/");	
		System.out.println("PAGE TITLE  : "+driver.getTitle());
		Thread.sleep(1000);

		driver.findElement(By.id("lst-ib")).click(); System.out.println("Clicked");
		driver.findElement(By.id("lst-ib")).clear();System.out.println("Clear");
		driver.findElement(By.id("lst-ib")).sendKeys("Test");System.out.println("SendKeys");
		
		//driver.findElement(By.cssSelector("#tsf > div.tsf-p > div.jsb > center > input[type=\"submit\"]:nth-child(1)")).click();//cssSelector
		driver.findElement(By.name("btnK")).click();
		Thread.sleep(1000);
		
		driver.quit();
	}

}

