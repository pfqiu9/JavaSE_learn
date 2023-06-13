package com.example.demo_test.controller;

public class Adress {
    private String city;
    private String province;

    public Adress() {
    }

    public Adress(String city, String province) {
        this.city = city;
        this.province = province;
    }

    /**
     * 获取
     * @return city
     */
    public String getCity() {
        return city;
    }

    /**
     * 设置
     * @param city
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * 获取
     * @return province
     */
    public String getProvince() {
        return province;
    }

    /**
     * 设置
     * @param province
     */
    public void setProvince(String province) {
        this.province = province;
    }

    public String toString() {
        return "Adress{city = " + city + ", province = " + province + "}";
    }
}
