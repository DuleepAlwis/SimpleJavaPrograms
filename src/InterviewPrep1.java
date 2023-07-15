import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.Collections;
public class InterviewPrep1 {

    public static void main(String [] args){
        /*HashMap<Character,Integer> occurences = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string :");
        String str = sc.nextLine();
        char [] chars = str.toCharArray();

        int count = 0;
        for(int i=0;i<chars.length;i++){
            count = 0;
            for(int j=0;j<chars.length;j++){
                if(chars[i]==chars[j]){
                    count++;
                }
            }
            occurences.put(chars[i],count);
        }
        System.out.println(occurences);*/
    swapStrings("abh","lkj");
    reverseString("ABC",0,3);
    swapNumbers(1,3);
    getTheThridLargest(new int[]{3,2,1,1,1,2});
    }

    public static void swapStrings(String word1,String word2){
        word2 = word1.concat(word2);
        word1 = word2.substring(word1.length(),word2.length());
        word2 = word2.substring(0,word1.length());
        System.out.println("Word1 "+word1+" word2 "+word2);
    }

    //Reverse a sting without using a third variable
    public static void reverseString(String str,int start,int end){

        int i=0;
        int j=str.length();

        while(j>0){
            str = str.concat(str.charAt(j-1)+"");
            j--;
        }
        str = str.substring(end,str.length());
        System.out.println("Reversed string "+str);


    }

    //Swap numbers without using a third variable
    public static void swapNumbers(int i,int j){
        i = i+j;
        j = i - j;
        i  = i - j;
        System.out.println("i = "+i+" j = "+j);
    }

    public static void getTheThridLargest(int [] arr){
        Set<Integer> nums = new HashSet<Integer>();
        for(int i:arr){
            nums.add(i);
        }
        ArrayList<Integer> numbers = new ArrayList<>(nums);
        Collections.sort(numbers);
        System.out.println("Third largest element is : "+(numbers.size()-3>=0?numbers.get(numbers.size()-3):-1));
    }
}
