import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in= new Scanner(System.in);
       int num_strings=in.nextInt();
        int[] arr= new int[num_strings];
        for(int i=0;i<num_strings;i++){
            arr[i]=in.next().hashCode();
        }
        int num_query=in.nextInt();
        //System.out.println("the number of queries are "+num_query);
        for(int i=0; i<num_query;i++){
            int count=0;
            int query=in.next().hashCode();
            for(int j=0; j<num_strings;j++){
                if(arr[j]==query){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
