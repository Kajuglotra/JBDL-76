package com.gfg.inheritance;

public class Address {
    private String pincode;
    private String city;

    // pincode and city are 2 instance level variable
    public Address(String pincode, String city){
//        pincode and city are local variable
        this.pincode =pincode;
        this.city =city;
    }


    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
