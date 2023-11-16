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

WebUI.delay(8)

WebUI.navigateToUrl(equipment_type_url)

WebUI.delay(GlobalVariable.MED_TIMESLEEP)

WebUI.click(findTestObject('Object Repository/Fleet Config OR/Page_QM Timesheet/button_add Add Equipment Type'))

WebUI.setText(findTestObject('Object Repository/Fleet Config OR/Page_QM Timesheet/input__p-inputtext p-component p-element w-_728c40'), 
    GlobalVariable.TEXT)

WebUI.click(findTestObject('Object Repository/Fleet Config OR/Page_QM Timesheet/button_Add'))

WebUI.delay(GlobalVariable.LOW_TIMESLEEP)

WebUI.delay(GlobalVariable.LOW_TIMESLEEP)

WebUI.delay(GlobalVariable.LOW_TIMESLEEP)

WebUI.setText(findTestObject('Object Repository/Fleet Config OR/Page_QM Timesheet/input_All Equipment Types_p-inputtext p-com_db1966'), 
    'new')

WebUI.delay(3)

WebUI.navigateToUrl(category_url)

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Fleet Config OR/Page_QM Timesheet/button_add Add Category'))

WebUI.setText(findTestObject('Object Repository/Fleet Config OR/Page_QM Timesheet/input__p-inputtext p-component p-element w-_728c40'), 
    GlobalVariable.TEXT)

WebUI.delay(GlobalVariable.LOW_TIMESLEEP)

WebUI.click(findTestObject('Object Repository/Fleet Config OR/Page_QM Timesheet/button_Add'))

WebUI.delay(GlobalVariable.LOW_TIMESLEEP)

WebUI.delay(GlobalVariable.LOW_TIMESLEEP)

WebUI.delay(GlobalVariable.LOW_TIMESLEEP)

WebUI.navigateToUrl(status_url)

WebUI.delay(GlobalVariable.LOW_TIMESLEEP)

WebUI.click(findTestObject('Object Repository/Fleet Config OR/Page_QM Timesheet/button_add Add Fleet Status'))

WebUI.setText(findTestObject('Object Repository/Fleet Config OR/Page_QM Timesheet/input__p-inputtext p-component p-element w-_728c40'), 
    GlobalVariable.TEXT)

WebUI.click(findTestObject('Object Repository/Fleet Config OR/Page_QM Timesheet/button_Add'))

WebUI.delay(GlobalVariable.LOW_TIMESLEEP)

WebUI.closeBrowser()

