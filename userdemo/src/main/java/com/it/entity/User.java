package com.it.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;


public class User {
    private int id;
    private String name;
    private Date birthday;
    private String address;

    // 构造方法
    public User() {

        super();
    }

    public User(int id, String name, Date birthday, String address) {
        super();
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.address = address;
    }

    // getter & setter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        this.name = name;
    }
    //用于从后台给前台传出date类型的数据
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+08:00")
    public Date getBirthday() {

        return birthday;
    }

    public void setBirthday(Date birthday) {

        this.birthday = birthday;
    }

    public String getAddress() {

        return address;
    }

    public void setAddress(String address) {

        this.address = address;
    }




}
