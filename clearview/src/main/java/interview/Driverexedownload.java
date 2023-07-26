package interview;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Driverexedownload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		WebDriver dr= new ChromeDriver();
		dr.get("https://www.avenuinsights.com/solutions/administration/records-solutions/clearview-grids/");

}
}
