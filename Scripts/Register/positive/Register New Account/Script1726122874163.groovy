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

WebUI.navigateToUrl('https://dev.premium.enigmacamp.com/auth/register')

WebUI.click(findTestObject('Object Repository/Register/Positive/Page_Premium Class/div_Full name'))

WebUI.setText(findTestObject('Object Repository/Register/Positive/Page_Premium Class/input_Full name_fullname'), 'userDummyFullname')

WebUI.setText(findTestObject('Object Repository/Register/Positive/Page_Premium Class/input_Email_username'), 'userDummy@gmail.com')

WebUI.setText(findTestObject('Object Repository/Register/Positive/Page_Premium Class/input_Phone Number_phone'), '89876543212')

WebUI.setEncryptedText(findTestObject('Object Repository/Register/Positive/Page_Premium Class/input_Create Password_password'), 
    '5rJRkp63EpyCwk1Mu/Ij1Q==')

WebUI.setEncryptedText(findTestObject('Object Repository/Register/Positive/Page_Premium Class/input_Confirmation Password_confirmPassword'), 
    '5rJRkp63EpyCwk1Mu/Ij1Q==')

WebUI.click(findTestObject('Object Repository/Register/Positive/Page_Premium Class/div_Confirmation Password'))

WebUI.doubleClick(findTestObject('Object Repository/Register/Positive/Page_Premium Class/span_Refresh captcha'))

WebUI.click(findTestObject('Object Repository/Register/Positive/Page_Premium Class/span_Refresh captcha'))

WebUI.click(findTestObject('Object Repository/Register/Positive/Page_Premium Class/span_Refresh captcha'))

WebUI.click(findTestObject('Object Repository/Register/Positive/Page_Premium Class/span_Refresh captcha'))

WebUI.click(findTestObject('Object Repository/Register/Positive/Page_Premium Class/span_Refresh captcha'))

WebUI.click(findTestObject('Object Repository/Register/Positive/Page_Premium Class/span_Refresh captcha'))

WebUI.click(findTestObject('Object Repository/Register/Positive/Page_Premium Class/span_Refresh captcha'))

WebUI.click(findTestObject('Object Repository/Register/Positive/Page_Premium Class/span_Refresh captcha'))

WebUI.click(findTestObject('Object Repository/Register/Positive/Page_Premium Class/span_Refresh captcha'))

WebUI.click(findTestObject('Object Repository/Register/Positive/Page_Premium Class/span_Refresh captcha'))

WebUI.setText(findTestObject('Object Repository/Register/Positive/Page_Premium Class/input_Refresh captcha_captchaAnswer'), 
    '1R7il')

WebUI.click(findTestObject('Object Repository/Register/Positive/Page_Premium Class/span_Refresh captcha'))

WebUI.setText(findTestObject('Object Repository/Register/Positive/Page_Premium Class/input_Refresh captcha_captchaAnswer'), 
    'WLuI3')

WebUI.click(findTestObject('Object Repository/Register/Positive/Page_Premium Class/span_Refresh captcha'))

WebUI.setText(findTestObject('Object Repository/Register/Positive/Page_Premium Class/input_Refresh captcha_captchaAnswer'), 
    'rST28')

WebUI.click(findTestObject('Object Repository/Register/Positive/Page_Premium Class/button_Create account'))

WebUI.click(findTestObject('Object Repository/Register/Positive/Page_Premium Class/span_Please verify your account to complete_a3c986'))

WebUI.click(findTestObject('Object Repository/Register/Positive/Page_Premium Class/img'))

WebUI.click(findTestObject('Object Repository/Register/Positive/Page_Premium Class/h1_Account Verification'))

WebUI.click(findTestObject('Object Repository/Register/Positive/Page_Premium Class/span_Resent verification email'))

WebUI.closeBrowser()

