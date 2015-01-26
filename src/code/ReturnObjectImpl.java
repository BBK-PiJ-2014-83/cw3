package code;
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
	
	public boolean hasError() {
		return this.error;
	}
	
	public ErrorMessage getError() {
		return this.errorDetails;
	}
	
	public Object getReturnValue() {
		if (this.hasError() == false) {
			return this.item;
		} else {
			return this.errorDetails;
		}
	}

}