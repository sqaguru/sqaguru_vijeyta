package orangehrm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class HomePage {

	private WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	By BTN_CONTACT_SALES = By.linkText("CONTACT SALES");

	By BTN_REQUEST_DEMO = By.linkText("GET A FREE DEMO");

	public void clickContactSalesButton() {

		driver.findElement(BTN_CONTACT_SALES).click();

		String contactSalesTitleActual = driver.getTitle();

		String contactSalesTitleExpected = "Contact OrangeHRM";

		Assert.assertEquals(contactSalesTitleActual, contactSalesTitleExpected, "Verify Page title for Contact Sales");
	}

	public void clickRequestDemoButton() {
		driver.findElement(BTN_REQUEST_DEMO).click();

		String requestDemoTitleActual = driver.getTitle();

		String requestDemoTitleExpected = "Sign Up for a Free HR Software Demo | OrangeHRM";

		Assert.assertEquals(requestDemoTitleActual, requestDemoTitleExpected,
				"Verify Page title for Sign Up for a Free HR Software Demo | OrangeHRM");
	}

}
