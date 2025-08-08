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

WebUI.setText(findTestObject('Object Repository/CreateInvver2/Page_Login - Codx.Auth/input_Login_Username'), 'graceyguinto@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/CreateInvver2/Page_Login - Codx.Auth/input_Login_Password'), 'CTSjUTGqz7ePh4ERSxjjPQ==')

WebUI.click(findTestObject('Object Repository/CreateInvver2/Page_Login - Codx.Auth/button_Remember My Login_button'))

WebUI.click(findTestObject('Object Repository/CreateInvver2/Page_Tuos/h1_Dashboard_flex items-center'))

WebUI.click(findTestObject('Object Repository/CreateInvver2/Page_Tuos/a_Recurring Invoice_flex py-2 w-full text-x_5d5cc9'))

WebUI.click(findTestObject('Object Repository/CreateInvver2/Page_Tuos/button_Invoice_bg-primary-500 items-center _715a6e'))

WebUI.selectOptionByValue(findTestObject('Object Repository/CreateInvver2/Page_Tuos/select_Customer_customerID'), '29', 
    true)

WebUI.click(findTestObject('Object Repository/CreateInvver2/Page_Tuos/input_Due Date (mmddyyyy)_block w-full bord_bdc4f5'))

WebUI.click(findTestObject('Object Repository/CreateInvver2/Page_Tuos/div_Sa_react-datepicker__day react-datepick_1cfa70'))

WebUI.selectOptionByValue(findTestObject('Object Repository/CreateInvver2/Page_Tuos/select_SubTotal_mt-1 block w-full py-2 pl-3_012011'), 
    '4', true)

WebUI.click(findTestObject('Object Repository/CreateInvver2/Page_Tuos/input_SubTotal_block w-full bg-white text-x_ec7ca8'))

WebUI.setText(findTestObject('Object Repository/CreateInvver2/Page_Tuos/input_SubTotal_block w-full bg-white text-x_ec7ca8_1'), 
    '')

WebUI.setText(findTestObject('Object Repository/CreateInvver2/Page_Tuos/input_SubTotal_block w-full bg-white text-x_ec7ca8_2'), 
    '2')

WebUI.setText(findTestObject('Object Repository/CreateInvver2/Page_Tuos/input_SubTotal_block w-full bg-white text-x_ec7ca8_3'), 
    '20')

WebUI.selectOptionByValue(findTestObject('Object Repository/CreateInvver2/Page_Tuos/select_228.00_discountType'), '2', true)

WebUI.setText(findTestObject('Object Repository/CreateInvver2/Page_Tuos/input_Discount_discount'), '6')

WebUI.click(findTestObject('Object Repository/CreateInvver2/Page_Tuos/button_Cancel_ml-3 inline-flex justify-cent_ee1268'))

WebUI.closeBrowser()

