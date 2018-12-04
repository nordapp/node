package org.i3xx.node;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.GregorianCalendar;

public class ObPropertyImpl implements ObProperty {
	
	/**  */
	public static final ObProperty of() { return new ObPropertyImpl(); }
	
	/**  */
	private String stringValue;
	
	/**  */
	private Boolean booleanValue;
	
	/**  */
	private Long longValue;
	
	/**  */
	private Double doubleValue;
	
	/**  */
	private BigInteger bigintValue;
	
	/**  */
	private BigDecimal bigdecimalValue;
	
	/**  */
	private GregorianCalendar calendarValue;
	
	/**  */
	private byte[] byteaValue;
	
	/**
	 * 
	 */
	public ObPropertyImpl() {
		super();
		this.stringValue = null;
		this.booleanValue = null;
		this.longValue = null;
		this.doubleValue = null;
		this.bigintValue = null;
		this.bigdecimalValue = null;
		this.calendarValue = null;
		this.byteaValue = null;
	}
	
	/**
	 * @param stringValue
	 * @param booleanValue
	 * @param longValue
	 * @param doubleValue
	 * @param bigintValue
	 * @param bigdecimalValue
	 * @param calendarValue
	 * @param bytea
	 */
	public ObPropertyImpl(String stringValue, Boolean booleanValue,
			Long longValue, Double doubleValue,	BigInteger bigintValue,
			BigDecimal bigdecimalValue, GregorianCalendar calendarValue,
			byte[] bytea) {
		super();
		this.stringValue = stringValue;
		this.booleanValue = booleanValue;
		this.longValue = longValue;
		this.doubleValue = doubleValue;
		this.bigintValue = bigintValue;
		this.bigdecimalValue = bigdecimalValue;
		this.calendarValue = calendarValue;
		this.byteaValue = bytea;
	}

	/**
	 * @return the stringValue
	 */
	public String getStringValue() {
		return stringValue;
	}

	/**
	 * @param stringValue the stringValue to set
	 */
	public ObProperty setStringValue(String stringValue) {
		this.stringValue = stringValue;
		return this;
	}

	/**
	 * @return the booleanValue
	 */
	public Boolean getBooleanValue() {
		return booleanValue;
	}

	/**
	 * @param booleanValue the booleanValue to set
	 */
	public ObProperty setBooleanValue(Boolean booleanValue) {
		this.booleanValue = booleanValue;
		return this;
	}

	/**
	 * @return the longValue
	 */
	public Long getLongValue() {
		return longValue;
	}

	/**
	 * @param longValue the longValue to set
	 */
	public ObProperty setLongValue(Long longValue) {
		this.longValue = longValue;
		return this;
	}

	/**
	 * @return the doubleValue
	 */
	public Double getDoubleValue() {
		return doubleValue;
	}

	/**
	 * @param doubleValue the doubleValue to set
	 */
	public ObProperty setDoubleValue(Double doubleValue) {
		this.doubleValue = doubleValue;
		return this;
	}

	/**
	 * @return the bigintValue
	 */
	public BigInteger getBigintValue() {
		return bigintValue;
	}

	/**
	 * @param bigintValue the bigintValue to set
	 */
	public ObProperty setBigintValue(BigInteger bigintValue) {
		this.bigintValue = bigintValue;
		return this;
	}

	/**
	 * @return the bigdecimalValue
	 */
	public BigDecimal getBigdecimalValue() {
		return bigdecimalValue;
	}

	/**
	 * @param bigdecimalValue the bigdecimalValue to set
	 */
	public ObProperty setBigdecimalValue(BigDecimal bigdecimalValue) {
		this.bigdecimalValue = bigdecimalValue;
		return this;
	}

	/**
	 * @return the calendarValue
	 */
	public GregorianCalendar getCalendarValue() {
		return calendarValue;
	}

	/**
	 * @param calendarValue the calendarValue to set
	 */
	public ObProperty setCalendarValue(GregorianCalendar calendarValue) {
		this.calendarValue = calendarValue;
		return this;
	}

	/**
	 * @return the byteaValue
	 */
	public byte[] getByteaValue() {
		return byteaValue;
	}

	/**
	 * @param byteaValue the byteaValue to set
	 */
	public ObProperty setByteaValue(byte[] byteaValue) {
		this.byteaValue = byteaValue;
		return this;
	}
}
