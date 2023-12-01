package workforce_configurations

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.webui.common.WebUiCommonHelper
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

public class UnionCode {
	
	@Keyword
	def add_union_code() {

		//navigate to URL
		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)

		WebUI.navigateToUrl(GlobalVariable.BASE_URL+'super-admin/union-code/list')

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)

		//add union code button
		WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR UnionCode/button_add Add Union Code'))



		// taking number of div present
		WebDriver driver = DriverFactory.getWebDriver()

		List<WebElement> table =  driver.findElements(By.xpath("/html/body/qm-root/qmt-layout/qmt-navigation/mat-sidenav-container/mat-sidenav-content/div/div/qmt-union-code-form/form/div/div[2]/div"))

		println(table.size())

		int size_of_table=table.size()

		int amount=5000
		float percentage=5.2

		//union code
		WebUI.setText(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR UnionCode/inputUnion Code'),'000123')

		for (int i=1;i<size_of_table+1;i++) {

			WebElement element =  driver.findElement(By.xpath("/html/body/qm-root/qmt-layout/qmt-navigation/mat-sidenav-container/mat-sidenav-content/div/div/qmt-union-code-form/form/div/div[2]/div[${i}]"))

			GlobalVariable.VARIABLE=i

			println(GlobalVariable.VARIABLE)

			int half=size_of_table/2

			if(i<=half) {

				WebUI.setText(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR UnionCode/Input amount type'),
						'PERCENTAGE')

				percentage+=5
				WebUI.setText(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR UnionCode/inputUnion Amount'),"${percentage}")

				WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR UnionCode/select unit'))

				WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR UnionCode/li_Hours Worked'))

				WebUI.delay(0.5)

				WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR UnionCode/provincial_tax'))

				WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR UnionCode/consider_1.5'))


				WebUI.setText(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR UnionCode/textareaNote 1'),
						'Adding union code note 1')

				WebUI.setText(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR UnionCode/textareaNote 2'),
						'Adding union code note 2')

				if(i==1) {
					add_subhead()
				}
			}


			else {

				amount+=150
				WebUI.setText(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR UnionCode/Input amount type'),
						'AMOUNT')

				WebUI.setText(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR UnionCode/inputUnion Amount'),"${amount}")

				WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR UnionCode/select unit'))

				WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR UnionCode/li_Hours Earned'))

				WebUI.delay(0.5)

				WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR UnionCode/consider 2'))

				WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR UnionCode/consider_1.5'))

				WebUI.setText(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR UnionCode/textareaNote 1'),
						'Adding union code note 1')

				WebUI.setText(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR UnionCode/textareaNote 2'),
						'Adding union code note 2')

				if(i==1) {
					add_subhead()
				}
			}

			WebUI.delay(GlobalVariable.LOW_TIMESLEEP)
		}

		WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR UnionCode/add_button'))

		WebUI.delay(GlobalVariable.HIGH_TIMESLEEP)
	}


	@Keyword
	def update_union_code() {

		WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR UnionCode/button_Action_mat-focus-indicator flex justify-center w-30px h-30px items-center text-primary-dark mat-icon-button mat-button-base'))

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)

		// taking number of DIV present
		WebDriver driver = DriverFactory.getWebDriver()

		List<WebElement> table =  driver.findElements(By.xpath("/html/body/qm-root/qmt-layout/qmt-navigation/mat-sidenav-container/mat-sidenav-content/div/div/qmt-union-code-form/form/div/div[2]/div"))

		println(table.size())

		int size_of_table=table.size()

		int amount=4000
		float percentage=4.2

		for (int i=1;i<=size_of_table;i++) {

			WebElement element =  driver.findElement(By.xpath("/html/body/qm-root/qmt-layout/qmt-navigation/mat-sidenav-container/mat-sidenav-content/div/div/qmt-union-code-form/form/div/div[2]/div[${i}]"))

			GlobalVariable.VARIABLE=i

			println(GlobalVariable.VARIABLE)

			int half=size_of_table/2

			if(i<=half) {

				WebUI.setText(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR UnionCode/Input amount type'),
						'PERCENTAGE')

				percentage+=5

				WebUI.setText(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR UnionCode/inputUnion Amount'),"${percentage}")

				WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR UnionCode/select unit'))

				WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR UnionCode/li_Hours Worked'))

				WebUI.delay(0.5)

				WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR UnionCode/provincial_tax'))

				WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR UnionCode/consider_1.5'))


				WebUI.setText(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR UnionCode/textareaNote 1'),
						'Updating union code note 1')

				WebUI.setText(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR UnionCode/textareaNote 2'),
						'Updating union code note 2')

				if(i==1) {
					add_subhead()
				}
			}


			else {


				WebUI.setText(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR UnionCode/Input amount type'),
						'AMOUNT')

				amount+=5

				WebUI.setText(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR UnionCode/inputUnion Amount'),"${amount}")

				WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR UnionCode/select unit'))

				WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR UnionCode/li_Hours Earned'))

				WebUI.delay(0.5)

				WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR UnionCode/consider 2'))

				WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR UnionCode/consider_1.5'))

				WebUI.setText(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR UnionCode/textareaNote 1'),"updating union code 1")

				WebUI.setText(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR UnionCode/textareaNote 2'),"updating union code 2")

				if(i==size_of_table-1) {

					WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR subhead/close_subhead'))
				}
			}

			WebUI.delay(GlobalVariable.LOW_TIMESLEEP)
		}

		WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR UnionCode/button_Update'))
	}


	@Keyword
	def delete_union() {

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)

		WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR UnionCode/button_Action_row-delete'))

		WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR UnionCode/button_Delete'))

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)
	}


	@Keyword
	def goto_union_code() {

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)

		WebUI.navigateToUrl(GlobalVariable.BASE_URL+'super-admin/union-code/list')

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)
	}

	@Keyword
	def add_subhead() {

		WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR subhead/click_subhead'))

		WebUI.setText(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR subhead/input_name'),"subhead testing")

		WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR subhead/click_amount_type'))

		WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR subhead/li_AMOUNT'))

		WebUI.setText(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR subhead/inputAmount'), '256314')

		WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR subhead/click_unit'))

		WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR subhead/li_Hours Earned'))
	}
}