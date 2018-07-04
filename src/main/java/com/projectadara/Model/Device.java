package com.projectadara.Model;

public class Device {
    public static final int CAMERA = 1;
    public static final int MICROPHONE = 2;
    public static final int SENSOR = 3;
    public static final int LOCK = 4;

    long customerId;
    long deviceId;
    String deviceName;
    int deviceType;

    //TODO: temporary constructor until retrieving stuff from db or whatever
    public Device(long customerId, long deviceId, String deviceName, int deviceType) {
        this.customerId = customerId;
        this.deviceId = deviceId;
        this.deviceName = deviceName;
        this.deviceType = deviceType;
    }

    public long getCustomerId() {
        return customerId;
    }

    public long getDeviceId() {
        return deviceId;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public int getDeviceType() {
        return deviceType;
    }
}
