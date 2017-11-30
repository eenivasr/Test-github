package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Frames {
	
	
	
	
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver","D:\\WorkSpace\\SR\\WebElements\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		driver.get("http://toolsqa.com/iframe-practice-page/");
		
		driver.findElement(By.id("IF1"));
		driver.switchTo().frame("iframe1");
		System.out.println("NAME: "+driver.getTitle());
		
		driver.findElement(By.xpath("//*[@id=\"content\"]/form/fieldset/div[1]/input[1]")).sendKeys("SwitchingFrames");
		
		
		
		Thread.sleep(2000);
		
		driver.switchTo().frame(1);
		driver.findElement(By.name("email")).sendKeys("Selenium usertest@gmail.com");
		
		Thread.sleep(2000);
		
		driver.quit();
	}

}
