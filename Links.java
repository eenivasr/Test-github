package WebElements;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Links {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver","D:\\WorkSpace\\SR\\WebElements\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		driver.get("http://www.rediff.com/");
		
		
		
		String parentWindowHandler = driver.getWindowHandle(); // Store your parent windowSystem.out.println("Parent Handles"+parentWindowHandler);
		
		Set<String> handles = driver.getWindowHandles(); //	System.out.println("Handles"+handles);// get all window handles
				
		 for (String currWindowHandler : handles)           /* Loop in the allWindowHandlers. */
		 {
		 		 
			 if (!currWindowHandler.equals(parentWindowHandler))/* If not mainWindowHandler then close it. */
			 {
		 		 driver.switchTo().window(currWindowHandler);/* First switch to the popup window. */
		  		 String currWindowTitle = driver.getTitle();/* Get current web page title first, because can not  * get this value after close it.		 * */
		 		 driver.close();/* Then quite Firefox browser.*/
		  		 System.out.println("Quit popup, browser title is : " + currWindowTitle);
			 }
		 }	
		 
		 Thread.sleep(5000);
		 driver.switchTo().window(parentWindowHandler);	
		
		//driver.findElement(By.linkText("rediffmail")).click();//link
		//driver.findElement(By.partialLinkText("mail")).click();//partiallink
		driver.findElement(By.className("curhand")).click();
		System.out.println("New PAGE TITLE  : "+driver.getTitle());
		
		driver.navigate().back();
		System.out.println("Back PAGE TITLE  : "+driver.getTitle());
		
		Thread.sleep(1000);
		
		List<WebElement> links = driver.findElements(By.tagName("a"));	
		System.out.println(links.size());
		 
//		for (int i = 1; i<=links.size(); i=i+1)
// 
//		{
// 
//			System.out.println(links.get(i).getText());
// 
//		}
		Thread.sleep(5000);
		driver.quit();

	}

}
