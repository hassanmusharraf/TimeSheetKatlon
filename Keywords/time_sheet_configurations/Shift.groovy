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

public class Shift {


	@Keyword
	def add_shift() {
		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)

		WebUI.navigateToUrl('http://localhost:4200/super-admin/shift/list')

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)

		WebUI.click(findTestObject('Object Repository/OR TimeSheet Configuration/Page_QM Timesheet/button_add Add New'))

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)

		WebUI.setText(findTestObject('Object Repository/OR TimeSheet Configuration/Page_QM Timesheet/inputName'), 'Adding name')

		WebUI.setText(findTestObject('Object Repository/OR TimeSheet Configuration/OR Shift/input__Start Time'), '0904A')

		WebUI.setText(findTestObject('Object Repository/OR TimeSheet Configuration/OR Shift/input__End Time'), '1205P')

		WebUI.click(findTestObject('Object Repository/OR TimeSheet Configuration/Page_QM Timesheet/button_Add'))

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)
	}

	@Keyword
	def update_shift() {
		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)

		WebUI.click(findTestObject('Object Repository/OR TimeSheet Configuration/Page_QM Timesheet/buttonrow-update'))

		WebUI.setText(findTestObject('Object Repository/OR TimeSheet Configuration/Page_QM Timesheet/inputName'), 'Updating name')

		WebUI.setText(findTestObject('Object Repository/OR TimeSheet Configuration/OR Shift/input__Start Time'), '1205P')

		WebUI.setText(findTestObject('Object Repository/OR TimeSheet Configuration/OR Shift/input__End Time'), '0905A')

		WebUI.click(findTestObject('Object Repository/OR TimeSheet Configuration/Page_QM Timesheet/button_Update'))

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)
	}

	@Keyword
	def delete_shift() {
		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)

		WebUI.click(findTestObject('Object Repository/OR TimeSheet Configuration/Page_QM Timesheet/buttonrow-delete'))

		WebUI.click(findTestObject('Object Repository/OR TimeSheet Configuration/Page_QM Timesheet/button_Delete'))

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)
	}

	@Keyword
	def goto_shift() {
		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)

		WebUI.navigateToUrl('http://localhost:4200/super-admin/shift/list')

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)
	}
}
