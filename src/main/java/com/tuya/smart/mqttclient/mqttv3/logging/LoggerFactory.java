/*******************************************************************************
 * Copyright (c) 2009, 2014 IBM Corp.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * and Eclipse Distribution License v1.0 which accompany this distribution.
 *
 * The Eclipse Public License is available at
 *    http://www.eclipse.org/legal/epl-v10.html
 * and the Eclipse Distribution License is available at
 *   http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * Contributors:
 *    Dave Locke - initial API and implementation and/or initial documentation
 */
package com.tuya.smart.mqttclient.mqttv3.logging;

import java.util.MissingResourceException;
import java.util.ResourceBundle;

public class LoggerFactory {
    /**
     * Default message catalog.
     */
    public final static String MQTT_CLIENT_MSG_CAT = "org.eclipse.paho.client.mqttv3.internal.nls.logcat";
    private static final String CLASS_NAME = LoggerFactory.class.getName();

    private static String overrideloggerClassName = null;
    /**
     * Default logger that uses java.util.logging.
     */
    private static String jsr47LoggerClassName = JSR47Logger.class.getName();

    /**
     * Find or create a logger for a named package/class.
     * If a logger has already been created with the given name
     * it is returned. Otherwise a new logger is created. By default a logger
     * that uses java.util.logging will be returned.
     *
     * @param messageCatalogName the resource bundle containing the logging messages.
     * @param loggerID           unique name to identify this logger.
     * @return a suitable Logger.
     */
    public static Logger getLogger(String messageCatalogName, String loggerID) {
        Logger logger = null;
        try {
            String loggerClassName = overrideloggerClassName;
            logger = null;

            if (loggerClassName == null) {
                loggerClassName = jsr47LoggerClassName;
            }
            logger = getLogger(loggerClassName, ResourceBundle.getBundle(messageCatalogName), loggerID, null);
            if (null == logger) {
                throw new MissingResourceException("Error locating the logging class", CLASS_NAME, loggerID);
            }
        } catch (Throwable ignore) {
        }
        if(logger == null)
            logger = new JSR47Logger();
        return logger;
    }


    /**
     * Return an instance of a logger
     *
     * @param loggerClassName class name of the load to load
     * @param messageCatalog  the resource bundle containing messages
     * @param loggerID        an identifier for the logger
     * @param resourceName    a name or context to associate with this logger instance.
     * @return a ready for use logger
     */
    private static Logger getLogger(String loggerClassName, ResourceBundle messageCatalog, String loggerID, String resourceName) { //, FFDC ffdc) {
        Logger logger = null;
        Class logClass = null;

        try {
            logClass = Class.forName(loggerClassName);
        } catch (NoClassDefFoundError ncdfe) {
            return null;
        } catch (ClassNotFoundException cnfe) {
            return null;
        }
        if (null != logClass) {
            // Now instantiate the log
            try {
                logger = (Logger) logClass.newInstance();
            } catch (IllegalAccessException e) {
                return null;
            } catch (InstantiationException e) {
                return null;
            } catch (ExceptionInInitializerError e) {
                return null;
            } catch (SecurityException e) {
                return null;
            }
            logger.initialise(messageCatalog, loggerID, resourceName);
        }

        return logger;
    }

    /**
     * When run in JSR47, this allows access to the properties in the logging.properties
     * file.
     * If not run in JSR47, or the property isn't set, returns null.
     * @param name the property to return
     * @return the property value, or null if it isn't set or JSR47 isn't being used
     */
//	public static String getLoggingProperty(String name) {
//		String result = null;
//		try {
//			// Hide behind reflection as java.util.logging is guaranteed to be
//			// available.
//			Class logManagerClass = Class.forName("java.util.logging.LogManager");
//			Method m1 = logManagerClass.getMethod("getLogManager", new Class[]{});
//			Object logManagerInstance = m1.invoke(null, null);
//			Method m2 = logManagerClass.getMethod("getProperty", new Class[]{String.class});
//			result = (String)m2.invoke(logManagerInstance,new Object[]{name});
//		} catch(Exception e) {
//			// Any error, assume JSR47 isn't available and return null
//			result = null;
//		}
//		return result;
//	}

    /**
     * Set the class name of the logger that the LoggerFactory will load
     * If not set getLogger will attempt to create a logger
     * appropriate for the platform.
     *
     * @param loggerClassName - Logger implementation class name to use.
     */
    public static void setLogger(String loggerClassName) {
        LoggerFactory.overrideloggerClassName = loggerClassName;
    }
}