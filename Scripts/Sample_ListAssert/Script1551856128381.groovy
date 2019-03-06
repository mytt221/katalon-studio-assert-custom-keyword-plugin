import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.model.FailureHandling

//// Verify 2 lists are equal with incorrect order
actual = [null, 1, 3]
expected = [null, 3, 1]
CustomKeywords.'kms.turing.katalon.plugins.assertj.ListAssert.equalsIgnoreOrder'(actual, expected, "Verify 2 lists are equal", FailureHandling.CONTINUE_ON_FAILURE)

// Verify 2 lists are equal with One of input list is null
actual = ["a", "c"]
expected = ["a", "c"]
CustomKeywords.'kms.turing.katalon.plugins.assertj.ListAssert.equalsWithOrder'(actual, expected, "Verify 2 lists are equal", FailureHandling.CONTINUE_ON_FAILURE)

// Verify 1 list contains another one
list = ["a", "c", "b"]
sublist = ["b",'a']
CustomKeywords.'kms.turing.katalon.plugins.assertj.ListAssert.contains'(list, sublist,  "Verify 1 list contains another one",FailureHandling.STOP_ON_FAILURE)
