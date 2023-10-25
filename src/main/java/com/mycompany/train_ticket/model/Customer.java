package com.mycompany.train_ticket.model;

import java.io.Serializable;
import java.util.Date;

public class Customer implements Serializable {
    private String code;
    private String fullName;
    private String birth;
    private String type;

    public Customer(String code, String fullName, String birth, String type) {
        this.birth = birth;
        this.code = code;
        this.fullName = fullName;
        this.type = type;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
