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

WebUI.openBrowser(GlobalVariable.url1)

WebUI.click(findTestObject('Object Repository/Strona1/Edit_cookies'))

WebUI.click(findTestObject('Object Repository/Strona1/Confirm_all_cookies'))

WebUI.setText(findTestObject('Strona1/Wyszukiwanie'), Wyszukanie)

WebUI.click(findTestObject('Object Repository/Strona1/Search'))

WebUI.click(findTestObject('Object Repository/Strona1/Zaloguj_sie'))

WebUI.setText(findTestObject('Strona1/Input_Imię'), Imie)

WebUI.setText(findTestObject('Strona1/Input_Nazwisko'), Nazwisko)

WebUI.setText(findTestObject('Strona1/Input_E-mail'), Email)

WebUI.setText(findTestObject('Strona1/Input_Hasło'), Haslo)

WebUI.setText(findTestObject('Strona1/Input_Powtorz_Hasło'), Haslo2)

String blad = WebUI.getText(findTestObject('Object Repository/Strona1/Bład'))

assert error == blad

WebUI.closeBrowser()

