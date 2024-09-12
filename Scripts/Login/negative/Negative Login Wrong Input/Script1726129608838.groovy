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

WebUI.click(findTestObject('Object Repository/Login/Negative/Page_Premium Class/button_Login_1'))

WebUI.setText(findTestObject('Object Repository/Login/Negative/Page_Premium Class/input_Email_email'), 'matthewdpk@gmail.com ')

WebUI.setEncryptedText(findTestObject('Object Repository/Login/Negative/Page_Premium Class/input_Password_password'), 'jGTq+1D2TFzulE8ZIt5YRDAKsBeT1zkPAiSMIXQCcyQ0npZq5xttHA==')

WebUI.setText(findTestObject('Object Repository/Login/Negative/Page_Premium Class/input_Email_email'), 'matthewdpk@gmail.com')

WebUI.click(findTestObject('Object Repository/Login/Negative/Page_Premium Class/button_Login_1'))

WebUI.click(findTestObject('Object Repository/Login/Negative/Page_Premium Class/img'))

WebUI.setEncryptedText(findTestObject('Object Repository/Login/Negative/Page_Premium Class/input_Password_password'), 'cw0ysTOoKIoXuQZsrcrU8Q==')

WebUI.setText(findTestObject('Object Repository/Login/Negative/Page_Premium Class/input_Email_email'), 'matthewdpk@gmail.com')

WebUI.click(findTestObject('Object Repository/Login/Negative/Page_Premium Class/div_Email'))

WebUI.setText(findTestObject('Object Repository/Login/Negative/Page_Premium Class/input_Email_email'), 'dummy@gmail.com')

WebUI.click(findTestObject('Object Repository/Login/Negative/Page_Premium Class/button_Login_1'))

WebUI.click(findTestObject('Object Repository/Login/Negative/Page_Premium Class/i_Password_bi bi-eye'))

WebUI.click(findTestObject('Object Repository/Login/Negative/Page_Premium Class/input_Email_email'))

WebUI.click(findTestObject('Object Repository/Login/Negative/Page_Premium Class/img'))

WebUI.setText(findTestObject('Object Repository/Login/Negative/Page_Premium Class/input_Email_email'), '')

WebUI.setText(findTestObject('Object Repository/Login/Negative/Page_Premium Class/input_Password_password_1'), '1827M#chiuws')

WebUI.click(findTestObject('Object Repository/Login/Negative/Page_Premium Class/span_Password_ec-input-group-text'))

WebUI.setText(findTestObject('Object Repository/Login/Negative/Page_Premium Class/input_Password_password_1'), '')

WebUI.closeBrowser()

