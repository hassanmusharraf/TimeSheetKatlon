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

		WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/OR Compensation/Page_QM Timesheet/button_add Add Compensation'))

		WebUI.setText(findTestObject('Object Repository/OR WorkForce Configuration/OR Compensation/Page_QM Timesheet/inputCompensation Name'),
				'compensation adding')
		
		
		WebUI.setText(findTestObject('Object Repository/OR WorkForce Configuration/OR Compensation/Page_QM Timesheet/input Annual Earning Max'),
			'250000')
		
		
		
		WebUI.setText(findTestObject('Object Repository/OR WorkForce Configuration/OR Compensation/Page_QM Timesheet/input Exemption'),'550')
		
		
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
	def update_compensation() {

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)

		WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/OR Compensation/Page_QM Timesheet/row-update'))

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)

		WebUI.setText(findTestObject('Object Repository/OR WorkForce Configuration/OR Compensation/Page_QM Timesheet/inputCompensation Name'),
				'compensation updating')
		
		WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/OR Compensation/Page_QM Timesheet/checkbox'))
		
		
		WebUI.setText(findTestObject('Object Repository/OR WorkForce Configuration/OR Compensation/Page_QM Timesheet/inputEr Rate'),
				'10')

//		WebUI.click(findTestObject('OR WorkForce Configuration/OR Compensation/Page_QM Timesheet/inputCountry'))

//		WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/OR Compensation/Page_QM Timesheet/li_India'))

//		WebUI.click(findTestObject('OR WorkForce Configuration/OR Compensation/Page_QM Timesheet/inputProvision'))

//		WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/OR Compensation/Page_QM Timesheet/li_Andhra Pradesh'))


		WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/OR Compensation/Page_QM Timesheet/confirm update'))

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)
	}

	@Keyword
	def delete_compensation() {

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)
		
		WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/OR Compensation/Page_QM Timesheet/row-delete'))

		WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/OR Compensation/Page_QM Timesheet/button_Delete'))

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)
	}

	@Keyword
	def goto_compensation() {
		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)
		
		WebUI.navigateToUrl(GlobalVariable.BASE_URL+"super-admin/compensation/list")
		
		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)
	}
}
