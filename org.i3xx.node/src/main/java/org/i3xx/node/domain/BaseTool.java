package org.i3xx.node.domain;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public final class BaseTool {
	
	/**
	 * @return
	 */
	public static Map<String, Node> getNodeMap() {
		return new LinkedHashMap<String, Node>();
	}
	
	/**
	 * @return
	 */
	public static Map<String,ObProperty> getPropertyMap() {
		return new HashMap<String,ObProperty>();
	}
	
	/**
	 * @param props
	 * @return
	 */
	public static Base getObject(Map<String,ObProperty> props) {
		
		Base base = new BaseImpl();
		base.setObid( getLongValue( props, Base.OB_ID ) );
		base.setObguid( getLongValue( props, Base.OB_GUID ) );
		base.setObuuid( getStringValue( props, Base.OB_UUID ) );
		base.setObctime( getCalendarValue( props, Base.OB_CTIME ) );
		base.setObutime( getCalendarValue(props, Base.OB_UTIME) );
		base.setObhistory( getStringValue( props, Base.OB_HISTORY ) );
		base.setObhash( getLongValue( props, Base.OB_HASH ) );
		base.setObflags( getBigintValue( props, Base.OB_FLAGS ) );
		base.setObname( getStringValue( props, Base.OB_NAME ) );
		base.setObalias( getStringValue( props, Base.OB_ALIAS ) );
		base.setObtitle( getStringValue( props, Base.OB_TITLE ) );
		base.setObdescription( getStringValue( props, Base.OB_DESCRIPTION ) );
		base.setObroot( getStringValue( props, Base.OB_ROOT ) );
		base.setObmime( getStringValue( props, Base.OB_MIME ) );
		base.setObdata( getStringValue( props, Base.OB_DATA ) );
		base.setOburi( getStringValue( props, Base.OB_URI ) );
		base.setOblink( getStringValue( props, Base.OB_LINK ) );
		
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
	public static Map<String,ObProperty> getMapping(Base base, boolean allProperties) {
		
		if(allProperties)
			return getMapping(base);
		
		Map<String,ObProperty> props = new HashMap<String,ObProperty>();
		if(base.getObid()!=null)
			props.put( Base.OB_ID, ObPropertyImpl.of().setLongValue(base.getObid()) );
		if(base.getObguid()!=null)
			props.put( Base.OB_GUID, ObPropertyImpl.of().setLongValue(base.getObguid()) );
		if(base.getObuuid()!=null)
			props.put( Base.OB_UUID, ObPropertyImpl.of().setStringValue(base.getObuuid()) );
		if(base.getObctime()!=null)
			props.put( Base.OB_CTIME, ObPropertyImpl.of().setCalendarValue(base.getObctime()) );
		if(base.getObutime()!=null)
			props.put( Base.OB_UTIME, ObPropertyImpl.of().setCalendarValue(base.getObutime()) );
		if(base.getObhistory()!=null)
			props.put( Base.OB_HISTORY, ObPropertyImpl.of().setStringValue(base.getObhistory()) );
		if(base.getObhash()!=null)
			props.put( Base.OB_HASH, ObPropertyImpl.of().setLongValue(base.getObhash()) );
		if(base.getObflags()!=null)
			props.put( Base.OB_FLAGS, ObPropertyImpl.of().setBigintValue(base.getObflags()) );
		if(base.getObname()!=null)
			props.put( Base.OB_NAME, ObPropertyImpl.of().setStringValue(base.getObname()) );
		if(base.getObalias()!=null)
			props.put( Base.OB_ALIAS, ObPropertyImpl.of().setStringValue(base.getObalias()) );
		if(base.getObtitle()!=null)
			props.put( Base.OB_TITLE, ObPropertyImpl.of().setStringValue(base.getObtitle()) );
		if(base.getObdescription()!=null)
			props.put( Base.OB_DESCRIPTION, ObPropertyImpl.of().setStringValue(base.getObdescription()) );
		if(base.getObroot()!=null)
			props.put( Base.OB_ROOT, ObPropertyImpl.of().setStringValue(base.getObroot()) );
		if(base.getObmime()!=null)
			props.put( Base.OB_MIME, ObPropertyImpl.of().setStringValue(base.getObmime()) );
		if(base.getObdata()!=null)
			props.put( Base.OB_DATA, ObPropertyImpl.of().setStringValue(base.getObdata()) );
		if(base.getOburi()!=null)
			props.put( Base.OB_URI, ObPropertyImpl.of().setStringValue(base.getOburi()) );
		if(base.getOblink()!=null)
			props.put( Base.OB_LINK, ObPropertyImpl.of().setStringValue(base.getOblink()) );
		
		return props;
	}

	/**
	 * @param base
	 * @return
	 */
	public static Map<String,Object> getObjectMapping(Base base) {
		
		Map<String,Object> props = new HashMap<String,Object>();
		props.put( Base.OB_ID, base.getObid() );
		props.put( Base.OB_GUID, base.getObguid() );
		props.put( Base.OB_UUID, base.getObuuid() );
		props.put( Base.OB_CTIME, base.getObctime() );
		props.put( Base.OB_UTIME, base.getObutime() );
		props.put( Base.OB_HISTORY, base.getObhistory() );
		props.put( Base.OB_HASH, base.getObhash() );
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
	 * @param base
	 * @param allProperties
	 * @return
	 */
	public static Map<String,Object> getObjectMapping(Base base, boolean allProperties) {
		
		if(allProperties)
			return getObjectMapping(base);
		
		Map<String,Object> props = new HashMap<String,Object>();
		if(base.getObid()!=null)
			props.put( Base.OB_ID, base.getObid() );
		if(base.getObguid()!=null)
			props.put( Base.OB_GUID, base.getObguid() );
		if(base.getObuuid()!=null)
			props.put( Base.OB_UUID, base.getObuuid() );
		if(base.getObctime()!=null)
			props.put( Base.OB_CTIME, base.getObctime() );
		if(base.getObutime()!=null)
			props.put( Base.OB_UTIME, base.getObutime() );
		if(base.getObhistory()!=null)
			props.put( Base.OB_HISTORY, base.getObhistory() );
		if(base.getObhash()!=null)
			props.put( Base.OB_HASH, base.getObhash() );
		if(base.getObflags()!=null)
			props.put( Base.OB_FLAGS, base.getObflags() );
		if(base.getObname()!=null)
			props.put( Base.OB_NAME, base.getObname() );
		if(base.getObalias()!=null)
			props.put( Base.OB_ALIAS, base.getObalias() );
		if(base.getObtitle()!=null)
			props.put( Base.OB_TITLE, base.getObtitle() );
		if(base.getObdescription()!=null)
			props.put( Base.OB_DESCRIPTION, base.getObdescription() );
		if(base.getObroot()!=null)
			props.put( Base.OB_ROOT, base.getObroot() );
		if(base.getObmime()!=null)
			props.put( Base.OB_MIME, base.getObmime() );
		if(base.getObdata()!=null)
			props.put( Base.OB_DATA, base.getObdata() );
		if(base.getOburi()!=null)
			props.put( Base.OB_URI, base.getOburi() );
		if(base.getOblink()!=null)
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
	public static GregorianCalendar getCalendarValue(Map<String,ObProperty> props, String propertyName) {
		ObProperty prop = props.get(propertyName);
		return prop==null ? null : prop.getCalendarValue();
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
	
	// --------------------------------------------------------------------
	// Static tools
	// --------------------------------------------------------------------
	
	/**
	 * @param base
	 * @return
	 */
	public static String toString(Base base) {
		return toString( getObjectMapping(base) );
	}
	
	/**
	 * @param props
	 * @return
	 */
	public static String toString(Map<String,Object> props) {
		StringBuffer buf = new StringBuffer();
		Iterator<Map.Entry<String,Object>> iter = props.entrySet().iterator();
		while(iter.hasNext()) {
			Map.Entry<String,Object> elem = iter.next();
			if(buf.length()>0) {
				buf.append(',');
				buf.append(' ');
			}
			buf.append('"');
			buf.append(elem.getKey());
			buf.append('"');
			buf.append(':');
			buf.append('"');
			buf.append(elem.getValue());
			buf.append('"');
		}
		
		return buf.toString();
	}

	/**
	 * Replace the '.' with the id
	 * protect with '\\'
	 * 
	 * @param param The parameter
	 * @param id The id to insert
	 */
	public static final String setCurrentId(String param, String id) {
		StringBuffer buf = new StringBuffer();
		char[] cc = param.toCharArray();
		
		for(int i=0;i<cc.length;i++){
			//protected char
			if(cc[i]=='\\') {
				if((i+1)<cc.length){
					i++;
					buf.append(cc[i]);
				}//fi
				//else does nothing
			}
			//replace '.'
			else if(cc[i]=='.'){
				buf.append(id);
			}
			//any other character
			else{
				buf.append(cc[i]);
			}//fi
		}//for
		
		return buf.toString();
	}
}
