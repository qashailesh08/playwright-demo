package practice;

import com.microsoft.playwright.*;

public class Demo {
	public static void main(String[] args) {
		Playwright playwright = Playwright.create();
		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		Page page = browser.newPage();
		page.navigate("http://localhost:8888");

		System.out.println(page.title());

		Locator locUserName = page.locator("//input[@name='user_name']");
		locUserName.fill("admin");
		Locator locUserPassword = page.locator("//input[@name='user_password']");
		locUserPassword.clear();
		locUserPassword.fill("admin");
		Locator locColorTheme = page.locator("//select[@name='login_theme']");
		locColorTheme.selectOption("bluelagoon");
		page.locator("//input[@name='Login']").click();
		page.locator("//td[contains(@onmouseover,'Marketing_sub')]").click();
		// Contacts Module
		page.locator("//table[@class='level2Bg']//a[text()='Contacts']").click();
		// Contacts Create Button
		page.locator("//img[@title='Create Contact...']").click();
		// Select Salutation Type
		page.locator("//select[@name='salutationtype']").selectOption("Mr.");
		// First Name
		page.locator("//input[@name='firstname']").fill("Er. Shailesh");
		// Last Name
		page.locator("//input[@name='lastname']").fill("Patel");
		// Company
		page.locator("//select[@name='leadsource']").selectOption("Conference");
		// Title
		page.locator("//input[@name='fax']").fill("IT Engineer");
		// Office Phone
		page.locator("//input[@name='phone']").fill("7300559827");
		// Phone
		page.locator("//input[@name='mobile']").fill("8934679200");
		// Title
		page.locator("//input[@name='title']").fill("Junior Test Engineer");
		// Email
		page.locator("//input[@name='email']").fill("juniorengineer74@gmail.com");
		// Address Information
		page.locator("//input[contains(@onclick,'copyAddressLeft')]").click();
		// Mailing Street
		page.locator("//textarea[@name='mailingstreet']").fill("Gala, Palidih, Pathalgav , Chhattisgar");
		// Mailing PO Box
		page.locator("//input[@name='mailingpobox']").fill("Palidih");
		// Mailing City
		page.locator("//input[@name='mailingcity']").fill("Pathalgav");
		// Mailing State
		page.locator("//input[@name='mailingstate']").fill("Chhattisgar");
		// Mailing Postal Code
		page.locator("//input[@name='mailingzip']").fill("843679");
		// Mailing Country
		page.locator("//input[@name='mailingcountry']").fill("India");
		// Copy Mailing Address
		page.locator("//input[contains(@onclick,'copyAddressRight')]").click();
		// Save
//		page.locator("(//input[@title='Save [Alt+S]'])[2]").click();
		
	}
}
