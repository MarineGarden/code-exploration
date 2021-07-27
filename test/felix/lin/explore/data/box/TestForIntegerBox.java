package felix.lin.explore.data.box;

public class TestForIntegerBox {

	public static void main(String[] args) {
		
		IntegerBox test = new IntegerBox( 2021 );
		System.out.println( test.get().equals( 2021 ) );
		System.out.println( Integer.valueOf( test.getIntegerInside() + 1 ).equals( 2022 ) );
		
	}
	
}
