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
	private final Logger LibraryLogger = LoggerFactory.getLogger( FS_Java_Apprentice.class );


	public static void main( String[] args )
	{
		// Core Java
		Core.LifeCycle();
		Core.BasicDataTypes();
		// Working with Methods, Encapsulation, and Inheritance
		MethodsEncapsulationInheritance.Methods();
		// Library
		FS_Java_Apprentice exampleLogger = new FS_Java_Apprentice();
		exampleLogger.Logging();
	}


	private void Logging()
	{
		/**
		 * Write an application that uses the slf4j logging library directly (can also choose log4j if you want).
		 * Do the following:
		 *   Configure the logging using an accepted department log statement format (see Application Logging).
		 *   Log at different logging levels (error, warn, info, debug), to see the effect of the default logging level setting.
		 *   Turn on DEBUG in the logging config to show DEBUG output.
		 *   Configure logging to go to both the console and a log file.
		 */
		LibraryLogger.error( "Errors require action on the part of the team." );
		LibraryLogger.warn( "Warn indicates a problem, but doesn't require action." );
		LibraryLogger.info( "Informational logging can contain almost anything." );
		LibraryLogger.debug( "Debug logging may be verbose, and is used to find problems in the code." );
	}
}
