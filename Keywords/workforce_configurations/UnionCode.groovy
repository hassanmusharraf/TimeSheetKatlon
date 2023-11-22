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
		
		
		//navigate to url
		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)
		
		WebUI.navigateToUrl(GlobalVariable.BASE_URL+'super-admin/union-code/list')
		
		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)
		
		WebUI.verifyElementPresent(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR AccidentFund/div_All Union Codes'),
				0)
		
		//add union code button
		WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR AccidentFund/button_add Add Union Code'))
		
		
		
		// taking number of div present
		WebDriver driver = DriverFactory.getWebDriver()
		
		List<WebElement> table =  driver.findElements(By.xpath("/html/body/qm-root/qmt-layout/qmt-navigation/mat-sidenav-container/mat-sidenav-content/div/div/qmt-union-code-form/form/div/div[2]/div"))
		
		println(table.size())
		
		int size_of_table=table.size()
		
		
		//union code 
		WebUI.setText(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR AccidentFund/inputUnion Code'),
			'000123')
		
		for (int i=1;i<size_of_table+1;i++) {
			
			WebElement element =  driver.findElement(By.xpath("/html/body/qm-root/qmt-layout/qmt-navigation/mat-sidenav-container/mat-sidenav-content/div/div/qmt-union-code-form/form/div/div[2]/div[${i}]"))
			
			GlobalVariable.VARIABLE=i
			
			println(GlobalVariable.VARIABLE)
			
			int half=size_of_table/2
			
			if(i<=half) {
				
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
				
				if(i==1) {
					add_subhead()
				}
				
				
			}	
			
			
			else {
				
				
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
		
		//navigate to url
		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)
		
		WebUI.navigateToUrl(GlobalVariable.BASE_URL+'super-admin/union-code/list')
		
		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)
		
		WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR UnionCode/button_Action_mat-focus-indicator flex justify-center w-30px h-30px items-center text-primary-dark mat-icon-button mat-button-base'))
		
		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)
		
		// taking number of div present
		WebDriver driver = DriverFactory.getWebDriver()
		
		List<WebElement> table =  driver.findElements(By.xpath("/html/body/qm-root/qmt-layout/qmt-navigation/mat-sidenav-container/mat-sidenav-content/div/div/qmt-union-code-form/form/div/div[2]/div"))
		
		println(table.size())
		
		int size_of_table=table.size()		
		
		
		for (int i=1;i<size_of_table+1;i++) {
			
		int half=size_of_table/2

			if(i<=half) {
				
				println("into if")
				
				
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
				
				if(i==1) {
					add_subhead()
		
				}
			}
			
			
			else {
				
				println("into else")
				
				
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
				
				if(i==1) {
					add_subhead()
					
					println("into subhead")
					
				}
				
				
				
			}
			
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
	def static add_accident_fund() {

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)
		
		WebUI.navigateToUrl(GlobalVariable.BASE_URL+'super-admin/union-code/list')

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)

		WebUI.verifyElementPresent(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR AccidentFund/div_All Union Codes'),
				0)

		WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR AccidentFund/button_add Add Union Code'))

		
		
//		List<WebElement> all_div= WebUI.findWebElements(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR AccidentFund/all_div'), 0,)
		
//		WebElement table = WebUiCommonHelper.findWebElement(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR AccidentFund/all_div'), 2)
//		List<WebElement> rows = table.findElements(By.tagName("div"))
//		println(rows.size()+" Row present")
		
//		List<WebElement> table = WebUiCommonHelper.findWebElements(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR AccidentFund/all_div'), 2)
//		List<WebElement> rows = table.(By.tagName("div"))
//		println(table.size()+" Row present")
		
//		
//		List<WebElement> jj = WebUiCommonHelper.findWebElements(By.xpath('/html/body/qm-root/qmt-layout/qmt-navigation/mat-sidenav-container/mat-sidenav-content/div/div/qmt-union-code-form/form/div/div[2]/div'),0)
//		
//		println(jj.size())
		
		
		List<WebElement> myList = WebUI.findWebElements(By.xpath('/html/body/qm-root/qmt-layout/qmt-navigation/mat-sidenav-container/mat-sidenav-content/div/div/qmt-union-code-form/form/div/div[2]/div'),30)
//		
		println(myList.size())
		
		
		WebDriver driver = DriverFactory.getWebDriver()
		
		List<WebElement> table =  driver.findElement(By.xpath("/html/body/qm-root/qmt-layout/qmt-navigation/mat-sidenav-container/mat-sidenav-content/div/div/qmt-union-code-form/form/div/div[2]/div"))
//		
		println(table.size())
		
		
		
		
		
		
//		println(table.getTagName())
//		println(table.size())
//		
//		List<WebElement> children = table.findElement(By.tagName("div"))
//		
//		for (int i=0;i<children.size();i++) {
//			
//			println(children[i].getTagName())
//		}
		
//		println(children[0].text)
//		println(children[0].tagName)
		
		
//		println(children.size())
		
		
		
		
		
//		for(int i = 0; i < children.size(); i++){
//			KeywordUtil.logInfo(children[i].getText())
//			}
		 //return true or false once the slots order is validated
		
		
		
//		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)
//
//		WebUI.navigateToUrl(GlobalVariable.BASE_URL+'super-admin/union-code/list')
//
//		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)
//
//		WebUI.verifyElementPresent(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR AccidentFund/div_All Union Codes'),
//				0)
//
//		WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR AccidentFund/button_add Add Union Code'))
//
//		WebUI.setText(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR AccidentFund/inputUnion Code'),
//				'000123')
//
//		WebUI.setText(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR AccidentFund/Input amount type'),
//				'AMOUNT')
//
//		WebUI.setText(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR AccidentFund/inputUnion Amount'),
//				'50000')
//
//		WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR AccidentFund/select unit'))
//
//		WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR AccidentFund/li_Hours Earned'))
//
//		WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR AccidentFund/span_mat-checkbox-inner-container'))
//
//		WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR AccidentFund/span_mat-checkbox-inner-container_1'))
//
//		WebUI.setText(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR AccidentFund/textareaNote 1'),
//				'Note 1')
//
//		WebUI.setText(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR AccidentFund/textareaNote 2'),
//				'Note 2')
//
//
//		add_subhead()
//		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)
//
//		println("into incident fund")
	}

	@Keyword
	def add_pension_fund() {

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)

		WebUI.navigateToUrl(GlobalVariable.BASE_URL+'super-admin/union-code/list')

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)

		WebUI.verifyElementPresent(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR AccidentFund/div_All Union Codes'),
				0)

		WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR AccidentFund/button_add Add Union Code'))

		WebUI.setText(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR AccidentFund/inputUnion Code'),
				'000123')

		WebUI.setText(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR PensionFund/Input amount type'),
				'AMOUNT')

		WebUI.setText(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR PensionFund/inputUnion Amount'),
				'50000')

		WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR PensionFund/select unit'))

		WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR PensionFund/li_Hours Earned'))

		WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR PensionFund/span_mat-checkbox-inner-container'))

		WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR PensionFund/span_mat-checkbox-inner-container_1'))

		WebUI.setText(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR PensionFund/textareaNote 1'),
				'Note 1')

		WebUI.setText(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR PensionFund/textareaNote 2'),
				'Note 2')

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)

		println("start pension fund")
	}
	@Keyword
	def add_industry_fund() {

		println("into industry fund")

		WebUI.verifyElementPresent(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR IndustryFund/Input amount type'),
				0)

		WebUI.setText(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR IndustryFund/Input amount type'),
				'AMOUNT')

		WebUI.setText(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR IndustryFund/inputUnion Amount'),
				'50000')

		WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR IndustryFund/select unit'))


		WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR IndustryFund/li_Hours Earned'))

		WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR IndustryFund/span_mat-checkbox-inner-container'))

		WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR IndustryFund/span_mat-checkbox-inner-container_1'))

		WebUI.setText(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR IndustryFund/textareaNote 1'),
				'Note 1')

		WebUI.setText(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR IndustryFund/textareaNote 2'),
				'Note 2')

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)
	}

	@Keyword
	def add_welfare_fund() {

		WebUI.setText(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR WelfareFund/Input amount type'),
				'AMOUNT')

		WebUI.setText(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR WelfareFund/inputUnion Amount'),
				'50000')

		WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR WelfareFund/select unit'))

		WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR WelfareFund/li_Hours Earned'))

		WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR WelfareFund/span_mat-checkbox-inner-container'))

		WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR WelfareFund/span_mat-checkbox-inner-container_1'))

		WebUI.setText(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR WelfareFund/textareaNote 1'),
				'Note 1')

		WebUI.setText(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR WelfareFund/textareaNote 2'),
				'Note 2')

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)
	}

	@Keyword
	def add_training_fund() {

		WebUI.setText(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR TrainingFund/Input amount type'),
				'AMOUNT')

		WebUI.setText(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR TrainingFund/inputUnion Amount'),
				'50000')

		WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR TrainingFund/select unit'))

		WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR TrainingFund/li_Hours Earned'))

		WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR TrainingFund/span_mat-checkbox-inner-container'))

		WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR TrainingFund/span_mat-checkbox-inner-container_1'))

		WebUI.setText(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR TrainingFund/textareaNote 1'),
				'Note 1')

		WebUI.setText(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR TrainingFund/textareaNote 2'),
				'Note 2')

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)
	}

	@Keyword
	def add_vacation() {
		WebUI.setText(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR Vacation/Input amount type'),
				'AMOUNT')

		WebUI.setText(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR Vacation/inputUnion Amount'),
				'50000')

		WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR Vacation/select unit'))

		WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR Vacation/li_Hours Earned'))

		WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR Vacation/span_mat-checkbox-inner-container'))

		WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR Vacation/span_mat-checkbox-inner-container_1'))

		WebUI.setText(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR Vacation/textareaNote 1'),
				'Note 1')

		WebUI.setText(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR Vacation/textareaNote 2'),
				'Note 2')

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)
	}

	@Keyword
	def add_other() {
		WebUI.setText(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR Other/Input amount type'),
				'AMOUNT')

		WebUI.setText(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR Other/inputUnion Amount'),
				'50000')

		WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR Other/select unit'))

		WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR Other/li_Hours Earned'))

		WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR Other/span_mat-checkbox-inner-container'))

		WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR Other/span_mat-checkbox-inner-container_1'))

		WebUI.setText(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR Other/textareaNote 1'),
				'Note 1')

		WebUI.setText(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR Other/textareaNote 2'),
				'Note 2')

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)
	}


	@Keyword
	def add_RRSP_fund() {

		WebUI.setText(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR RRSP/Input amount type'),
				'AMOUNT')

		WebUI.setText(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR RRSP/inputUnion Amount'),
				'50000')

		WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR RRSP/select unit'))

		WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR RRSP/li_Hours Earned'))

		WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR RRSP/span_mat-checkbox-inner-container'))

		WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR RRSP/span_mat-checkbox-inner-container_1'))

		WebUI.setText(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR RRSP/textareaNote 1'),
				'Note 1')

		WebUI.setText(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR RRSP/textareaNote 2'),
				'Note 2')

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)
	}


	@Keyword
	def add_WCB_fund() {

		WebUI.setText(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR WCB/Input amount type'),
				'AMOUNT')

		WebUI.setText(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR WCB/inputUnion Amount'),
				'50000')

		WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR WCB/select unit'))

		WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR WCB/li_Hours Earned'))

		WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR WCB/span_mat-checkbox-inner-container'))

		WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR WCB/span_mat-checkbox-inner-container_1'))

		WebUI.setText(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR WCB/textareaNote 1'),
				'Note 1')

		WebUI.setText(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR WCB/textareaNote 2'),
				'Note 2')


		WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR WCB/add_button'))
		println("9")

		WebUI.delay(GlobalVariable.MED_TIMESLEEP)
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
