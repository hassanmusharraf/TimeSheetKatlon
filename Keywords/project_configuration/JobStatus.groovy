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

public class JobStatus {
	
	@Keyword
	def add_job_status() {
		WebUI.delay(GlobalVariable.MED_TIMESLEEP)
		
		WebUI.navigateToUrl('http://localhost:4200/super-admin/job-status/list')
		
		WebUI.delay(GlobalVariable.MED_TIMESLEEP)
		
		WebUI.click(findTestObject('Object Repository/Project Configuration/OR JobStatus/Page_QM Timesheet/button_add Add Job Status'))
		
		WebUI.setText(findTestObject('Object Repository/Project Configuration/OR JobStatus/Page_QM Timesheet/inputName'), 'status')
		
		WebUI.click(findTestObject('Object Repository/Project Configuration/OR JobStatus/Page_QM Timesheet/button_Add'))
		
		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)
	}
	@Keyword
	def update_job_status() {
		WebUI.click(findTestObject('Object Repository/Project Configuration/OR JobStatus/Page_QM Timesheet/button_mat-focus-indicator flex justify-cen_6f7d9e'))
		
		WebUI.setText(findTestObject('Object Repository/Project Configuration/OR JobStatus/Page_QM Timesheet/inputName'), 'update status')
		
		WebUI.click(findTestObject('Object Repository/Project Configuration/OR JobStatus/Page_QM Timesheet/button_Update'))
		
		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)
	}
	@Keyword
	def delete_job_status() {
		WebUI.click(findTestObject('Object Repository/Project Configuration/OR JobStatus/Page_QM Timesheet/buttonrow-delete'))
		
		WebUI.click(findTestObject('Object Repository/Project Configuration/OR JobStatus/Page_QM Timesheet/button_Delete'))
		
		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)
	}
	@Keyword
	def goto_job_status() {
		
		WebUI.navigateToUrl('http://localhost:4200/super-admin/job-status/list')
		
	}
}
