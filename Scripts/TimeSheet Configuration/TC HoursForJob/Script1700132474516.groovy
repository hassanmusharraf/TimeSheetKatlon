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

WebUI.navigateToUrl('http://localhost:4200/auth/login')

WebUI.click(findTestObject('Object Repository/OR TimeSheet Configuration/OR HoursForJob/button_add Add New'))

WebUI.setText(findTestObject('Object Repository/OR TimeSheet Configuration/OR HoursForJob/inputCode'), 'NC')

WebUI.setText(findTestObject('Object Repository/OR TimeSheet Configuration/OR HoursForJob/inputName'), 'Adding name')

WebUI.setText(findTestObject('Object Repository/OR TimeSheet Configuration/OR HoursForJob/inputStandard Hour'), '25')

WebUI.setText(findTestObject('Object Repository/OR TimeSheet Configuration/OR HoursForJob/input_ng-tns-c329-31 p-autocomplete-input p_2fbdfd'), 
    '')

WebUI.click(findTestObject('Object Repository/OR TimeSheet Configuration/OR HoursForJob/input_ng-tns-c329-31 p-autocomplete-input p_2fbdfd'))

WebUI.click(findTestObject('Object Repository/OR TimeSheet Configuration/OR HoursForJob/li_Over Time'))

WebUI.click(findTestObject('Object Repository/OR TimeSheet Configuration/OR HoursForJob/button_Add'))

