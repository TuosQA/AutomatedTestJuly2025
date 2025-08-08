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

WebUI.setText(findTestObject('Object Repository/UpdateInvver2/Page_Login - Codx.Auth/input_Login_Username'), 'graceyguinto@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/UpdateInvver2/Page_Login - Codx.Auth/input_Login_Password'), 'CTSjUTGqz7ePh4ERSxjjPQ==')

WebUI.click(findTestObject('Object Repository/UpdateInvver2/Page_Login - Codx.Auth/button_Remember My Login_button'))

WebUI.click(findTestObject('Object Repository/UpdateInvver2/Page_Tuos/h1_Dashboard_flex items-center'))

WebUI.click(findTestObject('Object Repository/UpdateInvver2/Page_Tuos/a_Recurring Invoice_flex py-2 w-full text-x_5d5cc9'))

WebUI.click(findTestObject('Object Repository/UpdateInvver2/Page_Tuos/svg'))

WebUI.click(findTestObject('Object Repository/UpdateInvver2/Page_Tuos/div_Open options_headlessui-menu-item-r7m'))

WebUI.click(findTestObject('Object Repository/UpdateInvver2/Page_Tuos/input_Due Date (mmddyyyy)_block w-full bord_bdc4f5'))

WebUI.click(findTestObject('Object Repository/UpdateInvver2/Page_Tuos/div_Sa_react-datepicker__day react-datepick_831a13'))

WebUI.click(findTestObject('Object Repository/UpdateInvver2/Page_Tuos/div_Tax Exempt_flex items-center gap-2'))

WebUI.selectOptionByValue(findTestObject('Object Repository/UpdateInvver2/Page_Tuos/select_Tax Exempt_mt-1 block w-full py-2 pl_54281d'), 
    '3', true)

WebUI.click(findTestObject('Object Repository/UpdateInvver2/Page_Tuos/input_Tax Exempt_block w-full bg-white text_6e96f6'))

WebUI.setText(findTestObject('Object Repository/UpdateInvver2/Page_Tuos/input_Tax Exempt_block w-full bg-white text_6e96f6_1'), 
    '10')

WebUI.setText(findTestObject('Object Repository/UpdateInvver2/Page_Tuos/input_Discount_discount'), '20')

WebUI.click(findTestObject('Object Repository/UpdateInvver2/Page_Tuos/button_Cancel_ml-3 inline-flex justify-cent_ee1268'))

WebUI.closeBrowser()

