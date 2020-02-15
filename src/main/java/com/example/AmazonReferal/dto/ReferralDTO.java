package com.example.AmazonReferal.dto;


public class ReferralDTO {

    private String eid;
    private String name;
    private String mobileNumber;
    private String email;
    private String location;
    private String languageOfCode;


    public String getId() {
        return eid;
    }

    public void setId(String id) {
        this.eid = eid;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLanguageOfCode() {
        return languageOfCode;
    }

    public void setLanguageOfCode(String languageOfCode) {
        this.languageOfCode = languageOfCode;
    }
}
