package modulepackage.RedrobProject;

import org.testng.annotations.Test;

public class TestCase2_Login_With_Valid_Credentials extends BaseClass {

	@Test
	public void signin() {
		SignupPage signupPage = new SignupPage(driver);  // ✅ Initialize properly
		SigninPage signinPage = new SigninPage(driver);

		signupPage.signupfromhomepage();                 // ✅ Click signup button
		SignupPage.switchToSignupTab();                  // ✅ Switch to new tab
		signinPage.clickLoginLink();                     // ✅ Click Login link
	}
}
