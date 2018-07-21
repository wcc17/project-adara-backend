package com.projectadara.Controller;

import com.projectadara.Model.Customer;
import com.projectadara.Model.Device;
import com.projectadara.Repository.CustomerRepository;
import com.projectadara.Repository.DeviceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.net.URI;

@RestController
public class DeviceController {

    @Autowired DeviceRepository deviceRepository;
    @Autowired CustomerRepository customerRepository;

    @RequestMapping("/deviceList")
    public Iterable<Device> getDeviceList(@RequestParam(value="customerId") int customerId) {
        System.out.println("Retrieving list of devices");

        //TODO: customerId param is useless right now, should be finding devices by customer Id
        Iterable<Device> deviceList = deviceRepository.findAll();

        return deviceList;
    }

    //TODO: should only be returning a single customer
    @RequestMapping("/customer")
    public Iterable<Customer> getCustomerInfo(@RequestParam(value="customerId") int customerId) {
        System.out.println("Retrieving customer info");

        //TODO: customerId param is useless right now, should be finding a single customer by customer Id
        Iterable<Customer> customerList = customerRepository.findAll();

        return customerList;
    }

    /**
     * TODO: should be using @PathVariable like so:
     * @RequestMapping(value = "/employees/{id}")
     *     public ResponseEntity<EmployeeVO> getEmployeeById (@PathVariable("id") int id)
     */


    @RequestMapping(value = "/deviceUrl", method = RequestMethod.GET)
    public URI getDeviceURL(@RequestParam(value="customerId") int customerId, @RequestParam(value="deviceId") int deviceId) throws Exception {
        System.out.println("Retrieving device url for customer id: " + customerId + " and device id: " + deviceId);

        String responseString = null;

        //TODO: should retrieve deviceURL by making a REST call to the customer server, which we should have stored by customerID
        //for now faking it
        switch((int)deviceId%3) {
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
