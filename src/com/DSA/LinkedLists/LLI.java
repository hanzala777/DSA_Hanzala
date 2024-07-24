package com.DSA.LinkedLists;

public class LLI {
    public static void main(String[] args){
        LL list=new LL();
        list.addFirst(5);
        list.addFirst(1);
        list.addLast(2);
        list.add(4, 2);
        list.addLast(2);
        list.add(4, 4);
        list.Display();
        System.out.println(list.deleteFirst());
        System.out.println(list.deleteLast());
        System.out.println(list.delete(3));
        list.Display();
        list.find(4);
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
