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

CustomKeywords.'project_configuration.WorkType.add_work_type'()

CustomKeywords.'project_configuration.WorkType.update_work_type'()

CustomKeywords.'project_configuration.WorkType.delete_work_type'()

//WebUI.delay(5)
//
//WebUI.navigateToUrl('http://localhost:4200/super-admin/job-work-type/list')
//
//WebUI.click(findTestObject('Object Repository/Project Configuration/OR WorkType/Page_QM Timesheet/button_add Add New'))
//
//WebUI.setText(findTestObject('Object Repository/Project Configuration/OR WorkType/Page_QM Timesheet/inputCode'), 'WT001')
//
//WebUI.click(findTestObject('Object Repository/Project Configuration/OR WorkType/Page_QM Timesheet/DropDownDivision'))
//
//WebUI.click(findTestObject('Object Repository/Project Configuration/OR WorkType/Page_QM Timesheet/li_102  Remediation'))
//
//WebUI.click(findTestObject('Project Configuration/OR WorkType/Page_QM Timesheet/DropDownRegion'))
//
//WebUI.click(findTestObject('Object Repository/Project Configuration/OR WorkType/Page_QM Timesheet/div_111  region name'))
//
//WebUI.click(findTestObject('Project Configuration/OR WorkType/Page_QM Timesheet/DropDownLocation'))
//
//WebUI.click(findTestObject('Object Repository/Project Configuration/OR WorkType/Page_QM Timesheet/li_101  Richmond BC'))
//
//WebUI.click(findTestObject('Project Configuration/OR WorkType/Page_QM Timesheet/DropDownDepartment'))
//
//WebUI.click(findTestObject('Object Repository/Project Configuration/OR WorkType/Page_QM Timesheet/li_101  Health and Safety'))
//
//WebUI.setText(findTestObject('Object Repository/Project Configuration/OR WorkType/Page_QM Timesheet/textareaNote'), 'note')
//
//WebUI.click(findTestObject('Object Repository/Project Configuration/OR WorkType/Page_QM Timesheet/button_Add'))
//
//WebUI.delay(2)
//
//WebUI.click(findTestObject('Object Repository/Project Configuration/OR WorkType/Page_QM Timesheet/EditButton'))
//
//WebUI.setText(findTestObject('Object Repository/Project Configuration/OR WorkType/Page_QM Timesheet/inputCode'), 'WT002')
//
//WebUI.click(findTestObject('Object Repository/Project Configuration/OR WorkType/Page_QM Timesheet/DropDownDivision'))
//
//WebUI.click(findTestObject('Object Repository/Project Configuration/OR WorkType/Page_QM Timesheet/li_101  Hazmat'))
//
//WebUI.click(findTestObject('Project Configuration/OR WorkType/Page_QM Timesheet/DropDownRegion'))
//
//WebUI.click(findTestObject('Object Repository/Project Configuration/OR WorkType/Page_QM Timesheet/div_111  region name'))
//
//WebUI.click(findTestObject('Project Configuration/OR WorkType/Page_QM Timesheet/DropDownLocation'))
//
//WebUI.click(findTestObject('Object Repository/Project Configuration/OR WorkType/Page_QM Timesheet/li_100  Burlington ON'))
//
//WebUI.click(findTestObject('Project Configuration/OR WorkType/Page_QM Timesheet/DropDownDepartment'))
//
//WebUI.click(findTestObject('Object Repository/Project Configuration/OR WorkType/Page_QM Timesheet/li_102  Operations Management'))
//
//WebUI.setText(findTestObject('Object Repository/Project Configuration/OR WorkType/Page_QM Timesheet/textareaNote'), 'note123')
//
//WebUI.click(findTestObject('Object Repository/Project Configuration/OR WorkType/Page_QM Timesheet/button_Update'))
//
//WebUI.delay(2)
//
//WebUI.click(findTestObject('Object Repository/Project Configuration/OR WorkType/Page_QM Timesheet/buttonrow-delete'))
//
//WebUI.click(findTestObject('Object Repository/Project Configuration/OR WorkType/Page_QM Timesheet/button_Delete'))
//
//WebUI.delay(2)
WebUI.closeBrowser()
