package com.DSA.LinkedLists;

import java.util.LinkedList;

public class Main{
    public static void main(String args[]){
        LinkedList list=new LinkedList();
        list.addLast(10);
        list.addFirst(2);
        list.add(10);
        list.addFirst(21);
        list.addLast(31);
        list.remove(1);
        System.out.println(list.contains(10));
        System.out.println(list.indexOf(10));
        System.out.println(list.size());
        System.out.println(list);
    }
}
/*Runtime complexity:
      Lookup:
         by value: O(n)
         by Index: O(n)

      Insert:
         At the end      : O(1)
         At the Beginning: O(1)
         In the middle   : O(n)

      Delete:
         At the end      : O(1)
         At the Beginning: O(n)
         At the Middle   : O(n)
 */
