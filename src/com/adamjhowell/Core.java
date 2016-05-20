package com.adamjhowell;


/**
 * Created by Adam Howell on 2016-05-19.
 * This will show my understanding of the Core requirements for the Java Apprentice badge.
 */
class Core
{
	/**
	 * Describe how the basic data types are represented in memory (boolean, int, long, String, array of ints, array of Objects, class with fields).
	 * Write an application to find out how many total characters can be held in a list of strings before you run out of memory.
	 * Compare and contrast StringBuffer and StringBuilder and when to use each.
	 * Compare/contrast use of ArrayList / LinkedList / HashMap / HashSet / TreeSet.
	 * Write an application to read a file with 10k lines of text, and output another file with the lines in sorted order (sample file).
	 * Write an application to read a file with 10k lines of text, and output another file with the lines in reverse sorted order.
	 * Write code to show exception handling including examples of checked, unchecked, and Error exceptions.
	 * Write your own enum type.  Describe when you would use it.
	 */
	static void LifeCycle()
	{
		// Describe the lifecycle of an object instance in Java and how garbage collection works.
		System.out.println( "\nThe lifecycle of an object is how long it exists in memory." );
		System.out.println( "Sometime mistakenly equated to 'scope', an object will live longer than its scope." );
		System.out.println( "Lifecycle begins when the object is created.  This is usually at runtime." );
		System.out.println( "Lifecycle ends when an object is destroyed." );
		System.out.println( "An object in memory is usually destroyed by the Garbage Collector." );
		System.out.println( "Garbage collection in Java is automatic, but can be 'coerced' by using the 'System.gc()' call." );
		System.out.println( "This will not immediately run GC, as the VM has final say on when that happens." );
		System.out.println( "But it may cause GC to happen earlier than it normally would." );
	}


	static void BasicDataTypes()
	{
		// Describe how the basic data types are represented in memory (boolean, int, long, String, array of ints, array of Objects, class with fields).
		System.out.println( "\nHow basic data types are represented in memory." );
		System.out.println( "A 'boolean' in Java can hold one bit of information.  Its memory consumption is not precisely defined." );
		System.out.println( "Consensus on StackOverflow is that a single boolean consumes 32 bits of memory, but an array of booleans will consume one byte per element (not one bit per element)." );
	}
}
