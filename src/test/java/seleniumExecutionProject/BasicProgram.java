package seleniumExecutionProject;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class BasicProgram {
	public static void main (String args[]) {
	WebDriver driver;	
	driver = new ChromeDriver();
	driver.get("http://www.seleniumhq.org");
	driver.findElement(By.linkText("Documentation")).click();
    driver.findElement(By.linkText("Selenium WebDriver")).click();
    Assert.assertEquals("Selenium WebDriver — Selenium Documentation", driver.getTitle());
    driver.quit();
	}

}
