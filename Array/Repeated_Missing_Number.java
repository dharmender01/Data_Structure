package Array;
import java.util.*;


public class Repeated_Missing_Number {
    public static int[] repeatedNumber(final int[] A) {
        int[] res = new int[2];
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 1; i<= A.length; i++){
            map.put(i,0);
        }
        for(int i = 0; i< A.length; i++){
            if(map.containsKey(A[i])){
                map.put(A[i],map.get(A[i])+1);
            }else{
                map.put(A[i],1);
            }
        }
        for(int i = 1; i<=A.length; i++){
            if(map.get(i) == 2) res[0] = i;
            if(map.get(i) == 0) res[1] = i;
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = repeatedNumber(new int[]{3,1,2,5,3});
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
}
