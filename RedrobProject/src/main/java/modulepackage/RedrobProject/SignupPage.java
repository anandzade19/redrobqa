package modulepackage.RedrobProject;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignupPage {

	static WebDriver driver;


	// Web Elements
	@FindBy(xpath = "//div[@class='framer-ckxxcu-container']")
	WebElement signupbutton;

	@FindBy(xpath = "//input[@id='headlessui-input-:r0:']")
	WebElement firstname;

	@FindBy(xpath = "//input[@id='headlessui-input-:r1:']")
	WebElement lastname;

	@FindBy(xpath = "//input[@id='headlessui-input-:r2:']")
	WebElement email;

	@FindBy(xpath = "//input[@id='headlessui-input-:r3:']")
	WebElement password;

	@FindBy(xpath = "//input[@id='headlessui-input-:r4:']")
	WebElement confirmpass;

	@FindBy(xpath = "//input[@placeholder='Enter your company']")
	WebElement companyname;

	@FindBy(xpath = "//button[@id='headlessui-listbox-button-:r8:']")
	WebElement listofcountry;

	@FindBy(xpath = "//label[contains(text(),'I agree to')]")
	WebElement tandcbox;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement createaccountbutton;

	// Methods

	// Click on Signup button
	public void signupfromhomepage() {
		signupbutton.click();
	}

	// Switch to the new signup tab
	public static void switchToSignupTab() {
		String originalWindow = driver.getWindowHandle();
		Set<String> allHandles = driver.getWindowHandles();
		ArrayList<String> handlesList = new ArrayList<>(allHandles);

		for (String handle : handlesList) {
			if (!handle.equals(originalWindow)) {
				driver.switchTo().window(handle);
				break;
			}
		}
	}

	public void enterFirstname() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		firstname.sendKeys("Anand");
	}

	public void enterLastname() {
		lastname.sendKeys("Zade");
	}

	public void enterEmail() {
		email.sendKeys("anandzade+2@gmail.com");
	}

	public void enterPassword() {
		password.sendKeys("Anand@123");
	}

	public void enterConfirmPassword() {
		confirmpass.sendKeys("Anand@123");
	}

	public void enterCompanyName() {
		companyname.sendKeys("Redrob");
	}

	public void selectCountryIndia() {
	    listofcountry.click(); // Open dropdown

	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    
	    // Wait for the 'India' option to be visible and clickable
	    WebElement indiaOption = wait.until(ExpectedConditions
	            .visibilityOfElementLocated(By.xpath("//li[contains(., 'India')]")));
	    
	    indiaOption.click(); // Select India
	}

	public void acceptTermsAndConditions() {
		tandcbox.click();
	}

	public void clickCreateAccount() {
		createaccountbutton.click();
	}
	

	// Constructor
	public SignupPage(WebDriver driver) {
		SignupPage.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
