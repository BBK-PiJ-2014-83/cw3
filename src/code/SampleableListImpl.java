package code;
/**
 * A sampleable list can be sampled. It only has one method and extends on LinkedList rather than ArrayList 
 * 
 * @author John Spears
 */
public class SampleableListImpl extends LinkedList implements SampleableList {
	//using linked list rather than array list as the array list size issue causes confusion
	/**
	 * Returns a list containing the first, third, fifth...
	 * items of this list, or an empty list if the list is empty. 
	 * 
	 * @return a list containing the first, third, fifth... items of this list
	 */	
	public SampleableList sample(){
		SampleableList sampledList = new SampleableListImpl();
		if(!(this.isEmpty())) {
			for(int i = 0; i < this.size(); i++) {
				if((i % 2) == 0) {
					sampledList.add(this.get(i).getReturnValue());
				}
			}
		}
		return sampledList;
	};

}