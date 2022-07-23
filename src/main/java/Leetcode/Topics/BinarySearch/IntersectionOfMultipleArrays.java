package Leetcode.Topics.BinarySearch;

import java.util.ArrayList;
import java.util.List;

public class IntersectionOfMultipleArrays {
    public List<Integer> intersection(int[][] nums) {
        List<Integer> res=new ArrayList<>();
        int count[]=new int[1001];
        for(int arr[]: nums){
            for(int i: arr){
                count[i]++;
            }
        }
        for(int i=0;i<count.length;i++){
            if(count[i]==nums.length)
                res.add(i);
        }
        return res;
    }
}
