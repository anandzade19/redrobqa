package modulepackage.RedrobProject;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SigninPage {

	WebDriver driver;

	@FindBy(xpath = "//a[@class='text-label-semibold text-primary-400  py-[10px] px-1']")
	WebElement loginLink;

	

	public void clickLoginLink() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(loginLink)).click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//Constructor
	public SigninPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
