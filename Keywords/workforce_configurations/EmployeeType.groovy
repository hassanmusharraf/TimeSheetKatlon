package workforce_configurations

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import static workforce_configurations.WorkforceConfigurations.goto_workforce_configuration

public class EmployeeType {

	@Keyword
	def add_employee_type() {
		
		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)
		
		WebUI.navigateToUrl(GlobalVariable.BASE_URL+"super-admin/employee-type/list")

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)

		WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/OR Employee Type/Page_QM Timesheet/button_add Add Employee Type'))

		WebUI.setText(findTestObject('Object Repository/OR WorkForce Configuration/OR Employee Type/Page_QM Timesheet/inputEmployee Type Code'),
				'1234')

		WebUI.setText(findTestObject('Object Repository/OR WorkForce Configuration/OR Employee Type/Page_QM Timesheet/inputEmployee Type Name'),
				'intern')

		WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/OR Employee Type/Page_QM Timesheet/button_Add'))

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)
	}

	@Keyword
	def update_employee_type() {

		WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/OR Employee Type/Page_QM Timesheet/button_mat-focus-indicator flex justify-cen_6f7d9e'))

		WebUI.setText(findTestObject('Object Repository/OR WorkForce Configuration/OR Employee Type/Page_QM Timesheet/inputEmployee Type Code'),
				'1235')

		WebUI.setText(findTestObject('Object Repository/OR WorkForce Configuration/OR Employee Type/Page_QM Timesheet/inputEmployee Type Name'),
				'permanent')

		WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/OR Employee Type/Page_QM Timesheet/button_Update'))

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)
	}

	@Keyword
	def delete_employee_type() {

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)

		WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/OR Employee Type/Page_QM Timesheet/button_mat-focus-indicator flex justify-cen_187649'))

		WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/OR Employee Type/Page_QM Timesheet/button_Delete'))

		WebUI.delay(GlobalVariable.MED_TIMESLEEP)
	}
	
	@Keyword
	def goto_employee_type() {
		
		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)
		
		WebUI.navigateToUrl(GlobalVariable.BASE_URL+"super-admin/employee-type/list")

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)
	}
}
