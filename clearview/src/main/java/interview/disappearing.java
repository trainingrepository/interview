package interview;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class disappearing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		jse.executeScript("document.getElementsByClassName('G43f7e').value='text' args)
		
	}

}
