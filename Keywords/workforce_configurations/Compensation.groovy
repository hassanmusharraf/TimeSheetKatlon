package workforce_configurations

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

public class Compensation {

	@Keyword
	def add_compensation() {
		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)
		WebUI.navigateToUrl(GlobalVariable.BASE_URL+"super-admin/compensation/list")
		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)
//		WebUI.waitForElementPresent(findTestObject('Object Repository/OR WorkForce Configuration/OR Compensation/Page_QM Timesheet/mat-icon_keyboard_arrow_down'),0)
//		WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/OR Compensation/Page_QM Timesheet/mat-icon_keyboard_arrow_down'))
//
//		WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/OR Compensation/Page_QM Timesheet/div_engineering Workforce Configuration'))
//
//		WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/OR Compensation/Page_QM Timesheet/div_noise_control_off Compensation'))

		WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/OR Compensation/Page_QM Timesheet/button_add Add Compensation'))

		WebUI.setText(findTestObject('Object Repository/OR WorkForce Configuration/OR Compensation/Page_QM Timesheet/inputCompensation Name'),
				'compensation name')

		WebUI.setText(findTestObject('Object Repository/OR WorkForce Configuration/OR Compensation/Page_QM Timesheet/inputEr Rate'),
				'5')

		WebUI.click(findTestObject('OR WorkForce Configuration/OR Compensation/Page_QM Timesheet/inputCountry'))

		WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/OR Compensation/Page_QM Timesheet/li_Canada'))

		WebUI.click(findTestObject('OR WorkForce Configuration/OR Compensation/Page_QM Timesheet/inputProvision'))

		WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/OR Compensation/Page_QM Timesheet/li_British Columbia'))

		WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/OR Compensation/Page_QM Timesheet/button_Add'))

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)
	}

	@Keyword
	def delete_compensation() {

		WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/OR Compensation/Page_QM Timesheet/button_mat-focus-indicator flex justify-cen_187649'))

		//		WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/OR Compensation/Page_QM Timesheet/button_mat-focus-indicator flex justify-cen_187649'))

		WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/OR Compensation/Page_QM Timesheet/button_Delete'))

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)
	}

	@Keyword
	def goto_compensation() {
		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)

		WebUI.waitForElementPresent(findTestObject('Object Repository/OR WorkForce Configuration/OR Compensation/Page_QM Timesheet/mat-icon_keyboard_arrow_down'),0)
		WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/OR Compensation/Page_QM Timesheet/mat-icon_keyboard_arrow_down'))

		WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/OR Compensation/Page_QM Timesheet/div_engineering Workforce Configuration'))

		WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/OR Compensation/Page_QM Timesheet/div_noise_control_off Compensation'))
	}
}
