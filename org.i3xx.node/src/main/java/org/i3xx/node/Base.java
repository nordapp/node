package org.i3xx.node;

import java.util.GregorianCalendar;

public interface Base {
	
	/**
	 * @return the obid
	 */
	long getObid();

	/**
	 * @param obid the obid to set
	 */
	void setObid(long obid);

	/**
	 * @return the obguid
	 */
	long getObguid();

	/**
	 * @param obguid the obguid to set
	 */
	void setObguid(long obguid);

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
	String getObhash();

	/**
	 * @param obhash the obhash to set
	 */
	void setObhash(String obhash);

	/**
	 * @return the obflags
	 */
	String getObflags();

	/**
	 * @param obflags the obflags to set
	 */
	void setObflags(String obflags);

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

}
