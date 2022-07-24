package Leetcode.Topics.BinarySearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class targetIndicesAfterSortingArray {
    public List<Integer> targetIndices(int[] nums, int target) {
        // List<Integer>list=new ArrayList<>();
        // Arrays.sort(nums);
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]==target)
        //         list.add(i);
        // }
        // return list;
        List<Integer> list=new ArrayList<>();
        int belowTargetCount=0, targetCount=0;
        for(int e: nums){
            if(e==target)
                targetCount++;
            else if(e<target)
                belowTargetCount++;
        }
        for(int i=0;i<targetCount;i++){
            list.add(belowTargetCount++);
        }
        return list;
    }

    //recursive way

    public void helper(int[] nums, int start, int end, int target, List<Integer> list){
        if(start > end) return;
        int mid = (start + end)/2;
        if(nums[mid] == target){
            list.add(mid);
        }
        helper(nums, start, mid-1, target, list);
        helper(nums, mid+1, end, target, list);
    }

    public List<Integer> targetIndex(int[] nums, int target) {
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<>();
        helper(nums, 0, nums.length-1, target, list);
        Collections.sort(list);
        return list;
    }
}
