package interview;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/window.xhtml");
		System.out.println("home window" +driver.getWindowHandle());
		driver.findElement(By.xpath("//span[text()='Open']")).click();
		//String opendedwindoww=driver.getWindowHandle();
		//driver.switchTo().window();
		//String openedwindowtitle=driver.getTitle();
		//System.out.println(openedwindowtitle);
		//System.out.println("clciked window" +driver.getWindowHandle());
		
		//WebDriverWait wait= new WebDriverWait(driver, 10);
		//wait.until(ExpectedConditions.visibilityOfElementLocated((By) driver.findElement(By.linkText("Book Now"))));
	
		//wait.until(ExpectedConditions.visibilityOfElementLocated((By) driver.findElement(By.linkText("Book Now"))));

		Set<String> windowHandles = driver.getWindowHandles();
		//System.out.println("all window" +windowHandles);
		/*for (String eachwindow : windowHandles) {
			System.out.println(eachwindow);
			
		}*/
		
		List<String> list= new ArrayList<String>(windowHandles);
		String openedwindow=list.get(1);
		System.out.println(openedwindow);
		driver.switchTo().window(openedwindow);
		boolean value=driver.findElement(By.xpath("//input[@type='text'][1]")).isDisplayed();
		if(value)
			System.out.println("element located in first window");
		//String title=driver.switchTo().window(openedwindow).getTitle();
		//System.out.println(title);
		driver.close();
		driver.switchTo().window(list.get(0));
		System.out.println(driver.getTitle());
	
	}

}
