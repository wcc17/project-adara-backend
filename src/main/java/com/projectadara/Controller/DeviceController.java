package com.projectadara.Controller;

import com.projectadara.Model.Device;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class DeviceController {

    @RequestMapping("/deviceList")
    public List<Device> getDeviceList(@RequestParam(value="customerId") long customerId) {
        System.out.println("Retrieving list of devices");

        List<Device> deviceList = new ArrayList<Device>();

        //TODO: query by customerId passed in here, building dummy list for now
        deviceList.add(new Device(customerId, 0, "Camera0", Device.CAMERA, "https://commondatastorage.googleapis.com/gtv-videos-bucket/sample/ElephantsDream.mp4"));
        deviceList.add(new Device(customerId, 1, "Camera1", Device.CAMERA, "https://commondatastorage.googleapis.com/gtv-videos-bucket/sample/BigBuckBunny.mp4"));
        deviceList.add(new Device(customerId, 2, "Camera2", Device.CAMERA, "https://commondatastorage.googleapis.com/gtv-videos-bucket/sample/ForBiggerBlazes.mp4"));

        deviceList.add(new Device(customerId, 6, "Microphone1", Device.MICROPHONE, null));
        deviceList.add(new Device(customerId, 7, "Microphone2", Device.MICROPHONE, null));

        deviceList.add(new Device(customerId, 9, "Sensor0", Device.SENSOR, null));
        deviceList.add(new Device(customerId, 10, "Sensor1", Device.SENSOR, null));
        deviceList.add(new Device(customerId, 11, "Sensor2", Device.SENSOR, null));
        deviceList.add(new Device(customerId, 12, "Sensor3", Device.SENSOR, null));
        deviceList.add(new Device(customerId, 13, "Sensor4", Device.SENSOR, null));

        deviceList.add(new Device(customerId, 14, "Lock1", Device.LOCK, null));

        return deviceList;
    }

}
