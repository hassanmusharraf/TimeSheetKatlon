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

WebUI.navigateToUrl('http://192.168.1.113:4200')

WebUI.click(findTestObject('Object Repository/Settings/OR Organization/button_Sign In'))

WebUI.waitForElementPresent(findTestObject('Settings/OR Organization/span_Organization'), 0)

WebUI.click(findTestObject('Settings/OR Organization/span_Organization'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Settings/OR Organization/div_All Companies'), 0)

WebUI.click(findTestObject('Object Repository/Settings/OR Organization/button_add Add Company'))

WebUI.click(findTestObject('Object Repository/Settings/OR Organization/div_Add Company'))

WebUI.sendKeys(findTestObject('Object Repository/Settings/OR Organization/input_p-inputtext p-component p-element w-f_006ace'), 
    'Katalon Company')

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.TAB))

WebUI.setText(findTestObject('Settings/OR Organization/input_p-inputtext p-component p-element w-f_006ace_1'), 'Testing type')

WebUI.setText(findTestObject('Settings/OR Organization/input_p-inputtext p-component p-element w-f_006ace_1_2'), '1')

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.TAB))

WebUI.setText(findTestObject('Object Repository/Settings/OR Organization/p_Date Of Establishment'), '05-11-1999')

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.TAB))

WebUI.setText(findTestObject('Settings/OR Organization/adminfirstname'), 'admin')

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.TAB))

WebUI.setText(findTestObject('Settings/OR Organization/adminlastname'), 'name')

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.TAB))

WebUI.setText(findTestObject('Settings/OR Organization/adminemail'), 'katalontest@gmail.com')

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.TAB))

WebUI.setText(findTestObject('Settings/OR Organization/phone'), '80808080880')

WebUI.click(findTestObject('Settings/OR Organization/countrydropdown'))

WebUI.click(findTestObject('Object Repository/Settings/OR Organization/li_Afghanistan'))

WebUI.click(findTestObject('Settings/OR Organization/provision'))

WebUI.click(findTestObject('Object Repository/Settings/OR Organization/li_Badghis'))

WebUI.setText(findTestObject('Settings/OR Organization/street'), 'street123')

WebUI.setText(findTestObject('Settings/OR Organization/unit'), '12345')

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.TAB))

WebUI.sendKeys(findTestObject('Settings/OR Organization/PostalCode'), '12345')

WebUI.click(findTestObject('Object Repository/Settings/OR Organization/button_Add'))

WebUI.delay(1)

WebUI.verifyElementPresent(findTestObject('Settings/OR Organization/button_katalontestgmail.com_mat-focus-indicator flex justify-center w-30px h-30px items-center text-red-500 mat-icon-button mat-button-base cdk-focused cdk-mouse-focused'), 
    0, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Settings/OR Organization/button_katalontestgmail.com_mat-focus-indicator flex justify-center w-30px h-30px items-center text-red-500 mat-icon-button mat-button-base cdk-focused cdk-mouse-focused'))

WebUI.verifyElementPresent(findTestObject('Settings/OR Organization/button_Delete'), 0)

WebUI.click(findTestObject('Settings/OR Organization/button_Delete'))

WebUI.delay(2)

WebUI.closeBrowser()

