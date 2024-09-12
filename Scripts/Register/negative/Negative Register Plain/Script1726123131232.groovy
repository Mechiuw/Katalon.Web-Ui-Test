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

WebUI.click(findTestObject('Object Repository/Register/Negative/Negative Register Account Plain Form/button_Register'))

WebUI.click(findTestObject('Object Repository/Register/Negative/Negative Register Account Plain Form/input_Full name_fullname'))

WebUI.click(findTestObject('Object Repository/Register/Negative/Negative Register Account Plain Form/img'))

WebUI.click(findTestObject('Object Repository/Register/Negative/Negative Register Account Plain Form/span_Full Name is required'))

WebUI.click(findTestObject('Object Repository/Register/Negative/Negative Register Account Plain Form/span_Full Name should be alphabethic'))

WebUI.click(findTestObject('Object Repository/Register/Negative/Negative Register Account Plain Form/input_Email_username'))

WebUI.click(findTestObject('Object Repository/Register/Negative/Negative Register Account Plain Form/span_Full Name is required'))

WebUI.click(findTestObject('Object Repository/Register/Negative/Negative Register Account Plain Form/span_Full Name should be alphabethic'))

WebUI.click(findTestObject('Object Repository/Register/Negative/Negative Register Account Plain Form/span_Email is required'))

WebUI.click(findTestObject('Object Repository/Register/Negative/Negative Register Account Plain Form/span_Invalid Email address'))

WebUI.click(findTestObject('Object Repository/Register/Negative/Negative Register Account Plain Form/input_Phone Number_phone'))

WebUI.setText(findTestObject('Object Repository/Register/Negative/Negative Register Account Plain Form/input_Phone Number_phone'), '')

WebUI.click(findTestObject('Object Repository/Register/Negative/Negative Register Account Plain Form/span_Phone is required'))

WebUI.click(findTestObject('Object Repository/Register/Negative/Negative Register Account Plain Form/span_Invalid Phone. The phone number must c_ce1ad2'))

WebUI.click(findTestObject('Object Repository/Register/Negative/Negative Register Account Plain Form/div_Create New Account Please register  ent_58e2f8'))

WebUI.click(findTestObject('Object Repository/Register/Negative/Negative Register Account Plain Form/span_Birth Date is required'))

WebUI.click(findTestObject('Object Repository/Register/Negative/Negative Register Account Plain Form/span_The minimum age to register is 5 years'))

WebUI.click(findTestObject('Object Repository/Register/Negative/Negative Register Account Plain Form/div_Create New Account Please register  ent_58e2f8_1'))

WebUI.click(findTestObject('Object Repository/Register/Negative/Negative Register Account Plain Form/span_Birth Date is required'))

WebUI.click(findTestObject('Object Repository/Register/Negative/Negative Register Account Plain Form/div_Create Password'))

WebUI.click(findTestObject('Object Repository/Register/Negative/Negative Register Account Plain Form/label_Create Password'))

WebUI.click(findTestObject('Object Repository/Register/Negative/Negative Register Account Plain Form/div_Password is required.  The Password mus_4e3d42'))

WebUI.click(findTestObject('Object Repository/Register/Negative/Negative Register Account Plain Form/span_Password is required'))

WebUI.click(findTestObject('Object Repository/Register/Negative/Negative Register Account Plain Form/label_Confirmation Password'))

WebUI.click(findTestObject('Object Repository/Register/Negative/Negative Register Account Plain Form/span_Confirm Password is required'))

WebUI.click(findTestObject('Object Repository/Register/Negative/Negative Register Account Plain Form/input_Refresh captcha_captchaAnswer'))

WebUI.click(findTestObject('Object Repository/Register/Negative/Negative Register Account Plain Form/input_Refresh captcha_captchaAnswer'))

WebUI.click(findTestObject('Object Repository/Register/Negative/Negative Register Account Plain Form/div_Captcha Answer is required'))

WebUI.closeBrowser()

