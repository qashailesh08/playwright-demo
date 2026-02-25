package com.cg.vtiger.marketing.module;

import org.testng.annotations.Test;

import com.microsoft.playwright.*;

public class DeleteAccount {

	@Test(priority=1)
	public void test_001_AccountSearchAndDelete() {
		Playwright play=Playwright.create();	
		Browser browser=play.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		Page page=browser.newPage();
		page.navigate("http://localhost:8888");
	
	}
}
