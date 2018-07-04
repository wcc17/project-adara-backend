package com.projectadara.Controller;

import com.projectadara.Model.Device;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

@RestController
public class DeviceController {

    @RequestMapping("/deviceList")
    public List<Device> getDeviceList(@RequestParam(value="customerId") long customerId) {
        System.out.println("Retrieving list of devices");

        List<Device> deviceList = new ArrayList<Device>();

        //TODO: query by customerId passed in here, building dummy list for now
        deviceList.add(new Device(customerId, 0, "Camera0", Device.CAMERA));
        deviceList.add(new Device(customerId, 1, "Camera1", Device.CAMERA));
        deviceList.add(new Device(customerId, 2, "Camera2", Device.CAMERA));

        deviceList.add(new Device(customerId, 6, "Microphone1", Device.MICROPHONE));
        deviceList.add(new Device(customerId, 7, "Microphone2", Device.MICROPHONE));

        deviceList.add(new Device(customerId, 9, "Sensor0", Device.SENSOR));
        deviceList.add(new Device(customerId, 10, "Sensor1", Device.SENSOR));
        deviceList.add(new Device(customerId, 11, "Sensor2", Device.SENSOR));
        deviceList.add(new Device(customerId, 12, "Sensor3", Device.SENSOR));
        deviceList.add(new Device(customerId, 13, "Sensor4", Device.SENSOR));

        deviceList.add(new Device(customerId, 14, "Lock1", Device.LOCK));

        return deviceList;
    }

    /**
     * @RequestMapping(value = "/employees/{id}")
     *     public ResponseEntity<EmployeeVO> getEmployeeById (@PathVariable("id") int id)
     */


    @RequestMapping(value = "/deviceUrl", method = RequestMethod.GET)
    public URI getDeviceURL(@RequestParam(value="customerId") long customerId, @RequestParam(value="deviceId") long deviceId) throws Exception {
        System.out.println("Retrieving device url for customer id: " + customerId + " and device id: " + deviceId);

        String responseString = null;

        //TODO: should retrieve deviceURL by making a REST call to the customer server, which we should have stored by customerID
        //for now faking it
        switch((int)deviceId) {
            case 0:
                responseString = "https://commondatastorage.googleapis.com/gtv-videos-bucket/sample/ElephantsDream.mp4";
                break;
            case 1:
                responseString = "https://commondatastorage.googleapis.com/gtv-videos-bucket/sample/BigBuckBunny.mp4";
                break;
            case 2:
                responseString = "https://commondatastorage.googleapis.com/gtv-videos-bucket/sample/ForBiggerBlazes.mp4";
                break;
        }

        URI responseURI = new URI(responseString);
        return responseURI;
    }

}
