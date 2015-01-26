package testing;
import code.*;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestImprovedStackImpl {
	ImprovedStack testStack;
	ReturnObject result;
	@Before
	public void before() {
		//Constructor
		this.testStack = new ImprovedStackImpl();
		this.result = new ReturnObjectImpl();
		this.testStack.push("Test complete");		
		this.testStack.push(36);		
		this.testStack.push(37);
		this.testStack.push("thirty eight");
		this.testStack.push(true);
		this.testStack.push(36);	
	}
	
	@Test
	public void testPop() {
		assertEquals(36, this.testStack.pop().getReturnValue());
	}

	@Test
	public void testPop_Again() {
		this.testStack.pop();
		assertEquals(true, this.testStack.pop().getReturnValue());
	}	
	
	@Test
	public void testReverse() {
		ImprovedStack reverseStack = this.testStack.reverse();	
		assertEquals("Test complete", reverseStack.pop().getReturnValue());
	}

	@Test
	public void testRemove() {
		this.testStack.remove(36);
		assertEquals(true, this.testStack.pop().getReturnValue());
	}
	
	@Test
	public void testRemove_All() {
		this.testStack.remove(36);
		this.testStack.remove(37);
		this.testStack.remove(true);
		this.testStack.remove("thirty eight");
		this.testStack.remove("Test complete");
		assertTrue(this.testStack.isEmpty());	
	}
	
	@Test
	public void testSize() {
		assertEquals(6,this.testStack.size());	
	}	
	

}