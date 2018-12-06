package org.i3xx.node.domain;

import java.util.Map;

public interface Item {

	/**
	 * @return
	 */
	Map<String,ObProperty> getProperties();
	
	/**
	 * @param props
	 */
	Item setProperties(Map<String,ObProperty> props);
	
	/**
	 * @return
	 */
	Map<String,Node> getNodes();
	
	/**
	 * @param nodes
	 */
	Item setNodes(Map<String,Node> nodes);
	
	/**
	 * @param key
	 * @param prop
	 * @return
	 */
	Item put(String key, ObProperty prop);
	
	/**
	 * @param key
	 * @param node
	 * @return
	 */
	Item put(String key, Node node);
}
