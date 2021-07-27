package felix.lin.explore.data.box;

/**
 * 
 * This is an easy storage for a integer.
 *
 */
public class IntegerBox extends ObjectBox {

	/**
	 * 
	 * @param anyValue You can put any integer here.
	 * 
	 */
	public IntegerBox( Integer anyValue ) {
		
		super( anyValue );
		
	}
	
	/**
	 * 
	 * @return your storage
	 * 
	 */
	public Integer getIntegerInside() {
		
		Object value = get();
		return ( Integer )( value );
		
	}

}
