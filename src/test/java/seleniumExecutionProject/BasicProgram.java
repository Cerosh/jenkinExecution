package seleniumExecutionProject;



import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BasicProgram {
	@Test(description="Test case executed through Jenkins")
	public void navigate() {
	WebDriver driver;	
	driver = new ChromeDriver();
	driver.get("http://www.seleniumhq.org");
	driver.findElement(By.linkText("Documentation")).click();
    driver.findElement(By.linkText("Selenium WebDriver")).click();
    AssertJUnit.assertEquals("Selenium WebDriver — Selenium Documentation", driver.getTitle());
    driver.quit();
	}

}
