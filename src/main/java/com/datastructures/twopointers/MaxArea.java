package com.datastructures.twopointers;

public class MaxArea {

    public  static int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;

        int maxArea = 0;
        while(left<right){
            int minHeight = Math.min(height[left],height[right]);
            int vertices = right-left;
            maxArea = Math.max(maxArea, minHeight*vertices);
            if(height[right] < height[left]){
                right--;
            }else{
                left++;
            }
        }

        return maxArea;
    }


    public static void main(String[] args){
        int[] case1 =  new int[]{1,8,6,2,5,4,8,3,7};
        int[] case2 =  new int[]{1,1};
        System.out.println(maxArea(case2));
    }


}
