package week6;
import java.util.ArrayList;

public class BinarySearch {
    public static int recBinarySearch(ArrayList<Integer> arr, int l, int r, int key){
        if (r >= l){
            int index = l + (r - l)/2;
            if (arr.get(index) == key){
                return index;
            }
            if (arr.get(index) > key){
                return recBinarySearch(arr, l, index-1, key);
            }else{
                return recBinarySearch(arr, index+1, r, key);
            }
        }
        return -1;
    }
    static int binarySearch(ArrayList<Integer> arr, int key) {
        int l = 0;
        int r = arr.size() - 1;
        while (l <= r) {
            int index = l + (r - l) / 2;
            if (key < arr.get(index)) {
                r = index - 1;
            } else if (key > arr.get(index)) {
                l = index + 1;
            } else if (key == arr.get(index)) {
                return index;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        ArrayList <Integer> arr = new ArrayList<>();
        arr.add(2);
        arr.add(5);
        arr.add(8);
        arr.add(16);
        arr.add(21);
        arr.add(33);
        arr.add(41);
        arr.add(58);
        //System.out.println(binarySearch(arr,41));
        System.out.println(recBinarySearch(arr, 0, arr.size() - 1, 41));
    }
}
