package testing;
import code.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestFunctionalLinkedList {
	private FunctionalLinkedList fullList;
	private FunctionalLinkedList emptyList;

	protected ReturnObject result;

	@Before
	public void before() {
		//Like a constructor
		this.fullList = new FunctionalLinkedList();
		this.emptyList = new FunctionalLinkedList();

		this.result = new ReturnObjectImpl();
		//Add a few items to full List
		this.fullList.add(0,"John");
		this.fullList.add(0,5);
		this.fullList.add("Testing");
		this.fullList.add("Birkbeck");
		this.fullList.add(3);
	}
	
	@Test
	public void testHead_Empty() {
		assertEquals(ErrorMessage.EMPTY_STRUCTURE, this.emptyList.head().getReturnValue());
	}
		
	@Test
	public void testHead_Value() {
		assertEquals(5, this.fullList.head().getReturnValue());
	}
	
	@Test
	public void testHead_Remove_Then_Get_Head() {
		this.fullList.remove(0);
		assertEquals("John", this.fullList.head().getReturnValue());
	}
	
	@Test
	public void testRest() {
		FunctionalLinkedList testList = (FunctionalLinkedList) this.fullList.rest();
		assertEquals("John", testList.get(0).getReturnValue());
	}

	@Test
	public void testHead_From_Rest() {
		FunctionalLinkedList testList = (FunctionalLinkedList) this.fullList.rest();
		assertEquals("John", testList.head().getReturnValue());
	}		
	
}