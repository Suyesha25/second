package Login1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login11 {

public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver", "C://Users//Suyesha//Drivers-Eclips//geckodriver-v0.21.0-win64//geckodriver.exe");	
	
	//System.setProperty("webdriver.chrome.driver", "C:/Users/Suyesha/Drivers-Eclips/chromedriver.exe");
	//WebDriver driver =new ChromeDriver();
	
 WebDriver driver = new FirefoxDriver();
 driver.get("https://www.facebook.com/");

 driver.findElement(By.name("email")).sendKeys("suyesha.deole.1@facebook.com");
 driver.findElement(By.name("pass")).sendKeys("@Iamunique25@");
 driver.findElement(By.linkText("Forgotten account?")).click();
 //driver.findElement(By.id("u_0_a")).click();id changes for this after refresh
// driver.findElement(By.id("u_0_8")).click();
 
	//Thread.sleep(5000);
	//driver.quit();
}
}


