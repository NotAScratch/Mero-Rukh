/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.merorukh.controllers;

import com.merorukh.models.MeroRukhModel;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SamirDON
 */
public class BinarySearchAlgorithm {
     public static List<MeroRukhModel>performBinarySearchAll(String searchValue,
            ArrayList<MeroRukhModel> model,
            int low,
            int high){
        
        List<MeroRukhModel> resultModel = new ArrayList<>();
       
        while(low<=high){
            int mid = low + (high - low)/2;
            String name = model.get(mid).getTree_name().trim().toLowerCase();
            int result = name.compareTo(searchValue.trim().toLowerCase());
            if(result == 0)
            {
                resultModel.add(model.get(mid));
               
                int left = mid - 1;
                while(left >= low && model.get(left).getTree_name().trim().toLowerCase().equals(searchValue.trim().toLowerCase()))
                {
                resultModel.add(model.get(left));
                left--;
                }
               
                int right = mid+1;
                while(right <= high && model.get(right).getTree_name().trim().toLowerCase().equalsIgnoreCase(searchValue.trim().toLowerCase()))
                {
                    resultModel.add(model.get(right));
                    right++;
                }
                return resultModel;
            }
             if(result < 0)
                low = mid +1;
            
            else
                high = mid -1;
            
           
        
        }
        return resultModel;
    }
}
