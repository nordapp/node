package org.i3xx.node.domain;

public class NodeImpl implements Node {
	
	/**  */
	private Item itemValue;
	
	/**  */
	private String type;
	
	public NodeImpl() {
		itemValue = null;
		type = null;
	}
	
	@Override
	public Item getItemValue() {
		return itemValue;
	}

	@Override
	public Node setItemValue(Item itemValue) {
		this.itemValue = itemValue;
		return this;
	}

	@Override
	public String getType() {
		return type;
	}

	@Override
	public Node setType(String type) {
		this.type = type;
		return this;
	}

}
