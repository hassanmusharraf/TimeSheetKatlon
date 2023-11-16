package workforce_configurations

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

public class Vehicle {

	@Keyword
	def add_vehicle() {
		WorkforceConfigurations.goto_workforce_configuration()

		WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/OR Vehicle/Page_QM Timesheet/div_noise_control_off Vehicle'))

		WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/OR Vehicle/Page_QM Timesheet/button_add Add Vehicle'))

		WebUI.setText(findTestObject('Object Repository/OR WorkForce Configuration/OR Vehicle/Page_QM Timesheet/inputVehicle Code'),
				'b2')

		WebUI.setText(findTestObject('Object Repository/OR WorkForce Configuration/OR Vehicle/Page_QM Timesheet/inputVehical Name'),
				'bike')

		WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/OR Vehicle/Page_QM Timesheet/button_Add'))

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)
	}

	@Keyword
	def update_vehicle() {

		WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/OR Vehicle/Page_QM Timesheet/button_mat-focus-indicator flex justify-cen_6f7d9e'))

		WebUI.setText(findTestObject('Object Repository/OR WorkForce Configuration/OR Vehicle/Page_QM Timesheet/inputVehicle Code'),
				'b3')

		WebUI.setText(findTestObject('Object Repository/OR WorkForce Configuration/OR Vehicle/Page_QM Timesheet/inputVehical Name'),
				'bike1')

		WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/OR Vehicle/Page_QM Timesheet/button_Update'))

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)
	}

	@Keyword
	def delete_vehicle() {

		WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/OR Vehicle/Page_QM Timesheet/button_mat-focus-indicator flex justify-cen_187649'))

		WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/OR Vehicle/Page_QM Timesheet/button_Delete'))

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)
	}
}
