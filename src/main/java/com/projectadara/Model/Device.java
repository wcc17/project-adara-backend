package com.projectadara.Model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;

@Entity(name = "device")
public class Device {
    public static final int CAMERA = 1;
    public static final int MICROPHONE = 2;
    public static final int SENSOR = 3;
    public static final int LOCK = 4;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "customer_id", nullable = false)
    @JsonBackReference
    Customer customer;

    @Column(name = "name", nullable = false)
    String name;

    @Column(name = "type", nullable = false)
    int type;

    public int getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public String getName() {
        return name;
    }

    public int getType() {
        return type;
    }
}
