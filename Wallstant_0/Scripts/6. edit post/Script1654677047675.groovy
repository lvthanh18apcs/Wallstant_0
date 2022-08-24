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

WebUI.sendKeys(findTestObject('Object Repository/Page_Welcome  Wallstant/input_Login now_login_password'), Keys.chord(Keys.ENTER))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Home  Wallstant/a_admin 1'), 'admin 1')

WebUI.setText(findTestObject('Object Repository/Page_Home  Wallstant/textarea_admin1_post_textbox'), 'Post to edit')

WebUI.click(findTestObject('Object Repository/Page_Home  Wallstant/input_Title_post_now'))

WebUI.click(findTestObject('Object Repository/Page_Home  Wallstant/a_admin 1'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_admin1  Wallstant/p_Post to edit'), 'Post to edit')

WebUI.click(findTestObject('Object Repository/Page_admin1  Wallstant/span_'))

WebUI.click(findTestObject('Object Repository/Page_admin1  Wallstant/a_Edit post'))

WebUI.setText(findTestObject('Object Repository/Page_admin1  Wallstant/textarea_Post to edit'), 'Post edited !')

WebUI.click(findTestObject('Object Repository/Page_admin1  Wallstant/a_Save'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_admin1  Wallstant/p_Post edited'), 'Post edited !')

WebUI.click(findTestObject('Object Repository/Page_admin1  Wallstant/span_'))

WebUI.click(findTestObject('Object Repository/Page_admin1  Wallstant/a_Delete post'))

WebUI.click(findTestObject('Object Repository/Page_admin1  Wallstant/button_Load more'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_admin1  Wallstant/p_No more stories'), 'No more stories')

WebUI.closeBrowser()

