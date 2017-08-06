package test;

import java.awt.SecondaryLoop;
import java.util.List;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestClass {
	
	@Test
	public static void main(String[] args){
		
		System.out.println("Working");
		
		
		System.setProperty("webdriver.chrome.driver", "/Users/admin/Downloads/chromedriver");
		//System.setProperty("webdriver.firefox.driver", "/Users/admin/Downloads/geckodriver");
		//Applications/Firefox.app/Contents/MacOS/firefox-bin
		//WebDriver driverFirefox = new FirefoxDriver();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		/*
		WebElement table = driver.findElement(By.xpath("//table[@class='WRD']"));
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
		    .withTimeout(60, TimeUnit.SECONDS)
		    .pollingEvery(5, TimeUnit.SECONDS)
		    .ignoring(NoSuchElementException.class);
		
		Object hey = wait.until(visibilityOfAllElementsLocatedBy(table));
		
		*/
		driver.manage().window().maximize();
		String parent_window = driver.getWindowHandle();
		driver.switchTo().window(parent_window);
		
		//id=email
		driver.findElement(By.id("email")).sendKeys("alberto.escada@gmail.com");
		//WebDriverElement = 
		
		//id=pass
		driver.findElement(By.id("pass")).sendKeys("libertad0");
		
		//id=u_0_7
		String text = driver.findElement(By.xpath("//*[@id='login_form']/table/tbody/tr[3]/td[2]/div/a")).getText();
		System.out.println(text);
		assertEquals("Forgotten account?", text);
		
		//xpath = //*[@id="blueBarDOMInspector"]/div/div/div/div[1]/h1/a/i
		WebElement image = driver.findElement(By.xpath("//*[@id='blueBarDOMInspector']/div/div/div/div[1]/h1/a/i"));
		System.out.println(image.getCssValue("color"));
		assertEquals("170px",image.getCssValue("width"));
		
		Actions builder = new Actions(driver);
		
		/*
		WebElement link = driver.findElement(By.xpath("//*[@id='login_form']/table/tbody/tr[3]/td[2]/div/a"));

		builder.keyDown(Keys.CONTROL)
		.click(link)
		.keyUp(Keys.CONTROL)
		.build().perform();
		*/
		
		driver.quit();	
	}
	public static ExpectedCondition<WebElement> visibilityOfAllElementsLocatedBy(final WebElement locator) {
		return new ExpectedCondition<WebElement>() {
			@Override
			public WebElement apply(WebDriver driver) {
				
				try {
					List<WebElement> elements = locator.findElements(By.xpath(".//tbody/tr"));
					System.out.println(elements.size());
					for (WebElement element : elements) {
						String text = element.findElement(By.xpath("./td[1]")).getText();
						System.out.println(text);
						if (text.contains("Cris")) {
							System.out.println("Entra");
							return element;
						}
					}
					driver.findElement(By.xpath("//input[@id='si' and @name='w']")).sendKeys("1");

					// Si mientras está esperando encuentra un error, lanza
					// excepción
					

				} catch (Exception e){
					return null;
				}
				return null;
			}

			@Override
			public String toString() {
				return "visibility of any elements located by " + locator;
			}
		};
	}
}
	
