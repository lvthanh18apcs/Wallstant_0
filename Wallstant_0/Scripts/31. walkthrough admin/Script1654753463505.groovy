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

WebUI.navigateToUrl('http://localhost/')

WebUI.setText(findTestObject('Object Repository/Page_Welcome  Wallstant/input_Login now_login_username'), 'admin1')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Welcome  Wallstant/input_Login now_login_password'), 'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/Page_Welcome  Wallstant/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_Home  Wallstant/p_My photos'))

WebUI.click(findTestObject('Object Repository/Page_admin1  Wallstant/a_Home'))

WebUI.click(findTestObject('Object Repository/Page_Home  Wallstant/p_Settings'))

WebUI.click(findTestObject('Object Repository/Page_Account settings  Wallstant/a_Wallstant'))

WebUI.click(findTestObject('Object Repository/Page_Home  Wallstant/p_Language'))

WebUI.click(findTestObject('Object Repository/Page_Account settings  Wallstant/a_Wallstant'))

WebUI.click(findTestObject('Object Repository/Page_Home  Wallstant/p_New note'))

WebUI.click(findTestObject('Object Repository/Page_Create new note  Wallstant/a_Wallstant'))

WebUI.click(findTestObject('Object Repository/Page_Home  Wallstant/p_See all notes0'))

WebUI.click(findTestObject('Object Repository/Page_My notepad  Wallstant/a_Wallstant'))

WebUI.click(findTestObject('Object Repository/Page_Home  Wallstant/p_Saved posts'))

WebUI.click(findTestObject('Object Repository/Page_Saved posts  Wallstant/a_Wallstant'))

WebUI.click(findTestObject('Object Repository/Page_Home  Wallstant/p_Support box'))

WebUI.click(findTestObject('Object Repository/Page_Support box  Wallstant/a_Wallstant'))

WebUI.click(findTestObject('Object Repository/Page_Home  Wallstant/p_Report a problem'))

WebUI.click(findTestObject('Object Repository/Page_Report a problem  Wallstant/a_Wallstant'))

WebUI.closeBrowser()

