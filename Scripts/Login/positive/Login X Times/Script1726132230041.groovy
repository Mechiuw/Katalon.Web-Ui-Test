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


for(int i = 0; i <= xTimes; i++) {
	WebUI.openBrowser('')
	
	WebUI.navigateToUrl(loginUrl)
	
	WebUI.setText(findTestObject('Object Repository/Login/Positive/Page_Premium Class/input_Email_email (1)'), loginUname)
	
	WebUI.setEncryptedText(findTestObject('Object Repository/Login/Positive/Page_Premium Class/input_Password_password (1)'), 
	    'cw0ysTOoKIoXuQZsrcrU8Q==')
	
	WebUI.click(findTestObject('Object Repository/Login/Positive/Page_Premium Class/button_Login (2)'))
	
	WebUI.closeBrowser()
}
