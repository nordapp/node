package org.i3xx.node.domain;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.GregorianCalendar;

public interface ObProperty {

	/**
	 * @return the stringValue
	 */
	String getStringValue();

	/**
	 * @param stringValue the stringValue to set
	 */
	ObProperty setStringValue(String stringValue);

	/**
	 * @return the booleanValue
	 */
	Boolean getBooleanValue();

	/**
	 * @param booleanValue the booleanValue to set
	 */
	ObProperty setBooleanValue(Boolean booleanValue);

	/**
	 * @return the longValue
	 */
	Long getLongValue();

	/**
	 * @param longValue the longValue to set
	 */
	ObProperty setLongValue(Long longValue);

	/**
	 * @return the doubleValue
	 */
	Double getDoubleValue();

	/**
	 * @param doubleValue the doubleValue to set
	 */
	ObProperty setDoubleValue(Double doubleValue);

	/**
	 * @return the bigintValue
	 */
	BigInteger getBigintValue();

	/**
	 * @param bigintValue the bigintValue to set
	 */
	ObProperty setBigintValue(BigInteger bigintValue);

	/**
	 * @return the bigdecimalValue
	 */
	BigDecimal getBigdecimalValue();

	/**
	 * @param bigdecimalValue the bigdecimalValue to set
	 */
	ObProperty setBigdecimalValue(BigDecimal bigdecimalValue);

	/**
	 * @return the calendarValue
	 */
	GregorianCalendar getCalendarValue();

	/**
	 * @param calendarValue the calendarValue to set
	 */
	ObProperty setCalendarValue(GregorianCalendar calendarValue);

	/**
	 * @return the byteaValue
	 */
	byte[] getByteaValue();

	/**
	 * @param byteaValue the byteaValue to set
	 */
	ObProperty setByteaValue(byte[] byteaValue);

}
