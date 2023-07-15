import java.util.HashMap;
import java.util.Scanner;

public class Tutorial1 {

    public static void main(String[] args) {
        System.out.println("Enter the values: ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String [] str = input.split(" ");
        countOccurences(str);
    }

    public static void countOccurences(String [] arr){
        HashMap<String ,Integer> occurences = new HashMap<>();

        for(int i=0;i<arr.length;i++){
            int count = 0;
            for(int j=0;j<arr.length;j++){
                if(arr[i].equals(arr[j])){
                    count++;
                }
            }

            occurences.put(arr[i],count);
        }
        System.out.println(occurences);
    }
}
