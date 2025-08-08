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

WebUI.navigateToUrl('https://tuos-qatest.simpacc.ca/#/revenue-and-collections/invoices')

WebUI.setText(findTestObject('Object Repository/Export Estimate to Pdf/Page_Login - Codx.Auth/input_Login_Username'), 'graceyguinto@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Export Estimate to Pdf/Page_Login - Codx.Auth/input_Login_Password'), 
    'CTSjUTGqz7ePh4ERSxjjPQ==')

WebUI.click(findTestObject('Object Repository/Export Estimate to Pdf/Page_Login - Codx.Auth/button_Remember My Login_button'))

WebUI.click(findTestObject('Object Repository/Export Estimate to Pdf/Page_Tuos/h1_Dashboard_flex items-center'))

WebUI.click(findTestObject('Object Repository/Export Estimate to Pdf/Page_Tuos/a_Revenue and Collections_flex py-2 w-full _52361d'))

WebUI.click(findTestObject('Object Repository/Export Estimate to Pdf/Page_Tuos/svg'))

WebUI.click(findTestObject('Object Repository/Export Estimate to Pdf/Page_Tuos/div_Approve_headlessui-menu-item-rag'))

WebUI.click(findTestObject('Object Repository/Export Estimate to Pdf/Page_Tuos/button_Estimates and Quotes_flex gap-x-2 it_2990ce'))

WebUI.closeBrowser()

