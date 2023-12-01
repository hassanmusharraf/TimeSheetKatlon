package project_configuration

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

public class CostType {
	@Keyword
	def add_cost_type() {
		WebUI.delay(GlobalVariable.MED_TIMESLEEP)
		
		WebUI.navigateToUrl('http://localhost:4200/super-admin/cost-type/list')
		
		WebUI.click(findTestObject('Object Repository/Project Configuration/OR CostType/Page_QM Timesheet/button_add Add Cost Type'))
		
		WebUI.setText(findTestObject('Object Repository/Project Configuration/OR CostType/Page_QM Timesheet/inputCode'), '101')
		
		WebUI.setText(findTestObject('Object Repository/Project Configuration/OR CostType/Page_QM Timesheet/inputName'), 'type1')
		
		WebUI.click(findTestObject('Object Repository/Project Configuration/OR CostType/Page_QM Timesheet/button_Add'))
		
		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)
		
	}
	@Keyword
	def update_cost_type() {
		
		
		WebUI.click(findTestObject('Object Repository/Project Configuration/OR CostType/Page_QM Timesheet/button_mat-focus-indicator flex justify-cen_6f7d9e'))
		
		WebUI.setText(findTestObject('Object Repository/Project Configuration/OR CostType/Page_QM Timesheet/inputCode'), '1011')
		
		WebUI.setText(findTestObject('Object Repository/Project Configuration/OR CostType/Page_QM Timesheet/inputName'), 'type12')
		
		WebUI.click(findTestObject('Object Repository/Project Configuration/OR CostType/Page_QM Timesheet/button_Update'))
		
		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)
		
		
	}
	@Keyword
	def delete_cost_type() {
		WebUI.click(findTestObject('Object Repository/Project Configuration/OR CostType/Page_QM Timesheet/buttonrow-delete'))
		
		WebUI.click(findTestObject('Object Repository/Project Configuration/OR CostType/Page_QM Timesheet/button_Delete'))
		
		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)
		
	}
}
