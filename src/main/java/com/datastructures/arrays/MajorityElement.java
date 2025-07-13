package com.datastructures.arrays;


import java.util.Arrays;
import java.util.HashMap;

/**
 * Problem : 169 Majority Element
 * @see <a href="https://leetcode.com/problems/majority-element/description/">169 Majority Element</a>
 */
public class MajorityElement {

    public static int majorityElement(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        Arrays.sort(nums);
        HashMap<Integer,Integer> elements = new HashMap<>();

        int countElement = Integer.MIN_VALUE;
        int counting = Integer.MIN_VALUE;
        int j = 0;
        for(int i:nums){
            if(countElement==Integer.MIN_VALUE){
                countElement = i;
                counting =1;
            }else if(j == nums.length-1){
                counting +=1;
                elements.put(countElement,counting);
            }else{
                if(countElement != i){
                    elements.put(countElement,counting);
                    countElement = i;
                    counting = 1;
                }else{
                    counting +=1;
                }
            }
            j++;
        }

        int ans = Integer.MIN_VALUE;
        for(int k: elements.keySet()){
            if(elements.get(k) >= nums.length/2){
                if(ans==Integer.MIN_VALUE){
                    ans = k;
                }else{
                    if(elements.get(ans) < elements.get(k)){
                        ans = k;
                    }
                }
            }
        }

        return ans;
    }


    public static void main(String[] args){
       // int[] arr =  new int[]{3,2,3};
      //  int[] arr =  new int[]{2,2,1,1,1,2,2};
        int[] arr =  new int[]{1};
        System.out.println(majorityElement(arr));
     }
}
