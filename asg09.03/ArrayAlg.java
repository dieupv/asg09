/**
 * @(#)ArrayAlg.java
 *
 *
 * @author:  Le Van Hung
 */

import java.util.*;
class InvalidSubscriptException extends Exception{
	InvalidSubscriptException()
	{
		super();
	}
}
public class ArrayAlg {

    public static < T > void printArray( T[] a )
    {
    	for ( T element : a )
    		System.out.printf( "%s ", element );
    }
	public static < T > void printArray1(T[] a,int start,int end)
	{
		for(int i = start; i < end ; i++ )
			System.out.printf( "%s ", a[i] );
	}
	public static < T extends Comparable< T > > void maxTwo(T[] a)
	{
		int t = 0;
		T temp;
		for ( T element : a )
			t++;
		for(int i = 0; i < t ; i++ )
		for(int j = i + 1; j < t; j++)
		{
			if(a[i].compareTo(a[j]) > 0 )
			{
				temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}

		}
		System.out.printf( "Max1 : %s ", a[t-1] );
		System.out.printf( "Max2 : %s ", a[t-2] );
	}
    public static void main( String args[] )
    {
    	try{

    	Scanner input = new Scanner(System.in);
    	int start,end;
        // create arrays of Integer, Double and Character
        Integer[] intArray = { 1, 2, 3, 4, 5 };
        Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7 };


        System.out.println( "Array integerArray contains:" );
        printArray( intArray ); // pass an Integer array
        System.out.println();
        System.out.print("Start : ");
        start = input.nextInt();
        System.out.print("End : ");
        end = input.nextInt();
        printArray1(intArray, start , end);
        System.out.println();
        maxTwo(intArray);
		if(start >= end ) throw new InvalidSubscriptException();


        System.out.println( "\nArray doubleArray contains:" );
        printArray( doubleArray ); // pass a Double array
        System.out.println();
        System.out.print("Start : ");
        start = input.nextInt();
        System.out.print("End : ");
        end = input.nextInt();
		printArray1(doubleArray, start , end);
		System.out.println();
		maxTwo(doubleArray);
		if(start >= end ) throw new InvalidSubscriptException();
    	}

    	catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    } // end main


}