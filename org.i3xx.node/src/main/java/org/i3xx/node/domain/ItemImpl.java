package org.i3xx.node.domain;

import java.util.Map;

public class ItemImpl implements Item {
	
	/**  */
	private Map<String, ObProperty> properties;
	
	/**  */
	private Map<String, Node> nodes;
	
	public ItemImpl() {
		properties = null;
		nodes = null;
	}
	
	@Override
	public Map<String, ObProperty> getProperties() {
		return properties;
	}

	@Override
	public void setProperties(Map<String, ObProperty> props) {
		this.properties = props;
	}

	@Override
	public Map<String, Node> getNodes() {
		return nodes;
	}

	@Override
	public void setNodes(Map<String, Node> nodes) {
		this.nodes = nodes;
	}

}
