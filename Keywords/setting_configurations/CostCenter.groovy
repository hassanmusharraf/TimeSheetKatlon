package setting_configurations

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.Components
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

public class CostCenter {

	//add cost center
	@Keyword
	def add_division() {

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)

		WebUI.navigateToUrl(GlobalVariable.BASE_URL+'super-admin/cost-center/individual/division/list')

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)

		WebUI.click(findTestObject('Object Repository/Settings/CostCenter/Page_QM Timesheet/Add new button'))

		WebUI.setText(findTestObject('Settings/CostCenter/Page_QM Timesheet/set name'), 'Adding division')

		WebUI.setText(findTestObject('Settings/CostCenter/Page_QM Timesheet/set code'), '111')

		WebUI.setText(findTestObject('Settings/CostCenter/Page_QM Timesheet/sequence'), '5')

		WebUI.click(findTestObject('Settings/CostCenter/Page_QM Timesheet/set organization'))

		WebUI.click(findTestObject('Object Repository/Settings/CostCenter/Page_QM Timesheet/li_Sample Organization'))

		WebUI.click(findTestObject('Object Repository/Settings/CostCenter/Page_QM Timesheet/button_Add'))

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)
	}

	//delete cost center
	@Keyword
	def delete_division() {

		Components.search_element('111')

		WebUI.click(findTestObject('Object Repository/Settings/CostCenter/Page_QM Timesheet/row-delete'))

		WebUI.click(findTestObject('Object Repository/Settings/CostCenter/Page_QM Timesheet/button_Delete'))

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)
	}

	//goto cost center
	@Keyword
	def goto_division() {
		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)

		WebUI.navigateToUrl(GlobalVariable.BASE_URL+'super-admin/cost-center/individual/division/list')

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)
	}



	// Region

	@Keyword
	def add_region() {

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)
		WebUI.navigateToUrl(GlobalVariable.BASE_URL+'super-admin/cost-center/individual/region/list')
		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)

		WebUI.click(findTestObject('Settings/CostCenter/Page_QM Timesheet/Add new button'))

		WebUI.setText(findTestObject('Settings/CostCenter/Page_QM Timesheet/set name'), 'Adding region')

		WebUI.setText(findTestObject('Settings/CostCenter/Page_QM Timesheet/divisioncodee'), '0001')

		WebUI.setText(findTestObject('Settings/CostCenter/Page_QM Timesheet/sequence'), '5')

		WebUI.click(findTestObject('Settings/CostCenter/Page_QM Timesheet/set organization'))

		WebUI.click(findTestObject('Object Repository/Settings/CostCenter/Page_QM Timesheet/li_Sample Organization'))

		WebUI.click(findTestObject('Object Repository/Settings/CostCenter/Page_QM Timesheet/button_Add'))

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)
	}

	@Keyword
	def delete_region() {

		Components.search_element('0001')

		WebUI.click(findTestObject('Object Repository/Settings/CostCenter/Page_QM Timesheet/row-delete'))

		WebUI.click(findTestObject('Object Repository/Settings/CostCenter/Page_QM Timesheet/button_Delete'))

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)
	}

	@Keyword
	def goto_region() {

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)
		WebUI.navigateToUrl(GlobalVariable.BASE_URL+'super-admin/cost-center/individual/region/list')
		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)
	}




	@Keyword
	def add_location() {
		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)
		WebUI.navigateToUrl(GlobalVariable.BASE_URL+'super-admin/cost-center/individual/location/list')
		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)

		WebUI.click(findTestObject('Settings/CostCenter/Page_QM Timesheet/Add new button'))

		WebUI.setText(findTestObject('Settings/CostCenter/Page_QM Timesheet/set name'), 'Adding location')

		WebUI.setText(findTestObject('Settings/CostCenter/Page_QM Timesheet/set code'), '111')

		WebUI.setText(findTestObject('Settings/CostCenter/Page_QM Timesheet/set sequence'), '5')

		WebUI.click(findTestObject('Settings/CostCenter/Page_QM Timesheet/set organization'))

		WebUI.click(findTestObject('Object Repository/Settings/CostCenter/Page_QM Timesheet/li_Sample Organization'))

		WebUI.click(findTestObject('Object Repository/Settings/CostCenter/Page_QM Timesheet/button_Add'))

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)
	}

	@Keyword
	def delete_location() {

		Components.search_element('111')

		WebUI.click(findTestObject('Object Repository/Settings/CostCenter/Page_QM Timesheet/row-delete'))

		WebUI.click(findTestObject('Object Repository/Settings/CostCenter/Page_QM Timesheet/button_Delete'))

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)
	}

	@Keyword
	def goto_location() {

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)
		WebUI.navigateToUrl(GlobalVariable.BASE_URL+'super-admin/cost-center/individual/location/list')
		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)
	}




	@Keyword
	def add_department() {

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)
		WebUI.navigateToUrl(GlobalVariable.BASE_URL+'super-admin/cost-center/individual/department/list')
		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)

		WebUI.click(findTestObject('Settings/CostCenter/Page_QM Timesheet/Add new button'))

		WebUI.setText(findTestObject('Settings/CostCenter/Page_QM Timesheet/idivisionname'), 'Adding department')

		WebUI.setText(findTestObject('Settings/CostCenter/Page_QM Timesheet/divisioncodee'), '111')

		WebUI.setText(findTestObject('Settings/CostCenter/Page_QM Timesheet/sequence'), '5')

		WebUI.click(findTestObject('Settings/CostCenter/Page_QM Timesheet/set organization'))

		WebUI.click(findTestObject('Object Repository/Settings/CostCenter/Page_QM Timesheet/li_Sample Organization'))

		WebUI.click(findTestObject('Object Repository/Settings/CostCenter/Page_QM Timesheet/button_Add'))

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)
	}

	@Keyword
	def delete_department() {

		Components.search_element('111')

		WebUI.click(findTestObject('Object Repository/Settings/CostCenter/Page_QM Timesheet/row-delete'))

		WebUI.click(findTestObject('Object Repository/Settings/CostCenter/Page_QM Timesheet/button_Delete'))

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)
	}

	@Keyword
	def goto_department() {
		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)
		WebUI.navigateToUrl(GlobalVariable.BASE_URL+'super-admin/cost-center/individual/department/list')
		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)
	}
}
