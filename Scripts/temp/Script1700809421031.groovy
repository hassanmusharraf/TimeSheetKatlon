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

WebUI.delay(GlobalVariable.LOW_TIMESLEEP)

WebUI.click(findTestObject('Object Repository/OR Fleet Configurations/OR FleetTemplates/row-update'))

WebUI.delay(GlobalVariable.LOW_TIMESLEEP)

WebUI.setText(findTestObject('Object Repository/OR Fleet Configurations/OR FleetTemplates/inputEquipment ID'), 'ID002')

WebUI.setText(findTestObject('Object Repository/OR Fleet Configurations/OR FleetTemplates/inputEquipment Name'), 'Updating name')

WebUI.setText(findTestObject('Object Repository/OR Fleet Configurations/OR FleetTemplates/inputMake'), 'Updating')

WebUI.setText(findTestObject('Object Repository/OR Fleet Configurations/OR FleetTemplates/inputModel'), 'Updating')

WebUI.setText(findTestObject('Object Repository/OR Fleet Configurations/OR FleetTemplates/inputSIN'), 'Updating')

WebUI.click(findTestObject('Object Repository/OR Fleet Configurations/OR FleetTemplates/Equipment Type'))
		
WebUI.click(findTestObject('Object Repository/OR Fleet Configurations/OR FleetTemplates/li_equipment type 2'))

WebUI.click(findTestObject('OR Fleet Configurations/OR FleetTemplates/Parent Equipment'))

WebUI.click(findTestObject('Object Repository/OR Fleet Configurations/OR FleetTemplates/li_Name3'))

WebUI.click(findTestObject('OR Fleet Configurations/OR FleetTemplates/Fleet Category'))

WebUI.click(findTestObject('Object Repository/OR Fleet Configurations/OR FleetTemplates/li_category 2'))

WebUI.setText(findTestObject('Object Repository/OR Fleet Configurations/OR FleetTemplates/inputShort Description'), 'updating desc')

WebUI.click(findTestObject('Object Repository/OR Fleet Configurations/OR FleetTemplates/isSSR'))

WebUI.click(findTestObject('OR Fleet Configurations/OR FleetTemplates/Base UOM'))

WebUI.click(findTestObject('Object Repository/OR Fleet Configurations/OR FleetTemplates/li_Day'))

WebUI.setText(findTestObject('Object Repository/OR Fleet Configurations/OR FleetTemplates/inputUnit Rate Work'), '26')

WebUI.setText(findTestObject('Object Repository/OR Fleet Configurations/OR FleetTemplates/inputUnit Rate travel'), '24')

WebUI.setText(findTestObject('Object Repository/OR Fleet Configurations/OR FleetTemplates/inputUnit Cost'), '12')
		
WebUI.click(findTestObject('OR Fleet Configurations/OR FleetTemplates/Division'))

WebUI.click(findTestObject('Object Repository/OR Fleet Configurations/OR FleetTemplates/li_102  Remediation'))

WebUI.click(findTestObject('OR Fleet Configurations/OR FleetTemplates/Region'))

WebUI.click(findTestObject('Object Repository/OR Fleet Configurations/OR FleetTemplates/li_111  region name'))

WebUI.click(findTestObject('OR Fleet Configurations/OR FleetTemplates/Location'))

WebUI.click(findTestObject('Object Repository/OR Fleet Configurations/OR FleetTemplates/li_100  Burlington ON'))

WebUI.click(findTestObject('OR Fleet Configurations/OR FleetTemplates/Department'))

WebUI.click(findTestObject('Object Repository/OR Fleet Configurations/OR FleetTemplates/li_100  Job Sites'))

WebUI.click(findTestObject('OR Fleet Configurations/OR FleetTemplates/IsEnable'))

WebUI.setText(findTestObject('OR Fleet Configurations/OR FleetTemplates/input date'), '22102023')

WebUI.click(findTestObject('OR Fleet Configurations/OR FleetTemplates/Fleet Status'))

WebUI.click(findTestObject('Object Repository/OR Fleet Configurations/OR FleetTemplates/li_status 2'))

WebUI.click(findTestObject('OR Fleet Configurations/OR FleetTemplates/Country'))

WebUI.click(findTestObject('Object Repository/OR Fleet Configurations/OR FleetTemplates/li_India'))

WebUI.click(findTestObject('OR Fleet Configurations/OR FleetTemplates/Province'))

WebUI.click(findTestObject('Object Repository/OR Fleet Configurations/OR FleetTemplates/li_Andaman and Nicobar Islands'))

WebUI.setText(findTestObject('Object Repository/OR Fleet Configurations/OR FleetTemplates/textareaUpdate Remark'), 'updating ')

WebUI.click(findTestObject('Object Repository/OR Fleet Configurations/OR FleetTemplates/button_Update'))

WebUI.delay(GlobalVariable.LOW_TIMESLEEP)