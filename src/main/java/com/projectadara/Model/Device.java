package com.projectadara.Model;

public class Device {
    public static final int CAMERA = 1;
    public static final int MICROPHONE = 2;
    public static final int SENSOR = 3;
    public static final int LOCK = 4;

    long customerId;
    int deviceId;
    String deviceName;
    int deviceType;
    String deviceUrl;

    //TODO: temporary constructor until retrieving stuff from db
    public Device(long customerId, int deviceId, String deviceName, int deviceType, String deviceUrl) {
        this.customerId = customerId;
        this.deviceId = deviceId;
        this.deviceName = deviceName;
        this.deviceType = deviceType;
        this.deviceUrl = deviceUrl;
    }

    public long getCustomerId() {
        return customerId;
    }

    public int getDeviceId() {
        return deviceId;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public int getDeviceType() {
        return deviceType;
    }

    public String getDeviceUrl() {
        return deviceUrl;
    }
}
