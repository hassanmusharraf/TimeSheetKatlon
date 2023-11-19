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

CustomKeywords.'com.Components.loginIntoApplication'(GlobalVariable.IT_ADMIN, GlobalVariable.IT_ADMIN_PASS)

CustomKeywords.'setting_configurations.CountryOfOperation.add_country_of_operation'()

CustomKeywords.'setting_configurations.CountryOfOperation.delete_country_of_operation'()

//WebUI.verifyElementPresent(findTestObject('null'), 0)
//
//WebUI.click(findTestObject('null'))
//
//WebUI.click(findTestObject('null'))
//
//WebUI.verifyElementPresent(findTestObject('Settings/OR CountryOfOperations/Page_QM Timesheet/div_All Countries of Operations'), 
//    0)
//
//WebDriver driver = DriverFactory.getWebDriver()
//
//'Checking number of rows present before adding element'
//
//'To locate table'
//WebElement Table = driver.findElement(By.xpath('/html[1]/body[1]/qm-root[1]/qmt-layout[1]/qmt-navigation[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[1]/div[1]/qmt-country-of-operations[1]/qmt-datagrid[1]/div[1]/p-table[1]/div[1]/div[1]/table[1]'))
//
//'To locate rows available in the table'
//List<WebElement> rowsInTable = Table.findElements(By.tagName('tr'))
//
//'To calculate no of rows In table'
//int totalRows = rowsInTable.size()
//
//println(totalRows)
//
//WebUI.click(findTestObject('Object Repository/Settings/OR CountryOfOperations/Page_QM Timesheet/span_add Add New'))
//
//WebUI.click(findTestObject('null'))
//
//WebUI.click(findTestObject('Object Repository/Settings/OR CountryOfOperations/Page_QM Timesheet/li_Albania'))
//
//WebUI.click(findTestObject('Object Repository/Settings/OR CountryOfOperations/Page_QM Timesheet/span_Add'))
//
//WebUI.delay(2)
//
//'checking number rows present after adding one new row'
//
//'To locate rows of table it will Capture all the rows available in the table'
//List<WebElement> CurrentRowsInTable = Table.findElements(By.tagName('tr'))
//
//'To calculate no of rows In table'
//int currentRows = CurrentRowsInTable.size()
//
//if (currentRows < totalRows) {
//    println('Row added successfully')
//} else {
//    println('something is wronge')
//}
WebUI.closeBrowser()

