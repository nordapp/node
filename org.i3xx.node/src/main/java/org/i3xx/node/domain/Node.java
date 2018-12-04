package org.i3xx.node.domain;

public interface Node {
	
	/**
	 * @return the itemValue
	 */
	Item getItemValue();
	
	/**
	 * @param itemValue The itemValue to set
	 */
	Node setItemValue(Item itemValue);
	
	/**
	 * @return the type
	 */
	String getType();
	
	/**
	 * @param type The type to set
	 */
	Node setType(String type);
}
