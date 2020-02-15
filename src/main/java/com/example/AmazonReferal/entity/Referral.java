package com.example.AmazonReferal.entity;



import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "REFRRAL")
public class Referral implements Serializable {

    @Id
    @GeneratedValue(generator="system-uuid")
    @GenericGenerator(name="system-uuid", strategy = "uuid")
    private String eid;

    private String name;
    private String mobileNumber;
    private String email;
    private String location;
    private String languageOfCode;


    public String getName(String name) {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return eid;
    }

    public void setId(String id) {
        this.eid = eid;
    }

    public String getMobileNumber(String mobileNumber) {
        return this.mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getEmail(String email) {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLocation(String location) {
        return this.location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLanguageOfCode(String languageOfCode) {
        return this.languageOfCode;
    }

    public void setLanguageOfCode(String languageOfCode) {
        this.languageOfCode = languageOfCode;
    }

    @Override
    public String toString() {
        return "Referral{" +
                "eid='" + eid + '\'' +
                ", name='" + name + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                ", email='" + email + '\'' +
                ", location='" + location + '\'' +
                ", languageOfCode='" + languageOfCode + '\'' +
                '}';
    }
}
