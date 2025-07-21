package modulepackage.RedrobProject;

import org.testng.annotations.Test;

public class TestCase1_Signup extends BaseClass {

    @Test
    public void signup() throws InterruptedException {
        // Initialize SignupPage object
        SignupPage signuppage = new SignupPage(driver);

        // Navigate to Signup page and switch tab
        signuppage.signupfromhomepage();     // Click signup
        SignupPage.switchToSignupTab();      // Switch tab

        // Fill in the signup form
        signuppage.enterFirstname();
        signuppage.enterLastname();
        signuppage.enterEmail();
        signuppage.enterPassword();
        signuppage.enterConfirmPassword();
        signuppage.enterCompanyName();
        signuppage.selectCountryIndia();
        signuppage.acceptTermsAndConditions();

        // Optional: Click Create Account button
         //signuppage.clickCreateAccount();
    }
}
