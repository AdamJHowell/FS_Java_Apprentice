package com.adamjhowell;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * Created by Adam Howell on 2016-05-19.
 * This will be the driver program for my attempt to pass the Family History Department's Java Apprentice badge.
 * My personal checklist can be found here:
 * https://almtools.ldschurch.org/fhconfluence/display/~adamrules/Adam%27s+checklist+for%3A+Core+Skills+-+Java+-+Apprentice
 */
class FS_Java_Apprentice
{
	private static final Logger LibraryLogger = LoggerFactory.getLogger( FS_Java_Apprentice.class );


	public static void main( String[] args )
	{
		// Core Java
		Core.LifeCycle( LibraryLogger );
		Core.BasicDataTypes( LibraryLogger );

		// Working with Methods, Encapsulation, and Inheritance
		MethodsEncapsulationInheritance.Methods( LibraryLogger );

		// Library
		Library testLogger = new Library();
		testLogger.Logging();
	}
}
