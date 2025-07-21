package modulepackage.RedrobProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {

	WebDriver driver;

	@BeforeMethod
	public void launch() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://in.redrob.io/");
	}

	@AfterMethod
	public void quit() throws InterruptedException {
		Thread.sleep(5000);
		//driver.quit();
	}
}
