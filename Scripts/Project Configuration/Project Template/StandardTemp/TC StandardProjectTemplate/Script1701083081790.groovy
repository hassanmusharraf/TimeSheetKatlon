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
import java.text.SimpleDateFormat as SimpleDateFormat

CustomKeywords.'com.Components.loginIntoApplication'(GlobalVariable.IT_ADMIN, GlobalVariable.IT_ADMIN_PASS)

def todays_date = new Date()

GlobalVariable.TODAYS_DATE = new SimpleDateFormat('ddMMyyyy')

println(GlobalVariable.TODAYS_DATE.format(todays_date))

def end_date = new Date() + 30

GlobalVariable.DATE = new SimpleDateFormat('ddMMyyyy')

println(GlobalVariable.DATE.format(end_date))

//CustomKeywords.'project_configuration.StandardTemplate.add_standard_template'()
def updating_date = new Date() + 30

GlobalVariable.TODAYS_DATE = new SimpleDateFormat('ddMMyyyy')

println(GlobalVariable.TODAYS_DATE.format(updating_date))

def updating_end_date = new Date() + 60

GlobalVariable.DATE = new SimpleDateFormat('ddMMyyyy')

println(GlobalVariable.DATE.format(updating_end_date))

not_run: CustomKeywords.'com.Components.search_element'('')

CustomKeywords.'project_configuration.StandardTemplate.goto_project'()

CustomKeywords.'project_configuration.StandardTemplate.add_settings'()

CustomKeywords.'project_configuration.StandardTemplate.add_task'()

CustomKeywords.'project_configuration.StandardTemplate.add_resource'()

//CustomKeywords.'project_configuration.StandardTemplate.update_standard_template'()
//WebUI.delay(GlobalVariable.LOW_TIMESLEEP)
//
//WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/OR ProjectDetail/row-update'))
//
//WebUI.delay(GlobalVariable.LOW_TIMESLEEP)
//
//WebUI.setText(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/updating_template/inputProject Number'),
//	'TPJ002')
//
//WebUI.setText(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/updating_template/inputProject Name'),
//	'Adding name')
//
//WebUI.doubleClick(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/updating_template/inputProject Name'))
//
//WebUI.setText(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/updating_template/inputProject Name'),
//	'Updating name')
//
//WebUI.setText(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/updating_template/inputProject Short Description'),
//	'Desc')
//
//WebUI.setText(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/updating_template/inputClient Number'),
//	'002')
//
//WebUI.setText(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/updating_template/inputClient Name'),
//	'Updating Client XYZ')
//
//WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/updating_template/button_'))
//
//WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/updating_template/li_Emp 2  emp2gmail.com'))
//
//WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/updating_template/input_ng-tns-c329-38 p-autocomplete-input p_1d95f6'))
//
//WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/updating_template/li_Emp 5  emp5gmail.com'))
//
//WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/updating_template/input_ng-tns-c329-38 p-autocomplete-input p_1d95f6'))
//
//WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/updating_template/span_Emp 1  emp1gmail.com'))
//
//WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/updating_template/input_ng-tns-c329-38 p-autocomplete-input p_1d95f6'))
//
//WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/updating_template/li_Meenaz Momin  meenazmail.com'))
//
//WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/updating_template/button_'))
//
//WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/updating_template/li_WIP Name 1'))
//
//WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/updating_template/button_'))
//
//WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/updating_template/li_name 1'))
//
//WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/updating_template/input_ng-tns-c329-38 p-autocomplete-input p_1d95f6'))
//
//WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/updating_template/li_JUC001'))
//
//WebUI.setText(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/updating_template/inputDaily LOA Amount Selection'),
//	'556')
//
//WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/updating_template/button_'))
//
//WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/updating_template/li_India'))
//
//WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/updating_template/button_'))
//
//WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/updating_template/li_Andhra Pradesh'))
//
//WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/updating_template/button_'))
//
//WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/updating_template/li_100  Demolition'))
//
//WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/updating_template/button_'))
//
//WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/updating_template/li_R001  Testing Region'))
//
//WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/updating_template/button_'))
//
//WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/updating_template/li_101  Richmond BC'))
//
//WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/updating_template/button_'))
//
//WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/updating_template/li_101  Health and Safety'))
//
//WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/updating_template/button_Update'))
WebUI.closeBrowser()

