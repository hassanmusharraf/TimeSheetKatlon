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

CustomKeywords.'project_configuration.StandardTemplate.goto_add_standard_template'()

CustomKeywords.'com.Components.loginIntoApplication'(GlobalVariable.IT_ADMIN, GlobalVariable.IT_ADMIN_PASS)

CustomKeywords.'project_configuration.StandardTemplate.goto_add_standard_template'()

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:4200/super-admin/job/job-data/ca9bdc17-79d2-4c11-9d0e-1a151a81d9ba/edit?id=ca9bdc17-79d2-4c11-9d0e-1a151a81d9ba&name=Standard%20Project&project_id=1c1bcb67-e82f-4d9d-aab7-617b8094f254')

WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/OR Resource/a_Resources'))

WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/OR Resource/button_add Add New'))

WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/OR Resource/div_construction'))

WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/OR Resource/input_ng-tns-c329-49 p-autocomplete-input p_9d5528'))

WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/OR Resource/li_Standard Fleet'))

WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/OR Resource/button_'))

WebUI.click(findTestObject('Object Repository/Project Configuration/OR StandardTemplate/OR Resource/li_test  test name2'))

