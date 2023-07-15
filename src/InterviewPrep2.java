import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class InterviewPrep2 {

    public static void main(String [] args){
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        getTheSecondLargest2(arr);
    }

    public static void getTheSecondLargest(ArrayList<Integer> arr){

        Collections.sort(arr);
        System.out.println(arr.get(arr.size()-2));


    }

    public static void getTheSecondLargest2(ArrayList<Integer> arr){

        int max = 0;
        int secondMax = 0;
        for(int i:arr){
            if(i>max){
                secondMax = max;
                max = i;
            }
            else if(secondMax<i){
                secondMax = i;
            }

        }
        System.out.println(secondMax);
    }
}
