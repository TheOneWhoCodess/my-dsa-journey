
public class BinarySearch {
    public static void main(String[] args) {
int[]even={3,5,7,8,9,11};
        int[]odd={1,2,3,4,5};
        int index=BinarySearch2(even, even.length, 11);
        int index2=BinarySearch2(odd, odd.length, 2);
        System.out.println("index of 11 is:"+ index);
        System.out.println("index of 4 is:"+ index2);

    }
    public static int BinarySearch2(int[]arr, int size, int target){
        int start=0;
        int end=size-1;
        int mid=start + (end-start)/2;
        while(start<=end){
            if(arr[mid]==target){
                return mid;
            }
            if(target>arr[mid]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
            mid=start+(end-start)/2;
        }
return -1;
    }

}