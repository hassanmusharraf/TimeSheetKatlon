package workforce_configurations

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.Keys

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

public class WCB {

	@Keyword
	def add_WCB() {

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)

		WebUI.navigateToUrl(GlobalVariable.BASE_URL+'super-admin/wcb/list')

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)

		WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/WCB/Page_QM Timesheet/button_add Add WCB'))

		WebUI.setText(findTestObject('Object Repository/OR WorkForce Configuration/WCB/Page_QM Timesheet/inputName'), 'name 1')

		WebUI.setText(findTestObject('Object Repository/OR WorkForce Configuration/WCB/Page_QM Timesheet/inputEr Rate'), '5')

		//		WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/WCB/Page_QM Timesheet/input_ng-tns-c168-60 p-autocomplete-input p_013b65'))

		WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/WCB/Page_QM Timesheet/Country'))

		WebUI.sendKeys(findTestObject('Object Repository/OR WorkForce Configuration/WCB/Page_QM Timesheet/Country'), Keys.chord(Keys.ARROW_DOWN,Keys.ARROW_DOWN, Keys.ENTER))


		//		WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/WCB/Page_QM Timesheet/li_Canada'))

		WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/WCB/Page_QM Timesheet/button_'))

		WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/WCB/Page_QM Timesheet/li_Manitoba'))

		WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/WCB/Page_QM Timesheet/button_Add'))

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)
	}

	@Keyword
	def update_WCB() {
		WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/WCB/Page_QM Timesheet/row_update'))

		WebUI.setText(findTestObject('Object Repository/OR WorkForce Configuration/WCB/Page_QM Timesheet/inputName'), 'name 2')

		WebUI.setText(findTestObject('Object Repository/OR WorkForce Configuration/WCB/Page_QM Timesheet/inputEr Rate'), '10')

		WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/WCB/Page_QM Timesheet/input_ng-tns-c168-60 p-autocomplete-input p_013b65'))

		WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/WCB/Page_QM Timesheet/li_India'))

		WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/WCB/Page_QM Timesheet/button_'))

		WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/WCB/Page_QM Timesheet/li_Andhra Pradesh'))

		WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/WCB/Page_QM Timesheet/button_Update'))

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)
	}

	@Keyword
	def delete_WCB() {
		WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/WCB/Page_QM Timesheet/row-delete'))

		WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/WCB/Page_QM Timesheet/button_Delete'))

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)
	}

	@Keyword
	def goto_WCB() {
		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)

		WebUI.navigateToUrl(GlobalVariable.BASE_URL+'super-admin/wcb/add')

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)
	}
}
