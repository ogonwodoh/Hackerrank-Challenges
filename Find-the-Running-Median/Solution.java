import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        PriorityQueue<Integer> q= new PriorityQueue<>();
        Scanner in = new Scanner(System.in);
        int size= in.nextInt();
        ArrayList<Integer> arr=new ArrayList<>();
  
        while(size>0){
            q.add(in.nextInt());
            int m=0;
            while(!q.isEmpty()){
                arr.add(m, q.remove());
                m++;
            }
            System.out.printf("%.1f\n",findMedian(arr));
            for(int i=0; i<arr.size();i++){
                q.add(arr.get(i));
            }
            size--;
            arr.clear();
        }
    }
    public static float findMedian(ArrayList<Integer> arr){
        int l=arr.size();
        int h=l/2;
        if(l%2==0 && l>0){
            float med=arr.get(h) + arr.get(h-1);
            med=med/2;
            return med;
        }
        else{
            return arr.get(h);
        }
    }
}
