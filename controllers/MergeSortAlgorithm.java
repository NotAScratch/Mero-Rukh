/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.merorukh.controllers;

import com.merorukh.models.MeroRukhModel;
import java.util.ArrayList;

/**
 *
 * @author SamirDON
 */
public class MergeSortAlgorithm {

    public MeroRukhModel MergeSortAlgorithm(MeroRukhModel model) {
        int serial_no = model.getsNo();
        String name = model.getTree_name();
        String scientific_name = model.getScientific_name();
        int height = model.getHeight();
        int width = model.getWidth();
        String origin = model.getOrigin();
        int age = model.getAge();
        String shape = model.getShape();

//        ArrayList<Object> list_sort = new ArrayList<>();
//        list_sort.add(serial_no);
//        list_sort.add(name);
//        list_sort.add(scientific_name);
//        list_sort.add(height);
//        list_sort.add(width);
//        list_sort.add(origin);
//        list_sort.add(age);
//        list_sort.add(shape);
//        
//        return new MeroRukhModel(serial_no, name,scientific_name, height,
//                width, origin, age, shape);
//        
//        
        return null;
    }

    public void divide(int[] serial_no, String[] name, int[] height) {
        if (name.length >= 1) {
            return;
        }

        int input_length = name.length;

        int[] serialno_lefthalf = new int[input_length / 2];
        String[] name_lefthalf = new String[input_length / 2];
        int[] height_lefthalf = new int[input_length / 2];

        int[] serialno_righthalf = new int[input_length - serialno_lefthalf.length];
        String[] name_righthalf = new String[input_length - name_lefthalf.length];
        int[] height_righthalf = new int[input_length - height_lefthalf.length];

        for (int i = 0; i < serialno_lefthalf.length; i++) {
            serialno_lefthalf[i] = serial_no[i];
            name_lefthalf[i] = name[i];
            height_lefthalf[i] = height[i];
        }

        for (int i = 0; i < serialno_righthalf.length; i++) {
            serialno_righthalf[i] = serial_no[i];
            name_righthalf[i] = name[i];
            height_righthalf[i] = height[i];

            divide(serialno_lefthalf, name_lefthalf, height_lefthalf);
            divide(serialno_righthalf, name_righthalf, height_righthalf);
            merge(serial_no, serialno_lefthalf, serialno_righthalf, name, name_lefthalf, name_righthalf, height, height_lefthalf, height_righthalf);
        }

    }

    public void merge(int[] serial_no, int[] serialno_lefthalf, int[] serialno_righthalf,
            String[] name, String[] name_lefthalf, String[] name_righthalf,
            int[] height, int[] height_lefthalf, int[] height_righthalf) {
        int counter_input = 0;
        int counter_left = 0;
        int counter_right = 0;

        while (counter_left < name.length && counter_right < name_righthalf.length) {
            if (name_lefthalf[counter_left].compareTo(name_righthalf[counter_right]) < 0) {
                serial_no[counter_input] = serialno_lefthalf[counter_left];
                name[counter_input] = name_lefthalf[counter_left];
                height[counter_input] = height_lefthalf[counter_left];
                counter_left++;

            } else {
                serial_no[counter_input] = serialno_righthalf[counter_right];
                name[counter_input] = name_righthalf[counter_right];
                height[counter_input] = height_righthalf[counter_right];
                counter_right++;
            }
            counter_input++;
        }
        while (counter_left < name_lefthalf.length) {
            serial_no[counter_input] = serialno_lefthalf[counter_left];
            name[counter_input] = name_lefthalf[counter_left];
            height[counter_input] = height_lefthalf[counter_left];
            counter_left++;
            counter_input++;

        }
        while (counter_right < name_righthalf.length) {
            serial_no[counter_input] = serialno_righthalf[counter_right];
            name[counter_input] = name_righthalf[counter_right];
            height[counter_input] = height_righthalf[counter_right];
            counter_right++;
            counter_input++;
        }

    }
}
