package javaMathStuff;

public class IsPrime {
    public static void main( String[] args ) {
		int userNum = 1, i = 0;
		// Get integer from arguments
		if ( args.length > i ) {
		    try {
			userNum = Integer.parseInt( args[i] );
		    } catch ( Exception e ) {
			System.out.println( e );
			System.exit( 1 );
		    }
		} else {
		    System.out.println( "Please run with one integer argument." );
		    System.exit( 1 );
		}
		// Create new MathLib object
		MathLib math = new MathLib();
		// Check if the number is prime
		System.out.print( userNum + " " );
		if ( math.isPrime( userNum ) ) {
		    System.out.print( "is prime!" );
		} else {
		    // Show factors if the number is not prime
		    System.out.print( "is NOT prime!" );
		}
		System.out.println( " Factors: " + math.factorsOf( userNum ).toString() );
    }
}
