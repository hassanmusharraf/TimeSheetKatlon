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

not_run: CustomKeywords.'setting_configurations.CostCenter.add_division'()

not_run: CustomKeywords.'setting_configurations.CostCenter.delete_division'()

CustomKeywords.'setting_configurations.CostCenter.add_department'()

CustomKeywords.'setting_configurations.CostCenter.add_region'()

CustomKeywords.'setting_configurations.CostCenter.add_location'()

//WebUI.click(findTestObject('Object Repository/Settings/CostCenter/Page_QM Timesheet/span_Division'))
//
//WebUI.verifyElementPresent(findTestObject('Object Repository/Settings/CostCenter/Page_QM Timesheet/div_All division'), 0)
//
//WebUI.click(findTestObject('Object Repository/Settings/CostCenter/Page_QM Timesheet/Add new button'))
//
//WebUI.setText(findTestObject('Settings/CostCenter/Page_QM Timesheet/idivisionname'), 'division name')
//
//WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.TAB))
//
//WebUI.setText(findTestObject('Settings/CostCenter/Page_QM Timesheet/divisioncodee'), '111')
//
//WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.TAB))
//
//WebUI.setText(findTestObject('Settings/CostCenter/Page_QM Timesheet/sequence'), '5')
//
//WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.TAB))
//
//not_run: WebUI.click(findTestObject('Settings/CostCenter/Page_QM Timesheet/set organization'))
//
//WebUI.click(findTestObject('Object Repository/Settings/CostCenter/Page_QM Timesheet/li_company 1'))
//
//WebUI.click(findTestObject('Object Repository/Settings/CostCenter/Page_QM Timesheet/button_Add'))
//
//WebUI.click(findTestObject('Object Repository/Settings/CostCenter/Page_QM Timesheet/row-delete'))
//
//WebUI.click(findTestObject('Object Repository/Settings/CostCenter/Page_QM Timesheet/button_Delete'))
//
//WebUI.click(findTestObject('Settings/CostCenter/Page_QM Timesheet/span_Region'))
//
//WebUI.verifyElementPresent(findTestObject('Settings/CostCenter/Page_QM Timesheet/div_All region'), 0)
//
//WebUI.click(findTestObject('Settings/CostCenter/Page_QM Timesheet/button_add Add region'))
//
//WebUI.setText(findTestObject('Settings/CostCenter/Page_QM Timesheet/idivisionname'), 'region name')
//
//WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.TAB))
//
//WebUI.setText(findTestObject('Settings/CostCenter/Page_QM Timesheet/divisioncodee'), '111')
//
//WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.TAB))
//
//WebUI.setText(findTestObject('Settings/CostCenter/Page_QM Timesheet/sequence'), '5')
//
//WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.TAB))
//
//WebUI.click(findTestObject('Object Repository/Settings/CostCenter/Page_QM Timesheet/li_company 1'))
//
//WebUI.click(findTestObject('Object Repository/Settings/CostCenter/Page_QM Timesheet/button_Add'))
//
//WebUI.click(findTestObject('Object Repository/Settings/CostCenter/Page_QM Timesheet/row-delete'))
//
//WebUI.click(findTestObject('Object Repository/Settings/CostCenter/Page_QM Timesheet/button_Delete'))
//
//WebUI.click(findTestObject('Settings/CostCenter/Page_QM Timesheet/span_Location'))
//
//WebUI.verifyElementPresent(findTestObject('Settings/CostCenter/Page_QM Timesheet/div_All location'), 0)
//
//WebUI.click(findTestObject('Settings/CostCenter/Page_QM Timesheet/button_add Add location'))
//
//WebUI.setText(findTestObject('Settings/CostCenter/Page_QM Timesheet/idivisionname'), 'location name')
//
//WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.TAB))
//
//WebUI.setText(findTestObject('Settings/CostCenter/Page_QM Timesheet/divisioncodee'), '111')
//
//WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.TAB))
//
//WebUI.setText(findTestObject('Settings/CostCenter/Page_QM Timesheet/sequence'), '5')
//
//WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.TAB))
//
//WebUI.click(findTestObject('Object Repository/Settings/CostCenter/Page_QM Timesheet/li_company 1'))
//
//WebUI.click(findTestObject('Object Repository/Settings/CostCenter/Page_QM Timesheet/button_Add'))
//
//WebUI.click(findTestObject('Object Repository/Settings/CostCenter/Page_QM Timesheet/row-delete'))
//
//WebUI.click(findTestObject('Object Repository/Settings/CostCenter/Page_QM Timesheet/button_Delete'))
//
//WebUI.click(findTestObject('Settings/CostCenter/Page_QM Timesheet/span_Department'))
//
//WebUI.click(findTestObject('Settings/CostCenter/Page_QM Timesheet/button_add Add department'))
//
//WebUI.setText(findTestObject('Settings/CostCenter/Page_QM Timesheet/idivisionname'), 'department name')
//
//WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.TAB))
//
//WebUI.setText(findTestObject('Settings/CostCenter/Page_QM Timesheet/divisioncodee'), '111')
//
//WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.TAB))
//
//WebUI.setText(findTestObject('Settings/CostCenter/Page_QM Timesheet/sequence'), '5')
//
//WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.TAB))
//
//WebUI.click(findTestObject('Object Repository/Settings/CostCenter/Page_QM Timesheet/li_company 1'))
//
//WebUI.click(findTestObject('Object Repository/Settings/CostCenter/Page_QM Timesheet/button_Add'))
//
//WebUI.click(findTestObject('Object Repository/Settings/CostCenter/Page_QM Timesheet/row-delete'))
//
//WebUI.click(findTestObject('Object Repository/Settings/CostCenter/Page_QM Timesheet/button_Delete'))
//
//CustomKeywords.'com.Components.logOutFromApplication'()
WebUI.closeBrowser()

