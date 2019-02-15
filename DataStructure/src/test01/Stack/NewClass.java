/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test01.Stack;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author INT303
 */
public class NewClass {
    public static void main(String[] args) {
     LinkedList<Integer> stack = new LinkedList();
        for (int i = 0; i < 10; i++) {
            stack.push(i); //ไปแปลง primitive เป็น object 
        }
      while(!stack.isEmpty()){
         // System.out.println(stack.pop());// java แปลง object เป็น primitive
         int x = stack.pop();
          System.out.println(10*x);
      }
        System.out.println("Size : "+stack.size());
    }
}
