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

CustomKeywords.'com.Components.loginIntoApplication'(GlobalVariable.IT_ADMIN, GlobalVariable.IT_ADMIN_PASS)

CustomKeywords.'project_configuration.CostCode.add_cost_code'()

CustomKeywords.'project_configuration.CostCode.update_cost_code'()

CustomKeywords.'project_configuration.CostCode.delete_cost_code'()

//WebUI.delay(5)
//
//WebUI.navigateToUrl('http://localhost:4200/super-admin/cost-code/list')
//
//
//WebUI.click(findTestObject('Object Repository/Project Configuration/CostCode/Page_QM Timesheet/button_add Add Cost Code'))
//
//WebUI.setText(findTestObject('Object Repository/Project Configuration/CostCode/Page_QM Timesheet/inputCode'), '0001')
//
//WebUI.setText(findTestObject('Object Repository/Project Configuration/CostCode/Page_QM Timesheet/inputName'), 'Name1')
//
//WebUI.click(findTestObject('Object Repository/Project Configuration/CostCode/Page_QM Timesheet/button_Add'))
//
//WebUI.click(findTestObject('Object Repository/Project Configuration/CostCode/Page_QM Timesheet/button_mat-focus-indicator flex justify-cen_6f7d9e'))
//
//WebUI.setText(findTestObject('Object Repository/Project Configuration/CostCode/Page_QM Timesheet/inputCode'), '00012')
//
//WebUI.setText(findTestObject('Object Repository/Project Configuration/CostCode/Page_QM Timesheet/inputName'), 'Name')
//
//WebUI.click(findTestObject('Object Repository/Project Configuration/CostCode/Page_QM Timesheet/button_Update'))
//
//WebUI.click(findTestObject('Object Repository/Project Configuration/CostCode/Page_QM Timesheet/buttonrow-delete'))
//
//WebUI.click(findTestObject('Object Repository/Project Configuration/CostCode/Page_QM Timesheet/button_Delete'))
WebUI.closeBrowser()

