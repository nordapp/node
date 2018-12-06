package org.i3xx.node.domain;

import java.util.Map;

public class ItemImpl implements Item {
	
	/**  */
	private Map<String, ObProperty> properties;
	
	/**  */
	private Map<String, Node> nodes;
	
	/**
	 * @return
	 */
	public static Item of() {
		return new ItemImpl();
	}
	
	/**
	 * 
	 */
	public ItemImpl() {
		properties = null;
		nodes = null;
	}
	
	@Override
	public Map<String, ObProperty> getProperties() {
		return properties;
	}

	@Override
	public Item setProperties(Map<String, ObProperty> props) {
		this.properties = props;
		return this;
	}

	@Override
	public Map<String, Node> getNodes() {
		return nodes;
	}

	@Override
	public Item setNodes(Map<String, Node> nodes) {
		this.nodes = nodes;
		return this;
	}

	@Override
	public Item put(String key, Node node) {
		nodes.put(key, node);
		return this;
	}

	@Override
	public Item put(String key, ObProperty prop) {
		properties.put(key, prop);
		return this;
	}
	
    /* (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if(!(o instanceof Item))
        	return false;
        Item i = (Item)o;
        if( eq(nodes, i.getNodes()) && eq(properties, i.getProperties()))
        	return true;
        
    	return false;
    }
    
    /*
     * 
     */
    private boolean eq(Map<String, ?> a, Map<String, ?> b) {
    	return (a==null && b==null) ? true : //both are null
    		(a==null || b==null) ? false : //one of them is not null
    			a.equals(b);
    }
    
    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    public int hashCode() {
    	final int prime = 31;
    	int h = 0;
    	h = prime * h + ( (nodes==null) ? 0 : nodes.hashCode() );
    	h = prime * h + ( (properties==null) ? 0 : properties.hashCode() );
    	return h;
    }
}
