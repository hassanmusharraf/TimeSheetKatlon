package workforce_configurations

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.Keys

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable




public class PayGroup {

	// adding pay group
	@Keyword
	def add_pay_group() {

		WebUI.verifyElementPresent(findTestObject('OR VerifyElementPresent WFC/OR VerifyElementPresent WFC/Page_QM Timesheet/a_settings Settings keyboard_arrow_down'),
				0)

		WebUI.click(findTestObject('OR VerifyElementPresent WFC/OR VerifyElementPresent WFC/Page_QM Timesheet/a_settings Settings keyboard_arrow_down'))

		WebUI.verifyElementPresent(findTestObject('OR VerifyElementPresent WFC/OR PayGroup/Page_QM Timesheet/span_Workforce Configuration'),
				0)

		WebUI.click(findTestObject('Object Repository/OR VerifyElementPresent WFC/OR PayGroup/Page_QM Timesheet/span_Workforce Configuration'))

		WebUI.verifyElementPresent(findTestObject('OR VerifyElementPresent WFC/OR PayGroup/Page_QM Timesheet/span_Pay Group'), 0)

		WebUI.click(findTestObject('OR VerifyElementPresent WFC/OR PayGroup/Page_QM Timesheet/span_Pay Group'))

		WebUI.verifyElementPresent(findTestObject('Object Repository/OR VerifyElementPresent WFC/OR PayGroup/Page_QM Timesheet/div_All Pay Groups'),
				0)

		WebUI.verifyElementPresent(findTestObject('Object Repository/OR VerifyElementPresent WFC/OR PayGroup/Page_QM Timesheet/input_p-inputtext p-component p-element'),
				0)

		WebUI.verifyElementPresent(findTestObject('Object Repository/OR VerifyElementPresent WFC/OR PayGroup/Page_QM Timesheet/button_download Download Excel Format'),
				0)

		WebUI.verifyElementPresent(findTestObject('Object Repository/OR VerifyElementPresent WFC/OR PayGroup/Page_QM Timesheet/button_upload Bulk Upload'),
				0)

		WebUI.verifyElementPresent(findTestObject('Object Repository/OR VerifyElementPresent WFC/OR PayGroup/Page_QM Timesheet/button_add Add Pay Group'),
				0)

		WebUI.click(findTestObject('OR VerifyElementPresent WFC/OR PayGroup/Page_QM Timesheet/button_add Add Pay Group'))

		WebUI.setText(findTestObject('Object Repository/OR VerifyElementPresent WFC/OR PayGroup/Page_QM Timesheet/input_p-inputtext p-component p-element w-f_006ace'),
				'katalon testing 1')

		WebUI.sendKeys(findTestObject('Object Repository/OR VerifyElementPresent WFC/OR PayGroup/Page_QM Timesheet/input_p-inputtext p-component p-element w-f_006ace'),
				Keys.chord(Keys.TAB))

		WebUI.click(findTestObject('Object Repository/OR VerifyElementPresent WFC/OR PayGroup/Page_QM Timesheet/li_Bi-Weekly'))

		WebUI.click(findTestObject('Object Repository/OR VerifyElementPresent WFC/OR PayGroup/Page_QM Timesheet/button_Add'))

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)
	}

	// delete pay group
	@Keyword
	def delete_pay_group() {

		WebUI.verifyElementPresent(findTestObject('Object Repository/OR VerifyElementPresent WFC/OR PayGroup/Page_QM Timesheet/button_mat-focus-indicator flex justify-cen_6f7d9e'),
				0)

		WebUI.click(findTestObject('Object Repository/OR VerifyElementPresent WFC/OR PayGroup/Page_QM Timesheet/Delete_button'))

		WebUI.click(findTestObject('Object Repository/OR VerifyElementPresent WFC/OR PayGroup/Page_QM Timesheet/button_Delete'))

		WebUI.delay(2)
	}

	// goto pay group page
	@Keyword
	def goto_pay_group() {

		WebUI.verifyElementPresent(findTestObject('OR VerifyElementPresent WFC/OR VerifyElementPresent WFC/Page_QM Timesheet/a_settings Settings keyboard_arrow_down'),
				0)

		WebUI.click(findTestObject('OR VerifyElementPresent WFC/OR VerifyElementPresent WFC/Page_QM Timesheet/a_settings Settings keyboard_arrow_down'))

		WebUI.verifyElementPresent(findTestObject('OR VerifyElementPresent WFC/OR PayGroup/Page_QM Timesheet/span_Workforce Configuration'),
				0)

		WebUI.click(findTestObject('Object Repository/OR VerifyElementPresent WFC/OR PayGroup/Page_QM Timesheet/span_Workforce Configuration'))

		WebUI.verifyElementPresent(findTestObject('OR VerifyElementPresent WFC/OR PayGroup/Page_QM Timesheet/span_Pay Group'), GlobalVariable.LOW_TIMESLEEP)

		WebUI.click(findTestObject('OR VerifyElementPresent WFC/OR PayGroup/Page_QM Timesheet/span_Pay Group'))

		WebUI.verifyElementPresent(findTestObject('Object Repository/OR VerifyElementPresent WFC/OR PayGroup/Page_QM Timesheet/div_All Pay Groups'),
				0)

		WebUI.verifyElementPresent(findTestObject('Object Repository/OR VerifyElementPresent WFC/OR PayGroup/Page_QM Timesheet/input_p-inputtext p-component p-element'),
				0)
	}
}
