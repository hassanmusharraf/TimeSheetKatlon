package fleet_configurations

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

public class FleetConfiguration {

	@Keyword
	def add_equipment() {
		WebUI.navigateToUrl(GlobalVariable.EQUIPMENT_TYPE_URL)

		WebUI.delay(GlobalVariable.MED_TIMESLEEP)

		WebUI.click(findTestObject('Object Repository/OR Fleet Configurations/Page_QM Timesheet/button_add Add Equipment Type'))

		WebUI.setText(findTestObject('Object Repository/OR Fleet Configurations/Page_QM Timesheet/input__p-inputtext p-component p-element w-_728c40'),
				GlobalVariable.TEXT)

		WebUI.click(findTestObject('Object Repository/OR Fleet Configurations/Page_QM Timesheet/button_Add'))

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)

		WebUI.setText(findTestObject('Object Repository/OR Fleet Configurations/Page_QM Timesheet/input_All Equipment Types_p-inputtext p-com_db1966'),
				'new')

		WebUI.delay(3)
	}

	@Keyword
	def add_category() {
		WebUI.navigateToUrl(GlobalVariable.CATEGORY_URL)

		WebUI.delay(3)

		WebUI.click(findTestObject('Object Repository/OR Fleet Configurations/Page_QM Timesheet/button_add Add Category'))

		WebUI.setText(findTestObject('Object Repository/OR Fleet Configurations/Page_QM Timesheet/input__p-inputtext p-component p-element w-_728c40'),
				GlobalVariable.TEXT)

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)

		WebUI.click(findTestObject('Object Repository/OR Fleet Configurations/Page_QM Timesheet/button_Add'))

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)
	}

	@Keyword
	def add_fleet_status() {
		WebUI.navigateToUrl(GlobalVariable.FLEET_STATUS_TPE_URL)

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)

		WebUI.click(findTestObject('Object Repository/OR Fleet Configurations/Page_QM Timesheet/button_add Add Fleet Status'))

		WebUI.setText(findTestObject('Object Repository/OR Fleet Configurations/Page_QM Timesheet/input__p-inputtext p-component p-element w-_728c40'),
				GlobalVariable.TEXT)

		WebUI.click(findTestObject('Object Repository/OR Fleet Configurations/Page_QM Timesheet/button_Add'))

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)
	}
	
	@Keyword
	def delete_equipment() {
		
	}
	@Keyword
	def delete_category() {
		
	}
	@Keyword
	def delete_ewuipment() {
		
	}
}
