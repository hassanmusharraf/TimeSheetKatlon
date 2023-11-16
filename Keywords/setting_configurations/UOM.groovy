package setting_configurations

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

public class UOM {

	@Keyword
	def add_UOM() {

		WebUI.verifyElementPresent(findTestObject('Settings/OR CountryOfOperations/Page_QM Timesheet/span_Cost Center'), 0)

		WebUI.click(findTestObject('Settings/OR CountryOfOperations/Page_QM Timesheet/div_room_preferences Cost Center'))

		WebUI.click(findTestObject('Object Repository/Settings/UOM/span_UOM'))

		WebUI.verifyElementPresent(findTestObject('Object Repository/Settings/UOM/div_All Base UOM'), 0)

		WebUI.verifyElementPresent(findTestObject('Object Repository/Settings/UOM/input_p-inputtext p-component p-element'), 0)

		WebUI.verifyElementPresent(findTestObject('Settings/UOM/button_download Download Excel Format'), 0)

		WebUI.verifyElementPresent(findTestObject('Settings/UOM/button_upload Bulk Upload'), 0)

		WebUI.verifyElementPresent(findTestObject('Settings/UOM/button_Testing uom_mat-focus-indicator flex justify-center w-30px h-30px items-center text-red-500 mat-icon-button mat-button-base cdk-focused cdk-mouse-focused'),
				0)

		WebUI.verifyElementPresent(findTestObject('Settings/UOM/button_Testing uom_mat-focus-indicator flex justify-center w-30px h-30px items-center text-primary-dark mat-icon-button mat-button-base cdk-focused cdk-mouse-focused'),
				0)

		WebUI.click(findTestObject('Settings/UOM/button_add Add New'))

		WebUI.setText(findTestObject('Object Repository/Settings/UOM/input_p-inputtext p-component p-element w-f_006ace'), 'Testing uom')

		WebUI.verifyElementPresent(findTestObject('Object Repository/Settings/UOM/button_Close'), 0)

		WebUI.click(findTestObject('Settings/UOM/button_Add'))

		WebUI.delay(2)
	}
}
