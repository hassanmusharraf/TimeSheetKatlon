package project_configuration

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

public class WIPMethod {

	@Keyword
	def add_WIP_method() {
		WebUI.delay(GlobalVariable.MED_TIMESLEEP)

		WebUI.navigateToUrl(GlobalVariable.BASE_URL+'super-admin/wip-method/list')

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR WIPMethod/Page_QM Timesheet/button_add Add WIP Method'))

		WebUI.setText(findTestObject('Object Repository/Project Configuration/OR WIPMethod/Page_QM Timesheet/inputName'), 'Sample Text')

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR WIPMethod/Page_QM Timesheet/button_Add'))

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)
	}
	@Keyword
	def update_WIP_method() {

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR WIPMethod/Page_QM Timesheet/button_mat-focus-indicator flex justify-cen_6f7d9e'))

		WebUI.setText(findTestObject('Object Repository/Project Configuration/OR WIPMethod/Page_QM Timesheet/inputName'), 'Sample Name')

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR WIPMethod/Page_QM Timesheet/button_Update'))

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)
	}
	@Keyword
	def delete_WIP_method() {
		WebUI.click(findTestObject('Object Repository/Project Configuration/OR WIPMethod/Page_QM Timesheet/buttonrow-delete'))

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR WIPMethod/Page_QM Timesheet/button_Delete'))

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)
	}

	@Keyword
	def goto_WIP_method() {

		WebUI.navigateToUrl(GlobalVariable.BASE_URL+'super-admin/wip-method/list')
	}
}
