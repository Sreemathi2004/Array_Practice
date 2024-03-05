
import java.util.*;
public class LargestElement {
    public static void main(String[] args) {
        int[] arr={3,2,1,5,2};
        int largest=arr[0];
        for(int i=1;i<arr.length;i++){
            largest=Math.max(largest,arr[i]);
        }
        System.out.println("Largest Element is "+largest);
    }
}
