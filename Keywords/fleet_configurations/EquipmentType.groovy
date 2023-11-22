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

public class EquipmentType {


	@Keyword
	def add_equipment_type() {

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)

		WebUI.navigateToUrl(GlobalVariable.BASE_URL+'super-admin/equipment-type/list')

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)

		WebUI.verifyElementPresent(findTestObject('Object Repository/OR Fleet Configurations/OR EquipmentType/div_All Equipment Types'),
				0)

		WebUI.verifyElementPresent(findTestObject('Object Repository/OR Fleet Configurations/OR EquipmentType/input_p-inputtext p-component p-element'),
				0)

		WebUI.verifyElementPresent(findTestObject('Object Repository/OR Fleet Configurations/OR EquipmentType/button_upload Bulk Upload'),
				0)

		WebUI.verifyElementPresent(findTestObject('Object Repository/OR Fleet Configurations/OR EquipmentType/button_download Download Excel Format'),
				0)

		WebUI.click(findTestObject('Object Repository/OR Fleet Configurations/OR EquipmentType/button_add Add Equipment Type'))

		WebUI.setText(findTestObject('Object Repository/OR Fleet Configurations/OR EquipmentType/inputEquipment Type Name'), 'Equipment type')

		WebUI.click(findTestObject('Object Repository/OR Fleet Configurations/OR EquipmentType/button_Add'))

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)
	}
	@Keyword
	def update_equipment_type() {

		WebUI.click(findTestObject('Object Repository/OR Fleet Configurations/OR EquipmentType/buttonrow-update'))

		WebUI.setText(findTestObject('Object Repository/OR Fleet Configurations/OR EquipmentType/inputEquipment Type Name'), 'Equipment type testing')

		WebUI.click(findTestObject('Object Repository/OR Fleet Configurations/OR EquipmentType/button_Update'))

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)
	}
	@Keyword
	def delete_equipment_type() {

		WebUI.click(findTestObject('Object Repository/OR Fleet Configurations/OR EquipmentType/buttonrow-delete'))

		WebUI.click(findTestObject('Object Repository/OR Fleet Configurations/OR EquipmentType/button_Delete'))

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)
	}
	@Keyword
	def goto_equipment_type() {
		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)

		WebUI.navigateToUrl(GlobalVariable.BASE_URL+'super-admin/equipment-type/list')

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)
	}
}
