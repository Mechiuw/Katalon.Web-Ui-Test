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

WebUI.click(findTestObject('Object Repository/Register/Negative/Page_Premium Class/button_Register'))

WebUI.setText(findTestObject('Object Repository/Register/Negative/Page_Premium Class/input_Full name_fullname'), ')(*&^%$#@#$%^&*(*&^%$#@    *&^%$')

WebUI.setText(findTestObject('Object Repository/Register/Negative/Page_Premium Class/input_Email_username'), '(*&^%$##@#$%^&*(*&&^@^%mmmmm  @@@')

WebUI.setText(findTestObject('Object Repository/Register/Negative/Page_Premium Class/input_Phone Number_phone'), '8owdnadnapwd)(*&^%$&@&^#')

WebUI.click(findTestObject('Object Repository/Register/Negative/Page_Premium Class/span_The minimum age to register is 5 years'))

WebUI.setEncryptedText(findTestObject('Object Repository/Register/Negative/Page_Premium Class/input_Create Password_password'), 
    'VBjiYCnpYJlAcS1X1P0B7ppWt8jeW2tkr8h7nHcgy1g=')

WebUI.click(findTestObject('Object Repository/Register/Negative/Page_Premium Class/i_Create Password_bi bi-eye'))

WebUI.doubleClick(findTestObject('Object Repository/Register/Negative/Page_Premium Class/input_Create Password_password_1'))

WebUI.click(findTestObject('Object Repository/Register/Negative/Page_Premium Class/input_Create Password_password_1'))

WebUI.setEncryptedText(findTestObject('Object Repository/Register/Negative/Page_Premium Class/input_Confirmation Password_confirmPassword'), 
    'EuoSU3tTwO7cgKezgfKJHP+7uRqIQGVMrxUqv/SiFVU=')

WebUI.click(findTestObject('Object Repository/Register/Negative/Page_Premium Class/i_Create Password_bi bi-eye'))

WebUI.setText(findTestObject('Object Repository/Register/Negative/Page_Premium Class/input_Refresh captcha_captchaAnswer'), 
    'bdnawjd0137842')

WebUI.doubleClick(findTestObject('Object Repository/Register/Negative/Page_Premium Class/input_Confirmation Password_confirmPassword_1'))

WebUI.setText(findTestObject('Object Repository/Register/Negative/Page_Premium Class/input_Confirmation Password_confirmPassword_1'), 
    '1201331800(*(&@^&^%mMMMS')

WebUI.click(findTestObject('Object Repository/Register/Negative/Page_Premium Class/input_Refresh captcha_captchaAnswer'))

WebUI.closeBrowser()

