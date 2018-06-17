package com.projectadara.Model;

public class Device {
    long customerId;
    int deviceId;
    String deviceName;

    public Device(long customerId, int deviceId, String deviceName) {
        this.customerId = customerId;
        this.deviceId = deviceId;
        this.deviceName = deviceName;
    }

    public int getDeviceId() {
        return deviceId;
    }

    public String getDeviceName() {
        return deviceName;
    }
}
