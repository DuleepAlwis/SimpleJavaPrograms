import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class InterviewPrep3 {

    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter values : ");
        String nums = sc.nextLine();

        String [] numsArr = nums.split(" ");
        int [] numsToIntArr = new int[numsArr.length];
        for(int i=0;i<numsArr.length;i++){
            numsToIntArr[i] = Integer.parseInt(numsArr[i]);
        }
        getTheSecondLargest(numsToIntArr);
        getTheSecondLargest2(numsToIntArr);
        checkAnagrams("madam","adamm");
        checkAnagrams("avx","abc");
        vowelChecker2("lkjdlakje ious");
        primeNumberChecker(0);
        recursiveFibonachi(10,0);
        palindromeChecker("aaabbbcc");
        palindromeChecker("Madam");

    }

    public static void getTheSecondLargest(int [] nums){
        Arrays.sort(nums);

        System.out.println(nums[nums.length-2]);
    }

    public static void getTheSecondLargest2(int [] nums){
        int count = 0;
        int maxCount = 0;
        int maxNumber = 0;

        for(int i=0;i<nums.length;i++){
            count = 0;
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }

            if(count>maxCount){
                maxCount = count;
                maxNumber = nums[i];
            }
        }
        System.out.println("Maximums occurred number is " + maxNumber+ " with occurences "+maxCount);
    }

    public static void checkAnagrams(String word1,String word2){
        boolean isAnagram = false;
        if(word1.length()!=word2.length()){
            System.out.println("String are not anagrams");
        }else{
            char [] char1 = word1.toLowerCase().toCharArray();
            char [] char2 = word2.toLowerCase().toCharArray();

            Arrays.sort(char1);
            Arrays.sort(char2);

           if(Arrays.equals(char1,char2)){
               isAnagram = true;
           }
            if(isAnagram==true){
                System.out.println("String are anagrams");
            }else{
                System.out.println("Strings are not anagrams because characters are not equal");
            }
        }
    }

    public static void vowelChecker(String word){
        char [] vowels = {'a','e','i','o','u','y','w'};
        List<Character> containingVowels = new ArrayList<>();
        for(int i=0;i<word.length();i++){
            for(int j=0;j<vowels.length;j++){
                if(word.toLowerCase().charAt(i)==vowels[j]){
                    containingVowels.add(word.charAt(i));
                }
            }
        }
        System.out.println("Vowels of the string "+word);
        System.out.println(containingVowels);
    }
    public static void vowelChecker2(String word){
        char [] vowels = {'a','e','i','o','u'};
        word = word.toLowerCase();
        String containingVowels = "";
        for(char c:vowels){
            if(word.indexOf(c)>(-1)){
                containingVowels = containingVowels.concat(c+"");
            }
        }
        System.out.println("Vowels :"+containingVowels);

    }

    public static void primeNumberChecker(int number){
        int count = 0;
        for(int i=1;i<number+1;i++){
            if(number%i==0){
                count++;
            }
        }

        System.out.println(count>2?"Not a prime number":"Is a prime number");
    }

    public static void recursiveFibonachi(int number,int inc){
        if(inc>number){
            System.out.println("Sequence fibonachi ends");
        }else{
            if(inc==0 || inc==1){
                System.out.print((inc+":")+inc+" ");
                recursiveFibonachi(number,++inc);
            }else{
                System.out.print((inc+":")+((inc-1)+(inc-2))+" ");
                recursiveFibonachi(number,++inc);
            }
        }
    }

    public static void palindromeChecker(String word){
        word = word.toLowerCase();
        char [] arr = word.toCharArray();
        int i=0,j=arr.length-1;
        while(i<j){
            if(arr[i]!=arr[j]){
                System.out.printf("%s is not a palindrome\n",word);
                return;
            }
            i++;
            j--;
        }
        System.out.printf("%s is a palindrome\n",word);
    }
}
