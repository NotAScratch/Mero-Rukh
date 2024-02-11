/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.merorukh.models;

/**
 *
 * @author SamirDON
 */
public class MeroRukhModel {
    int sNo;
    String tree_name;
    String scientific_name;
    int height;
    int width;
    String origin;
    int age;
    String Shape;
    

    public MeroRukhModel(int sNo, String tree_name, String scientific_name, int height, int width, String origin, int age, String Shape) {
        this.sNo = sNo;
        this.tree_name = tree_name;
        this.scientific_name = scientific_name;
        this.height = height;
        this.width = width;
        this.origin = origin;
        this.age = age;
        this.Shape = Shape;
    }

    public int getsNo() {
        return sNo;
    }

    public void setsNo(int sNo) {
        this.sNo = sNo;
    }

    public String getTree_name() {
        return tree_name;
    }

    public void setTree_name(String tree_name) {
        this.tree_name = tree_name;
    }

    public String getScientific_name() {
        return scientific_name;
    }

    public void setScientific_name(String scientific_name) {
        this.scientific_name = scientific_name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWeidth(int weidth) {
        this.width = weidth;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getShape() {
        return Shape;
    }

    public void setShape(String Shape) {
        this.Shape = Shape;
    }
    
    

}
