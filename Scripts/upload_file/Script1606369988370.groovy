import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.apache.commons.io.FileUtils as FileUtils

WebUI.openBrowser('')

WebUI.navigateToUrl('http://sandbox.jurnal.id/users/login')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Page_Mekari Account/Login_email'), 'muhammadffuad@gmail.com')

WebUI.setEncryptedText(findTestObject('Page_Mekari Account/Login_password'), 'sqU2EbHce7o0M+f/WEc7Vg==')

WebUI.click(findTestObject('Page_Mekari Account/Btn_login'))

WebUI.click(findTestObject('Page_Dashboard  Jurnal/btn_sales'))

WebUI.click(findTestObject('Page_create_sales_invoice/Btn_creat_new_sales'))

WebUI.scrollToElement(findTestObject('Page_create_sales_invoice/span_browse'), 3)

WebUI.click(findTestObject('Page_create_sales_invoice/span_browse'))

File file = new File('C:\\Users\\fuadn\\Pictures\\error.PNG')

String data = FileUtils.readFileToString(file)

System.out.printin(data)

WebUI.uploadFile(findTestObject('Page_create_sales_invoice/span_browse'), 'file')



