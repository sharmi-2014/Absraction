package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonPrice {
	public static void main(String[] args) {
		
		
		//WebDriverManager.chromedriver().setup();
   ChromeDriver driver=new ChromeDriver();
   driver.manage().window().maximize();
   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
   driver.get("https://www.amazon.in/");
   driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobile",Keys.ENTER);
   List<String>lst=new ArrayList<String>();
   List<WebElement> price = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
	 for(int i=0;i<price.size();i++) {
		 String num = price.get(i).getText();
	     lst.add(num) ;
	 
	     System.out.println(num);
	 }
	    
	    
}
}
