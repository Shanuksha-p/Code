package Leetcode.Topics.BinarySearch;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class IntersectionOfTwoNonSortedArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
//         int s1=nums1.length;
//         int s2=nums2.length;
//         List<Integer>list=new ArrayList<>();
//         Arrays.sort(nums1);
//         Arrays.sort(nums2);
//         HashSet<Integer>set= new HashSet<>();
//         int i=0,j=0;
//         while(i<s1 && j<s2){
//             if(nums1[i]==nums2[j]){
//                 if(!set.contains(nums1[i])){
//                     list.add(Integer.valueOf(nums1[i]));
//                     set.add(nums1[i]);
//                 }
//                 i++;j++;

//             }
//             else if(nums1[i]<nums2[j])
//                 i++;
//             else
//                 j++;
//         }

        List<Integer> list=new ArrayList<>();
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            set.add(nums1[i]);
        }

        for(int i=0;i<nums2.length;i++){
            if(set.contains(nums2[i])){
                list.add(nums2[i]);
                set.remove(nums2[i]);
            }
        }
        int res[]=new int[list.size()];
        for(int k=0;k<list.size();k++){
            res[k]=list.get(k);
        }
        return res;
    }
}
