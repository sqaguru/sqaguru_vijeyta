package orangehrm.testcases;

import org.testng.annotations.Test;
import orangehrm.framework.Base;
import orangehrm.pages.FreeDemoPage;
import orangehrm.pages.HomePage;

public class RequestDemoTest extends Base {
	@Test(description = "to verify request demo elements exist on the request demo form")
	public void contactSalesFormTest() {

		HomePage homePage = new HomePage(driver);

		homePage.clickRequestDemoButton();

		FreeDemoPage freeDemoPage = new FreeDemoPage(driver);

		freeDemoPage.verifyFreeDemoFormFields();

	}
}
