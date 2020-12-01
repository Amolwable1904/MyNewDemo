import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println("Launch Crome Browser");
 
       System.setProperty("webdriver.chrome.driver", "D:\\Selenium Drivers\\chromedriver_win32\\chromedriver.exe");
       
       WebDriver driver =new ChromeDriver();
       
       driver.get("http://www.google.com");
       
       driver.manage().window().maximize();
       
	}

}
