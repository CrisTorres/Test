package test;



public class TestClass {
	
	public static void main(String[] args){
		
		System.out.println("Working");
		return;
		
		/*
		System.setProperty("webdriver.chrome.driver", "/Users/admin/Downloads/chromedriver");
		//System.setProperty("webdriver.firefox.driver", "/Users/admin/Downloads/geckodriver");
		//Applications/Firefox.app/Contents/MacOS/firefox-bin
		//WebDriver driverFirefox = new FirefoxDriver();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.wordreference.com/es/en/translation.asp?spen=eclipse");
		
		WebElement table = driver.findElement(By.xpath("//table[@class='WRD']"));
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
		    .withTimeout(60, TimeUnit.SECONDS)
		    .pollingEvery(5, TimeUnit.SECONDS)
		    .ignoring(NoSuchElementException.class);
		
		Object hey = wait.until(visibilityOfAllElementsLocatedBy(table));
		
		
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
		
		WebElement link = driver.findElement(By.xpath("//*[@id='login_form']/table/tbody/tr[3]/td[2]/div/a"));

		builder.keyDown(Keys.CONTROL)
		.click(link)
		.keyUp(Keys.CONTROL)
		.build().perform();
		
		
		driver.quit();	*/
	}

}
	
