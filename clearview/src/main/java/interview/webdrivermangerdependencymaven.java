package interview;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class webdrivermangerdependencymaven {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		
		DesiredCapabilities dr=new DesiredCapabilities();
		dr.setAcceptInsecureCerts(true);
		ChromeOptions options =new ChromeOptions();
		//options.addArguments("--incognito");
		WebDriver driver= new ChromeDriver(options);
		driver.get("https://www.saucedemo.com/");
	 
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		driver.findElement(By.name("login-button")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("CRM/SFA")).click();
	
		Alert alr=driver.switchTo().alert();
		alr.getText();
		alr.accept();
		
		
		
		//driver.close();

	}

}
