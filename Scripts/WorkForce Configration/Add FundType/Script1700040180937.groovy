import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

CustomKeywords.'com.Components.loginIntoApplication'(GlobalVariable.IT_ADMIN,GlobalVariable.IT_ADMIN_PASS)

CustomKeywords.'workforce_configurations.WorkforceConfigurations.goto_workforce_configuration'()

WebUI.waitForElementPresent(findTestObject('OR WorkForce Configuration/OR FundType/Page_QM Timesheet/div_noise_control_off Fund Type Reference'), 
    0)

WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/OR FundType/Page_QM Timesheet/div_noise_control_off Fund Type Reference'))

WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/OR FundType/Page_QM Timesheet/button_add Add Fund Type'))

WebUI.setText(findTestObject('Object Repository/OR WorkForce Configuration/OR FundType/Page_QM Timesheet/inputFund Type Name'), 
    'Accident Fund')

WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/OR FundType/Page_QM Timesheet/button_Add'))

WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/OR FundType/Page_QM Timesheet/button_mat-focus-indicator flex justify-cen_6f7d9e'))

WebUI.setText(findTestObject('Object Repository/OR WorkForce Configuration/OR FundType/Page_QM Timesheet/inputFund Type Name'), 
    'Accident Fund 1')

WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/OR FundType/Page_QM Timesheet/button_Update'))

WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/OR FundType/Page_QM Timesheet/button_mat-focus-indicator flex justify-cen_187649'))

WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/OR FundType/Page_QM Timesheet/button_Delete'))

