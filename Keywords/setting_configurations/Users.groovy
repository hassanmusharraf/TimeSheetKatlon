package setting_configurations

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

public class Users {

	@Keyword
	def addUser() {

		WebUI.verifyElementPresent(findTestObject('Settings/OR CountryOfOperations/Page_QM Timesheet/span_Cost Center'), 0)

		WebUI.click(findTestObject('Settings/OR CountryOfOperations/Page_QM Timesheet/div_room_preferences Cost Center'))

		WebUI.verifyElementPresent(findTestObject('Settings/OR Users/div_Users'), 0)

		WebUI.click(findTestObject('Settings/OR Users/div_Users'))

		WebUI.delay(1)

		//		WebUI.verifyElementPresent(findTestObject('Object Repository/Settings/OR Users/div_All Global Users'), 1)

		'com.Components.getNumberOfRows'(findTestObject('Settings/OR Users/usertable'))

		'com.Components.getNumberOfColumns'(findTestObject('Settings/OR Users/usertable'))

		'com.Components.getRowByNameValue'(findTestObject('Settings/OR Users/usertable'), 'ABC D')

		WebUI.verifyElementPresent(findTestObject('Object Repository/Settings/OR Users/input_p-inputtext p-component p-element'),
				0)

		WebUI.delay(2)

		WebUI.verifyElementPresent(findTestObject('Settings/OR Users/button_add Add New'), 0)

		WebUI.click(findTestObject('Object Repository/Settings/OR Users/button_add Add New'))

		WebUI.delay(1)

		not_run: WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.TAB))

		WebUI.sendKeys(findTestObject('Settings/OR Users/div_First NameFirst Name is required'), 'katalon')

		WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.TAB))

		WebUI.sendKeys(findTestObject('Settings/OR Users/div_Last NameLast Name is required'), 'testing')

		WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.TAB))

		WebUI.sendKeys(findTestObject('Settings/OR Users/div_EmailEmail is required'), 'katalonuser@gmail.com')

		WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.TAB))

		WebUI.setText(findTestObject('Object Repository/Settings/OR Users/input_p-inputtext p-component p-element w-f_006ace'),
				'1234567890')

		WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.TAB))

		WebUI.click(findTestObject('Object Repository/Settings/OR Users/input_p-inputtext p-component p-element w-f_006ace'))

		WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.TAB), Keys.chord(Keys.Tab))

		WebUI.click(findTestObject('Object Repository/Settings/OR Users/li_Canada'))

		WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.TAB))

		WebUI.click(findTestObject('Object Repository/Settings/OR Users/input_p-inputtext p-component p-element w-f_006ace'))

		WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.TAB))

		WebUI.click(findTestObject('Object Repository/Settings/OR Users/li_Manitoba'))

		WebUI.click(findTestObject('Object Repository/Settings/OR Users/button_Add'))
	}
}
