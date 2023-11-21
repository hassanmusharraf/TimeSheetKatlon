package workforce_configurations

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.Keys

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

public class UnionCode {

	@Keyword
	def add_accident_fund() {
		
		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)

		WebUI.navigateToUrl(GlobalVariable.BASE_URL+'super-admin/union-code/list')

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)

		WebUI.refresh()

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)

		WebUI.verifyElementPresent(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR AccidentFund/div_All Union Codes'),
				0)

		WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR AccidentFund/button_add Add Union Code'))

		WebUI.setText(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR AccidentFund/inputUnion Code'),
				'000123')

		WebUI.setText(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR AccidentFund/Input amount type'),
				'AMOUNT')

		WebUI.setText(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR AccidentFund/inputUnion Amount'),
				'50000')

		WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR AccidentFund/select unit'))

		WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR AccidentFund/li_Hours Earned'))

		WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR AccidentFund/span_mat-checkbox-inner-container'))

		WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR AccidentFund/span_mat-checkbox-inner-container_1'))

		WebUI.setText(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR AccidentFund/textareaNote 1'),
				'Note 1')

		WebUI.setText(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR AccidentFund/textareaNote 2'),
				'Note 2')
	

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)
		
		println("into incident fund")
	}

	@Keyword
	def add_pension_fund() {
		
		println("start pension fund")
		

		WebUI.setText(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR PensionFund/Input amount type'),
				'AMOUNT')

		//		WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR AccidentFund/Input amount type'))
		//
		//		WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR AccidentFund/li_AMOUNT'))

		WebUI.setText(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR PensionFund/inputUnion Amount'),
				'50000')

		//		WebUI.setText(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR AccidentFund/Input amount type'),
		//			'')
		//
		//		WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR AccidentFund/Input amount type'))

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

		//		WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR AccidentFund/Input amount type'))
		//
		//		WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR AccidentFund/li_AMOUNT'))

		WebUI.setText(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR IndustryFund/inputUnion Amount'),
				'50000')

		//		WebUI.setText(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR AccidentFund/Input amount type'),
		//			'')
		//
		//		WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR AccidentFund/Input amount type'))


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

		//		WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR AccidentFund/Input amount type'))
		//
		//		WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR AccidentFund/li_AMOUNT'))

		WebUI.setText(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR WelfareFund/inputUnion Amount'),
				'50000')

		//		WebUI.setText(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR AccidentFund/Input amount type'),
		//			'')
		//
		//		WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR AccidentFund/Input amount type'))

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

		//		WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR AccidentFund/Input amount type'))
		//
		//		WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR AccidentFund/li_AMOUNT'))

		WebUI.setText(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR TrainingFund/inputUnion Amount'),
				'50000')

		//		WebUI.setText(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR AccidentFund/Input amount type'),
		//			'')
		//
		//		WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR AccidentFund/Input amount type'))

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

		//		WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR AccidentFund/Input amount type'))
		//
		//		WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR AccidentFund/li_AMOUNT'))

		WebUI.setText(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR Vacation/inputUnion Amount'),
				'50000')

		//		WebUI.setText(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR AccidentFund/Input amount type'),
		//			'')
		//
		//		WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR AccidentFund/Input amount type'))

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

		//		WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR AccidentFund/Input amount type'))
		//
		//		WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR AccidentFund/li_AMOUNT'))

		WebUI.setText(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR Other/inputUnion Amount'),
				'50000')

		//		WebUI.setText(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR AccidentFund/Input amount type'),
		//			'')
		//
		//		WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR AccidentFund/Input amount type'))

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

		WebUI.setText(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR RRSPF/Input amount type'),
				'AMOUNT')

		//		WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR AccidentFund/Input amount type'))
		//
		//		WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR AccidentFund/li_AMOUNT'))

		WebUI.setText(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR RRSPF/inputUnion Amount'),
				'50000')

		//		WebUI.setText(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR AccidentFund/Input amount type'),
		//			'')
		//
		//		WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR AccidentFund/Input amount type'))

		WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR RRSPF/select unit'))

		WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR RRSPF/li_Hours Earned'))

		WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR RRSPF/span_mat-checkbox-inner-container'))

		WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR RRSPF/span_mat-checkbox-inner-container_1'))

		WebUI.setText(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR RRSPF/textareaNote 1'),
				'Note 1')

		WebUI.setText(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR RRSPF/textareaNote 2'),
				'Note 2')

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)
	}
	
	
	@Keyword
	def add_WCB_fund() {

		WebUI.setText(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR WCB/Input amount type'),
				'AMOUNT')

		//		WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR AccidentFund/Input amount type'))
		//
		//		WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR AccidentFund/li_AMOUNT'))

		WebUI.setText(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR WCB/inputUnion Amount'),
				'50000')

		//		WebUI.setText(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR AccidentFund/Input amount type'),
		//			'')
		//
		//		WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR AccidentFund/Input amount type'))

		WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR WCB/select unit'))

		WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR WCB/li_Hours Earned'))

		WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR WCB/span_mat-checkbox-inner-container'))

		WebUI.click(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR WCB/span_mat-checkbox-inner-container_1'))

		WebUI.setText(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR WCB/textareaNote 1'),
				'Note 1')

		WebUI.setText(findTestObject('Object Repository/OR WorkForce Configuration/OR UnionCode/OR WCB/textareaNote 2'),
				'Note 2')

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)
	}
	
}
