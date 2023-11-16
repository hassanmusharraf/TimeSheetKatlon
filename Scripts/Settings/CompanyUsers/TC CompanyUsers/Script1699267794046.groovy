import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

CustomKeywords.'com.Components.loginIntoApplication'(GlobalVariable.IT_ADMIN,GlobalVariable.IT_ADMIN_PASS)

WebUI.delay(1)

CustomKeywords.'setting_configurations.CompanyUser.company_user'()

//WebUI.verifyElementPresent(findTestObject('Settings/OR CountryOfOperations/Page_QM Timesheet/span_Cost Center'), 0)
//
//WebUI.click(findTestObject('Settings/OR CountryOfOperations/Page_QM Timesheet/div_room_preferences Cost Center'))
//
//WebUI.click(findTestObject('Object Repository/Settings/OR CompanyUsers/span_Company Users'))
//
//WebUI.verifyElementPresent(findTestObject('Object Repository/Settings/OR CompanyUsers/qmt-page-heading_All Admins'), 0)
//
//WebUI.verifyElementPresent(findTestObject('Object Repository/Settings/OR CompanyUsers/div_All Admins'), 0)
//
//WebUI.verifyElementPresent(findTestObject('Object Repository/Settings/OR CompanyUsers/input_p-inputtext p-component p-element'), 
//    0)
//
//WebUI.waitForElementPresent(findTestObject('Settings/OR CompanyUsers/table'), 0)
//
//CustomKeywords.'com.Components.getNumberOfRows'(findTestObject('Settings/OR CompanyUsers/table'))
//
//CustomKeywords.'com.Components.getRowByNameValue'(findTestObject('Settings/OR CompanyUsers/table'), 'first name')
//
//CustomKeywords.'com.Components.getNumberOfColumns'(findTestObject('Settings/OR CompanyUsers/table'))
WebUI.closeBrowser()

