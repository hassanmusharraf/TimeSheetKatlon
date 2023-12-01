package com

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import java.text.SimpleDateFormat

import org.openqa.selenium.By
import org.openqa.selenium.JavascriptExecutor
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable



public class Components {

	//login to web application
	@Keyword
	def static loginIntoApplication(String username,String password) {
		WebUI.openBrowser('')
		WebUI.maximizeWindow()
		WebUI.navigateToUrl(GlobalVariable.WEBURL)

		WebUI.setText(findTestObject('Object Repository/OR Component/OR SignIn/inputemail'), username)
		WebUI.setText(findTestObject('Object Repository/OR Component/OR SignIn/inputpassword'), password)

		WebUI.click(findTestObject('Object Repository/OR Component/OR SignIn/button_Sign In'))
		WebUI.delay(GlobalVariable.MED_TIMESLEEP)
	}




	//logout from web application
	@Keyword
	def static logOutFromApplication() {
		WebUI.click(findTestObject('Object Repository/OR Component/OR LogOut/div_I'))
		WebUI.click(findTestObject('Object Repository/OR Component/OR LogOut/button_logoutLogout'))
		WebUI.closeBrowser()
	}




	// search element
	@Keyword
	def static search_element(String str) {
		
		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)

		WebUI.verifyElementPresent(findTestObject('Object Repository/OR TimeSheet Configuration/OR TimeSheetType/input_p-inputtext p-component p-element'),
				0)

		WebUI.setText(findTestObject('Object Repository/OR TimeSheet Configuration/OR TimeSheetType/input_p-inputtext p-component p-element'),
				str)

		//		WebUI.clearText(findTestObject('Object Repository/OR TimeSheet Configuration/OR TimeSheetType/input_p-inputtext p-component p-element'))

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)
	}





	@Keyword
	def static getNumberOfRowsByXpath(String str) {

		WebDriver driver = DriverFactory.getWebDriver()

		List<WebElement> table =  driver.findElements(By.xpath(str))

		println("Rows Present " + table.size())

		return table
	}






	// get a row by it's value
	@Keyword
	def static getRowByNameValue(String xpath,String nameValue) {

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)

		nameValue=nameValue.trim()

		List<WebElement> rows = getNumberOfRowsByXpath(xpath)

		for (int i=0;i<rows.size();i++) {

			List<WebElement> columns = rows.get(i).findElements(By.tagName("td"))

			println("Columns Present "+columns.size())

			for (int j=0; j<columns.size();j++) {

				if (columns.get(j).getText().trim().equals(nameValue) ) {

					println(columns.get(j).getText()+" Row present")

					return rows.get(j)
				}
			}
		}
	}


	
	@Keyword
	def static select_row_by_name(String xpath,String nameValue) {
		
		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)
		
		nameValue=nameValue.trim()

		List<WebElement> rows = getNumberOfRowsByXpath(xpath)
		
		println('printing rows')
		
		println(rows)
		
		println('into func')
		
		for (int i=0;i<rows.size();i++) {
			
			println('into for')
			
			if (rows.get(i).getText().trim().equals(nameValue) ) {
	
				println(rows.get(i).getText()+" Row present")
	
				return rows.get(i)
			}
			
		}
		
	}





	@Keyword
	def static verify_element_present() {
		WebUI.waitForElementPresent(findTestObject('Object Repository/OR Component/OR VerifyElementPresent/Bulk Upload Button'),GlobalVariable.LOW_TIMESLEEP)
		WebUI.waitForElementClickable(findTestObject('Object Repository/OR Component/OR VerifyElementPresent/Bulk Upload Button'),GlobalVariable.LOW_TIMESLEEP)
		WebUI.verifyElementClickable(findTestObject('Object Repository/OR Component/OR VerifyElementPresent/Bulk Upload Button'),GlobalVariable.LOW_TIMESLEEP)

		WebUI.waitForElementPresent(findTestObject('Object Repository/OR Component/OR VerifyElementPresent/Download Excel Format Button'),GlobalVariable.LOW_TIMESLEEP)
		WebUI.waitForElementClickable(findTestObject('Object Repository/OR Component/OR VerifyElementPresent/Download Excel Format Button'),GlobalVariable.LOW_TIMESLEEP)
		WebUI.verifyElementClickable(findTestObject('Object Repository/OR Component/OR VerifyElementPresent/Download Excel Format Button'),GlobalVariable.LOW_TIMESLEEP)

		WebUI.waitForElementPresent(findTestObject('Object Repository/OR Component/OR VerifyElementPresent/Search Button'),GlobalVariable.LOW_TIMESLEEP)
		WebUI.waitForElementClickable(findTestObject('Object Repository/OR Component/OR VerifyElementPresent/Search Button'),GlobalVariable.LOW_TIMESLEEP)
		WebUI.verifyElementClickable(findTestObject('Object Repository/OR Component/OR VerifyElementPresent/Search Button'),GlobalVariable.LOW_TIMESLEEP)
	}





	// get current date
	@Keyword
	def static getTodaysDate() {

		def todays_date = new Date()

		def start_date = new SimpleDateFormat('ddMMyyyy')

		GlobalVariable.TODAYS_DATE = start_date.format(todays_date)

		println(GlobalVariable.TODAYS_DATE)

		return GlobalVariable.TODAYS_DATE
	}





	//get custom date
	@Keyword
	def static getCustomDate(int var=30) {

		def end_date = new Date() + var

		def end_date1 = new SimpleDateFormat('ddMMyyyy')

		GlobalVariable.DATE = end_date1.format(end_date)

		println(GlobalVariable.DATE)

		return GlobalVariable.DATE
	}





	@Keyword
	def static getNumberOfColumns(TestObject TO) {
		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)

		List<WebElement> rows = getNumberOfRows(TO)
		List<WebElement> columns = rows.get(0).findElements(By.tagName("td"))
		println(columns.size()+" Columns present")

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)
		return columns
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
