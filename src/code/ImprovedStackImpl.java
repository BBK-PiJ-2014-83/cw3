package code;
/**
 * An implementation of a stack with additional methods. 
 * 
 * Classes implementing this interface use a LinkedList as the
 * underlying data structure to store the elements on the stack.
 * 
 * @author John Spear
 */
public class ImprovedStackImpl implements ImprovedStack{
	LinkedList objList;
	public ImprovedStackImpl() {
		this.objList = new LinkedList();
	}
	/**
	 * Returns true if the stack is empty, false otherwise. 
	 * 
	 * @return true if the stack is empty, false otherwise. 
	 */	
	public boolean isEmpty() {
		return this.objList.isEmpty();
	}
	/**
	 * Returns the number of items currently in the stack.
	 * 
	 * @return the number of items currently in the stack
	 */	
	public int size() {
		return this.objList.size();
	}
	
	/**
	 * Adds an element at the top of the stack. 
	 * 
	 * @param the new item to be added
	 */
	public void push(Object item) {
		this.objList.add(0,item);
	}
	
	/**
	 * Returns the element at the top of the stack. The element is
	 * removed from the stack.
	 * 
	 * @return If stack is not empty, the item on the top is returned. If the
	 *         stack is empty, an appropriate error.
	 */	
	public ReturnObject pop() {
		return this.objList.remove(0);
	}
	
	/**
	 * Returns the element at the top of the stack. The stack is
	 * left unchanged.
	 * 
	 * @return If stack is not empty, the item on the top is returned. If the
	 *         stack is empty, an appropriate error.
	 */	
	public ReturnObject top() {
		return this.objList.get(0);
	}
	
	/**
	 * Returns a copy of this stack with the items reversed, the top
	 * elements on the original stack is at the bottom of the new
	 * stack and vice versa.
	 * 
	 * @return a copy of this stack with the items reversed. 
	 */	
	public ImprovedStack reverse() {
		ImprovedStackImpl reverseStack = new ImprovedStackImpl();
		for (int i = 0; i < this.size(); i++) {
			reverseStack.push(this.objList.get(i).getReturnValue());
		}
		return reverseStack;
	}
	
	/**
	 * Removes the given object from the stack if it is
	 * there. Multiple instances of the object are all removed.
	 *
	 * Classes implementing this method must use method .equals() to
	 * check whether the item is in the stack or not.
	 * 
	 * @param object the object to remove
	 */	
	public void remove(Object item) {
		for (int i = 0; i < this.size(); i++) {
			if (this.objList.get(i).getReturnValue().equals(item)) {
				this.objList.remove(i);
			}
		}
	}	
}