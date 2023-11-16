package delete_data_from_setting_configurations

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class DeleteCountryOfOperation {

	@Keyword
	def delete_country_of_operation() {
		WebUI.delay(1)

		WebUI.verifyElementPresent(findTestObject('Settings/OR CountryOfOperations/Page_QM Timesheet/span_Cost Center'), 0)

		WebUI.click(findTestObject('Settings/OR CountryOfOperations/Page_QM Timesheet/div_room_preferences Cost Center'))

		WebUI.click(findTestObject('Object Repository/Settings/OR CountryOfOperations/Page_QM Timesheet/span_Country of Operations'))

		WebUI.click(findTestObject('Settings/OR CountryOfOperations/OR DeletingCOO/div_India_flex justify-start items-center h-full w-full gap-2 ng-star-inserted'))

		WebUI.click(findTestObject('Object Repository/Settings/OR CountryOfOperations/OR DeletingCOO/span_Delete'))

		WebUI.delay(1)
	}
}
