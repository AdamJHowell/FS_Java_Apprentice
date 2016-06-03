package com.adamjhowell;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * Created by Adam Howell on 2016-05-19.
 * This will show my understanding of the Library requirements for the Java Apprentice badge.
 */
class Library
{
	private static final Logger LibraryLogger = LoggerFactory.getLogger( Library.class );


	void Logging()
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
