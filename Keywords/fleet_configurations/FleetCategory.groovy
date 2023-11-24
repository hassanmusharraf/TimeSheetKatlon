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

public class FleetCategory {
	@Keyword
	def add_fleet_category() {
		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)

		WebUI.navigateToUrl(GlobalVariable.BASE_URL + 'super-admin/category/list')

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)

		WebUI.click(findTestObject('Object Repository/OR Fleet Configurations/OR FleetCategory/button_add Add Category'))

		WebUI.setText(findTestObject('Object Repository/OR Fleet Configurations/OR FleetCategory/inputFleet Category Name'), 'Adding Category')

		WebUI.click(findTestObject('Object Repository/OR Fleet Configurations/OR FleetCategory/button_Add'))

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)
	}
	@Keyword
	def update_fleet_category() {

		WebUI.click(findTestObject('Object Repository/OR Fleet Configurations/OR FleetCategory/buttonrow-update'))

		WebUI.setText(findTestObject('Object Repository/OR Fleet Configurations/OR FleetCategory/inputFleet Category Name'), 'Updating Category')

		WebUI.click(findTestObject('Object Repository/OR Fleet Configurations/OR FleetCategory/button_Update'))

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)
	}
	@Keyword
	def delete_fleet_category() {

		WebUI.click(findTestObject('Object Repository/OR Fleet Configurations/OR FleetCategory/buttonrow-delete'))

		WebUI.click(findTestObject('Object Repository/OR Fleet Configurations/OR FleetCategory/button_Delete'))

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)
	}
	@Keyword
	def goto_fleet_category() {
		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)

		WebUI.navigateToUrl(GlobalVariable.BASE_URL + 'super-admin/category/list')

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)
	}
}
