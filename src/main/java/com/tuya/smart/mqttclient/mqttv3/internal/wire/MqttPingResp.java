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
package com.tuya.smart.mqttclient.mqttv3.internal.wire;

import com.tuya.smart.mqttclient.mqttv3.MqttException;


/**
 * An on-the-wire representation of an MQTT PINGRESP.
 */
public class MqttPingResp extends MqttAck {
	public static final String KEY = "Ping";
	
	public MqttPingResp(byte info, byte[] variableHeader) {
		super(MqttWireMessage.MESSAGE_TYPE_PINGRESP);
	}
	
	protected byte[] getVariableHeader() throws MqttException {
		// Not needed, as the client never encodes a PINGRESP
		return new byte[0];
	}
	
	/**
	 * Returns whether or not this message needs to include a message ID.
	 */
	public boolean isMessageIdRequired() {
		return false;
	}
	
	public String getKey() {
		return KEY;
	}
}
