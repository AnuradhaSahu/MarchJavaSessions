package WebDriverArchitectureDesign;

public abstract class GoogleTest {
	 static webdriver driver;

	public static void main(String[] args) {

		String browser="Safari";
		
		if(browser.equals("chrome")) {
			driver=new ChromeDriver();
		}else if(browser.equals("FireFox")) {
			driver=new FireFox();
		}else if(browser.equals("Safari")) {
			driver=new Safari();
		}else {
			System.out.println("Please pass teh right browser");
		}
		

		driver.get("www.google.com");
		String title=driver.getTitle();
		System.out.println(title);
		if(title.equals("Some title")) {
			System.out.println("pass");
		}
		driver.findelement("Search");
		driver.sendKeys("Naveen Automation labs");
		driver.click("submit");
		driver.close();
	}

}
