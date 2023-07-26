package interview;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Webtables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		/*List<WebElement> findElements = driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody//tr"));
		
		for (WebElement webElement : findElements) {
			
			System.out.println(webElement.getText());
			
		}*/
		
		int rowcount=driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody//tr")).size();

		int colcount=driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody//th")).size();
		//System.out.println(colcount);
		for (int i = 1; i < rowcount; i++) {
			for (int j = 1; j <= colcount; j++) {
				
				
				List<String> text=new ArrayList<>();
				
					text.forEach(null)	driver.findElement(By.xpath("//table[@class='ws-table-all']/tbody/tr["+(i+1)+"]/td["+j+"]")).getText();
				//System.out.println(text);
				
				if(text.equals("Maria Anders"))
					
				{
					
				System.out.println(string text1=);
				
			}
			
		}
		
		driver.quit();
	}

}
}