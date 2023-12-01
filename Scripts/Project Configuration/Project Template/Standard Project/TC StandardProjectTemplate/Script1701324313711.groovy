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

CustomKeywords.'project_configuration.StandardProject.get_todays_date'()

CustomKeywords.'com.Components.loginIntoApplication'(GlobalVariable.IT_ADMIN, GlobalVariable.IT_ADMIN_PASS)

//not_run: CustomKeywords.'project_configuration.StandardProject.add_project_detail'()

//def updating_todays_date = new Date() + 30
//
//start_date = new SimpleDateFormat('ddMMyyyy')
//
//GlobalVariable.TODAYS_DATE = start_date.format(updating_todays_date)
//
//println(GlobalVariable.TODAYS_DATE)
//
//def updating_end_date = new Date() + 60
//
//end_date = new SimpleDateFormat('ddMMyyyy')
//
//GlobalVariable.DATE = end_date.format(updating_end_date)
//
//println(GlobalVariable.DATE)
CustomKeywords.'project_configuration.StandardProject.goto_project'()
CustomKeywords.'project_configuration.StandardProject.update_project_detail'()

not_run: CustomKeywords.'project_configuration.StandardProject.add_settings'()

not_run: CustomKeywords.'project_configuration.StandardProject.add_task'()

CustomKeywords.'project_configuration.StandardProject.update_task'()

not_run: CustomKeywords.'project_configuration.StandardProject.add_resource'()

not_run: CustomKeywords.'com.Components.search_element'('')

WebUI.closeBrowser()

