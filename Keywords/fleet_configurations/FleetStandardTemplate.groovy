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

public class FleetStandardTemplate {

	@Keyword
	def add_fleet_template() {

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)

		WebUI.navigateToUrl(GlobalVariable.BASE_URL + 'super-admin/fleet/fleet-type-data/90d5739f-4f11-4ebb-8ab3-82ed30be26d7/list?id=90d5739f-4f11-4ebb-8ab3-82ed30be26d7')

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)

		WebUI.click(findTestObject('Object Repository/OR Fleet Configurations/OR FleetTemplates/OR StandardFleet/button_add Add Fleet Data'))

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)

		WebUI.setText(findTestObject('Object Repository/OR Fleet Configurations/OR FleetTemplates/OR StandardFleet/inputEquipment ID'), 'ID001')

		WebUI.setText(findTestObject('Object Repository/OR Fleet Configurations/OR FleetTemplates/OR StandardFleet/inputEquipment Name'), 'Adding name')

		WebUI.setText(findTestObject('Object Repository/OR Fleet Configurations/OR FleetTemplates/OR StandardFleet/inputMake'), 'testing')

		WebUI.setText(findTestObject('Object Repository/OR Fleet Configurations/OR FleetTemplates/OR StandardFleet/inputModel'), 'testing')

		WebUI.setText(findTestObject('Object Repository/OR Fleet Configurations/OR FleetTemplates/OR StandardFleet/inputSIN'), 'testing')

		WebUI.click(findTestObject('Object Repository/OR Fleet Configurations/OR FleetTemplates/OR StandardFleet/Equipment Type'))

		WebUI.click(findTestObject('Object Repository/OR Fleet Configurations/OR FleetTemplates/OR StandardFleet/li_equipment type 1'))

		WebUI.click(findTestObject('OR Fleet Configurations/OR FleetTemplates/OR StandardFleet/Parent Equipment'))

		WebUI.click(findTestObject('Object Repository/OR Fleet Configurations/OR FleetTemplates/OR StandardFleet/li_equipment name'))

		WebUI.click(findTestObject('OR Fleet Configurations/OR FleetTemplates/OR StandardFleet/Fleet Category'))

		WebUI.click(findTestObject('Object Repository/OR Fleet Configurations/OR FleetTemplates/OR StandardFleet/li_Category 12'))

		WebUI.setText(findTestObject('Object Repository/OR Fleet Configurations/OR FleetTemplates/OR StandardFleet/inputShort Description'), 'testing desc')

		WebUI.click(findTestObject('Object Repository/OR Fleet Configurations/OR FleetTemplates/OR StandardFleet/isSSR'))

		WebUI.click(findTestObject('OR Fleet Configurations/OR FleetTemplates/OR StandardFleet/Base UOM'))

		WebUI.click(findTestObject('Object Repository/OR Fleet Configurations/OR FleetTemplates/OR StandardFleet/li_Week'))

		WebUI.setText(findTestObject('Object Repository/OR Fleet Configurations/OR FleetTemplates/OR StandardFleet/inputUnit Rate Work'), '25')

		WebUI.setText(findTestObject('Object Repository/OR Fleet Configurations/OR FleetTemplates/OR StandardFleet/inputUnit Rate travel'), '25')

		WebUI.setText(findTestObject('Object Repository/OR Fleet Configurations/OR FleetTemplates/OR StandardFleet/inputUnit Cost'), '15')

		WebUI.click(findTestObject('OR Fleet Configurations/OR FleetTemplates/OR StandardFleet/Division'))

		WebUI.click(findTestObject('Object Repository/OR Fleet Configurations/OR FleetTemplates/OR StandardFleet/li_101  Hazmat'))

		WebUI.click(findTestObject('OR Fleet Configurations/OR FleetTemplates/OR StandardFleet/Region'))

		WebUI.click(findTestObject('Object Repository/OR Fleet Configurations/OR FleetTemplates/OR StandardFleet/li_111  region name'))

		WebUI.click(findTestObject('OR Fleet Configurations/OR FleetTemplates/OR StandardFleet/Location'))

		WebUI.click(findTestObject('Object Repository/OR Fleet Configurations/OR FleetTemplates/OR StandardFleet/li_101  Richmond BC'))

		WebUI.click(findTestObject('OR Fleet Configurations/OR FleetTemplates/OR StandardFleet/Department'))

		WebUI.click(findTestObject('Object Repository/OR Fleet Configurations/OR FleetTemplates/OR StandardFleet/li_101  Health and Safety'))

		WebUI.click(findTestObject('Object Repository/OR Fleet Configurations/OR FleetTemplates/OR StandardFleet/IsEnable'))

		WebUI.setText(findTestObject('OR Fleet Configurations/OR FleetTemplates/OR StandardFleet/input date'), '23102023')

		WebUI.click(findTestObject('OR Fleet Configurations/OR FleetTemplates/OR StandardFleet/Fleet Status'))

		WebUI.click(findTestObject('Object Repository/OR Fleet Configurations/OR FleetTemplates/OR StandardFleet/li_status 2'))

		WebUI.click(findTestObject('OR Fleet Configurations/OR FleetTemplates/OR StandardFleet/Country'))

		WebUI.click(findTestObject('Object Repository/OR Fleet Configurations/OR FleetTemplates/OR StandardFleet/li_Canada'))

		WebUI.click(findTestObject('OR Fleet Configurations/OR FleetTemplates/OR StandardFleet/Province'))

		WebUI.click(findTestObject('Object Repository/OR Fleet Configurations/OR FleetTemplates/OR StandardFleet/li_Manitoba'))

		WebUI.click(findTestObject('Object Repository/OR Fleet Configurations/OR FleetTemplates/OR StandardFleet/button_Add'))

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)
	}


	@Keyword
	def  update_fleet_template() {

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)

		WebUI.click(findTestObject('Object Repository/OR Fleet Configurations/OR FleetTemplates/OR StandardFleet/row-update'))

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)

		WebUI.setText(findTestObject('Object Repository/OR Fleet Configurations/OR FleetTemplates/OR StandardFleet/inputEquipment ID'), 'ID002')

		WebUI.setText(findTestObject('Object Repository/OR Fleet Configurations/OR FleetTemplates/OR StandardFleet/inputEquipment Name'), 'Updating name')

		WebUI.setText(findTestObject('Object Repository/OR Fleet Configurations/OR FleetTemplates/OR StandardFleet/inputMake'), 'Updating')

		WebUI.setText(findTestObject('Object Repository/OR Fleet Configurations/OR FleetTemplates/OR StandardFleet/inputModel'), 'Updating')

		WebUI.setText(findTestObject('Object Repository/OR Fleet Configurations/OR FleetTemplates/OR StandardFleet/inputSIN'), 'Updating')

		WebUI.click(findTestObject('Object Repository/OR Fleet Configurations/OR FleetTemplates/OR StandardFleet/Equipment Type'))

		WebUI.click(findTestObject('Object Repository/OR Fleet Configurations/OR FleetTemplates/OR StandardFleet/li_equipment type 2'))

		WebUI.click(findTestObject('OR Fleet Configurations/OR FleetTemplates/OR StandardFleet/Parent Equipment'))

		WebUI.click(findTestObject('Object Repository/OR Fleet Configurations/OR FleetTemplates/OR StandardFleet/li_Name3'))

		WebUI.click(findTestObject('OR Fleet Configurations/OR FleetTemplates/OR StandardFleet/Fleet Category'))

		WebUI.click(findTestObject('Object Repository/OR Fleet Configurations/OR FleetTemplates/li_Category 2'))

		WebUI.setText(findTestObject('Object Repository/OR Fleet Configurations/OR FleetTemplates/OR StandardFleet/inputShort Description'), 'updating desc')

		WebUI.click(findTestObject('Object Repository/OR Fleet Configurations/OR FleetTemplates/OR StandardFleet/isSSR'))
		
		WebUI.click(findTestObject('OR Fleet Configurations/OR FleetTemplates/OR StandardFleet/Base UOM'))

		WebUI.click(findTestObject('Object Repository/OR Fleet Configurations/OR FleetTemplates/OR StandardFleet/li_Day'))

		WebUI.setText(findTestObject('Object Repository/OR Fleet Configurations/OR FleetTemplates/OR StandardFleet/inputUnit Rate Work'), '26')

		WebUI.setText(findTestObject('Object Repository/OR Fleet Configurations/OR FleetTemplates/OR StandardFleet/inputUnit Rate travel'), '24')

		WebUI.setText(findTestObject('Object Repository/OR Fleet Configurations/OR FleetTemplates/OR StandardFleet/inputUnit Cost'), '12')

		WebUI.click(findTestObject('OR Fleet Configurations/OR FleetTemplates/OR StandardFleet/Division'))

		WebUI.click(findTestObject('Object Repository/OR Fleet Configurations/OR FleetTemplates/OR StandardFleet/li_102  Remediation'))

		WebUI.click(findTestObject('OR Fleet Configurations/OR FleetTemplates/OR StandardFleet/Region'))

		WebUI.click(findTestObject('Object Repository/OR Fleet Configurations/OR FleetTemplates/OR StandardFleet/li_111  region name'))

		WebUI.click(findTestObject('OR Fleet Configurations/OR FleetTemplates/OR StandardFleet/Location'))

		WebUI.click(findTestObject('Object Repository/OR Fleet Configurations/OR FleetTemplates/OR StandardFleet/li_100  Burlington ON'))

		WebUI.click(findTestObject('OR Fleet Configurations/OR FleetTemplates/OR StandardFleet/Department'))

		WebUI.click(findTestObject('Object Repository/OR Fleet Configurations/OR FleetTemplates/OR StandardFleet/li_100  Job Sites'))

		WebUI.click(findTestObject('Object Repository/OR Fleet Configurations/OR FleetTemplates/OR StandardFleet/IsEnable'))
		
		WebUI.setText(findTestObject('OR Fleet Configurations/OR FleetTemplates/OR StandardFleet/input date'), '22102023')

		WebUI.click(findTestObject('OR Fleet Configurations/OR FleetTemplates/OR StandardFleet/Fleet Status'))

		WebUI.click(findTestObject('Object Repository/OR Fleet Configurations/OR FleetTemplates/OR StandardFleet/li_status 2'))

		WebUI.click(findTestObject('OR Fleet Configurations/OR FleetTemplates/OR StandardFleet/Country'))

		WebUI.click(findTestObject('Object Repository/OR Fleet Configurations/OR FleetTemplates/OR StandardFleet/li_India'))

		WebUI.click(findTestObject('OR Fleet Configurations/OR FleetTemplates/OR StandardFleet/Province'))

		WebUI.click(findTestObject('Object Repository/OR Fleet Configurations/OR FleetTemplates/OR StandardFleet/li_Andaman and Nicobar Islands'))

		WebUI.setText(findTestObject('Object Repository/OR Fleet Configurations/OR FleetTemplates/OR StandardFleet/textareaUpdate Remark'), 'updating ')

		WebUI.click(findTestObject('Object Repository/OR Fleet Configurations/OR FleetTemplates/OR StandardFleet/button_Update'))

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)
	}


	@Keyword
	def delete_fleet_template() {
		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)

		WebUI.click(findTestObject('Object Repository/OR Fleet Configurations/OR FleetTemplates/OR StandardFleet/buttonrow-delete'))

		WebUI.click(findTestObject('Object Repository/OR Fleet Configurations/OR FleetTemplates/OR StandardFleet/button_Delete'))

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)
	}

	@Keyword
	def goto_fleet_template() {
		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)

		WebUI.navigateToUrl(GlobalVariable.BASE_URL + 'super-admin/fleet/fleet-type-data/90d5739f-4f11-4ebb-8ab3-82ed30be26d7/list?id=90d5739f-4f11-4ebb-8ab3-82ed30be26d7')

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)
	}
}
