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

CustomKeywords.'project_configuration.DailyRecordSheet.add_daily_record_sheeet'()

CustomKeywords.'project_configuration.DailyRecordSheet.update_daily_record_sheeet'()

CustomKeywords.'project_configuration.DailyRecordSheet.delete_daily_record_sheeet'()

//WebUI.delay(5)
//
//WebUI.navigateToUrl('http://localhost:4200/super-admin/job-drs/list')
//
//WebUI.click(findTestObject('Object Repository/Project Configuration/OR DailyRecordSheet/Page_QM Timesheet/button_add Add New'))
//
//WebUI.setText(findTestObject('Object Repository/Project Configuration/OR DailyRecordSheet/Page_QM Timesheet/inputName'), 
//    'name 1')
//
//WebUI.sendKeys(findTestObject('Object Repository/Project Configuration/OR DailyRecordSheet/Page_QM Timesheet/inputName'), 
//    Keys.chord(Keys.ENTER))
//
//WebUI.delay(2)
//
//WebUI.click(findTestObject('Object Repository/Project Configuration/OR DailyRecordSheet/Page_QM Timesheet/buttonrow-update'))
//
//WebUI.setText(findTestObject('Object Repository/Project Configuration/OR DailyRecordSheet/Page_QM Timesheet/inputName'), 
//    'name 2')
//
//WebUI.setText(findTestObject('Object Repository/Project Configuration/OR DailyRecordSheet/Page_QM Timesheet/textareaNote'), 
//    'note')
//
//WebUI.click(findTestObject('Object Repository/Project Configuration/OR DailyRecordSheet/Page_QM Timesheet/button_Update'))
//
//WebUI.delay(2)
//
//WebUI.click(findTestObject('Object Repository/Project Configuration/OR DailyRecordSheet/Page_QM Timesheet/buttonrow-delete'))
//
//WebUI.click(findTestObject('Object Repository/Project Configuration/OR DailyRecordSheet/Page_QM Timesheet/button_Delete'))
//
//WebUI.delay(2)
WebUI.closeBrowser()

