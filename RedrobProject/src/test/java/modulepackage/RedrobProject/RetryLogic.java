package modulepackage.RedrobProject;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryLogic implements IRetryAnalyzer {

	@Override
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		int initialcount = 0;
		int retrycout =5;
		return false;
	}

}
