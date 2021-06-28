package WebDriverArchitectureDesign;

public interface webdriver extends SearchContext{
	
	public void get(String url);
	public String getTitle();
	public void close();
	public void maximise();
	public void click(String element);
	public void sendKeys(String Value);
	
    @Override
	public void findelement(String element);
    @Override
	public void findelements(String element);
	

}
