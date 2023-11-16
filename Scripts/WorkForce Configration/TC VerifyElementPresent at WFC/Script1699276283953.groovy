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

WebUI.verifyElementPresent(findTestObject('Object Repository/OR VerifyElementPresent WFC/OR VerifyElementPresent WFC/Page_QM Timesheet/a_settings Settings keyboard_arrow_down'), 
    0)

WebUI.click(findTestObject('OR VerifyElementPresent WFC/OR VerifyElementPresent WFC/Page_QM Timesheet/a_settings Settings keyboard_arrow_down'))

WebUI.click(findTestObject('Object Repository/OR VerifyElementPresent WFC/OR VerifyElementPresent WFC/Page_QM Timesheet/span_Workforce Configuration'))

WebUI.verifyElementPresent(findTestObject('Object Repository/OR VerifyElementPresent WFC/OR VerifyElementPresent WFC/Page_QM Timesheet/span_Union Code'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/OR VerifyElementPresent WFC/OR VerifyElementPresent WFC/Page_QM Timesheet/span_WCB'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/OR VerifyElementPresent WFC/OR VerifyElementPresent WFC/Page_QM Timesheet/span_Compensation'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/OR VerifyElementPresent WFC/OR VerifyElementPresent WFC/Page_QM Timesheet/span_Pay Group'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/OR VerifyElementPresent WFC/OR VerifyElementPresent WFC/Page_QM Timesheet/span_Unit Of Measure'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/OR VerifyElementPresent WFC/OR VerifyElementPresent WFC/Page_QM Timesheet/span_Employee Type'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/OR VerifyElementPresent WFC/OR VerifyElementPresent WFC/Page_QM Timesheet/span_Vehicle'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/OR VerifyElementPresent WFC/OR VerifyElementPresent WFC/Page_QM Timesheet/span_Fundtype Reference'), 
    0)

WebUI.closeBrowser()

