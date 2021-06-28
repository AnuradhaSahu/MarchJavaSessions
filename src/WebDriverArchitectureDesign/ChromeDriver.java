package WebDriverArchitectureDesign;

public class ChromeDriver implements webdriver{
	
	public ChromeDriver() {
		System.out.println("Launch google Chrome");
	}

	@Override
	public void get(String url) {
System.out.println("enter the url"+url);		
	}

	@Override
	public String getTitle() {
		return "Some title";
	}

	@Override
	public void close() {
		System.out.println("Closing teh browser");		
		
	}

	@Override
	public void maximise() {
		System.out.println("Maximising teh window");		
		
	}

	@Override
	public void click(String element) {
		System.out.println("clicking on the window"+element);		
		
	}

	@Override
	public void sendKeys(String Value) {
		System.out.println("pass teh value to element "+Value);		
		
	}

	@Override
	public void findelement(String element) {
		System.out.println("find the element "+element);		
		
	}

	@Override
	public void findelements(String elements) {
		System.out.println("find the elements "+elements);		
		
	}

}
