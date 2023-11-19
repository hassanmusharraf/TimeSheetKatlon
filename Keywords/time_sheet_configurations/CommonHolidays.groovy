package time_sheet_configurations

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

public class CommonHolidays {
	
	@Keyword
	def add_common_holiday() {
		WebUI.delay(GlobalVariable.MED_TIMESLEEP)
		
		WebUI.navigateToUrl(GlobalVariable.BASE_URL + 'super-admin/common-holiday/list')
		
		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)		
		
		WebUI.verifyElementPresent(findTestObject('Object Repository/OR TimeSheet Configuration/Calender/OR CommonHoldays/div_Common Holiday List'),
			0)
		
		WebUI.verifyElementPresent(findTestObject('Object Repository/OR TimeSheet Configuration/Calender/OR CommonHoldays/inputyearpicker'),
			0)
		
		WebUI.verifyElementPresent(findTestObject('Object Repository/OR TimeSheet Configuration/Calender/OR CommonHoldays/input_p-inputtext p-component p-element'),
			0)
		
		WebUI.click(findTestObject('Object Repository/OR TimeSheet Configuration/Calender/OR CommonHoldays/button_add Add New'))
		
		WebUI.setText(findTestObject('Object Repository/OR TimeSheet Configuration/Calender/OR CommonHoldays/inputName'), 'Common Holiday')
		
		WebUI.setText(findTestObject('OR TimeSheet Configuration/Calender/OR CommonHoldays/input_date'), '23/11/2023')
		
		WebUI.click(findTestObject('Object Repository/OR TimeSheet Configuration/Calender/OR CommonHoldays/button_Add'))
		
		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)	}
	@Keyword
	def update_common_holiday() {
		
		WebUI.click(findTestObject('Object Repository/OR TimeSheet Configuration/Calender/OR CommonHoldays/button_mat-focus-indicator flex justify-cen_1daa0b'))
		
		WebUI.setText(findTestObject('Object Repository/OR TimeSheet Configuration/Calender/OR CommonHoldays/inputName'), 'Common Holiday 1')
		
		WebUI.setText(findTestObject('OR TimeSheet Configuration/Calender/OR CommonHoldays/input_date'), '24/11/2023')
		
		WebUI.click(findTestObject('Object Repository/OR TimeSheet Configuration/Calender/OR CommonHoldays/button_Update'))
		
		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)
	}
	@Keyword
	def delete_common_holiday() {
		
		WebUI.click(findTestObject('Object Repository/OR TimeSheet Configuration/Calender/OR CommonHoldays/buttonrow-delete'))
		
		WebUI.click(findTestObject('Object Repository/OR TimeSheet Configuration/Calender/OR CommonHoldays/button_Delete'))
		
		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)
		
	}
	@Keyword
	def goto_common_holiday() {
		
		WebUI.delay(GlobalVariable.MED_TIMESLEEP)
		
		WebUI.navigateToUrl(GlobalVariable.BASE_URL + 'super-admin/common-holiday/list')
		
		WebUI.delay(GlobalVariable.MED_TIMESLEEP)
	}
}
