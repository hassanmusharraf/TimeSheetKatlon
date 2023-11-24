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
import com.Components
public class CompanyUser {

	@Keyword
	def company_user() {

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)

		WebUI.navigateToUrl(GlobalVariable.BASE_URL+'super-admin/all-users-info/admin-list')

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)

		Components.getRowByNameValue("/html[1]/body[1]/qm-root[1]/qmt-layout[1]/qmt-navigation[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[1]/div[1]/qmt-company-users[1]/qmt-datagrid[1]/div[1]/p-table[1]/div[1]/div[1]/table[1]/tbody[1]/tr" ,'Shanta')
		
	}
}
