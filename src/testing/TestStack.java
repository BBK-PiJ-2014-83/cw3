package testing;
import code.*;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class TestStack{
	ReturnObject result;
	StackImpl stackArray;
	StackImpl stackList;
	StackImpl stackArrayEmpty;
	StackImpl stackListEmpty;
	@Before
	public void before() {
		//Constructor
		this.result = new ReturnObjectImpl();
		ArrayList testListArray = new ArrayList(0);
		ArrayList emptyListArray = new ArrayList(0);	
		stackArrayEmpty = new StackImpl(emptyListArray);		
		stackArray = new StackImpl(testListArray);
		stackArray.push("John");
		stackArray.push(31);
		stackArray.push(true);
		stackArray.push("testing");		
		LinkedList testListLinked = new LinkedList();
		LinkedList emptyListLinked = new LinkedList();
		stackListEmpty = new StackImpl(emptyListLinked);
		stackList = new StackImpl(testListLinked);
		stackList.push("John");
		stackList.push(31);
		stackList.push(true);
		stackList.push("testing");
		
	}
	
	@Test
	public void testPop_Array() {
		assertEquals("testing", this.stackArray.pop().getReturnValue());
	}
	
	@Test
	public void testPop_List() {
		assertEquals("testing", this.stackList.pop().getReturnValue());
	}

	@Test
	public void testError_Empty_Pop_Array() {
		assertEquals(ErrorMessage.EMPTY_STRUCTURE, this.stackArrayEmpty.pop().getReturnValue());
	}
	
	@Test
	public void testError_Empty_Pop_List() {
		assertEquals(ErrorMessage.EMPTY_STRUCTURE, this.stackArrayEmpty.pop().getReturnValue());
	}	

	@Test
	public void testError_Empty_Top_Array() {
		assertEquals(ErrorMessage.EMPTY_STRUCTURE, this.stackArrayEmpty.top().getReturnValue());
	}

	@Test
	public void testError_Empty_Top_List() {
		assertEquals(ErrorMessage.EMPTY_STRUCTURE, this.stackArrayEmpty.top().getReturnValue());
	}

	@Test
	public void testEmpty_List() {
		assertTrue(this.stackListEmpty.isEmpty());
	}

	@Test
	public void testFull_List() {
		assertFalse(this.stackList.isEmpty());
	}	

	@Test
	public void testEmpty_Array() {
		assertTrue(this.stackArrayEmpty.isEmpty());
	}

	@Test
	public void testFull_Array() {
		assertFalse(this.stackArray.isEmpty());
	}		
	@Test
	public void testSize_List() {
		assertEquals(4, this.stackList.size());
	}	

	@Test
	public void testArray_List() {
		assertEquals(4, this.stackArray.size());
	}	

	

}