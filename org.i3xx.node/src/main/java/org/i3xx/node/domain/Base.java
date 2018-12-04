package org.i3xx.node.domain;

import java.math.BigInteger;
import java.util.GregorianCalendar;

/**
 * The object represented by Base is primary represented by a map with the
 * definition Map<String,Object>. There should be no object mapping except
 * one is necessary.
 * 
 * Use the constants to get the value from the map.
 * 
 * @author green
 *
 */
public interface Base {
	
	/** The id */
	public static final String OB_ID = "ob:id";
	
	/** The guid */
	public static final String OB_GUID = "ob:guid";
	
	/** The uuid */
	public static final String OB_UUID = "ob:uuid";
	
	/** The creation time */
	public static final String OB_CTIME = "ob:ctime";
	
	/** The update time */
	public static final String OB_UTIME = "ob:utime";
	
	/** The history (uuid) */
	public static final String OB_HISTORY = "ob:history";
	
	/** The hash */
	public static final String OB_HASH = "ob:hash";
	
	/** The flags */
	public static final String OB_FLAGS = "ob:flags";
	
	/** The name */
	public static final String OB_NAME = "ob:name";
	
	/** The alias */
	public static final String OB_ALIAS = "ob:alias";
	
	/** The title */
	public static final String OB_TITLE = "ob:title";
	
	/** The description */
	public static final String OB_DESCRIPTION = "ob:description";
	
	/** The root */
	public static final String OB_ROOT = "ob:root";
	
	/** The mimetype */
	public static final String OB_MIME = "ob:mime";
	
	/** The data */
	public static final String OB_DATA = "ob:data";
	
	/** The uri */
	public static final String OB_URI = "ob:uri";
	
	/** The link */
	public static final String OB_LINK = "ob:link";
	
	/**
	 * @return the obid
	 */
	Long getObid();

	/**
	 * @param obid the obid to set
	 */
	void setObid(Long obid);

	/**
	 * @return the obguid
	 */
	Long getObguid();

	/**
	 * @param obguid the obguid to set
	 */
	void setObguid(Long obguid);

	/**
	 * @return the obuuid
	 */
	String getObuuid();

	/**
	 * @return the obctime
	 */
	GregorianCalendar getObctime();

	/**
	 * @param obctime the obctime to set
	 */
	void setObctime(GregorianCalendar obctime);

	/**
	 * @return the obutime
	 */
	GregorianCalendar getObutime();

	/**
	 * @param obutime the obutime to set
	 */
	void setObutime(GregorianCalendar obutime);

	/**
	 * @param obuuid the obuuid to set
	 */
	void setObuuid(String obuuid);

	/**
	 * @return the obhistory
	 */
	String getObhistory();

	/**
	 * @param obhistory the obhistory to set
	 */
	void setObhistory(String obhistory);
	
	/**
	 * @return the obhash
	 */
	Long getObhash();

	/**
	 * @param obhash the obhash to set
	 */
	void setObhash(Long obhash);

	/**
	 * @return the obflags
	 */
	BigInteger getObflags();

	/**
	 * @param obflags the obflags to set
	 */
	void setObflags(BigInteger obflags);

	/**
	 * @return the obname
	 */
	String getObname();

	/**
	 * @param obname the obname to set
	 */
	void setObname(String obname);

	/**
	 * @return the obalias
	 */
	String getObalias();

	/**
	 * @param obalias the obalias to set
	 */
	void setObalias(String obalias);

	/**
	 * @return the obtitle
	 */
	String getObtitle();

	/**
	 * @param obtitle the obtitle to set
	 */
	void setObtitle(String obtitle);

	/**
	 * @return the obdescription
	 */
	String getObdescription();

	/**
	 * @param obdescription the obdescription to set
	 */
	void setObdescription(String obdescription);

	/**
	 * @return the obroot
	 */
	String getObroot();

	/**
	 * @param obroot the obroot to set
	 */
	void setObroot(String obroot);
	
	/**
	 * @return the obmime
	 */
	String getObmime();

	/**
	 * @param obmime the obmime to set
	 */
	void setObmime(String obmime);

	/**
	 * @return the obdata
	 */
	String getObdata();

	/**
	 * @param obdata the obdata to set
	 */
	void setObdata(String obdata);

	/**
	 * @return the oburi
	 */
	String getOburi();

	/**
	 * @param oburi the oburi to set
	 */
	void setOburi(String oburi);

	/**
	 * @return the oblink
	 */
	String getOblink();

	/**
	 * @param oblink the oblink to set
	 */
	void setOblink(String oblink);
	
	/**
	 * @return the linkuuid
	 */
	String getLinkuuid();

	/**
	 * @param linkuuid the linkuuid to set
	 */
	void setLinkuuid(String linkuuid);
	
	/**
	 * The refresh
	 */
	void refresh();
}
