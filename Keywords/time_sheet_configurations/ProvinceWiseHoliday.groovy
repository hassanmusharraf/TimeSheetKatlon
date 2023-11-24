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

public class ProvinceWiseHoliday {

	@Keyword
	def add_province_for_holiday() {

		WebUI.delay(GlobalVariable.MED_TIMESLEEP)

		WebUI.navigateToUrl(GlobalVariable.BASE_URL + 'super-admin/province-calendar/list')

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)

		WebUI.click(findTestObject('Object Repository/OR TimeSheet Configuration/Calender/OR ProvinceWiseHoliday/button_add Add New'))

		WebUI.click(findTestObject('Object Repository/OR TimeSheet Configuration/Calender/OR ProvinceWiseHoliday/input_country'))

		WebUI.click(findTestObject('Object Repository/OR TimeSheet Configuration/Calender/OR ProvinceWiseHoliday/li_India'))

		WebUI.verifyElementPresent(findTestObject('OR TimeSheet Configuration/Calender/OR ProvinceWiseHoliday/input_province'),
				0)

		WebUI.click(findTestObject('OR TimeSheet Configuration/Calender/OR ProvinceWiseHoliday/input_province'))

		WebUI.click(findTestObject('Object Repository/OR TimeSheet Configuration/Calender/OR ProvinceWiseHoliday/li_Andhra Pradesh'))

		WebUI.click(findTestObject('Object Repository/OR TimeSheet Configuration/Calender/OR ProvinceWiseHoliday/button_Add'))

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)
	}

	@Keyword
	def add_holiday() {

		WebUI.click(findTestObject('Object Repository/OR TimeSheet Configuration/Calender/OR ProvinceWiseHoliday/button_add Add New'))

		WebUI.setText(findTestObject('Object Repository/OR TimeSheet Configuration/Calender/OR ProvinceWiseHoliday/inputName'),
				'Adding holiday')

		WebUI.setText(findTestObject('OR TimeSheet Configuration/Calender/OR ProvinceWiseHoliday/input__Date'), '09052023')

		WebUI.click(findTestObject('Object Repository/OR TimeSheet Configuration/Calender/OR ProvinceWiseHoliday/button_Add'))

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)
	}

	@Keyword
	def goto_province_for_holiday() {

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)

		WebUI.navigateToUrl(GlobalVariable.BASE_URL + 'super-admin/province-calendar/list')

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)
	}

	@Keyword
	def update_province_for_holiday() {

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)

		WebUI.navigateToUrl(GlobalVariable.BASE_URL + 'super-admin/province-calendar/list')

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)

		WebUI.click(findTestObject('Object Repository/OR TimeSheet Configuration/Calender/OR ProvinceWiseHoliday/row-update-existing-object'))

		WebUI.click(findTestObject('Object Repository/OR TimeSheet Configuration/Calender/OR ProvinceWiseHoliday/row_update'))

		WebUI.setText(findTestObject('Object Repository/OR TimeSheet Configuration/Calender/OR ProvinceWiseHoliday/inputName'),
				'updating holiday')

		WebUI.setText(findTestObject('OR TimeSheet Configuration/Calender/OR ProvinceWiseHoliday/input__Date'), '12112023')

		WebUI.click(findTestObject('Object Repository/OR TimeSheet Configuration/Calender/OR ProvinceWiseHoliday/button_Update'))

		WebUI.delay(GlobalVariable.MED_TIMESLEEP)
	}

	
	@Keyword
	def delete_holiday() {
		
		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)

		WebUI.click(findTestObject('Object Repository/OR TimeSheet Configuration/Calender/OR ProvinceWiseHoliday/buttonrow-delete'))

		WebUI.click(findTestObject('Object Repository/OR TimeSheet Configuration/Calender/OR ProvinceWiseHoliday/button_Delete'))
	}
	
	@Keyword
	def delete_province() {
		
		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)
		
		WebUI.navigateToUrl(GlobalVariable.BASE_URL + 'super-admin/province-calendar/list')

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)
		
		WebUI.click(findTestObject('Object Repository/OR TimeSheet Configuration/Calender/OR ProvinceWiseHoliday/buttonrow-delete'))

		WebUI.click(findTestObject('Object Repository/OR TimeSheet Configuration/Calender/OR ProvinceWiseHoliday/button_Delete'))
	}
}
