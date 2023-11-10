import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')

WebUI.maximizeWindow()

//DriverFactory.getWebDriver().navigate().to('http://159.203.25.179:4201/auth/login')
WebUI.navigateToUrl('http://192.168.1.113:4200')

WebUI.click(findTestObject('Object Repository/Settings/OR CountryOfOperations/Page_QM Timesheet/button_Sign In'))

WebUI.verifyElementPresent(findTestObject('Settings/OR Users/div_Users'), 0)

WebUI.click(findTestObject('Settings/OR Users/div_Users'))

WebUI.delay(1)

WebUI.verifyElementPresent(findTestObject('Object Repository/Settings/OR Users/div_All Global Users'), 1)

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

WebUI.closeBrowser()

