/*******************************************************************************
 * Copyright (c) 2009, 2014 IBM Corp.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * and Eclipse Distribution License v1.0 which accompany this distribution. 
 *
 * The Eclipse Public License is available at 
 *    https://www.eclipse.org/legal/epl-2.0
 * and the Eclipse Distribution License is available at 
 *   https://www.eclipse.org/org/documents/edl-v10.php
 *
 * Contributors:
 *    Dave Locke - initial API and implementation and/or initial documentation
 */
package com.tuya.smart.mqttclient.mqttv3.logging;
import java.util.ResourceBundle;

/**
 * Implementation of the the logger interface that uses java.uti.logging
 * 
 * A Logger that utilises Java's built in logging facility - java.util.logging.
 * <p>A sample java.util.logging properties file - jsr47min.properties is provided that demonstrates
 * how to run with a memory based trace facility that runs with minimal performance 
 * overhead. The memory buffer can be dumped when a log/trace record is written matching 
 * the MemoryHandlers trigger level or when the push method is invoked on the MemoryHandler. 
 * {@link com.tuya.smart.mqttclient.mqttv3.util.Debug Debug} provides method to make it easy
 * to dump the memory buffer as well as other useful debug info. 
 */
public class JSR47Logger implements Logger {
	@Override
	public void initialise(ResourceBundle messageCatalog, String loggerID, String resourceName) {

	}

	/**
	 * Set a name that can be used to provide context with each log record.
	 * This overrides the value passed in on initialise
	 *
	 * @param logContext The Log context name
	 */
	@Override
	public void setResourceName(String logContext) {

	}

	/**
	 * Check if a message of the given level would actually be logged by this
	 * logger. This check is based on the Loggers effective level, which may be
	 * inherited from its parent.
	 *
	 * @param level a message logging level.
	 * @return true if the given message level is currently being logged.
	 */
	@Override
	public boolean isLoggable(int level) {
		return false;
	}

	/**
	 * Log a message, specifying source class and method, if the logger is
	 * currently enabled for the given message level.
	 *
	 * @param sourceClass  Name of class that issued the logging request.
	 * @param sourceMethod Name of method that issued the logging request.
	 * @param msg          The key in the message localization catalog for the message or
	 *                     the actual message itself. During formatting, if the logger
	 *                     has a mapping for the msg string, then the msg string is
	 *                     replaced by the localized value. Otherwise the original msg
	 */
	@Override
	public void severe(String sourceClass, String sourceMethod, String msg) {

	}

	/**
	 * Log a message, specifying source class and method, with an array of
	 * object arguments, if the logger is currently enabled for the given
	 * message level.
	 *
	 * @param sourceClass  Name of class that issued the logging request.
	 * @param sourceMethod Name of method that issued the logging request.
	 * @param msg          The key in the message localization catalog for the message or
	 *                     the actual message itself. During formatting, if the logger
	 *                     has a mapping for the msg string, then the msg string is
	 *                     replaced by the localized value. Otherwise the original msg
	 *                     string is used. The formatter uses java.text.MessageFormat
	 *                     style formatting to format parameters, so for example a format
	 *                     string "{0} {1}" would format two inserts into the message.
	 * @param inserts
	 */
	@Override
	public void severe(String sourceClass, String sourceMethod, String msg, Object[] inserts) {

	}

	/**
	 * Log a message, specifying source class and method, with an array of
	 * object arguments and a throwable, if the logger is currently enabled for
	 * the given message level.
	 *
	 * @param sourceClass  Name of class that issued the logging request.
	 * @param sourceMethod Name of method that issued the logging request.
	 * @param msg          The key in the message localization catalog for the message or
	 *                     the actual message itself. During formatting, if the logger
	 *                     has a mapping for the msg string, then the msg string is
	 *                     replaced by the localized value. Otherwise the original msg
	 *                     string is used. The formatter uses java.text.MessageFormat
	 *                     style formatting to format parameters, so for example a format
	 *                     string "{0} {1}" would format two inserts into the message.
	 * @param inserts      Array of parameters to the message.
	 * @param thrown
	 */
	@Override
	public void severe(String sourceClass, String sourceMethod, String msg, Object[] inserts, Throwable thrown) {

	}

	/**
	 * Log a message, specifying source class and method, if the logger is
	 * currently enabled for the given message level.
	 *
	 * @param sourceClass  Name of class that issued the logging request.
	 * @param sourceMethod Name of method that issued the logging request.
	 * @param msg          The key in the message localization catalog for the message or
	 *                     the actual message itself. During formatting, if the logger
	 *                     has a mapping for the msg string, then the msg string is
	 *                     replaced by the localized value. Otherwise the original msg
	 */
	@Override
	public void warning(String sourceClass, String sourceMethod, String msg) {

	}

	/**
	 * Log a message, specifying source class and method, with an array of
	 * object arguments, if the logger is currently enabled for the given
	 * message level.
	 *
	 * @param sourceClass  Name of class that issued the logging request.
	 * @param sourceMethod Name of method that issued the logging request.
	 * @param msg          The key in the message localization catalog for the message or
	 *                     the actual message itself. During formatting, if the logger
	 *                     has a mapping for the msg string, then the msg string is
	 *                     replaced by the localized value. Otherwise the original msg
	 *                     string is used. The formatter uses java.text.MessageFormat
	 *                     style formatting to format parameters, so for example a format
	 *                     string "{0} {1}" would format two inserts into the message.
	 * @param inserts
	 */
	@Override
	public void warning(String sourceClass, String sourceMethod, String msg, Object[] inserts) {

	}

	/**
	 * Log a message, specifying source class and method, with an array of
	 * object arguments and a throwable, if the logger is currently enabled for
	 * the given message level.
	 *
	 * @param sourceClass  Name of class that issued the logging request.
	 * @param sourceMethod Name of method that issued the logging request.
	 * @param msg          The key in the message localization catalog for the message or
	 *                     the actual message itself. During formatting, if the logger
	 *                     has a mapping for the msg string, then the msg string is
	 *                     replaced by the localized value. Otherwise the original msg
	 *                     string is used. The formatter uses java.text.MessageFormat
	 *                     style formatting to format parameters, so for example a format
	 *                     string "{0} {1}" would format two inserts into the message.
	 * @param inserts      Array of parameters to the message.
	 * @param thrown
	 */
	@Override
	public void warning(String sourceClass, String sourceMethod, String msg, Object[] inserts, Throwable thrown) {

	}

	/**
	 * Log a message, specifying source class and method, if the logger is
	 * currently enabled for the given message level.
	 *
	 * @param sourceClass  Name of class that issued the logging request.
	 * @param sourceMethod Name of method that issued the logging request.
	 * @param msg          The key in the message localization catalog for the message or
	 *                     the actual message itself. During formatting, if the logger
	 *                     has a mapping for the msg string, then the msg string is
	 *                     replaced by the localized value. Otherwise the original msg
	 */
	@Override
	public void info(String sourceClass, String sourceMethod, String msg) {

	}

	/**
	 * Log a message, specifying source class and method, with an array of
	 * object arguments, if the logger is currently enabled for the given
	 * message level.
	 *
	 * @param sourceClass  Name of class that issued the logging request.
	 * @param sourceMethod Name of method that issued the logging request.
	 * @param msg          The key in the message localization catalog for the message or
	 *                     the actual message itself. During formatting, if the logger
	 *                     has a mapping for the msg string, then the msg string is
	 *                     replaced by the localized value. Otherwise the original msg
	 *                     string is used. The formatter uses java.text.MessageFormat
	 *                     style formatting to format parameters, so for example a format
	 *                     string "{0} {1}" would format two inserts into the message.
	 * @param inserts
	 */
	@Override
	public void info(String sourceClass, String sourceMethod, String msg, Object[] inserts) {

	}

	/**
	 * Log a message, specifying source class and method, with an array of
	 * object arguments and a throwable, if the logger is currently enabled for
	 * the given message level.
	 *
	 * @param sourceClass  Name of class that issued the logging request.
	 * @param sourceMethod Name of method that issued the logging request.
	 * @param msg          The key in the message localization catalog for the message or
	 *                     the actual message itself. During formatting, if the logger
	 *                     has a mapping for the msg string, then the msg string is
	 *                     replaced by the localized value. Otherwise the original msg
	 *                     string is used. The formatter uses java.text.MessageFormat
	 *                     style formatting to format parameters, so for example a format
	 *                     string "{0} {1}" would format two inserts into the message.
	 * @param inserts      Array of parameters to the message.
	 * @param thrown
	 */
	@Override
	public void info(String sourceClass, String sourceMethod, String msg, Object[] inserts, Throwable thrown) {

	}

	/**
	 * Log a message, specifying source class and method, if the logger is
	 * currently enabled for the given message level.
	 *
	 * @param sourceClass  Name of class that issued the logging request.
	 * @param sourceMethod Name of method that issued the logging request.
	 * @param msg          The key in the message localization catalog for the message or
	 *                     the actual message itself. During formatting, if the logger
	 *                     has a mapping for the msg string, then the msg string is
	 *                     replaced by the localized value. Otherwise the original msg
	 */
	@Override
	public void config(String sourceClass, String sourceMethod, String msg) {

	}

	/**
	 * Log a message, specifying source class and method, with an array of
	 * object arguments, if the logger is currently enabled for the given
	 * message level.
	 *
	 * @param sourceClass  Name of class that issued the logging request.
	 * @param sourceMethod Name of method that issued the logging request.
	 * @param msg          The key in the message localization catalog for the message or
	 *                     the actual message itself. During formatting, if the logger
	 *                     has a mapping for the msg string, then the msg string is
	 *                     replaced by the localized value. Otherwise the original msg
	 *                     string is used. The formatter uses java.text.MessageFormat
	 *                     style formatting to format parameters, so for example a format
	 *                     string "{0} {1}" would format two inserts into the message.
	 * @param inserts
	 */
	@Override
	public void config(String sourceClass, String sourceMethod, String msg, Object[] inserts) {

	}

	/**
	 * Log a message, specifying source class and method, with an array of
	 * object arguments and a throwable, if the logger is currently enabled for
	 * the given message level.
	 *
	 * @param sourceClass  Name of class that issued the logging request.
	 * @param sourceMethod Name of method that issued the logging request.
	 * @param msg          The key in the message localization catalog for the message or
	 *                     the actual message itself. During formatting, if the logger
	 *                     has a mapping for the msg string, then the msg string is
	 *                     replaced by the localized value. Otherwise the original msg
	 *                     string is used. The formatter uses java.text.MessageFormat
	 *                     style formatting to format parameters, so for example a format
	 *                     string "{0} {1}" would format two inserts into the message.
	 * @param inserts      Array of parameters to the message.
	 * @param thrown
	 */
	@Override
	public void config(String sourceClass, String sourceMethod, String msg, Object[] inserts, Throwable thrown) {

	}

	/**
	 * Trace a message, specifying source class and method, if the logger is
	 * currently enabled for the given message level.
	 *
	 * @param sourceClass  Name of class that issued the logging request.
	 * @param sourceMethod Name of method that issued the logging request.
	 * @param msg          The key in the message catalog for the message or the actual
	 *                     message itself. During formatting, if the logger has a mapping
	 *                     for the msg string, then the msg string is replaced by the
	 */
	@Override
	public void fine(String sourceClass, String sourceMethod, String msg) {

	}

	/**
	 * Trace a message, specifying source class and method, with an array of
	 * object arguments, if the logger is currently enabled for the given
	 * message level.
	 *
	 * @param sourceClass  Name of class that issued the logging request.
	 * @param sourceMethod Name of method that issued the logging request.
	 * @param msg          The key in the message catalog for the message or the actual
	 *                     message itself. During formatting, if the logger has a mapping
	 *                     for the msg string, then the msg string is replaced by the
	 *                     value. Otherwise the original msg string is used. The
	 *                     formatter uses java.text.MessageFormat style formatting to
	 *                     format parameters, so for example a format string "{0} {1}"
	 *                     would format two inserts into the message.
	 * @param inserts
	 */
	@Override
	public void fine(String sourceClass, String sourceMethod, String msg, Object[] inserts) {

	}

	@Override
	public void fine(String sourceClass, String sourceMethod, String msg, Object[] inserts, Throwable ex) {

	}

	/**
	 * Trace a message, specifying source class and method, if the logger is
	 * currently enabled for the given message level.
	 *
	 * @param sourceClass  Name of class that issued the logging request.
	 * @param sourceMethod Name of method that issued the logging request.
	 * @param msg          The key in the message catalog for the message or the actual
	 *                     message itself. During formatting, if the logger has a mapping
	 *                     for the msg string, then the msg string is replaced by the
	 */
	@Override
	public void finer(String sourceClass, String sourceMethod, String msg) {

	}

	/**
	 * Trace a message, specifying source class and method, with an array of
	 * object arguments, if the logger is currently enabled for the given
	 * message level.
	 *
	 * @param sourceClass  Name of class that issued the logging request.
	 * @param sourceMethod Name of method that issued the logging request.
	 * @param msg          The key in the message catalog for the message or the actual
	 *                     message itself. During formatting, if the logger has a mapping
	 *                     for the msg string, then the msg string is replaced by the
	 *                     value. Otherwise the original msg string is used. The
	 *                     formatter uses java.text.MessageFormat style formatting to
	 *                     format parameters, so for example a format string "{0} {1}"
	 *                     would format two inserts into the message.
	 * @param inserts
	 */
	@Override
	public void finer(String sourceClass, String sourceMethod, String msg, Object[] inserts) {

	}

	@Override
	public void finer(String sourceClass, String sourceMethod, String msg, Object[] inserts, Throwable ex) {

	}

	/**
	 * Trace a message, specifying source class and method, if the logger is
	 * currently enabled for the given message level.
	 *
	 * @param sourceClass  Name of class that issued the logging request.
	 * @param sourceMethod Name of method that issued the logging request.
	 * @param msg          The key in the message catalog for the message or the actual
	 *                     message itself. During formatting, if the logger has a mapping
	 *                     for the msg string, then the msg string is replaced by the
	 */
	@Override
	public void finest(String sourceClass, String sourceMethod, String msg) {

	}

	/**
	 * Trace a message, specifying source class and method, with an array of
	 * object arguments, if the logger is currently enabled for the given
	 * message level.
	 *
	 * @param sourceClass  Name of class that issued the logging request.
	 * @param sourceMethod Name of method that issued the logging request.
	 * @param msg          The key in the message catalog for the message or the actual
	 *                     message itself. During formatting, if the logger has a mapping
	 *                     for the msg string, then the msg string is replaced by the
	 *                     value. Otherwise the original msg string is used. The
	 *                     formatter uses java.text.MessageFormat style formatting to
	 *                     format parameters, so for example a format string "{0} {1}"
	 *                     would format two inserts into the message.
	 * @param inserts
	 */
	@Override
	public void finest(String sourceClass, String sourceMethod, String msg, Object[] inserts) {

	}

	@Override
	public void finest(String sourceClass, String sourceMethod, String msg, Object[] inserts, Throwable ex) {

	}

	/**
	 * Log a message, specifying source class and method, with an array of
	 * object arguments and a throwable, if the logger is currently enabled for
	 * the given message level.
	 *
	 * @param level        One of the message level identifiers, e.g. SEVERE.
	 * @param sourceClass  Name of class that issued the logging request.
	 * @param sourceMethod Name of method that issued the logging request.
	 * @param msg          The key in the message localization catalog for the message or
	 *                     the actual message itself. During formatting, if the logger
	 *                     has a mapping for the msg string, then the msg string is
	 *                     replaced by the localized value. Otherwise the original msg
	 *                     string is used. The formatter uses java.text.MessageFormat
	 *                     style formatting to format parameters, so for example a format
	 *                     string "{0} {1}" would format two inserts into the message.
	 * @param inserts      Array of parameters to the message, may be null.
	 * @param thrown
	 */
	@Override
	public void log(int level, String sourceClass, String sourceMethod, String msg, Object[] inserts, Throwable thrown) {

	}

	/**
	 * Log a trace message, specifying source class and method, with an array of
	 * object arguments and a throwable, if the logger is currently enabled for
	 * the given message level.
	 *
	 * @param level        One of the message level identifiers, e.g. SEVERE.
	 * @param sourceClass  Name of class that issued the logging request.
	 * @param sourceMethod Name of method that issued the logging request.
	 * @param msg          The key in the message catalog for the message or the actual
	 *                     message itself. During formatting, if the logger has a mapping
	 *                     for the msg string, then the msg string is replaced by the
	 *                     value. Otherwise the original msg string is used. The
	 *                     formatter uses java.text.MessageFormat style formatting to
	 *                     format parameters, so for example a format string "{0} {1}"
	 *                     would format two inserts into the message.
	 * @param inserts      Array of parameters to the message, may be null.
	 * @param ex
	 */
	@Override
	public void trace(int level, String sourceClass, String sourceMethod, String msg, Object[] inserts, Throwable ex) {

	}

	/**
	 * Format a log message without causing it to be written to the log.
	 *
	 * @param msg     The key in the message localization catalog for the message or
	 *                the actual message itself. During formatting, if the logger
	 *                has a mapping for the msg string, then the msg string is
	 *                replaced by the localized value. Otherwise the original msg
	 *                string is used. The formatter uses java.text.MessageFormat
	 *                style formatting to format parameters, so for example a format
	 *                string "{0} {1}" would format two inserts into the message.
	 * @param inserts Array of parameters to the message.
	 * @return The formatted message for the current locale.
	 */
	@Override
	public String formatMessage(String msg, Object[] inserts) {
		return null;
	}

	@Override
	public void dumpTrace() {

	}
}
