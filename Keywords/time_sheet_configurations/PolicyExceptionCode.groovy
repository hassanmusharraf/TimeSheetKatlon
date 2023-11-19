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

public class PolicyExceptionCode {

	@Keyword
	def add_policy_exception_code() {
		WebUI.delay(GlobalVariable.MED_TIMESLEEP)

		WebUI.navigateToUrl(GlobalVariable.BASE_URL+'super-admin/policy-exception-code/list')

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)

		WebUI.verifyElementPresent(findTestObject('Object Repository/OR TimeSheet Configuration/PolicyExceptionCode/div_All Policy Exception Codes'),
				0)

		WebUI.verifyElementPresent(findTestObject('Object Repository/OR TimeSheet Configuration/PolicyExceptionCode/input_p-inputtext p-component p-element'),
				0)

		WebUI.verifyElementPresent(findTestObject('Object Repository/OR TimeSheet Configuration/PolicyExceptionCode/button_upload Bulk Upload'),
				0)

		WebUI.verifyElementPresent(findTestObject('Object Repository/OR TimeSheet Configuration/PolicyExceptionCode/button_download Download Excel Format'),
				0)

		WebUI.click(findTestObject('Object Repository/OR TimeSheet Configuration/PolicyExceptionCode/button_add Add New'))

		WebUI.setText(findTestObject('Object Repository/OR TimeSheet Configuration/PolicyExceptionCode/inputCode'), '789')

		WebUI.setText(findTestObject('Object Repository/OR TimeSheet Configuration/PolicyExceptionCode/textareaExplanation'), 'note')

		WebUI.click(findTestObject('Object Repository/OR TimeSheet Configuration/PolicyExceptionCode/button_Add'))

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)
	}
	@Keyword
	def update_policy_exception_code() {

		WebUI.click(findTestObject('Object Repository/OR TimeSheet Configuration/PolicyExceptionCode/buttonrow-update'))

		WebUI.setText(findTestObject('Object Repository/OR TimeSheet Configuration/PolicyExceptionCode/inputCode'), '777')

		WebUI.setText(findTestObject('Object Repository/OR TimeSheet Configuration/PolicyExceptionCode/textareaExplanation'), 'note 123')

		WebUI.click(findTestObject('Object Repository/OR TimeSheet Configuration/PolicyExceptionCode/button_Update'))

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)
	}
	@Keyword
	def delete_policy_exception_code() {

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)

		WebUI.click(findTestObject('Object Repository/OR TimeSheet Configuration/PolicyExceptionCode/buttonrow-delete'))

		WebUI.click(findTestObject('Object Repository/OR TimeSheet Configuration/PolicyExceptionCode/button_Delete'))

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)
	}
	@Keyword
	def goto_policy_exception_code() {

		WebUI.navigateToUrl(GlobalVariable.BASE_URL+'/super-admin/policy-exception-code/list')
	}
}
