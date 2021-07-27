package felix.lin.explore.data.box;

/**
 * 
 * This is an easy storage for any instance.
 *
 */
public class ObjectBox {
	
	private final Object any;
	
	/**
	 * 
	 * @param any anything you want
	 * 
	 */
	public ObjectBox( Object any ) {
		
		this.any = any;
		
	}
	
	/**
	 * 
	 * @return The instance you put in this box. But
	 * please remember, for most cases this object
	 * will need to be casted to its original type.
	 * 
	 */
	public Object get() {
		
		return any;
		
	}
	
}
