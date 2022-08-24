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

WebUI.verifyElementText(findTestObject('Object Repository/Page_Home  Wallstant/p_user1'), '@user1')

WebUI.setText(findTestObject('Object Repository/Page_Home  Wallstant/textarea_user1_post_textbox'), 'user post to comment')

WebUI.click(findTestObject('Object Repository/Page_Home  Wallstant/input_Title_post_now'))

WebUI.setText(findTestObject('Object Repository/Page_Home  Wallstant/textarea_Be the first_1659236302'), 'comment to edit')

WebUI.sendKeys(findTestObject('Object Repository/Page_Home  Wallstant/textarea_Be the first_1659236302'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Page_Home  Wallstant/span_ (1)'))

WebUI.click(findTestObject('Object Repository/Page_Home  Wallstant/a_Edit comment'))

WebUI.setText(findTestObject('Object Repository/Page_Home  Wallstant/textarea_comment to edit'), 'user comment editted')

WebUI.click(findTestObject('Object Repository/Page_Home  Wallstant/a_Save'))

WebUI.click(findTestObject('Object Repository/Page_Home  Wallstant/span_'))

WebUI.click(findTestObject('Object Repository/Page_Home  Wallstant/a_Delete post'))

WebUI.click(findTestObject('Object Repository/Page_Home  Wallstant/a_user 1'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_user1  Wallstant/p_No more stories'), 'No more stories')

WebUI.closeBrowser()

