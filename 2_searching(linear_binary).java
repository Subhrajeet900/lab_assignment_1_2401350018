import java.util.*;

public class Task2Search {

    public static int linearSearch(int arr[], int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key)
                return i;
        }
        return -1;
    }

    public static int binarySearch(int arr[], int key){
        int low=0, high=arr.length-1;

        while(low<=high){
            int mid=(low+high)/2;

            if(arr[mid]==key)
                return mid;
            else if(arr[mid]<key)
                low=mid+1;
            else
                high=mid-1;
        }
        return -1;
    }

    public static void main(String args[]){

        int size = 10000;
        int arr[] = new int[size];

        for(int i=0;i<size;i++)
            arr[i]=i;

        int bestKey = arr[0];
        int avgKey = arr[size/2];
        int worstKey = -1;

        long start,end;

        start = System.nanoTime();
        linearSearch(arr,bestKey);
        end = System.nanoTime();
        System.out.println("Linear Search Best Case: "+(end-start));

        start = System.nanoTime();
        linearSearch(arr,avgKey);
        end = System.nanoTime();
        System.out.println("Linear Search Average Case: "+(end-start));

        start = System.nanoTime();
        linearSearch(arr,worstKey);
        end = System.nanoTime();
        System.out.println("Linear Search Worst Case: "+(end-start));

        start = System.nanoTime();
        binarySearch(arr,avgKey);
        end = System.nanoTime();
        System.out.println("Binary Search Time: "+(end-start));
    }
}
