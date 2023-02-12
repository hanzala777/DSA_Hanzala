package com.DSA.BinarySearch;

import java.util.Arrays;

public class FstAndLstOcc {
    public static void main(String[] args) {
        int[] arr={1,2,3,3,3,4,4,5};
        System.out.println(Arrays.toString(searchRange(arr,3)));
    }
    public static int[] searchRange(int[] arr,int target){
        int[] ans={-1,-1};

        ans[0] = search(arr,target,true);
        if(ans[0] != -1)
            ans[1] = search(arr,target,false);

        return ans;
    }

    //this function just returns the index value of target
    public static int search(int[] arr,int target,boolean findstartIndex){
        int ans=-1;

        int start=0,end=arr.length-1;

        while(start <=end){
            //find the middle element
            int middle=start+(end-start)/2;
            if(target<arr[middle]){
                end=middle-1;
            }
            else if(target>arr[middle]){
                start=middle + 1;
            }
            else {
                //potential ans found
                ans=middle;
                if(findstartIndex)
                    end=middle-1;
                else
                    start=middle+1;
            }
        }
        return ans;
    }
}
