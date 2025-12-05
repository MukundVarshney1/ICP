package Assignment_11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Transformation_from_A_to_B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long a=sc.nextLong();
        long b=sc.nextLong();
        
        answer(a,b);
    }

    public static void answer(long a, long b) {
        // TODO Auto-generated method stub
        List<Long> seq=new ArrayList<>();
        seq.add(b);
        while(b>a){
            if(b%10==1){ 
                b/=10;
            }        
            else if(b%2==0){
                b/=2; 
            }    
            else{
                break;
            } 
                                      
            seq.add(b);
        }

        if(b==a){
            System.out.println("YES");
            Collections.reverse(seq);
            System.out.println(seq.size());
            for(long x :seq){
                System.out.print(x + " ");
            }
                
            System.out.println();
        } 
        else{
            System.out.println("NO");
        }


    }
}