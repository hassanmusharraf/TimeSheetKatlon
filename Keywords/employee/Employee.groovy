package employee

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.Keys

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable





public class Employee {

	@Keyword
	def add_employee() {

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)

		WebUI.navigateToUrl(GlobalVariable.BASE_URL + 'admin/employee/list')

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)

		WebUI.click(findTestObject('Object Repository/OR JobTitle/OR SelectOrganization/Select Organization'))

		WebUI.sendKeys(findTestObject('Object Repository/OR JobTitle/OR SelectOrganization/Select Organization'), Keys.chord(Keys.ARROW_DOWN,Keys.ARROW_DOWN, Keys.ENTER))

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)

		WebUI.click(findTestObject('Object Repository/OR Employee/button_add Add Employee'))

		WebUI.setText(findTestObject('Object Repository/OR Employee/inputFirst Name'), 'Adding')

		WebUI.setText(findTestObject('Object Repository/OR Employee/inputLast Name'), 'Employee1')

		WebUI.setText(findTestObject('Object Repository/OR Employee/inputPhone'), '0000000013')

		WebUI.setText(findTestObject('Object Repository/OR Employee/inputEmail Address'), 'employee1@gmail.com')

		WebUI.setText(findTestObject('Object Repository/OR Employee/inputID Number'), '000002')

		WebUI.click(findTestObject('Object Repository/OR Employee/Employment Type'))

		//		WebUI.sendKeys(findTestObject('Object Repository/OR Employee/Employment Type'), Keys.chord(Keys.ARROW_DOWN,Keys.ARROW_DOWN, Keys.ENTER))


		//		TestObject var = findTestObject('Object Repository/OR Employee/Employment Type')
		//
		//		WebUI.click(var)
		//
		//		WebUI.sendKeys(var, Keys.chord(Keys.ARROW_DOWN,Keys.ARROW_DOWN, Keys.ENTER))

		//		WebUI.sendKeys(findTestObject('Object Repository/OR Employee/Employment Type'), Keys.chord(Keys.ARROW_DOWN))

		//		WebUI.selectOptionByIndex(findTestObject('Object Repository/OR Employee/new obj'), 1)




		WebUI.click(findTestObject('Object Repository/OR Employee/li_Testing Emp'))

		WebUI.setText(findTestObject('Object Repository/OR Employee/Joining Date'),'09052001')

		WebUI.setText(findTestObject('Object Repository/OR Employee/inputBank Account No'), '123456741237')

		WebUI.setText(findTestObject('Object Repository/OR Employee/inputWeekly Work Hours'), '15')

		WebUI.click(findTestObject('Object Repository/OR Employee/Vehicle'))

		WebUI.click(findTestObject('Object Repository/OR Employee/li_Testing Veh'))

		WebUI.click(findTestObject('Object Repository/OR Employee/Country'))

		WebUI.click(findTestObject('Object Repository/OR Employee/li_Nepal'))

		WebUI.click(findTestObject('Object Repository/OR Employee/Province'))

		WebUI.click(findTestObject('Object Repository/OR Employee/li_Bheri Zone'))

		WebUI.setText(findTestObject('Object Repository/OR Employee/inputCity'), 'xyz')

		WebUI.setText(findTestObject('Object Repository/OR Employee/inputPostal code'), '123456')

		WebUI.setText(findTestObject('Object Repository/OR Employee/textareaAddress Line 1'), 'add 1')

		WebUI.setText(findTestObject('Object Repository/OR Employee/textareaAddress Line 2'), 'add 2')

		WebUI.click(findTestObject('Object Repository/OR Employee/button_Save  Next'))

		WebUI.click(findTestObject('Object Repository/OR Employee/Job TitlePosition'))

		WebUI.click(findTestObject('Object Repository/OR Employee/li_Testing Job title'))

		WebUI.click(findTestObject('Object Repository/OR Employee/Union Code'))

		WebUI.click(findTestObject('Object Repository/OR Employee/li_U001'))

		//		WebUI.click(findTestObject('Object Repository/OR Employee/button_'))
		//
		//		WebUI.click(findTestObject('Object Repository/OR Employee/li_Testing Subhead'))

		WebUI.click(findTestObject('Object Repository/OR Employee/Division'))

		WebUI.click(findTestObject('Object Repository/OR Employee/li_101  Hazmat'))

		WebUI.click(findTestObject('Object Repository/OR Employee/Region'))

		WebUI.click(findTestObject('Object Repository/OR Employee/li_R001  Testing Region'))

		WebUI.click(findTestObject('Object Repository/OR Employee/Location'))

		WebUI.click(findTestObject('Object Repository/OR Employee/li_101  Richmond BC'))

		WebUI.click(findTestObject('Object Repository/OR Employee/Department'))

		WebUI.click(findTestObject('Object Repository/OR Employee/li_101  Health and Safety'))

		WebUI.setText(findTestObject('Object Repository/OR Employee/inputHourly Salary'), '1000')

		WebUI.click(findTestObject('Object Repository/OR Employee/Pay Group'))

		WebUI.click(findTestObject('Object Repository/OR Employee/li_Testing PayGroup'))

		WebUI.setText(findTestObject('Object Repository/OR Employee/inputEmployer Contribution'), '1')

		WebUI.setText(findTestObject('Object Repository/OR Employee/inputHSAWA'), '1')

		WebUI.setText(findTestObject('Object Repository/OR Employee/inputHourly Vehicle Allowance'), '1')

		WebUI.click(findTestObject('Object Repository/OR Employee/Manager'))

		WebUI.click(findTestObject('Object Repository/OR Employee/li_first  last name   emp11gmail.com'))


		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)


		//		WebUI.scrollToElement(findTestObject('Object Repository/OR Employee/heading'), 3)


		//		WebUI.scrollToElement(findTestObject('Object Repository/OR Employee/button_Create'), 5)


		//		WebUI.delay(3)
		//
		//		WebDriver driver = new ChromeDriver();
		//
		//		WebElement element = driver.findElement(By.xpath("/html[1]/body[1]/qm-root[1]/qmt-layout[1]/qmt-navigation[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[1]/div[1]/qmt-employee-form[1]/qmt-page-heading[1]/div[1]/div[2]/button[1]"));
		//
		//		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		//		Thread.sleep(500);


		//		JavascriptExecutor js= ((JavascriptExecutor) driver)


		//		int height = WebUI.getPageHeight()

		//		WebUI.executeJavaScript('window.scrollTo(0, height);', null)

		//		WebUI.executeJavaScript('window.scrollTo(0, -document.body.scrollHeight);', null)

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)

		WebUI.click(findTestObject('Object Repository/OR Employee/button_Create'))

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)
	}

	@Keyword
	def update_employee() {
		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)

		WebUI.click(findTestObject('Object Repository/OR Employee/button_mat-focus-indicator flex justify-cen_6f7d9e'))

		WebUI.setText(findTestObject('Object Repository/OR Employee/inputFirst Name'), 'Updating')

		WebUI.setText(findTestObject('Object Repository/OR Employee/inputLast Name'), 'Employee')

		WebUI.setText(findTestObject('Object Repository/OR Employee/inputPhone'), '0000000013')

		WebUI.setText(findTestObject('Object Repository/OR Employee/inputEmail Address'), 'updatingemployee@gmail.com')

		WebUI.setText(findTestObject('Object Repository/OR Employee/inputID Number'), '000002')

		WebUI.click(findTestObject('Object Repository/OR Employee/Employment Type'))

		WebUI.click(findTestObject('Object Repository/OR Employee/li_Full-Time'))

		WebUI.setText(findTestObject('Object Repository/OR Employee/inputBank Account No'), '123456741237')

		WebUI.setText(findTestObject('Object Repository/OR Employee/inputWeekly Work Hours'), '17')

		WebUI.click(findTestObject('Object Repository/OR Employee/Vehicle'))

		WebUI.click(findTestObject('Object Repository/OR Employee/li_Bike'))

		WebUI.click(findTestObject('Object Repository/OR Employee/Country'))

		WebUI.click(findTestObject('Object Repository/OR Employee/li_Canada'))

		WebUI.click(findTestObject('Object Repository/OR Employee/Province'))

		WebUI.click(findTestObject('Object Repository/OR Employee/li_Manitoba'))

		WebUI.setText(findTestObject('Object Repository/OR Employee/inputCity'), 'xyzz')

		WebUI.setText(findTestObject('Object Repository/OR Employee/inputPostal code'), '123457')

		WebUI.setText(findTestObject('Object Repository/OR Employee/textareaAddress Line 1'), 'add')

		WebUI.setText(findTestObject('Object Repository/OR Employee/textareaAddress Line 2'), 'add')

		WebUI.click(findTestObject('Object Repository/OR Employee/button_Save  Next'))

		WebUI.click(findTestObject('Object Repository/OR Employee/Job TitlePosition'))

		WebUI.click(findTestObject('Object Repository/OR Employee/li_IT Admin'))

		WebUI.click(findTestObject('Object Repository/OR Employee/Union Code'))

		WebUI.click(findTestObject('Object Repository/OR Employee/li_7887'))

		WebUI.click(findTestObject('Object Repository/OR Employee/Division'))

		WebUI.click(findTestObject('Object Repository/OR Employee/li_102  Remediation'))

		WebUI.click(findTestObject('Object Repository/OR Employee/Region'))

		WebUI.click(findTestObject('Object Repository/OR Employee/li_111  Adding region'))

		WebUI.click(findTestObject('Object Repository/OR Employee/Location'))

		WebUI.click(findTestObject('Object Repository/OR Employee/li_102  Saskatoon SK'))

		WebUI.click(findTestObject('Object Repository/OR Employee/Department'))

		WebUI.click(findTestObject('Object Repository/OR Employee/li_102  Operations Management'))

		WebUI.setText(findTestObject('Object Repository/OR Employee/inputHourly Salary'), '1100')

		WebUI.click(findTestObject('Object Repository/OR Employee/Pay Group'))

		WebUI.click(findTestObject('Object Repository/OR Employee/li_Testing1'))

		WebUI.setText(findTestObject('Object Repository/OR Employee/inputEmployer Contribution'), '1.5')

		WebUI.setText(findTestObject('Object Repository/OR Employee/inputHSAWA'), '1.5')

		WebUI.setText(findTestObject('Object Repository/OR Employee/inputHourly Vehicle Allowance'), '1.5')

		WebUI.click(findTestObject('Object Repository/OR Employee/Manager'))

		WebUI.click(findTestObject('Object Repository/OR Employee/li_first  last name   emp12gmail.com'))

		WebUI.delay(3)

		WebUI.executeJavaScript('window.scrollTo(0, -document.body.scrollHeight);', null)

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)

		WebUI.delay(3)

		WebUI.executeJavaScript('window.scrollTo(0, -document.body.scrollHeight);', null)

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)

		WebUI.click(findTestObject('Object Repository/OR Employee/button_Update'))

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)
	}

	@Keyword
	def delete_employee() {
		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)

		WebUI.click(findTestObject('Object Repository/OR Employee/buttonrow-delete'))

		WebUI.click(findTestObject('Object Repository/OR Employee/button_Delete'))

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)
	}

	@Keyword
	def goto_employee() {

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)

		WebUI.navigateToUrl(GlobalVariable.BASE_URL + 'admin/employee/list')

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)
	}
}
