import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSDemo
{

	public static void main(String[] args)
	{
		
		
		   System.out.println("Launch Crome Browser");
		   
	       System.setProperty("webdriver.chrome.driver", "D:\\Selenium Drivers\\chromedriver_win32\\chromedriver.exe");
	      
	       WebDriver driver = new ChromeDriver();
	      
	       
	       driver.get("http://demo.guru99.com/V4/");			

	      
	       driver.manage().window().maximize();
	       
	     //  Capture Scrape Data and Navigate to different pages using JavaScriptExecutor.
	       
	       JavascriptExecutor js= (JavascriptExecutor)driver;
	       
	      // Fetching Domain name of the site
	       
	       String domainName=js.executeScript("return document.domain;").toString();
	       
	       System.out.println("The Domain name is :- "+domainName);
	       
	       // Fetching Url from the site 
	       
	       String urlName=js.executeScript("return document.URL;").toString();
	       
	       System.out.println("The URl Name is :- "+urlName);
	       
	     //Method document.title fetch the Title name of the site. Tostring() change object to name	
	       
	       String TitleName = js.executeScript("return document.title;").toString();	
	       
	       System.out.println("Title of the page = "+TitleName);	
	       
	     //Navigate to new Page i.e to generate access page. (launch new url)
	       
	       js.executeScript("window.location = 'http://www.facebook.com/'");			


	}

}
