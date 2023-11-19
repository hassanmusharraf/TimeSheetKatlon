package setting_configurations

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable


public class CountryOfOperation {

	@Keyword
	def add_country_of_operation() {
		WebUI.delay(GlobalVariable.MED_TIMESLEEP)
		
		WebUI.navigateToUrl(GlobalVariable.BASE_URL+'super-admin/country-of-operations/list')
		
		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)
		
		WebUI.verifyElementPresent(findTestObject('Settings/OR CountryOfOperations/Page_QM Timesheet/div_All Countries of Operations'),
				0)

		WebUI.click(findTestObject('Object Repository/Settings/OR CountryOfOperations/Page_QM Timesheet/span_add Add New'))

		WebUI.click(findTestObject('Object Repository/Settings/OR CountryOfOperations/Page_QM Timesheet/name'))

		WebUI.click(findTestObject('Object Repository/Settings/OR CountryOfOperations/Page_QM Timesheet/li_Albania'))

		WebUI.click(findTestObject('Object Repository/Settings/OR CountryOfOperations/Page_QM Timesheet/span_Add'))

	}


	@Keyword
	def delete_country_of_operation() {
		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)

		WebUI.click(findTestObject('Settings/OR CountryOfOperations/Page_QM Timesheet/row_delete'))

		WebUI.click(findTestObject('Settings/OR CountryOfOperations/Page_QM Timesheet/span_Delete'))

		WebUI.delay(GlobalVariable.MED_TIMESLEEP)
	}
	
	@Keyword
	def goto_country_of_operation() {

		WebUI.navigateToUrl(GlobalVariable.BASE_URL+'super-admin/country-of-operations/list')
		
	}
}
