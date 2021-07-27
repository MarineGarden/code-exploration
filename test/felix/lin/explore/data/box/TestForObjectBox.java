package felix.lin.explore.data.box;

public class TestForObjectBox {

	public static void main(String[] args) {

		ObjectBox test = new ObjectBox( "Hello." );
		System.out.println( test.get().equals( "Hello." ) );
		
	}

}
