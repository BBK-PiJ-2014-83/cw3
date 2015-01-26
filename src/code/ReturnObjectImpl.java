package code;
/**
 * A wrapper containing either an object (the result of an operation
 * on a data structure) or an error value. It contains the a flag to tell whether there has been an error and a details item which will tell you the details of that error
 *
 * @author John Spears
 */
public class ReturnObjectImpl implements ReturnObject {
	private boolean error;
	private ErrorMessage errorDetails; 
	private Object item;	
	
	/**
		This method creates the object of type ReturnObject. When it is created it either has an error or not and the number returned is set 
		if at all.
		
	*/
	public ReturnObjectImpl() {
		this.error = false;
		this.item = null;
		this.errorDetails = ErrorMessage.NO_ERROR;
	}
	
	public void setError(boolean error) {
		this.error = error;
	}
	
	
	public void setItem(Object item) {
		this.item = item;
	}
	
	public void setErrorDetails(ErrorMessage errorDetails) {
		this.errorDetails = errorDetails;
	}
	/**
	 * Returns whether there has been an error
	 * @return whether there has been an error
	 */
	public boolean hasError() {
		return this.error;
	}
	/**
	 * Returns the error message. 
	 * 
	 * This method must return NO_ERROR if and only if
	 * {@hasError} returns false.
	 * 
	 * @return the error message
	 */
	public ErrorMessage getError() {
		return this.errorDetails;
	}
	/**
	 * Returns the object wrapped in this ReturnObject, i.e. the
	 * result of the operation if it was successful, or null if
	 * there has been error.
	 * 
	 * Note that the output of this method must be null if {@see
	 * hasError} returns true, but the opposite is not true: if
	 * {@see hasError} returns false, this method may or may not
	 * return null.
	 * 
	 * @return the return value from the method or null if there has been an
	 *         error
	 */
	public Object getReturnValue() {
		if (this.hasError() == false) {
			return this.item;
		} else {
			return this.errorDetails;
		}
	}

}