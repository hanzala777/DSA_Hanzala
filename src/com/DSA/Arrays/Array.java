package com.DSA.Arrays;
//Array :-
public class Array{
    private int[] items;
    private int count;
    public Array(int size){
        items=new int[size];
    }
    public void print(){
//        for(int i=0;i< items.length;i++){
//            System.out.println(items[i]);
//        }
        for(int a: items)
            System.out.println(a);
    }
    public void insert(int item){
        //If the array is full resize it
        if(items.length==count){
            //create a new array(Twice the size)
            int[] newItems=new int[count*2];
            //copy all the existing items
            for(int i=0;i<count;i++){
                newItems[i]=items[i];
            }
            //Set "items" to this new array
            items=newItems;
        }
        //Add the new item at the end
        items[count++]=item;
        /*
        the above line is similar to :
            items[count]=item;
            count++;
        */
    }
    public void removeAt(int index){
        //Validate the index
        int[] newItems = new int[items.length - 1];
        //Shift the items to the left to fill the hole
        for (int i = 0, k = 0; i < items.length; i++) {
            if (i == index) {
                continue;
            }
            newItems[k++]=items[i];
        }
        items=newItems;
    }
    public int indexOf(int item){
        //if we find it, return index
        for(int i=0;i<count;i++){
            if (items[i] == item)
                return i;
        }
        //otherwise, return -1
        return -1;
        /*
        Best case time complexity is O(1)
        Worst case time complexity is O(n)
        */
    }
}
/*
        Array numbers=new Array(4);
        numbers.insert(10);
        numbers.insert(20);
        numbers.insert(30);
        numbers.insert(40);
        numbers.removeAt(1);
        System.out.println(numbers.indexOf(10));
        numbers.print();
*/