package job_title
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.Keys

import com.Components
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

public class JobTitle {

	
	@Keyword 
	def select_organization_for_job_title(String org_name) {
		
		goto_job_title()
		
		WebUI.click(findTestObject('Object Repository/OR JobTitle/OR SelectOrganization/Select Organization'))
		
		TestObject org = Components.select_row_by_name('/html/body/div[2]/ul/li', org_name)
		
		WebUI.click(org)
		
	}
	
	@Keyword
	def add_job_title() {
		
		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)

		WebUI.navigateToUrl(GlobalVariable.BASE_URL+'admin/job-title/list')

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)

		WebUI.click(findTestObject('Object Repository/OR JobTitle/OR SelectOrganization/Select Organization'))
		
		WebUI.sendKeys(findTestObject('Object Repository/OR JobTitle/OR SelectOrganization/Select Organization'), Keys.chord(Keys.ARROW_DOWN,Keys.ARROW_DOWN, Keys.ENTER))
		
		WebUI.click(findTestObject('Object Repository/OR JobTitle/Page_QM Timesheet/button_add Add Job Title'))

		WebUI.setText(findTestObject('Object Repository/OR JobTitle/Page_QM Timesheet/inputCode'), 'C009')

		WebUI.setText(findTestObject('Object Repository/OR JobTitle/Page_QM Timesheet/inputName'), 'Testing Job Title')

		WebUI.click(findTestObject('Object Repository/OR JobTitle/Page_QM Timesheet/Role'))

		WebUI.click(findTestObject('Object Repository/OR JobTitle/Page_QM Timesheet/li_IT Admin'))

		WebUI.click(findTestObject('Object Repository/OR JobTitle/Page_QM Timesheet/button_Add'))

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)
		
	}

	@Keyword
	def update_job_title() {

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)

		WebUI.click(findTestObject('Object Repository/OR JobTitle/Page_QM Timesheet/buttonrow-update'))

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)

		WebUI.setText(findTestObject('Object Repository/OR JobTitle/Page_QM Timesheet/inputCode'), 'C010')

		WebUI.setText(findTestObject('Object Repository/OR JobTitle/Page_QM Timesheet/inputName'), 'Updating Testing Job Title')

		WebUI.click(findTestObject('Object Repository/OR JobTitle/Page_QM Timesheet/Role'))

		WebUI.click(findTestObject('Object Repository/OR JobTitle/Page_QM Timesheet/li_HR User'))

		WebUI.click(findTestObject('Object Repository/OR JobTitle/Page_QM Timesheet/button_Update'))

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)
	}


	@Keyword
	def delete_job_title() {

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)

		WebUI.click(findTestObject('Object Repository/OR JobTitle/Page_QM Timesheet/buttonrow-delete'))

		WebUI.click(findTestObject('Object Repository/OR JobTitle/Page_QM Timesheet/button_Delete'))

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)
	}

	@Keyword
	def goto_job_title() {

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)

		WebUI.navigateToUrl(GlobalVariable.BASE_URL+'admin/job-title/list')

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)
	}
}
