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


WebUI.navigateToUrl('http://localhost:4200/super-admin/union-code/list')

WebUI.click(findTestObject('Object Repository/OR temp/button_add Add Union Code'))

WebUI.setText(findTestObject('Object Repository/OR temp/inputUnion Code'), '11236')

WebUI.sendKeys(findTestObject('Object Repository/OR temp/input_ng-tns-c329-32 p-autocomplete-input p_b86901'), Keys.chord(
        Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/OR temp/inputUnion Amount'), '52896')

WebUI.sendKeys(findTestObject('Object Repository/OR temp/input_ng-tns-c329-32 p-autocomplete-input p_b86901'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('Object Repository/OR temp/inputmat-checkbox-2-input'))

WebUI.click(findTestObject('Object Repository/OR temp/inputmat-checkbox-3-input'))

WebUI.setText(findTestObject('Object Repository/OR temp/textareaNote 1'), 'note 1')

WebUI.setText(findTestObject('Object Repository/OR temp/textareaNote 2'), 'note 2')

WebUI.setText(findTestObject('Object Repository/OR temp/inputUnion Amount'), '14589')

WebUI.sendKeys(findTestObject('Object Repository/OR temp/input_ng-tns-c329-32 p-autocomplete-input p_b86901'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('Object Repository/OR temp/inputmat-checkbox-6-input'))

WebUI.setText(findTestObject('Object Repository/OR temp/textareaNote 1'), 'note 12')

WebUI.setText(findTestObject('Object Repository/OR temp/textareaNote 2'), 'note 12')

WebUI.setText(findTestObject('Object Repository/OR temp/inputUnion Amount'), '12.5')

WebUI.sendKeys(findTestObject('Object Repository/OR temp/input_ng-tns-c329-32 p-autocomplete-input p_b86901'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('Object Repository/OR temp/inputmat-checkbox-10-input'))

WebUI.click(findTestObject('Object Repository/OR temp/inputmat-checkbox-11-input'))

WebUI.setText(findTestObject('Object Repository/OR temp/textareaNote 1'), 'note 123')

WebUI.setText(findTestObject('Object Repository/OR temp/textareaNote 2'), 'note 123')

WebUI.setText(findTestObject('Object Repository/OR temp/input_ng-tns-c329-32 p-autocomplete-input p_b86901'), ' ')

WebUI.sendKeys(findTestObject('Object Repository/OR temp/input_ng-tns-c329-32 p-autocomplete-input p_b86901'), Keys.chord(
        Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/OR temp/inputUnion Amount'), '125634')

WebUI.sendKeys(findTestObject('Object Repository/OR temp/input_ng-tns-c329-32 p-autocomplete-input p_b86901'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('Object Repository/OR temp/inputmat-checkbox-14-input'))

WebUI.click(findTestObject('Object Repository/OR temp/inputmat-checkbox-15-input'))

WebUI.click(findTestObject('Object Repository/OR temp/inputmat-checkbox-16-input'))

WebUI.setText(findTestObject('Object Repository/OR temp/textareaNote 1'), 'note 1234')

WebUI.setText(findTestObject('Object Repository/OR temp/textareaNote 2'), 'note 1234')

WebUI.setText(findTestObject('Object Repository/OR temp/input_ng-tns-c329-32 p-autocomplete-input p_b86901'), ' ')

WebUI.sendKeys(findTestObject('Object Repository/OR temp/input_ng-tns-c329-32 p-autocomplete-input p_b86901'), Keys.chord(
        Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/OR temp/inputUnion Amount'), '25.8')

WebUI.sendKeys(findTestObject('Object Repository/OR temp/input_ng-tns-c329-32 p-autocomplete-input p_b86901'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('Object Repository/OR temp/inputmat-checkbox-18-input'))

WebUI.click(findTestObject('Object Repository/OR temp/inputmat-checkbox-19-input'))

WebUI.setText(findTestObject('Object Repository/OR temp/textareaNote 1'), 'note 12345')

WebUI.setText(findTestObject('Object Repository/OR temp/textareaNote 2'), 'note 12345')

WebUI.setText(findTestObject('Object Repository/OR temp/inputUnion Amount'), '12356')

WebUI.sendKeys(findTestObject('Object Repository/OR temp/input_ng-tns-c329-32 p-autocomplete-input p_b86901'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('Object Repository/OR temp/inputmat-checkbox-22-input'))

WebUI.setText(findTestObject('Object Repository/OR temp/textareaNote 1'), 'note')

WebUI.setText(findTestObject('Object Repository/OR temp/textareaNote 2'), 'note')

WebUI.setText(findTestObject('Object Repository/OR temp/inputUnion Amount'), '12589')

WebUI.sendKeys(findTestObject('Object Repository/OR temp/input_ng-tns-c329-32 p-autocomplete-input p_b86901'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('Object Repository/OR temp/inputmat-checkbox-26-input'))

WebUI.setText(findTestObject('Object Repository/OR temp/textareaNote 1'), 'note 456')

WebUI.setText(findTestObject('Object Repository/OR temp/textareaNote 2'), 'note 456')

WebUI.setText(findTestObject('Object Repository/OR temp/inputUnion Amount'), '1256')

WebUI.sendKeys(findTestObject('Object Repository/OR temp/input_ng-tns-c329-32 p-autocomplete-input p_b86901'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('Object Repository/OR temp/inputmat-checkbox-30-input'))

WebUI.click(findTestObject('Object Repository/OR temp/inputmat-checkbox-30-input'))

WebUI.click(findTestObject('Object Repository/OR temp/inputmat-checkbox-30-input'))

WebUI.click(findTestObject('Object Repository/OR temp/inputmat-checkbox-31-input'))

WebUI.click(findTestObject('Object Repository/OR temp/inputmat-checkbox-31-input'))

WebUI.click(findTestObject('Object Repository/OR temp/inputmat-checkbox-31-input'))

WebUI.setText(findTestObject('Object Repository/OR temp/textareaNote 1'), 'note 456')

WebUI.setText(findTestObject('Object Repository/OR temp/textareaNote 2'), 'note456')

WebUI.setText(findTestObject('Page_QM Timesheet/inputUnion Amount'), '12.5')

WebUI.sendKeys(findTestObject('Object Repository/OR temp/input_ng-tns-c329-32 p-autocomplete-input p_b86901'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('Object Repository/OR temp/inputmat-checkbox-34-input'))

WebUI.click(findTestObject('Object Repository/OR temp/inputmat-checkbox-35-input'))

WebUI.click(findTestObject('Object Repository/OR temp/inputmat-checkbox-36-input'))

WebUI.setText(findTestObject('Object Repository/OR temp/textareaNote 1'), 'note 147')

WebUI.setText(findTestObject('Object Repository/OR temp/textareaNote 2'), 'note 147')

WebUI.click(findTestObject('Object Repository/OR temp/button_Add'))

