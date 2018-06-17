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
        List<Device> deviceList = new ArrayList<Device>();

        //TODO: query by customerId, building dummy list for now
        deviceList.add(new Device(customerId, 0, "Camera0"));
        deviceList.add(new Device(customerId, 1, "Camera1"));
        deviceList.add(new Device(customerId, 2, "Camera2"));
        deviceList.add(new Device(customerId, 3, "Camera3"));
        deviceList.add(new Device(customerId, 4, "Camera4"));
        deviceList.add(new Device(customerId, 5, "Camera5"));

        return deviceList;
    }

}
