package javaMathStuff;

//import java.util.Scanner;
import java.lang.*;
import java.util.ArrayList;

public class MathLib {
  public boolean isPrime( int num ) {
	// Prime numbers must be greater than 1
	if ( num <= 1 ) {
	    return false; 
	}
	// To prevent problems later on
	if ( num == 2 ) {
	    return true;
	}
	// Loops are cool
	for ( int i = 2; i < Math.round( Math.sqrt( num ) ) + 1; i++ ) {
	    // If there is a multiple, return false
	    if ( num % i == 0 ) {
		return false;
	    }
	}
	// If we made it here, it's a prime number
	return true;
  }

  public ArrayList<Integer> factorsOf( int num ) {
	// Empty array
      ArrayList<Integer> factors = new ArrayList<Integer>();
	for ( int factor1 = 1; factor1 <= num; factor1++ ) {
	    if ( num % factor1 == 0 ) {
		factors.add( factor1 );
	    }
	}
	return factors;
  }

}
