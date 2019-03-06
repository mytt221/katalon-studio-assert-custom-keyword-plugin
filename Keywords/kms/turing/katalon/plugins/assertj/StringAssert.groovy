package kms.turing.katalon.plugins.assertj

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

public class StringAssert extends GenericAssert {

	/**
	 * Verify a String contains another String 
	 * @param text the String to be tested if it contains another String
	 * @param subText the substring
	 * @param description
	 */
	@Keyword
	static void contains(String text, String subText, boolean caseSensitive = true, String description, FailureHandling flowControl = FailureHandling.STOP_ON_FAILURE) {
		info "${description} with case-sensitive: ${caseSensitive}"
		try{
			String newText = text
			String newSubText = subText
			if(!caseSensitive){
				newText = newText.toLowerCase()
				newSubText = subText.toLowerCase()
			}

			if(text.contains(newSubText)){
				pass "The tested text '$text' contains '$subText'"
			}
			else {
				String message = buildAssertMessage(description, "contains text '$subText' with case-sensitive: $caseSensitive", text)
				handleError(message, flowControl)
			}
		}
		catch(ex){
			handleError(ex, flowControl)
		}
	}

	/**
	 * Verify a String not contains another String 
	 * @param text the String to be tested if it does not contain another String
	 * @param subText the substring
	 * @param description
	 */
	@Keyword
	static void notContain(String text, String subText, boolean caseSensitive = true, String description, FailureHandling flowControl = FailureHandling.STOP_ON_FAILURE) {
		info "${description} with case-sensitive: ${caseSensitive}"
		try{
			String newText = text
			String newSubText = subText
			if(!caseSensitive){
				newText = newText.toLowerCase()
				newSubText = subText.toLowerCase()
			}

			if(newText.contains(newSubText)){
				String message = buildAssertMessage(description, "not contains text '$subText' with case-sensitive: $caseSensitive", text)
				handleError(message, flowControl)
			}
			else {
				pass "The tested text '$text' does not contains '{$subText}'"
			}
		}
		catch(ex){
			handleError(ex, flowControl)
		}
	}

	/**
	 * Verify whether two String are equal
	 * @param actual the String passed to verify if it's equal to another String
	 * @param expected the expected String value for the comparison
	 * @param description
	 */
	@Keyword
	static void equals(String actual, String expected, boolean caseSensitive = true, String description, FailureHandling flowControl = FailureHandling.STOP_ON_FAILURE) {
		info "${description} with case-sensitive: ${caseSensitive}"
		try{

			if((actual.equalsIgnoreCase(expected) && !caseSensitive) || (actual.equals(expected) && caseSensitive)){
				pass "The tested text '$actual' are equal to '{$expected}'"
			}
			else {
				String message = buildAssertMessage(description, "equals to '$expected' with case-sensitive: $caseSensitive", actual)
				handleError(message, flowControl)
			}
		}
		catch(ex){
			handleError(ex, flowControl)
		}
	}

	/**
	 * Verify whether two String are not equal
	 * @param actual the String passed to verify if it's equal to another String
	 * @param expected the expected String value for the comparison
	 * @param description
	 */
	@Keyword
	static void notEqual(String actual, String expected, boolean caseSensitive = true, String description, FailureHandling flowControl = FailureHandling.STOP_ON_FAILURE) {
		info "${description} with case-sensitive: ${caseSensitive}"
		try{

			if((actual.equalsIgnoreCase(expected) && !caseSensitive) || (actual.equals(expected) && caseSensitive)){
				String message = buildAssertMessage(description, "not equal to '$expected' with case-sensitive: $caseSensitive", actual)
				handleError(message, flowControl)
			}
			else {
				pass "The tested text '$actual' are not equal to '{$expected}'"
			}
		}
		catch(ex){
			handleError(ex, flowControl)
		}
	}

	/**
	 * Verify whether a String starts with a prefix
	 * @param text the String to be tested
	 * @param prefix the prefix string value
	 * @param description
	 */
	@Keyword
	static void startsWith(String text, String prefix, boolean caseSensitive = true, String description, FailureHandling flowControl = FailureHandling.STOP_ON_FAILURE) {
		info "${description} with case-sensitive: ${caseSensitive}"
		try{
			String newText = text
			String newPrefix = prefix
			if(!caseSensitive){
				newText = newText.toLowerCase()
				newPrefix = newPrefix.toLowerCase()
			}

			if(newText.startsWith(newPrefix)){
				pass "The tested text starts with '${prefix}' with case-sensitive: $caseSensitive"
			}
			else {
				String message = buildAssertMessage(description, "starts with '$prefix' with case-sensitive: $caseSensitive", text)
				handleError(message, flowControl)
			}
		}
		catch(ex){
			handleError(ex, flowControl)
		}
	}

	/**
	 * Verify whether a String ends with a suffix
	 * @param text the String to be tested
	 * @param suffix the suffix string value
	 * @param description
	 */
	@Keyword
	static void endsWith(String text, String suffix, boolean caseSensitive = true, String description, FailureHandling flowControl = FailureHandling.STOP_ON_FAILURE) {
		info "${description} with case-sensitive: ${caseSensitive}"
		try{
			String newText = text
			String newSuffix = suffix
			if(!caseSensitive){
				newText = newText.toLowerCase()
				newSuffix = newSuffix.toLowerCase()
			}

			if(newText.endsWith(newSuffix)){
				pass "The tested text ends with '${suffix}' with case-sensitive: $caseSensitive"
			}
			else {
				String message = buildAssertMessage(description, "ends with '$suffix' with case-sensitive: $caseSensitive", text)
				handleError(message, flowControl)
			}
		}
		catch(ex){
			handleError(ex, flowControl)
		}
	}

	/**
	 * Verify whether a String matches to a pattern
	 * @param text the String to be tested
	 * @param pattern the pattern
	 * @param description
	 */
	@Keyword
	static void matches(String text, String pattern, String description, FailureHandling flowControl = FailureHandling.STOP_ON_FAILURE) {
		info description
		try{
			if(text.matches(pattern)){
				pass "The tested text matched to pattern '$pattern'"
			}
			else {
				String message = buildAssertMessage(description, "matches to pattern '$pattern'", text)
				handleError(message, flowControl)
			}
		}
		catch(ex){
			handleError(ex)
		}
	}
}
