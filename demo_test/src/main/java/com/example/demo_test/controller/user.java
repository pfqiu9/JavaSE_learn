package com.example.demo_test.controller;

public class user {
    private String name;
    private  Integer age;
    private Adress adress;

    public user() {
    }

    public user(String name, Integer age, Adress adress) {
        this.name = name;
        this.age = age;
        this.adress = adress;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public Integer getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * 获取
     * @return adress
     */
    public Adress getAdress() {
        return adress;
    }

    /**
     * 设置
     * @param adress
     */
    public void setAdress(Adress adress) {
        this.adress = adress;
    }

    public String toString() {
        return "user{name = " + name + ", age = " + age + ", adress = " + adress + "}";
    }
}
