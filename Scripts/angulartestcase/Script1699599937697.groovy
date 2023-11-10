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

CustomKeywords.'com.Components.loginIntoApplication'()

//WebUI.openBrowser('')
//
//WebUI.navigateToUrl('http://159.203.25.179:4201/auth/login')
//
//CustomKeywords.'com.AngularLocator.replaceXPath'(findTestObject('angulartesting/Page_QM Timesheet/button_Sign In'), '_ngcontent-trs-c146')
//
//WebUI.click(findTestObject('angulartesting/Page_QM Timesheet/button_Sign In'))
CustomKeywords.'com.AngularLocator.replaceXPath'(findTestObject('angulartesting/Page_QM Timesheet/span_UOM'), '_ngcontent-trs-c125')

WebUI.click(findTestObject('Object Repository/angulartesting/Page_QM Timesheet/span_UOM'))

CustomKeywords.'com.AngularLocator.replaceXPath'(findTestObject('angulartesting/Page_QM Timesheet/button_add Add New'), 
    '_ngcontent-trs-c208')

WebUI.click(findTestObject('angulartesting/Page_QM Timesheet/button_add Add New'))

WebUI.verifyElementPresent(findTestObject('angulartesting/Page_QM Timesheet/input_p-inputtext p-component p-element w-f_006ace'), 
    0)

WebUI.setText(findTestObject('Object Repository/angulartesting/Page_QM Timesheet/input_p-inputtext p-component p-element w-f_006ace'), 
    'jjj')

WebUI.click(findTestObject('Object Repository/angulartesting/Page_QM Timesheet/button_Add'))

WebUI.acceptAlert()

WebUI.closeBrowser()

