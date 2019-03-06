package kms.turing.katalon.plugins.assertj

import java.text.ParseException
import java.text.SimpleDateFormat

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.model.FailureHandling

public class DateTimeAssert extends GenericAssert{

	/**
	 * Assert that the tested date equals to another date
	 * @param verifiedDate the input string of date time to be verified
	 * @param compare2Date the input string of date time to compare to
	 * @param description the verification info
	 */
	@Keyword
	static void equals(String verifiedDate, String compare2Date, String format='dd/MM/yyyy', String description, FailureHandling flowControl = FailureHandling.STOP_ON_FAILURE) {
		info description
		String message =""
		try{
			def sdf = new SimpleDateFormat(format)
			def actual = sdf.parse(verifiedDate)
			def expected = sdf.parse(compare2Date)

			if (expected.compareTo(actual) == 0){
				pass "The tested date equals to '$compare2Date'"
			}else{
				message = buildAssertMessage(description, "equals ${compare2Date}'", verifiedDate)
				handleError( message, flowControl)
			}
		}
		catch(ex){
			handleError(ex, flowControl)
		}
	}

	/**
	 * Assert that the tested date is before a date
	 * @param verifiedDate the input string of date time to be verified
	 * @param compare2Date the input string of date time to compare to
	 * @param description the verification info
	 */
	@Keyword
	static void isBefore(String verifiedDate, String compare2Date, String format='dd/MM/yyyy', String description, FailureHandling flowControl = FailureHandling.STOP_ON_FAILURE) {
		info "$description"
		String message =""
		try{
			def sdf = new SimpleDateFormat(format)
			def startDate = sdf.parse(verifiedDate)
			def endDate = sdf.parse(compare2Date)

			if (!startDate.before(endDate)){
				message = buildAssertMessage(description, "before ${compare2Date}'", verifiedDate)
				handleError( message, flowControl)
			}else{
				pass "The tested date is before '$compare2Date'"
			}
		}
		catch(ex){
			handleError( ex, flowControl)
		}
	}

	/**
	 * Assert that the tested date is after a date
	 * @param verifiedDate the input string of date time to be verified
	 * @param compare2Date the input string of date time to compare to
	 * @param description the verification info
	 */
	@Keyword
	static void isAfter(String verifiedDate, String compare2Date, String format='dd/MM/yyyy', String description, FailureHandling flowControl = FailureHandling.STOP_ON_FAILURE) {
		info "$description"
		try{
			def sdf = new SimpleDateFormat(format)
			def endDate = sdf.parse(verifiedDate)
			def startDate = sdf.parse(compare2Date)

			if (!endDate.after(startDate)){
				String message = buildAssertMessage(description, "after ${compare2Date}'", verifiedDate)
				handleError( message, flowControl)
			}else{
				pass "The tested date is after '$compare2Date'"
			}
		}
		catch(ex){
			handleError( ex, flowControl)
		}
	}

	/**
	 * Assert that a date string matches to expected format
	 * @param dateInString the input string of date time to be verified
	 * @param datetimeFormat the input date time pattern which uses to verify the date passed in
	 * @param description verification info
	 */
	@Keyword
	static void matchesDateTimeFormat(String dateInString, String datetimeFormat, String description, FailureHandling flowControl = FailureHandling.STOP_ON_FAILURE) {
		info "$description the date: $dateInString matches to the pattern: $datetimeFormat"
		SimpleDateFormat formatter = new SimpleDateFormat(datetimeFormat)
		formatter.setLenient(false)
		try {
			Date date = formatter.parse(dateInString)
		}catch(ParseException pex){
			String message = buildAssertMessage(description, "matches to datetime format '$datetimeFormat'", dateInString)
			handleError(message, flowControl)
		}
		catch(ex){
			handleError(ex, flowControl)
		}
	}
}
