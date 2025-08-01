//Code for Binary Search:-
public class BinarySearch{
    public static void main(String[] args){
        int[] arr={1,2,3,44,66,77,99,900};
        int target=99;
        int ans=binarySearch(arr,target);
        System.out.println(ans);
    }
    static int binarySearch(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        int mid=start+(end-start)/2;   //safe formula to use
        while(start<=end){
        if(target<=mid){
            end=mid-1;
        }else if(target>mid){
            start=mid+1;
        }else{
            return mid;
        }
    }
    return -1;
}
}


//Order Agnostic for binary search:-
package com.kunal;

public class OrderAgnosticBS {
    public static void main(String[] args) {
//        int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};
        int[] arr = {99, 80, 75, 22, 11, 10, 5, 2, -3};
        int target = 22;
        int ans = orderAgnosticBS(arr, target);
        System.out.println(ans);
    }

    static int orderAgnosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        // find whether the array is sorted in ascending or descending
        boolean isAsc = arr[start] < arr[end];

        while(start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}


//Questions on binary search:-
/* Ceiling:- smallest element in an array greater or equal to target.
    For Example:- arr={2,3,5,9,14,16,18}
target:- 14
    ceiling(arr,target=15)=16   */

public class Ceiling{
    public static void main(String[] args){
        int[] arr={11,22,33,44,55,66,77,88,99,100};
        int target=45;
        int ans=ceilingex(arr,target);
        System.out.println(ans);
    }
    static int ceilingex(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
           int  mid=start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            }else if(target>arr[mid]){
                start=mid+1;
            }else{
                return mid;
            }
        }
        return start;
    }
}


/* floor:- greatest number smaller or equal to target*/
public class Ceiling{
    public static void main(String[] args){
        int[] arr={11,22,33,44,55,66,77,88,99,100};
        int target=45;
        int ans=ceilingex(arr,target);
        System.out.println(ans);
    }
    static int ceilingex(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
           int  mid=start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            }else if(target>arr[mid]){
                start=mid+1;
            }else{
                return mid;
            }
        }
        return end;
    }
}
