package com.vesselDemo.collection.a01_ArrayList;

import javax.management.ObjectName;

public class MyArrayList<E>{
   Object[] obj= new Object[10];
   int size;
   public boolean add(E e){
       obj[size]=e;
       size++;
       return true;
   }
   public E get(int index){
       return (E) obj[index];
   }

}
