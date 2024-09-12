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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://dev.premium.enigmacamp.com/')

WebUI.click(findTestObject('Object Repository/Register/Positive/Register Gmail Repo/button_Register'))

WebUI.setText(findTestObject('Object Repository/Register/Positive/Register Gmail Repo/input_Full name_fullname'), 'userDummyFullName')

WebUI.setText(findTestObject('Object Repository/Register/Positive/Register Gmail Repo/input_Email_username'), 'userdummy@gmail.com')

WebUI.click(findTestObject('Object Repository/Register/Positive/Register Gmail Repo/input_Email_username'))

WebUI.click(findTestObject('Object Repository/Register/Positive/Register Gmail Repo/div_Create New Account Please register  ent_1e29d0'))

WebUI.closeBrowser()

