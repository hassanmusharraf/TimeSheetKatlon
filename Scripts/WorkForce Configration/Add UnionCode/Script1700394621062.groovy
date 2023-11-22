import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
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
import org.openqa.selenium.Keys as Keys

CustomKeywords.'com.Components.loginIntoApplication'(GlobalVariable.IT_ADMIN, GlobalVariable.IT_ADMIN_PASS)

//CustomKeywords.'workforce_configurations.UnionCode.add_union_code'()
//CustomKeywords.'workforce_configurations.UnionCode.update_union_code'()
//navigate to url
// taking number of div present
//				add_subhead()
//				add_subhead()

not_run: CustomKeywords.'workforce_configurations.UnionCode.delete_union'()


WebUI.delay(GlobalVariable.LOW_TIMESLEEP)

WebUI.navigateToUrl(GlobalVariable.BASE_URL + 'super-admin/union-code/list')

WebUI.delay(GlobalVariable.LOW_TIMESLEEP)

WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR UnionCode/button_Action_mat-focus-indicator flex justify-center w-30px h-30px items-center text-primary-dark mat-icon-button mat-button-base'))

WebUI.delay(GlobalVariable.LOW_TIMESLEEP)

WebDriver driver = DriverFactory.getWebDriver()

List<WebElement> table = driver.findElements(By.xpath('/html/body/qm-root/qmt-layout/qmt-navigation/mat-sidenav-container/mat-sidenav-content/div/div/qmt-union-code-form/form/div/div[2]/div'))

println(table.size())

int size_of_table = table.size()

for (int i = 1; i < (size_of_table + 1); i++) {
    int half = size_of_table / 2

    if (i <= half) {
        println('into if')

        WebUI.setText(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR UnionCode/Input amount type'), 
            'AMOUNT')

        WebUI.setText(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR UnionCode/inputUnion Amount'), 
            '50000')

        WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR UnionCode/select unit'))

        WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR UnionCode/li_Hours Earned'))

        WebUI.delay(0.5)

        WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR UnionCode/consider 2'))

        WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR UnionCode/consider_1.5'))

        WebUI.setText(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR UnionCode/textareaNote 1'), 
            'Note 1')

        WebUI.setText(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR UnionCode/textareaNote 2'), 
            'Note 2')

        if (i == 1) {
        }
    } else {
        println('into else')

        WebUI.setText(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR UnionCode/Input amount type'), 
            'PERCENTAGE')

        WebUI.setText(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR UnionCode/inputUnion Amount'), 
            '50.5')

        WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR UnionCode/select unit'))

        WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR UnionCode/li_Hours Worked'))

        WebUI.delay(0.5)

        WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR UnionCode/provincial_tax'))

        WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR UnionCode/consider_1.5'))

        WebUI.setText(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR UnionCode/textareaNote 1'), 
            'Note 1')

        WebUI.setText(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR UnionCode/textareaNote 2'), 
            'Note 2')

        if (i == 1) {
            println('into subhead')
        }
    }
}

WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR UnionCode/button_Update'))


WebUI.closeBrowser()


