package testing;
import code.*;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class TestSampleableList {
	SampleableList testList;
	SampleableList emptyList;
	
	ReturnObject result;
	
	@Before
	public void before() {
		//Constructor
		this.testList = new SampleableListImpl();
		this.emptyList = new SampleableListImpl();
		this.result = new ReturnObjectImpl();
		this.testList.add("Test complete");		
		this.testList.add(39);		
		this.testList.add(37);
		this.testList.add("thirty eight");
		this.testList.add(true);
		this.testList.add(36);	
	}
	
	@Test
	public void testItems_Size() {
		//Make sure it contains the right number of items
		SampleableList list = this.testList.sample(); 
		assertEquals(3, list.size());
	}

	@Test
	public void testItems_getFirst() {
		//Make sure it contains the right number of items
		SampleableList list = this.testList.sample(); 
		assertEquals("Test complete", list.remove(0).getReturnValue());
	}

	@Test
	public void testItems_getSecond() {
		//Make sure it contains the right number of items
		SampleableList list = this.testList.sample(); 
		assertEquals(37, list.remove(1).getReturnValue());
	}		

	@Test
	public void testItems_getThird() {
		//Make sure it contains the right number of items
		SampleableList list = this.testList.sample(); 
		assertEquals(true, list.remove(2).getReturnValue());
	}		
	@Test
	public void testEmpty() {
		//Make sure it returns an error 
		SampleableList list = this.emptyList.sample(); 
		assertEquals(ErrorMessage.EMPTY_STRUCTURE, list.remove(2).getReturnValue());
	}		
}