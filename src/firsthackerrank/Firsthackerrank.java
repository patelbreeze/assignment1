/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firsthackerrank;

/**
 *
 * @author Breeze
 */

import java.io.*;
import java.util.*;
public class Firsthackerrank {




    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int num;
            num = scan.nextInt();
            arr.add(num);
        }
        int temp = scan.nextInt();
        for (int i = 0; i < temp; i++) {
            String query;
            query = scan.next();
            if(query.equals("Insert")){
                int index = scan.nextInt();
                int value = scan.nextInt();
                arr.add(index,value);
            }
            if(query.equals("Delete")){
                int index = scan.nextInt();
                arr.remove(index);
            }
        }
        
         for(int i =0; i < arr.size();i++) {
            System.out.print(arr.get(i)+" ");
         }
    }
}
