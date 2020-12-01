import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDropDemo
{

	public static void main(String[] args)
	{
		 System.out.println("Launch Crome Browser");
		   
	       System.setProperty("webdriver.chrome.driver", "D:\\Selenium Drivers\\chromedriver_win32\\chromedriver.exe");
	       
	       WebDriver driver = new ChromeDriver();
	       
	       driver.get("https://demoqa.com/droppable");
	       
	       driver.manage().window().maximize();
	       
	       Actions action=new Actions(driver);
	      
	       WebElement from =driver.findElement(By.id("draggable"));
           
	       WebElement to =driver.findElement(By.id("droppable"));
	       
	       action.dragAndDrop(from, to).build().perform();
	}

}
