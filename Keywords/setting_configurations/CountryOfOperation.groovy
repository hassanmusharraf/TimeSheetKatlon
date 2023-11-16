package setting_configurations

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.By
import org.openqa.selenium.WebElement

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import org.openqa.selenium.WebDriver as WebDriver





public class CountryOfOperation {

	@Keyword
	def add_country_of_operation() {
		WebUI.verifyElementPresent(findTestObject('Settings/OR CountryOfOperations/Page_QM Timesheet/span_Cost Center'), 0)

		WebUI.click(findTestObject('Settings/OR CountryOfOperations/Page_QM Timesheet/div_room_preferences Cost Center'))

		WebUI.click(findTestObject('Object Repository/Settings/OR CountryOfOperations/Page_QM Timesheet/span_Country of Operations'))

		WebUI.verifyElementPresent(findTestObject('Settings/OR CountryOfOperations/Page_QM Timesheet/div_All Countries of Operations'),
				0)

		WebDriver driver = DriverFactory.getWebDriver()

		'Checking number of rows present before adding element'

		'To locate table'
		WebElement Table = driver.findElement(By.xpath('/html[1]/body[1]/qm-root[1]/qmt-layout[1]/qmt-navigation[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[1]/div[1]/qmt-country-of-operations[1]/qmt-datagrid[1]/div[1]/p-table[1]/div[1]/div[1]/table[1]'))

		'To locate rows available in the table'
		List<WebElement> rowsInTable = Table.findElements(By.tagName('tr'))

		'To calculate no of rows In table'
		int totalRows = rowsInTable.size()

		println(totalRows)

		WebUI.click(findTestObject('Object Repository/Settings/OR CountryOfOperations/Page_QM Timesheet/span_add Add New'))

		WebUI.click(findTestObject('Object Repository/Settings/OR CountryOfOperations/Page_QM Timesheet/input_ng-tns-c166-43 p-autocomplete-input p_14c7d6'))

		WebUI.click(findTestObject('Object Repository/Settings/OR CountryOfOperations/Page_QM Timesheet/li_Albania'))

		WebUI.click(findTestObject('Object Repository/Settings/OR CountryOfOperations/Page_QM Timesheet/span_Add'))

		WebUI.delay(2)

		'checking number rows present after adding one new row'

		'To locate rows of table it will Capture all the rows available in the table'
		List<WebElement> CurrentRowsInTable = Table.findElements(By.tagName('tr'))

		'To calculate no of rows In table'
		int currentRows = CurrentRowsInTable.size()

		if (currentRows < totalRows) {
			println('Row added successfully')
		} else {
			println('something is wronge')
		}
	}
	
	
	@Keyword
	def delete_country_of_operation() {
		WebUI.delay(1)

		WebUI.verifyElementPresent(findTestObject('Settings/OR CountryOfOperations/Page_QM Timesheet/span_Cost Center'), 0)

		WebUI.click(findTestObject('Settings/OR CountryOfOperations/Page_QM Timesheet/div_room_preferences Cost Center'))

		WebUI.click(findTestObject('Object Repository/Settings/OR CountryOfOperations/Page_QM Timesheet/span_Country of Operations'))

		WebUI.click(findTestObject('Settings/OR CountryOfOperations/OR DeletingCOO/div_India_flex justify-start items-center h-full w-full gap-2 ng-star-inserted'))

		WebUI.click(findTestObject('Object Repository/Settings/OR CountryOfOperations/OR DeletingCOO/span_Delete'))

		WebUI.delay(1)
	}
}
