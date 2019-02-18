package javaMathStuff;

public class PrimeMine {
    public static void main( String[] args ) {
	int minNum = 0, maxNum = 1;
	// Check if there are enough arguments
	if ( args.length < 1 ) {
	    System.out.println( "Please run with the following arguments:" );
	    System.out.println( "max(int)" );
	    System.exit( 1 );
	} else {
	    try {
		maxNum = Integer.parseInt( args[0] );
	    } catch ( Exception e ) {
		System.out.println( e );
		System.exit( 1 );
	    }
	}
	// Check if file was given
	String filename = "primenums.txt";
	if ( args.length > 1 ) {
	    filename = args[1];
	}
	// Create math object
	MathLib math = new MathLib();
	// Loop througha
	for ( int i = minNum; i <= maxNum; i++ ) {
	    if ( math.isPrime( i ) ) {
		System.out.println( i );
	    }
	}
    }
}
