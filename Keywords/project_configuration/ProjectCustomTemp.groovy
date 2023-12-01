package project_configuration

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

public class ProjectCustomTemp {

	@Keyword
	def add_custom_project() {

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)

		WebUI.navigateToUrl(GlobalVariable.BASE_URL + 'super-admin/job/template/list')

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)

		WebUI.click(findTestObject('Object Repository/Project Configuration/OR CustomTemp/add_new_temp'))

		WebUI.setText(findTestObject('Object Repository/OR Fleet Configurations/OR FleetTemplates/OR CustomFleet Temp/inputTemplate Name'),
				'Adding Custom Fleet Temp')

		WebUI.setText(findTestObject('Object Repository/OR Fleet Configurations/OR FleetTemplates/OR CustomFleet Temp/inputTemplate Code'),
				'T001')

		WebUI.setText(findTestObject('Object Repository/OR Fleet Configurations/OR FleetTemplates/OR CustomFleet Temp/textareaTemplate Description'),
				'Desc')

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)
	}



	// adding text field
	@Keyword
	def add_text_field() {

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)

		WebUI.click(findTestObject('Object Repository/OR Fleet Configurations/OR FleetTemplates/OR CustomFleet Temp/create-new-field'))

		WebUI.click(findTestObject('Object Repository/OR Fleet Configurations/OR FleetTemplates/OR CustomFleet Temp/text'))

		WebUI.setText(findTestObject('Object Repository/OR Fleet Configurations/OR FleetTemplates/OR CustomFleet Temp/inputField Name'),'Adding Text')

		WebUI.setText(findTestObject('Object Repository/OR Fleet Configurations/OR FleetTemplates/OR CustomFleet Temp/inputDescription'),
				'Desc')

		WebUI.setText(findTestObject('Object Repository/OR Fleet Configurations/OR FleetTemplates/OR CustomFleet Temp/inputDefault Text'),
				'Text')

		WebUI.click(findTestObject('Object Repository/OR Fleet Configurations/OR FleetTemplates/OR CustomFleet Temp/button_Add'))

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)
	}

	// adding number field
	@Keyword
	def add_number_field() {

		WebUI.click(findTestObject('Object Repository/OR Fleet Configurations/OR FleetTemplates/OR CustomFleet Temp/create-new-field'))

		WebUI.click(findTestObject('Object Repository/OR Fleet Configurations/OR FleetTemplates/OR CustomFleet Temp/number'))

		WebUI.setText(findTestObject('Object Repository/OR Fleet Configurations/OR FleetTemplates/OR CustomFleet Temp/inputField Name'),'Adding Number')

		WebUI.setText(findTestObject('Object Repository/OR Fleet Configurations/OR FleetTemplates/OR CustomFleet Temp/inputDescription'),
				'Desc')

		WebUI.setText(findTestObject('Object Repository/OR Fleet Configurations/OR FleetTemplates/OR CustomFleet Temp/inputDefault whole number'),
				'5202')

		WebUI.click(findTestObject('Object Repository/OR Fleet Configurations/OR FleetTemplates/OR CustomFleet Temp/button_Add'))

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)
	}


	// adding amount field
	@Keyword
	def add_amount_field() {

		WebUI.click(findTestObject('Object Repository/OR Fleet Configurations/OR FleetTemplates/OR CustomFleet Temp/create-new-field'))

		WebUI.click(findTestObject('Object Repository/OR Fleet Configurations/OR FleetTemplates/OR CustomFleet Temp/float'))

		WebUI.setText(findTestObject('Object Repository/OR Fleet Configurations/OR FleetTemplates/OR CustomFleet Temp/inputField Name'),
				'Adding amount')

		WebUI.setText(findTestObject('Object Repository/OR Fleet Configurations/OR FleetTemplates/OR CustomFleet Temp/inputDescription'),
				'Desc')

		WebUI.setText(findTestObject('Object Repository/OR Fleet Configurations/OR FleetTemplates/OR CustomFleet Temp/inputDefault Amount'),
				'15.56')

		WebUI.click(findTestObject('Object Repository/OR Fleet Configurations/OR FleetTemplates/OR CustomFleet Temp/button_Add'))

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)
	}


	// adding checkbox field
	@Keyword
	def add_checkBox_field() {

		WebUI.click(findTestObject('Object Repository/OR Fleet Configurations/OR FleetTemplates/OR CustomFleet Temp/create-new-field'))

		WebUI.click(findTestObject('Object Repository/OR Fleet Configurations/OR FleetTemplates/OR CustomFleet Temp/div_checkbox'))

		WebUI.setText(findTestObject('Object Repository/OR Fleet Configurations/OR FleetTemplates/OR CustomFleet Temp/inputField Name'),
				'Adding Checkbox')

		WebUI.setText(findTestObject('Object Repository/OR Fleet Configurations/OR FleetTemplates/OR CustomFleet Temp/inputDescription'),
				'Desc')

		WebUI.click(findTestObject('Object Repository/OR Fleet Configurations/OR FleetTemplates/OR CustomFleet Temp/default_value_check_box'))

		WebUI.click(findTestObject('Object Repository/OR Fleet Configurations/OR FleetTemplates/OR CustomFleet Temp/button_Add'))

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)
	}

	@Keyword
	def add_date_field() {
		// adding Date field
		WebUI.click(findTestObject('Object Repository/OR Fleet Configurations/OR FleetTemplates/OR CustomFleet Temp/create-new-field'))

		WebUI.click(findTestObject('Object Repository/OR Fleet Configurations/OR FleetTemplates/OR CustomFleet Temp/div_Date'))

		WebUI.setText(findTestObject('Object Repository/OR Fleet Configurations/OR FleetTemplates/OR CustomFleet Temp/inputField Name'),'Adding Date')

		WebUI.setText(findTestObject('Object Repository/OR Fleet Configurations/OR FleetTemplates/OR CustomFleet Temp/inputDescription'),'Desc')

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)

		WebUI.setText(findTestObject('Object Repository/OR Fleet Configurations/OR FleetTemplates/OR CustomFleet Temp/click_date_field'), '10122023')

		WebUI.click(findTestObject('Object Repository/OR Fleet Configurations/OR FleetTemplates/OR CustomFleet Temp/button_Add'))

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)
	}


	@Keyword
	def add_dateAndTime_field() {

		// adding Date with time field
		WebUI.click(findTestObject('Object Repository/OR Fleet Configurations/OR FleetTemplates/OR CustomFleet Temp/create-new-field'))

		WebUI.click(findTestObject('Object Repository/OR Fleet Configurations/OR FleetTemplates/OR CustomFleet Temp/datetime-local'))

		WebUI.setText(findTestObject('Object Repository/OR Fleet Configurations/OR FleetTemplates/OR CustomFleet Temp/inputField Name'),
				'Adding Date And Time')

		WebUI.setText(findTestObject('Object Repository/OR Fleet Configurations/OR FleetTemplates/OR CustomFleet Temp/inputDescription'),'Desc')

		WebUI.setText(findTestObject('Object Repository/OR Fleet Configurations/OR FleetTemplates/OR CustomFleet Temp/setDateAndTime'), '10122023001005A')

		WebUI.click(findTestObject('Object Repository/OR Fleet Configurations/OR FleetTemplates/OR CustomFleet Temp/button_Add'))

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)
	}


	@Keyword
	def add_selectionBox_field() {

		// adding selection box field
		WebUI.click(findTestObject('Object Repository/OR Fleet Configurations/OR FleetTemplates/OR CustomFleet Temp/create-new-field'))

		WebUI.click(findTestObject('Object Repository/OR Fleet Configurations/OR FleetTemplates/OR CustomFleet Temp/select'))

		WebUI.setText(findTestObject('Object Repository/OR Fleet Configurations/OR FleetTemplates/OR CustomFleet Temp/inputField Name'),
				'Adding SearchBox')

		WebUI.setText(findTestObject('Object Repository/OR Fleet Configurations/OR FleetTemplates/OR CustomFleet Temp/inputDescription'),
				'Desc')

		WebUI.setText(findTestObject('Object Repository/OR Fleet Configurations/OR FleetTemplates/OR CustomFleet Temp/inputmat-input-2'),
				'Option 1')

		WebUI.click(findTestObject('Object Repository/OR Fleet Configurations/OR FleetTemplates/OR CustomFleet Temp/div_add Add Option'))

		WebUI.setText(findTestObject('Object Repository/OR Fleet Configurations/OR FleetTemplates/OR CustomFleet Temp/inputmat-input-2'),
				'option 2')

		WebUI.click(findTestObject('Object Repository/OR Fleet Configurations/OR FleetTemplates/OR CustomFleet Temp/div_add Add Option'))

		WebUI.click(findTestObject('Object Repository/OR Fleet Configurations/OR FleetTemplates/OR CustomFleet Temp/button_Add'))

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)
	}


	@Keyword
	def save_template() {

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)

		WebUI.click(findTestObject('Object Repository/OR Fleet Configurations/OR FleetTemplates/OR CustomFleet Temp/button_Save Template'))

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)
	}


	@Keyword
	def goto_add_custom_template() {

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)

		WebUI.navigateToUrl(GlobalVariable.BASE_URL + 'super-admin/fleet/template/list')

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)
	}
}
