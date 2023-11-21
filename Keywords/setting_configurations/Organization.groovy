package setting_configurations

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.Keys

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

public class Organization {

	@Keyword
	def add_company() {

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)

		WebUI.navigateToUrl(GlobalVariable.BASE_URL+'super-admin/company/list')

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)

		WebUI.click(findTestObject('Object Repository/Settings/OR Organization/button_add Add Company'))

		WebUI.click(findTestObject('Object Repository/Settings/OR Organization/div_Add Company'))

		WebUI.sendKeys(findTestObject('Object Repository/Settings/OR Organization/input_p-inputtext p-component p-element w-f_006ace'),
				'Katalon Company')

		WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.TAB))

		WebUI.setText(findTestObject('Settings/OR Organization/input_p-inputtext p-component p-element w-f_006ace_1'), 'Testing type')

		WebUI.setText(findTestObject('Settings/OR Organization/input_p-inputtext p-component p-element w-f_006ace_1_2'), '1')

		WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.TAB))

		WebUI.setText(findTestObject('Object Repository/Settings/OR Organization/p_Date Of Establishment'), '05-11-1999')

		WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.TAB))

		WebUI.setText(findTestObject('Settings/OR Organization/adminfirstname'), 'admin')

		WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.TAB))

		WebUI.setText(findTestObject('Settings/OR Organization/adminlastname'), 'name')

		WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.TAB))

		WebUI.setText(findTestObject('Settings/OR Organization/adminemail'), 'katalontest@gmail.com')

		WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.TAB))

		WebUI.setText(findTestObject('Settings/OR Organization/phone'), '80808080880')

		WebUI.click(findTestObject('Settings/OR Organization/countrydropdown'))

		WebUI.click(findTestObject('Object Repository/Settings/OR Organization/li_Afghanistan'))

		WebUI.click(findTestObject('Settings/OR Organization/provision'))

		WebUI.click(findTestObject('Object Repository/Settings/OR Organization/li_Badghis'))

		WebUI.setText(findTestObject('Settings/OR Organization/street'), 'street123')

		WebUI.setText(findTestObject('Settings/OR Organization/unit'), '12345')

		WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.TAB))

		WebUI.sendKeys(findTestObject('Settings/OR Organization/PostalCode'), '12345')

		WebUI.click(findTestObject('Object Repository/Settings/OR Organization/button_Add'))

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)
	}

	@Keyword
	def update_company() {

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)

		WebUI.waitForElementPresent(findTestObject('Object Repository/OR Component/OR CommonObjects/row-update'), 0)

		WebUI.click(findTestObject('Object Repository/OR Component/OR CommonObjects/row-update'), 0)

		WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.TAB))

		WebUI.setText(findTestObject('Settings/OR Organization/input_p-inputtext p-component p-element w-f_006ace_1'), 'Testing type 1')

		WebUI.setText(findTestObject('Settings/OR Organization/input_p-inputtext p-component p-element w-f_006ace_1_2'), '2')

		WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.TAB))

		WebUI.setText(findTestObject('Object Repository/Settings/OR Organization/p_Date Of Establishment'), '06-11-1999')

		WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.TAB))

		WebUI.setText(findTestObject('Settings/OR Organization/adminfirstname'), 'admin 1')

		WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.TAB))

		WebUI.setText(findTestObject('Settings/OR Organization/adminlastname'), 'name 1')

		WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.TAB))

		WebUI.setText(findTestObject('Settings/OR Organization/adminemail'), 'katalontestupdate@gmail.com')

		WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.TAB))

		WebUI.setText(findTestObject('Settings/OR Organization/phone'), '9999999999')

		WebUI.click(findTestObject('Settings/OR Organization/countrydropdown'))

		WebUI.click(findTestObject('Object Repository/Settings/OR Organization/li_India'))

		WebUI.click(findTestObject('Settings/OR Organization/provision'))

		WebUI.click(findTestObject('Object Repository/Settings/OR Organization/li_AndhraPradesh'))

		WebUI.setText(findTestObject('Settings/OR Organization/street'), 'street456')

		WebUI.setText(findTestObject('Settings/OR Organization/unit'), '23654')

		WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.TAB))

		WebUI.sendKeys(findTestObject('Settings/OR Organization/PostalCode'), '8523')

		WebUI.waitForElementPresent(findTestObject('Object Repository/OR Component/OR CommonObjects/confirm update'), 0)

		WebUI.click(findTestObject('Object Repository/OR Component/OR CommonObjects/confirm update'), 0)

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)
	}
	@Keyword
	def delete_company() {

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)

		WebUI.waitForElementNotPresent(findTestObject('Settings/OR Organization/button_katalontestgmail.com_mat-focus-indicator flex justify-center w-30px h-30px items-center text-red-500 mat-icon-button mat-button-base cdk-focused cdk-mouse-focused'),
				0, FailureHandling.OPTIONAL)

		WebUI.verifyElementPresent(findTestObject('Settings/OR Organization/button_katalontestgmail.com_mat-focus-indicator flex justify-center w-30px h-30px items-center text-red-500 mat-icon-button mat-button-base cdk-focused cdk-mouse-focused'),
				0, FailureHandling.OPTIONAL)

		WebUI.click(findTestObject('Settings/OR Organization/button_katalontestgmail.com_mat-focus-indicator flex justify-center w-30px h-30px items-center text-red-500 mat-icon-button mat-button-base cdk-focused cdk-mouse-focused'))

		WebUI.verifyElementPresent(findTestObject('Settings/OR Organization/button_Delete'), 0)

		WebUI.click(findTestObject('Settings/OR Organization/button_Delete'))

		WebUI.delay(GlobalVariable.LOW_TIMESLEEP)
	}
}
