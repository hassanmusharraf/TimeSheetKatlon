package fleet_configurations

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

public class FleetStatus {
	
	@Keyword
	def add_fleet_status() {
		WebUI.delay(GlobalVariable.MED_TIMESLEEP)
		
		WebUI.navigateToUrl(GlobalVariable.BASE_URL + 'super-admin/fleet-status/list')
		
		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)
		
		WebUI.verifyElementPresent(findTestObject('Object Repository/OR Fleet Configurations/OR FleetStatus/div_All Fleet Status'),1)
		
		WebUI.verifyElementPresent(findTestObject('Object Repository/OR Fleet Configurations/OR FleetStatus/input_p-inputtext p-component p-element'),
			1)
		
		WebUI.verifyElementPresent(findTestObject('Object Repository/OR Fleet Configurations/OR FleetStatus/button_upload Bulk Upload'),
			1)
		
		WebUI.verifyElementPresent(findTestObject('Object Repository/OR Fleet Configurations/OR FleetStatus/button_download Download Excel Format'),
			1)
		
		WebUI.click(findTestObject('Object Repository/OR Fleet Configurations/OR FleetStatus/button_add Add Fleet Status'))
		
		WebUI.setText(findTestObject('Object Repository/OR Fleet Configurations/OR FleetStatus/inputFleet Status Name'), 'Status 1')
		
		WebUI.click(findTestObject('Object Repository/OR Fleet Configurations/OR FleetStatus/button_Add'))
		
		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)
	}
	@Keyword
	def update_fleet_status() {
		
		WebUI.click(findTestObject('Object Repository/OR Fleet Configurations/OR FleetStatus/buttonrow-update'))
		
		WebUI.setText(findTestObject('Object Repository/OR Fleet Configurations/OR FleetStatus/inputFleet Status Name'), 'Status 2')
		
		WebUI.click(findTestObject('Object Repository/OR Fleet Configurations/OR FleetStatus/button_Update'))
		
		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)
	}
	
	@Keyword
	def delete_fleet_status() {
		
		WebUI.click(findTestObject('Object Repository/OR Fleet Configurations/OR FleetStatus/buttonrow-delete'))
		
		WebUI.click(findTestObject('Object Repository/OR Fleet Configurations/OR FleetStatus/button_Delete'))
		
		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)
	}
	
	@Keyword
	def goto_fleet_status() {
		
		WebUI.delay(GlobalVariable.MED_TIMESLEEP)
		
		WebUI.navigateToUrl(GlobalVariable.BASE_URL + 'super-admin/fleet-status/list')
		
		WebUI.delay(GlobalVariable.MED_TIMESLEEP)
	}
}