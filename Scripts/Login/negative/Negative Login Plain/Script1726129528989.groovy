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

WebUI.click(findTestObject('Login/Negative/Page_Premium Class/button_Login_1'))

WebUI.click(findTestObject('Object Repository/Login/Negative/Page_Premium Class/input_Email_email'))

WebUI.click(findTestObject('Object Repository/Login/Negative/Page_Premium Class/i_Password_bi bi-eye'))

WebUI.click(findTestObject('Object Repository/Login/Negative/Page_Premium Class/span_Email is required'))

WebUI.click(findTestObject('Object Repository/Login/Negative/Page_Premium Class/span_Password is required'))

WebUI.click(findTestObject('Object Repository/Login/Negative/Page_Premium Class/span_The Password must have at least 8 char_b31fc3'))

WebUI.click(findTestObject('Object Repository/Login/Negative/Page_Premium Class/button_Sign up with google'))

WebUI.click(findTestObject('Object Repository/Login/Negative/Page_Premium Class/input_Email_email'))

WebUI.click(findTestObject('Object Repository/Login/Negative/Page_Premium Class/div_Password_ec-input-group-rounded positio_e4b345'))

WebUI.closeBrowser()

