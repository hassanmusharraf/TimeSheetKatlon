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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('http://159.203.25.179:4201/auth/login')

WebUI.click(findTestObject('OR VerifyElementPresent WFC/OR PayGroup/Page_QM Timesheet/button_Sign In'))

WebUI.verifyElementPresent(findTestObject('OR VerifyElementPresent WFC/OR VerifyElementPresent WFC/Page_QM Timesheet/a_settings Settings keyboard_arrow_down'), 
    0)

WebUI.click(findTestObject('OR VerifyElementPresent WFC/OR VerifyElementPresent WFC/Page_QM Timesheet/a_settings Settings keyboard_arrow_down'))

WebUI.verifyElementPresent(findTestObject('OR VerifyElementPresent WFC/OR PayGroup/Page_QM Timesheet/span_Workforce Configuration'), 
    0)

WebUI.click(findTestObject('Object Repository/OR VerifyElementPresent WFC/OR PayGroup/Page_QM Timesheet/span_Workforce Configuration'))

WebUI.verifyElementPresent(findTestObject('OR VerifyElementPresent WFC/OR PayGroup/Page_QM Timesheet/span_Pay Group'), 0)

WebUI.click(findTestObject('OR VerifyElementPresent WFC/OR PayGroup/Page_QM Timesheet/span_Pay Group'))

WebUI.verifyElementPresent(findTestObject('Object Repository/OR VerifyElementPresent WFC/OR PayGroup/Page_QM Timesheet/div_All Pay Groups'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/OR VerifyElementPresent WFC/OR PayGroup/Page_QM Timesheet/div_All Pay Groups'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/OR VerifyElementPresent WFC/OR PayGroup/Page_QM Timesheet/input_p-inputtext p-component p-element'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/OR VerifyElementPresent WFC/OR PayGroup/Page_QM Timesheet/button_download Download Excel Format'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/OR VerifyElementPresent WFC/OR PayGroup/Page_QM Timesheet/button_upload Bulk Upload'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/OR VerifyElementPresent WFC/OR PayGroup/Page_QM Timesheet/button_add Add Pay Group'), 
    0)

WebUI.click(findTestObject('OR VerifyElementPresent WFC/OR PayGroup/Page_QM Timesheet/button_add Add Pay Group'))

WebUI.setText(findTestObject('Object Repository/OR VerifyElementPresent WFC/OR PayGroup/Page_QM Timesheet/input_p-inputtext p-component p-element w-f_006ace'), 
    'katalon testing 1')

WebUI.sendKeys(findTestObject('Object Repository/OR VerifyElementPresent WFC/OR PayGroup/Page_QM Timesheet/input_p-inputtext p-component p-element w-f_006ace'), 
    Keys.chord(Keys.TAB))

WebUI.click(findTestObject('Object Repository/OR VerifyElementPresent WFC/OR PayGroup/Page_QM Timesheet/li_Bi-Weekly'))

WebUI.click(findTestObject('Object Repository/OR VerifyElementPresent WFC/OR PayGroup/Page_QM Timesheet/button_Add'))

WebUI.verifyElementPresent(findTestObject('Object Repository/OR VerifyElementPresent WFC/OR PayGroup/Page_QM Timesheet/button_mat-focus-indicator flex justify-cen_6f7d9e'), 
    0)

WebUI.click(findTestObject('Object Repository/OR VerifyElementPresent WFC/OR PayGroup/Page_QM Timesheet/button_mat-focus-indicator flex justify-cen_187649'))

WebUI.click(findTestObject('Object Repository/OR VerifyElementPresent WFC/OR PayGroup/Page_QM Timesheet/button_Delete'))

WebUI.delay(2)

WebUI.closeBrowser()

