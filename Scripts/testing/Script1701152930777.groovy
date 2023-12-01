import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')
WebUI.navigateToUrl('https://en.wikipedia.org/wiki/Main_Page')

//Scroll to bottom of page
WebUI.delay(3)
WebUI.executeJavaScript('window.scrollTo(0, document.body.scrollHeight);', null)

//Scroll to Top of page
WebUI.delay(3)
WebUI.executeJavaScript('window.scrollTo(0, -document.body.scrollHeight);', null)

//Scroll midway on page
WebUI.delay(3)
WebUI.executeJavaScript('window.scrollTo(0, 1200);', null)

//Scroll to top of page
WebUI.delay(3)
WebUI.executeJavaScript('window.scrollTo(0, 0);', null)

//Scroll to bottom of page
WebUI.delay(3)
WebUI.executeJavaScript('window.scrollTo(0, 999999);', null)

