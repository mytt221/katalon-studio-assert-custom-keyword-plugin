package kms.turing.katalon.plugins.assertj

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.apache.commons.lang.math.NumberUtils

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

public class NumberAssert extends GenericAssert{

	/**
	 * 
	 * @param x the value to be tested
	 * @param y the value to be compared
	 * @param description the verification info
	 */
	@Keyword
	static void lessThan(x, y, String description, FailureHandling flowControl = FailureHandling.STOP_ON_FAILURE) {
		info "$description with x: $x, y: $y"
		try{
			String message = buildAssertMessage(description, "is less than $y", x)
			if (x >= y){
				handleError(message, flowControl)
			}else{
				pass "The tested value is less than: $y"
			}
		}
		catch(ex){
			handleError(ex)
		}
	}

	/**
	 *
	 * @param x the value to be tested
	 * @param y the value to be compared
	 * @param description the verification info
	 */
	@Keyword
	static void lessThanOrEqual(x, y, String description, FailureHandling flowControl = FailureHandling.STOP_ON_FAILURE) {
		info "$description with x: $x, y: $y"
		try{
			String message = buildAssertMessage(description, "is less than or equal to $y", x)
			if (x > y){
				handleError(message, flowControl)
			}else{
				pass "The tested value is less than or equal to: $y"
			}
		}
		catch(ex){
			handleError(ex)
		}
	}

	/**
	 *
	 * @param x the value to be tested
	 * @param y the value to be compared
	 * @param description the verification info
	 */
	@Keyword
	static void greaterThan(x, y, String description, FailureHandling flowControl = FailureHandling.STOP_ON_FAILURE) {
		info "$description with x: $x, y: $y"
		try{
			String message = buildAssertMessage(description, "is greater than $y", x)
			if (x <= y){
				handleError(message, flowControl)
			}else{
				pass "The tested value is greater than: $y"
			}
		}
		catch(ex){
			handleError(ex)
		}
	}

	/**
	 *
	 * @param x the value to be tested
	 * @param y the value to be compared
	 * @param description the verification info
	 */
	@Keyword
	static void greaterThanOrEqual(x, y, String description, FailureHandling flowControl = FailureHandling.STOP_ON_FAILURE) {
		info "$description with x: $x, y: $y"
		try{
			String message = buildAssertMessage(description, "is greater than or equal to $y", x)
			if (x < y){
				handleError(message, flowControl)
			}else{
				pass "The tested value is greater than or equal to: $y"
			}
		}
		catch(ex){
			handleError(ex)
		}
	}

	/**
	 *
	 * @param x the value to be tested
	 * @param description the verification info
	 */
	@Keyword
	static void isPositive(value, String description, FailureHandling flowControl = FailureHandling.STOP_ON_FAILURE) {
		info "$description with object value is '$value'"
		try{
			String message = buildAssertMessage(description, "is positive number", value)
			if (value <= 0){
				handleError(message, flowControl)
			}else{
				pass "The tested value is poistive"
			}
		}
		catch(ex){
			handleError(ex)
		}
	}

	/**
	 *
	 * @param x the value to be tested
	 * @param description the verification info
	 */
	@Keyword
	static void isNegative(value, String description, FailureHandling flowControl = FailureHandling.STOP_ON_FAILURE) {
		info "$description with object value is '$value'"
		try{
			String message = buildAssertMessage(description, "is negative number", value)
			if (value >= 0){
				handleError(message, flowControl)
			}else{
				pass "The tested value is negative"
			}
		}
		catch(ex){
			handleError(ex)
		}
	}

	/**
	 *
	 * @param x the value to be tested
	 * @param description the verification info
	 */
	@Keyword
	static void isZero(value, String description, FailureHandling flowControl = FailureHandling.STOP_ON_FAILURE) {
		info "$description with object value is '$value'"
		try{
			String message = buildAssertMessage(description, "is Zero", value)
			if (value != 0){
				handleError(message, flowControl)
			}else{
				pass "The tested value is zero"
			}
		}
		catch(ex){
			handleError(ex)
		}
	}

	/**
	 * Verify whether two numbers are equal and the step will be failed if they are not equal
	 * @param actual the first number to compare
	 * @param expected the second number to compare
	 * @param description the verification info
	 */
	@Keyword
	static void equals(actual, expected, String description, FailureHandling flowControl = FailureHandling.STOP_ON_FAILURE) {
		try{
			info "$description"
			String message = buildAssertMessage(description, "equals to $expected", actual)
			if(actual != expected){
				handleError(message, flowControl)
			}
			else{
				pass("The two values are equal")
			}
		}
		catch(ex){
			handleError(ex, flowControl)
		}
	}

	/**
	 * Verify whether two numbers are not equal and the step will be failed if they are equal
	 * @param actual the first number to compare
	 * @param expected the second number to compare
	 * @param description the verification info
	 */
	@Keyword
	static void notEqual(actual, expected, String description, FailureHandling flowControl = FailureHandling.STOP_ON_FAILURE) {
		try{
			info "$description"
			String message = buildAssertMessage(description, "not equal to $expected", actual)
			if(actual == expected){
				handleError(message, flowControl)
			}
			else{
				pass("The two values are equal")
			}
		}
		catch(ex){
			handleError(ex, flowControl)
		}
	}
}
