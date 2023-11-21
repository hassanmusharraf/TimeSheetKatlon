package workforce_configurations

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

public class WCB {

	@Keyword
	def add_WCB() {

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)

		WebUI.navigateToUrl(GlobalVariable.BASE_URL+'super-admin/wcb/list')

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)

		WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/WCB/Page_QM Timesheet/button_add Add WCB'))

		WebUI.setText(findTestObject('Object Repository/OR WorkForce Configuration/WCB/Page_QM Timesheet/inputName'), 'name 1')

		WebUI.setText(findTestObject('Object Repository/OR WorkForce Configuration/WCB/Page_QM Timesheet/inputEr Rate'), '5')

		WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/WCB/Page_QM Timesheet/input_ng-tns-c168-60 p-autocomplete-input p_013b65'))

		WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/WCB/Page_QM Timesheet/li_Canada'))

		WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/WCB/Page_QM Timesheet/button_'))

		WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/WCB/Page_QM Timesheet/li_Manitoba'))

		WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/WCB/Page_QM Timesheet/button_Add'))

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)
	}

	@Keyword
	def update_WCB() {
		WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/WCB/Page_QM Timesheet/row_update'))

		WebUI.setText(findTestObject('Object Repository/OR WorkForce Configuration/WCB/Page_QM Timesheet/inputName'), 'name 2')

		WebUI.setText(findTestObject('Object Repository/OR WorkForce Configuration/WCB/Page_QM Timesheet/inputEr Rate'), '10')

		WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/WCB/Page_QM Timesheet/input_ng-tns-c168-60 p-autocomplete-input p_013b65'))

		WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/WCB/Page_QM Timesheet/li_India'))

		WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/WCB/Page_QM Timesheet/button_'))

		WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/WCB/Page_QM Timesheet/li_Andhra Pradesh'))

		WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/WCB/Page_QM Timesheet/button_Update'))

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)
	}

	@Keyword
	def delete_WCB() {
		WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/WCB/Page_QM Timesheet/row-delete'))

		WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/WCB/Page_QM Timesheet/button_Delete'))

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)
	}

	@Keyword
	def goto_WCB() {
		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)

		WebUI.navigateToUrl(GlobalVariable.BASE_URL+'super-admin/wcb/add')

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)
	}
}
