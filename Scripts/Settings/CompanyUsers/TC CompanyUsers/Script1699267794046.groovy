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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('http://192.168.1.113:4200')

WebUI.click(findTestObject('Object Repository/Settings/OR CountryOfOperations/Page_QM Timesheet/button_Sign In'))

WebUI.delay(1)

WebUI.verifyElementPresent(findTestObject('Settings/OR CountryOfOperations/Page_QM Timesheet/span_Cost Center'), 0)

WebUI.click(findTestObject('Settings/OR CountryOfOperations/Page_QM Timesheet/div_room_preferences Cost Center'))

WebUI.click(findTestObject('Object Repository/Settings/OR CompanyUsers/span_Company Users'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Settings/OR CompanyUsers/qmt-page-heading_All Admins'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Settings/OR CompanyUsers/div_All Admins'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Settings/OR CompanyUsers/input_p-inputtext p-component p-element'), 
    0)

WebUI.waitForElementPresent(findTestObject('Settings/OR CompanyUsers/table'), 0)

WebDriver driver = DriverFactory.getWebDriver()

'Checking number of rows present before adding element'

'To locate table'
WebElement Table = driver.findElement(By.xpath('/html[1]/body[1]/qm-root[1]/qmt-layout[1]/qmt-navigation[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[1]/div[1]/qmt-company-users[1]/qmt-datagrid[1]/div[1]/p-table[1]/div[1]/div[1]/table[1]/tbody[1]'))

'To locate rows available in the table'
List<WebElement> rowsInTable = Table.findElements(By.tagName('tr'))

int totalRows = rowsInTable.size()

println('Rows : ' + totalRows)

int columns = 6

WebElement row = driver.findElement(By.xpath('/html[1]/body[1]/qm-root[1]/qmt-layout[1]/qmt-navigation[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[1]/div[1]/qmt-company-users[1]/qmt-datagrid[1]/div[1]/p-table[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]'))

List<WebElement> columnInTable = row.findElements(By.tagName('td'))

int totalColumnsInTable = columnInTable.size()

if (columns == totalColumnsInTable) {
    println(totalColumnsInTable + 'Columns are present')
} else {
    println('Number of Columns' + totalColumnsInTable)
}

WebUI.closeBrowser()

