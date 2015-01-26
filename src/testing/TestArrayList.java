package testing;
import code.*;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class TestArrayList {
	private ArrayList fullList;
	private ArrayList emptyList;
	protected ReturnObject result;

	@Before
	public void before() {
		//Like a constructor
		this.fullList = new ArrayList(3);
		this.emptyList = new ArrayList(0);
		this.result = new ReturnObjectImpl();
		//Add a few items to full List
		this.fullList.add(0,"John");
		this.fullList.add(0,5);
		this.fullList.add("Testing");
		this.fullList.add("Birkbeck");
		this.fullList.add(3);
	}
	
	@Test
	public void testError_OOB_Neg_Get() {
		assertEquals(ErrorMessage.INDEX_OUT_OF_BOUNDS, this.fullList.get(-1).getReturnValue());
	}
	
	@Test
	public void testError_OOB_Large_Get() {
		assertEquals(ErrorMessage.INDEX_OUT_OF_BOUNDS, this.fullList.get(7).getReturnValue());
	}
	
	@Test
	public void testError_OOB_Neg_Remove() {
		assertEquals(ErrorMessage.INDEX_OUT_OF_BOUNDS, this.fullList.remove(-1).getReturnValue());
	}
	
	@Test
	public void testError_OOB_Large_Remove() {
		assertEquals(ErrorMessage.INDEX_OUT_OF_BOUNDS, this.fullList.remove(7).getReturnValue());
	}	

	@Test
	public void testError_Empty_Get() {
		assertEquals(ErrorMessage.EMPTY_STRUCTURE, this.emptyList.get(0).getReturnValue());
	}
	
	@Test
	public void testError_Empty_Remove() {
		assertEquals(ErrorMessage.EMPTY_STRUCTURE, this.emptyList.remove(0).getReturnValue());
	}

	@Test
	public void testError_EnterNull_NoInDeces() {
		assertEquals(ErrorMessage.INVALID_ARGUMENT, this.fullList.add(null).getReturnValue());
	}

	@Test
	public void testError_EnterNull_WithIndeces() {
		assertEquals(ErrorMessage.INVALID_ARGUMENT, this.fullList.add(0,null).getReturnValue());
	}	
	@Test
	public void testGet() {
		assertEquals("John",this.fullList.get(1).getReturnValue());
	}

	@Test
	public void testRemove() {
		assertEquals(5,this.fullList.remove(0).getReturnValue());
	}
	
	@Test
	public void testAdd_NoIndeces() {
		assertEquals(null,this.fullList.add("testing new").getReturnValue());
	}
	
	@Test
	public void testAdd_With_Indeces() {
		assertEquals(null,this.fullList.add(2,"testing new").getReturnValue());
	}
	
	@Test
	public void testAdd_At_End_With_Indeces() {
		//this.fullList.printArr();
		assertEquals(null,this.fullList.add(7,"final add").getReturnValue());

	}	
	
	
	@Test
	public void testEmpty_Empty() {
		assertTrue(this.emptyList.isEmpty());
	}
	
	@Test
	public void testEmpty_Full() {
		assertFalse(this.fullList.isEmpty());
	}
	
	@Test
	public void testSize_Full() {
		assertEquals(7,this.fullList.size());
	}	

	@Test
	public void testSize_Empty() {
		assertEquals(0,this.emptyList.size());
	}		
	
}