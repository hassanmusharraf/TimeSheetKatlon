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

public class ProjectUnionCode {
	
	@Keyword
	def add_union_code() {
		WebUI.delay(GlobalVariable.MED_TIMESLEEP)
		
		WebUI.navigateToUrl('http://localhost:4200/super-admin/job-union-code/list')
		
		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)
		
		WebUI.click(findTestObject('Object Repository/Project Configuration/OR ProjectUnionCode/Page_QM Timesheet/button_add Add New'))
		
		WebUI.setText(findTestObject('Object Repository/Project Configuration/OR ProjectUnionCode/Page_QM Timesheet/inputCode'),
			'JUC002')
		
		WebUI.click(findTestObject('Object Repository/Project Configuration/OR ProjectUnionCode/Page_QM Timesheet/button_Add'))
		
		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)
	}
	@Keyword
	def update_union_code() {
		WebUI.click(findTestObject('Object Repository/Project Configuration/OR ProjectUnionCode/Page_QM Timesheet/buttonrow-update'))
		
		WebUI.setText(findTestObject('Object Repository/Project Configuration/OR ProjectUnionCode/Page_QM Timesheet/inputCode'),
			'JUC003')
		
		WebUI.click(findTestObject('Object Repository/Project Configuration/OR ProjectUnionCode/Page_QM Timesheet/button_Update'))
		
		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)
	}
	@Keyword
	def delete_union_code() {
		WebUI.click(findTestObject('Object Repository/Project Configuration/OR ProjectUnionCode/Page_QM Timesheet/buttonrow-delete'))
		
		WebUI.click(findTestObject('Object Repository/Project Configuration/OR ProjectUnionCode/Page_QM Timesheet/button_Delete'))
		
		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)
	}
	@Keyword
	def goto_union_code() {
		
		WebUI.navigateToUrl('http://localhost:4200/super-admin/job-union-code/list')
		
	}
}
