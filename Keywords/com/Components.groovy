package com

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.By
import org.openqa.selenium.JavascriptExecutor
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.common.WebUiCommonHelper
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

public class Components {

	//login to web application
	@Keyword
	def loginIntoApplication(String username,String password) {
		WebUI.openBrowser('')
		WebUI.maximizeWindow()
		WebUI.navigateToUrl(GlobalVariable.WEBURL)

		WebUI.setText(findTestObject('Object Repository/OR SignIn/inputemail'), username)
		WebUI.setText(findTestObject('Object Repository/OR SignIn/inputpassword'), password)

		WebUI.click(findTestObject('Object Repository/OR SignIn/button_Sign In'))
		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)
	}

	//logout from web application
	@Keyword
	def logOutFromApplication() {
		WebUI.click(findTestObject('Object Repository/LogOut/div_I'))
		WebUI.click(findTestObject('Object Repository/LogOut/button_logoutLogout'))
		WebUI.closeBrowser()
	}

	//checking if element is present in a list or not
	@Keyword
	def getNumberOfRows(TestObject TO) {

		WebDriver driver = DriverFactory.getWebDriver()
		WebElement table = WebUiCommonHelper.findWebElement(TO, 30)
		List<WebElement> rows = table.findElements(By.tagName("tr"))
		println(rows.size()+" Row present")
		return rows
	}

	// get a row by it's value
	@Keyword
	def getRowByNameValue(TestObject TO,String nameValue) {

		nameValue=nameValue.trim()
		List<WebElement> rows = getNumberOfRows(TO)

		for (int i=0;i<rows.size();i++) {
			List<WebElement> columns = rows.get(i).findElements(By.tagName("td"))
			if (columns.get(i).getText().trim().equals(nameValue) ) {
				println(columns.get(i).getText())
				println(" Row present")
				return rows.get(i)
			}
			else {
				println("row not present")
			}
		}
	}


	@Keyword
	def getNumberOfColumns(TestObject TO) {
		List<WebElement> rows = getNumberOfRows(TO)
		List<WebElement> columns = rows.get(0).findElements(By.tagName("td"))
		println(columns.size()+" Columns present")
		return columns
	}

	//	@Keyword
	//	def getTotalRows(TestObject TO) {
	//
	//		WebDriver driver = DriverFactory.getWebDriver()
	//		WebElement table = WebUiCommonHelper.findWebElements(TO, 30)
	//		List<WebElement> rows = table.findElements(By.tagName("tr"))
	//		WebUI.findWebElement(TO, 0)
	//		WebUI.click(findTestObject('Object Repository/Settings/OR Users/lastrowbutton'))
	//
	//		WebElement rowString=WebUiCommonHelper.findWebElement('Object Repository/Settings/OR Users/spanrows'))
	//
	//	}


	// generating random email
	@Keyword
	public static String generateRandomEmail() {
		return "test" + UUID.randomUUID().toString().substring(0, 8) + "@example.com"
	}

	// scrolling down to find element
	@Keyword
	public static void scrollToElement(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) DriverFactory.getWebDriver()
		js.executeScript("arguments[0].scrollIntoView(true);", element)
	}
}
