package org.i3xx.node.domain;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;

public final class BaseMapper {

	/**
	 * @param props
	 * @return
	 */
	public static Base getObject(Map<String,ObProperty> props) {
		
		Base base = new BaseImpl();
		base.setObid( props.get( Base.OB_ID ).getLongValue() );
		base.setObguid( props.get( Base.OB_GUID ).getLongValue() );
		base.setObuuid( props.get( Base.OB_UUID ).getStringValue() );
		base.setObctime( props.get( Base.OB_CTIME ).getCalendarValue() );
		base.setObutime( props.get( Base.OB_UTIME ).getCalendarValue() );
		base.setObhistory( props.get( Base.OB_HISTORY ).getStringValue() );
		base.setObhash( props.get( Base.OB_HASH ).getLongValue() );
		base.setObflags( props.get( Base.OB_FLAGS ).getBigintValue() );
		base.setObname( props.get( Base.OB_NAME ).getStringValue() );
		base.setObalias( props.get( Base.OB_ALIAS ).getStringValue() );
		base.setObtitle( props.get( Base.OB_TITLE ).getStringValue() );
		base.setObdescription( props.get( Base.OB_DESCRIPTION ).getStringValue() );
		base.setObroot( props.get( Base.OB_ROOT ).getStringValue() );
		base.setObmime( props.get( Base.OB_MIME ).getStringValue() );
		base.setObdata( props.get( Base.OB_DATA ).getStringValue() );
		base.setOburi( props.get( Base.OB_URI ).getStringValue() );
		base.setOblink( props.get( Base.OB_LINK ).getStringValue() );
		
		return base;
	}

	/**
	 * @param base
	 * @return
	 */
	public static Map<String,ObProperty> getMapping(Base base) {
		
		Map<String,ObProperty> props = new HashMap<String,ObProperty>();
		props.put( Base.OB_ID, ObPropertyImpl.of().setLongValue(base.getObid()) );
		props.put( Base.OB_GUID, ObPropertyImpl.of().setLongValue(base.getObguid()) );
		props.put( Base.OB_UUID, ObPropertyImpl.of().setStringValue(base.getObuuid()) );
		props.put( Base.OB_CTIME, ObPropertyImpl.of().setCalendarValue(base.getObctime()) );
		props.put( Base.OB_UTIME, ObPropertyImpl.of().setCalendarValue(base.getObutime()) );
		props.put( Base.OB_HISTORY, ObPropertyImpl.of().setStringValue(base.getObhistory()) );
		props.put( Base.OB_HASH, ObPropertyImpl.of().setLongValue(base.getObhash()) );
		props.put( Base.OB_FLAGS, ObPropertyImpl.of().setBigintValue(base.getObflags()) );
		props.put( Base.OB_NAME, ObPropertyImpl.of().setStringValue(base.getObname()) );
		props.put( Base.OB_ALIAS, ObPropertyImpl.of().setStringValue(base.getObalias()) );
		props.put( Base.OB_TITLE, ObPropertyImpl.of().setStringValue(base.getObtitle()) );
		props.put( Base.OB_DESCRIPTION, ObPropertyImpl.of().setStringValue(base.getObdescription()) );
		props.put( Base.OB_ROOT, ObPropertyImpl.of().setStringValue(base.getObroot()) );
		props.put( Base.OB_MIME, ObPropertyImpl.of().setStringValue(base.getObmime()) );
		props.put( Base.OB_DATA, ObPropertyImpl.of().setStringValue(base.getObdata()) );
		props.put( Base.OB_URI, ObPropertyImpl.of().setStringValue(base.getOburi()) );
		props.put( Base.OB_LINK, ObPropertyImpl.of().setStringValue(base.getOblink()) );
		
		return props;
	}

	/**
	 * @param base
	 * @return
	 */
	public static Map<String,Object> getObjectMapping(Base base) {
		
		Map<String,Object> props = new HashMap<String,Object>();
		props.put( Base.OB_ID, new Long(base.getObid()) );
		props.put( Base.OB_GUID, new Long(base.getObguid()) );
		props.put( Base.OB_UUID, base.getObuuid() );
		props.put( Base.OB_CTIME, base.getObctime() );
		props.put( Base.OB_UTIME, base.getObutime() );
		props.put( Base.OB_HISTORY, base.getObhistory() );
		props.put( Base.OB_HASH, new Long(base.getObhash()) );
		props.put( Base.OB_FLAGS, base.getObflags() );
		props.put( Base.OB_NAME, base.getObname() );
		props.put( Base.OB_ALIAS, base.getObalias() );
		props.put( Base.OB_TITLE, base.getObtitle() );
		props.put( Base.OB_DESCRIPTION, base.getObdescription() );
		props.put( Base.OB_ROOT, base.getObroot() );
		props.put( Base.OB_MIME, base.getObmime() );
		props.put( Base.OB_DATA, base.getObdata() );
		props.put( Base.OB_URI, base.getOburi() );
		props.put( Base.OB_LINK, base.getOblink() );
		
		return props;
	}

	/**
	 * @param props
	 * @return
	 */
	public static Base getByObjectMapping(Map<String,Object> props) {
		
		Base base = new BaseImpl();
		base.setObid( (Long)props.get( Base.OB_ID ) );
		base.setObguid( (Long)props.get( Base.OB_GUID ) );
		base.setObuuid( (String)props.get( Base.OB_UUID ) );
		base.setObctime( (GregorianCalendar)props.get( Base.OB_CTIME ) );
		base.setObutime( (GregorianCalendar)props.get( Base.OB_UTIME ) );
		base.setObhistory( (String)props.get( Base.OB_HISTORY ) );
		base.setObhash( (Long)props.get( Base.OB_HASH ) );
		base.setObflags( (BigInteger)props.get( Base.OB_FLAGS ) );
		base.setObname( (String)props.get( Base.OB_NAME ) );
		base.setObalias( (String)props.get( Base.OB_ALIAS ) );
		base.setObtitle( (String)props.get( Base.OB_TITLE ) );
		base.setObdescription( (String)props.get( Base.OB_DESCRIPTION ) );
		base.setObroot( (String)props.get( Base.OB_ROOT ) );
		base.setObmime( (String)props.get( Base.OB_MIME ) );
		base.setObdata( (String)props.get( Base.OB_DATA ) );
		base.setOburi( (String)props.get( Base.OB_URI ) );
		base.setOblink( (String)props.get( Base.OB_LINK ) );
		
		return base;
	}
	
	/**
	 * @param props
	 * @param propertyName
	 * @return
	 */
	public static BigInteger getBigintValue(Map<String,ObProperty> props, String propertyName) {
		ObProperty prop = props.get(propertyName);
		return prop==null ? null : prop.getBigintValue();
	}
	
	/**
	 * @param props
	 * @param propertyName
	 * @return
	 */
	public static BigDecimal getBigDecimalValue(Map<String,ObProperty> props, String propertyName) {
		ObProperty prop = props.get(propertyName);
		return prop==null ? null : prop.getBigdecimalValue();
	}
	
	/**
	 * @param props
	 * @param propertyName
	 * @return
	 */
	public static Boolean isBooleanValue(Map<String,ObProperty> props, String propertyName) {
		ObProperty prop = props.get(propertyName);
		return prop==null ? null : prop.getBooleanValue();
	}
	
	/**
	 * @param props
	 * @param propertyName
	 * @return
	 */
	public static Long getLongValue(Map<String,ObProperty> props, String propertyName) {
		ObProperty prop = props.get(propertyName);
		return prop==null ? null : prop.getLongValue();
	}
	
	/**
	 * @param props
	 * @param propertyName
	 * @return
	 */
	public static Double getDoubleValue(Map<String,ObProperty> props, String propertyName) {
		ObProperty prop = props.get(propertyName);
		return prop==null ? null : prop.getDoubleValue();
	}
	
	/**
	 * @param props
	 * @param propertyName
	 * @return
	 */
	public static String getStringValue(Map<String,ObProperty> props, String propertyName) {
		ObProperty prop = props.get(propertyName);
		return prop==null ? null : prop.getStringValue();
	}
	
	/**
	 * @param props
	 * @param propertyName
	 * @return
	 */
	public static byte[] getByteaValue(Map<String,ObProperty> props, String propertyName) {
		ObProperty prop = props.get(propertyName);
		return prop==null ? null : prop.getByteaValue();
	}
}
