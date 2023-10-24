package com.mycompany.train_ticket.model;

import java.util.Date;

public class Customer {
    private int code;
    private String fullName;
    private Date birth;
    private String type;
    public Customer(int code, String fullName,Date birth,String type){
        this.birth=birth;
        this.code=code;
        this.fullName=fullName;
        this.type=type;
    }

    public long getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
