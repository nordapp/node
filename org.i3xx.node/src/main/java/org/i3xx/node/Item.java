package org.i3xx.node;

import java.util.Map;

public interface Item {

	/**
	 * @return
	 */
	Map<String,ObProperty> getProperties();
	
	/**
	 * @param props
	 */
	void setProperties(Map<String,ObProperty> props);
	
	/**
	 * @return
	 */
	Map<String,Node> getNodes();
	
	/**
	 * @param nodes
	 */
	void setNodes(Map<String,Node> nodes);

}
