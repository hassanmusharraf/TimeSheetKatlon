package workforce_configurations

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

public class UnitOfMeasure {

	@Keyword
	def add_UnitOfMeasure() {
		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)

		WebUI.navigateToUrl(GlobalVariable.BASE_URL+"super-admin/unit-of-measure/list")

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)

		WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/OR UnitOfMeasure/button_add Add New'))

		WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/OR UnitOfMeasure/input_ng-tns-c168-47 p-autocomplete-input p_053656'))

		WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/OR UnitOfMeasure/li_Month'))

		WebUI.setText(findTestObject('Object Repository/OR WorkForce Configuration/OR UnitOfMeasure/inputName'), 'Testing name')

		WebUI.setText(findTestObject('Object Repository/OR WorkForce Configuration/OR UnitOfMeasure/inputHours Earned'), '5')

		WebUI.setText(findTestObject('Object Repository/OR WorkForce Configuration/OR UnitOfMeasure/inputHours Worked'), '10')

		WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/OR UnitOfMeasure/button_Add'))

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)
	}

	@Keyword
	def update_unit_of_measure() {
		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)

		WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/OR Compensation/Page_QM Timesheet/row-update'))

		WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/OR UnitOfMeasure/input_ng-tns-c168-47 p-autocomplete-input p_053656'))

		WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/OR UnitOfMeasure/li_Week'))

		WebUI.setText(findTestObject('Object Repository/OR WorkForce Configuration/OR UnitOfMeasure/inputName'), 'Testing name 1')

		WebUI.setText(findTestObject('Object Repository/OR WorkForce Configuration/OR UnitOfMeasure/inputHours Earned'), '10')

		WebUI.setText(findTestObject('Object Repository/OR WorkForce Configuration/OR UnitOfMeasure/inputHours Worked'), '15')

		WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/OR UnitOfMeasure/confirm update'))

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)
	}

	@Keyword
	def delete_unit_of_measure() {

		WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/OR UnitOfMeasure/row-delete'))

		WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/OR UnitOfMeasure/button_Delete'))

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)
	}

	@Keyword
	def goto_unit_of_measure() {
		//		'workforce_configurations.WorkforceConfigurations.goto_workforce_configuration'()
		//
		//		WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/OR UnitOfMeasure/span_Unit Of Measure'))

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)

		WebUI.navigateToUrl(GlobalVariable.BASE_URL+"super-admin/unit-of-measure/list")

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)
	}
}
