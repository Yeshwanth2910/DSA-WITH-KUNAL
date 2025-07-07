public class Search {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 9;
        System.out.println(BinarySearch(arr, target));
    }
    static int BinarySearch(int[] arr,int key){
        int start = 0,end = arr.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid] < key){
                start = mid+1;
            }
            else if(arr[mid] > key){
                end = mid-1;
            }
            else{
                return mid;
            }

        }
        return -1;
    }
}
