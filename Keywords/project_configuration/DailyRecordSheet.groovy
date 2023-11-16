package project_configuration

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.Keys

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

public class DailyRecordSheet {
	
	@Keyword
	def add_daily_record_sheeet() {
		
		WebUI.delay(GlobalVariable.MED_TIMESLEEP)
		
		WebUI.navigateToUrl('http://localhost:4200/super-admin/job-drs/list')
		
		WebUI.click(findTestObject('Object Repository/Project Configuration/OR DailyRecordSheet/Page_QM Timesheet/button_add Add New'))
		
		WebUI.setText(findTestObject('Object Repository/Project Configuration/OR DailyRecordSheet/Page_QM Timesheet/inputName'),
			'name 1')
		
		WebUI.sendKeys(findTestObject('Object Repository/Project Configuration/OR DailyRecordSheet/Page_QM Timesheet/inputName'),
			Keys.chord(Keys.ENTER))
		
		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)
	}
	
	@Keyword
	def update_daily_record_sheeet() {
		
		WebUI.click(findTestObject('Object Repository/Project Configuration/OR DailyRecordSheet/Page_QM Timesheet/buttonrow-update'))
		
		WebUI.setText(findTestObject('Object Repository/Project Configuration/OR DailyRecordSheet/Page_QM Timesheet/inputName'),
			'name 2')
		
		WebUI.setText(findTestObject('Object Repository/Project Configuration/OR DailyRecordSheet/Page_QM Timesheet/textareaNote'),
			'note')
		
		WebUI.click(findTestObject('Object Repository/Project Configuration/OR DailyRecordSheet/Page_QM Timesheet/button_Update'))
		
		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)
	}
	
	@Keyword
	def delete_daily_record_sheeet() {
		
		WebUI.click(findTestObject('Object Repository/Project Configuration/OR DailyRecordSheet/Page_QM Timesheet/buttonrow-delete'))
		
		WebUI.click(findTestObject('Object Repository/Project Configuration/OR DailyRecordSheet/Page_QM Timesheet/button_Delete'))
		
		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)
	}
}
