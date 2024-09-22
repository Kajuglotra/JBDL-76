package com.gfg.misc;

import java.util.Iterator;

// multiple collections -> implementing iterable  -> able to iterated
//list -> multiple elements --> iterable -> when u have more than 1 elemenst

// array, list, set
// index++
// list.get(i)


public class MyCollection implements Iterable<String>{

    private String[] arr = new String[10];
    @Override
    public Iterator<String> iterator() {
        return new MyIterator();
    }

    class MyIterator implements Iterator<String>{
        private int index = 0;
        @Override
        public boolean hasNext() {
            return index<arr.length && arr[index] != null;
        }

        @Override
        public String next() {
            return arr[index++];
        }
    }

    public static void main(String[] args) {
        MyCollection collection  = new MyCollection();
        collection.arr[0] = "abc";
        collection.arr[1] = "def";
        collection.arr[2] = "ghi";

        Iterator<String> iterator = collection.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        collection.forEach(s  -> System.out.println(s));

    }
}
