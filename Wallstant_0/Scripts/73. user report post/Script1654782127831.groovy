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

WebUI.setText(findTestObject('Object Repository/Page_Welcome  Wallstant/input_Login now_login_username'), 'user1')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Welcome  Wallstant/input_Login now_login_password'), 'qeJ0sjJnwEs=')

WebUI.click(findTestObject('Object Repository/Page_Welcome  Wallstant/button_Login'))

WebUI.setText(findTestObject('Object Repository/Page_Home  Wallstant/textarea_user1_post_textbox'), 'Post to report')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Home  Wallstant/select_Public            Followers         _08a2bc'), 
    'Followers', true)

WebUI.click(findTestObject('Object Repository/Page_Home  Wallstant/input_Title_post_now'))

WebUI.click(findTestObject('Object Repository/Page_Home  Wallstant/span_'))

WebUI.click(findTestObject('Object Repository/Page_Home  Wallstant/a_Report post'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Home  Wallstant/p_Post reported we will review your report soon'), 
    'Post reported! we will review your report soon.')

WebUI.click(findTestObject('Object Repository/Page_Home  Wallstant/span_'))

WebUI.click(findTestObject('Object Repository/Page_Home  Wallstant/a_Delete post'))

WebUI.click(findTestObject('Object Repository/Page_Home  Wallstant/p_Support box'))

WebUI.click(findTestObject('Object Repository/Page_Support box  Wallstant/div_You anonymously reported a post. openCl_0e4e72'))

WebUI.click(findTestObject('Object Repository/Page_Support box  Wallstant/a_Delete'))

WebUI.click(findTestObject('Object Repository/Page_Support box  Wallstant/a_Home'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Home  Wallstant/p_user1'), '@user1')

WebUI.closeBrowser()

