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

public class CompanyUser {

	@Keyword
	def company_user() {

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)

		WebUI.navigateToUrl(GlobalVariable.BASE_URL+'super-admin/all-users-info/admin-list')

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)

		WebUI.verifyElementPresent(findTestObject('Object Repository/Settings/OR CompanyUsers/qmt-page-heading_All Admins'), 0)

		WebUI.verifyElementPresent(findTestObject('Object Repository/Settings/OR CompanyUsers/div_All Admins'), 0)

		WebUI.verifyElementPresent(findTestObject('Object Repository/Settings/OR CompanyUsers/input_p-inputtext p-component p-element'),
				0)

		WebUI.waitForElementPresent(findTestObject('Settings/OR CompanyUsers/table'), 0)

//		'com.Components.getNumberOfRows'(findTestObject('Settings/OR CompanyUsers/table'),0)

		'com.Components.getRowByNameValue'(findTestObject('Settings/OR CompanyUsers/table'), 'Shanta')

		'com.Components.getNumberOfColumns'(findTestObject('Settings/OR CompanyUsers/table'),0)
	}
}
