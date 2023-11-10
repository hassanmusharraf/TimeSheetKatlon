package com

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.JavascriptExecutor
import org.openqa.selenium.WebElement

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

public class Components {

	//login to web application
	@Keyword
	def loginIntoApplication() {
		WebUI.openBrowser('')
		WebUI.maximizeWindow()
		WebUI.navigateToUrl(GlobalVariable.WEBURL)

		WebUI.setText(findTestObject('Object Repository/OR SignIn/inputemail'), GlobalVariable.IT_ADMIN)
		WebUI.setText(findTestObject('Object Repository/OR SignIn/inputpassword'), GlobalVariable.IT_ADMIN_PASS)
		WebUI.click(findTestObject('Object Repository/OR SignIn/button_Sign In'),GlobalVariable.MED_TIMESLEEP)
	}

	//logout from web application
	@Keyword
	def logOutFromApplication() {

		WebUI.click(findTestObject('Object Repository/OR SignIn/button_Sign In'),5)
		WebUI.closeBrowser()
	}

	//checking if element is present in a list or not
	@Keyword
	def isElementsPresent(TestObject TO,String value) {
		List<WebElement> element=WebUI.findWebElements(TestObject, GlobalVariable.LOW_TIMESLEEP)

		for(int i=0;i<element.size();i++) {
			if (element[i].text.equals(value)) {
				KeywordUtil.markPassed(value+" is present")
			}
			else {
				KeywordUtil.markFailed("element not present")
			}
		}

		//		WebElement Table = driver.findElement(By.xpath('/html[1]/body[1]/qm-root[1]/qmt-layout[1]/qmt-navigation[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[1]/div[1]/qmt-company-users[1]/qmt-datagrid[1]/div[1]/p-table[1]/div[1]/div[1]/table[1]/tbody[1]'))
		//
		//		'To locate rows available in the table'
		//		List<WebElement> rowsInTable = Table.findElements(By.tagName('tr'))
		//
		//		int totalRows = rowsInTable.size()
		//
		//		println('Rows : ' + totalRows)
	}

	@Keyword
	def checkNumberOfRowsPresent(TestObject To) {

		List<WebElement> element=WebUI.findWebElements(TestObject, GlobalVariable.LOW_TIMESLEEP)
		WebUI.println(element.size())
	}










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
