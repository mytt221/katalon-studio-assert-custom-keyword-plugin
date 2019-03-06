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

//equals
text1 = 'a nice string'
text2 = 'A nice string'
CustomKeywords.'kms.turing.katalon.plugins.assertj.StringAssert.equals'(text1, text2, true, "contains", FailureHandling.STOP_ON_FAILURE)

//
//contains
text1 = 'a nice string'
text2 = 'Nice'
CustomKeywords.'kms.turing.katalon.plugins.assertj.StringAssert.contains'(text1, text2, false, "contains", FailureHandling.STOP_ON_FAILURE)

//not contains
text1 = 'a nice string'
text2 = 'strinG'
CustomKeywords.'kms.turing.katalon.plugins.assertj.StringAssert.notContain'(text1, text2, false, "does NOT Contain", FailureHandling.STOP_ON_FAILURE)

////equal
expected ="This is a testing"
actual = "This is a testing"
CustomKeywords.'kms.turing.katalon.plugins.assertj.StringAssert.equals'(expected, actual, true, "equals with case sensitive", FailureHandling.STOP_ON_FAILURE)

////not equal
expected ="This is a testing"
actual = "This is a testin"
CustomKeywords.'kms.turing.katalon.plugins.assertj.StringAssert.notEqual'(expected, actual, true, "does Not Equal", FailureHandling.STOP_ON_FAILURE)

//startwith Prefix
text ="This is a testing"
prefix = "tH"
CustomKeywords.'kms.turing.katalon.plugins.assertj.StringAssert.startsWith'(text, prefix, false, "starts with prefix", FailureHandling.STOP_ON_FAILURE)

//endwith suffix
text ="This is a testing"
suffix = "Testing"
CustomKeywords.'kms.turing.katalon.plugins.assertj.StringAssert.endsWith'(text, suffix, false, "ends with suffix", FailureHandling.STOP_ON_FAILURE)

//match with pattern
text ="http://google.com/"
pattern = "http://(.*)/"
CustomKeywords.'kms.turing.katalon.plugins.assertj.StringAssert.matches'(text, pattern, "matches with pattern" , FailureHandling.STOP_ON_FAILURE)

//NOT endwith Prefix
text ="This is a testing"
suffix = "e"
CustomKeywords.'kms.turing.katalon.plugins.assertj.StringAssert.endsWith'(text, suffix, true, "does NOT end with suffix", FailureHandling.CONTINUE_ON_FAILURE)

//NOT startwith Prefix
text ="This is a testing"
prefix = "h"
CustomKeywords.'kms.turing.katalon.plugins.assertj.StringAssert.startsWith'(text, prefix, true, "does NOT start with prefix", FailureHandling.CONTINUE_ON_FAILURE)



