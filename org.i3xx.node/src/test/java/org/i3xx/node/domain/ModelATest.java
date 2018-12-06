package org.i3xx.node.domain;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigInteger;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.Set;

import org.i3xx.util.basic.util.key.UuidTool;
import org.junit.jupiter.api.Test;

class ModelATest {

	@Test
	void testDefinition() {
		
		//
		// Notice equals(Object) and hashCode() !!!
		//
		// The new Long(0) has the hashCode '0'. It has no
		// effect to the hashCode of the Set (or Map).
		//
		
		Set<Object> set = new HashSet<Object>();
		
		assertTrue( set.hashCode()==0 );
		
		set.add( new Long(0) );
		
		assertTrue( set.hashCode()==0 );
		
		Set<Object> setA = new HashSet<Object>();
		
		// Not equals but the same hashCode
		assertFalse( setA.equals(set) );
		assertTrue( setA.hashCode()==set.hashCode() );
		
		set.remove( new Long(0) );
		assertTrue( setA.size()==0 );
		assertTrue( setA.equals(set) );
		assertTrue( setA.hashCode()==set.hashCode() );

	}
	
	@Test
	void testA() {
		Base a = BaseImpl.of()
			.setObid( Long.valueOf(3) )
			.setObguid( Long.valueOf(243) )
			//.setObuuid( UuidTool.getOne() )
			.setObflags(BigInteger.ZERO)
			.setObhistory( null )
			//.setObctime( new GregorianCalendar() )
			.setObname( "Test data" )
			.setObdescription( "This is a dataset for test purposes" );
		
		Item itemB = ItemImpl.of()
				.setProperties(BaseTool.getPropertyMap())
				.put(Base.OB_GUID, ObPropertyImpl.of().setLongValue( Long.valueOf(243) ) )
				//.put(Base.OB_UUID, ObPropertyImpl.of().setStringValue( a.getObuuid() ) )
				//.put(Base.OB_CTIME, ObPropertyImpl.of().setCalendarValue( a.getObctime() ) )
				.put(Base.OB_FLAGS, ObPropertyImpl.of().setBigintValue(BigInteger.ZERO))
				.put(Base.OB_NAME, ObPropertyImpl.of().setStringValue( "Test data" ) )
				.put(Base.OB_DESCRIPTION, ObPropertyImpl.of().setStringValue( "This is a dataset for test purposes" ) )
				.put(Base.OB_ID, ObPropertyImpl.of().setLongValue( Long.valueOf(3) ) )
				.setNodes(BaseTool.getNodeMap());
		
		Base b = BaseTool.getObject(itemB.getProperties());
		
		assertTrue( a.equals(b) );
		assertTrue( a.hashCode()==b.hashCode() );
		
		itemB.getProperties().remove(Base.OB_FLAGS);
		b = BaseTool.getObject(itemB.getProperties());
		
		assertFalse( a.equals(b) );
		assertTrue( a.hashCode()==b.hashCode() );
		
		a.setObflags(null);
		
		assertTrue( a.equals(b) );
		assertTrue( a.hashCode()==b.hashCode() );
	}

	@Test
	void testB() {
		
		Item itemA = ItemImpl.of()
				.setProperties( BaseTool.getMapping(
					BaseImpl.of()
						.setObid( Long.valueOf(3) )
						.setObguid( Long.valueOf(243) )
						.setObuuid( UuidTool.getOne() )
						.setObflags(BigInteger.ZERO)
						.setObhistory( null )
						.setObctime( new GregorianCalendar() )
						.setObname( "Test data" )
						.setObdescription( "This is a dataset for test purposes" ), false
					))
				.setNodes(BaseTool.getNodeMap());
		
		Item itemB = ItemImpl.of()
				.setProperties(BaseTool.getPropertyMap())
				.put(Base.OB_GUID, ObPropertyImpl.of().setLongValue( Long.valueOf(243) ) )
				.put(Base.OB_UUID, ObPropertyImpl.of().setStringValue( itemA.getProperties().get(Base.OB_UUID).getStringValue() ) )
				.put(Base.OB_CTIME, ObPropertyImpl.of().setCalendarValue( itemA.getProperties().get(Base.OB_CTIME).getCalendarValue() ) )
				.put(Base.OB_FLAGS, ObPropertyImpl.of().setBigintValue(BigInteger.ZERO))
				.put(Base.OB_NAME, ObPropertyImpl.of().setStringValue( "Test data" ) )
				.put(Base.OB_DESCRIPTION, ObPropertyImpl.of().setStringValue( "This is a dataset for test purposes" ) )
				.put(Base.OB_ID, ObPropertyImpl.of().setLongValue( Long.valueOf(3) ) )
				.setNodes(BaseTool.getNodeMap());
		
		//the order of the properties doesn't matter - being equal
		assertTrue( itemA.equals(itemB) );
		assertTrue( itemA.hashCode() == itemB.hashCode() );
		
		//but the empty map does - notice the hashCode !!!
		itemB.setNodes(null);
		assertFalse( itemA.equals(itemB) );
		assertTrue( itemA.hashCode() == itemB.hashCode() );
		
		//both maps are null - sic
		itemA.setNodes(null);
		assertTrue( itemA.equals(itemB) );
		assertTrue( itemA.hashCode() == itemB.hashCode() );
	}

}
