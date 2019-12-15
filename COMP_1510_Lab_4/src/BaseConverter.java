import java.util.*;

public class BaseConverter {

    public static ArrayList<Integer> arr = new ArrayList<Integer>();

    public static void main(String args[]){
        int number = 294;
        divide(number);
        Collections.reverse(arr);
        System.out.println(arr);
    }

    public static void divide(int number) {
        if(number > 0){
            if(number % 2 == 1){
                arr.add(1);
            }else if(number % 2 == 0){
                arr.add(0);
            }
            divide(number/2);
        }
    }

}