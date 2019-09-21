/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L9HW;

import java.util.Arrays;

/**
 *
 * @author asus
 */
public class ArrayQueueImpl {
private int[] arr = new int[10];
private int front = -1;
private int rear = 0;
public int peek() {
 if(isEmpty()){
        System.out.println("queue is empty");
    return -1;
    }
 else return arr[front];
//implement
}
public void enqueue(int obj){
//implement

if(rear==arr.length) resize();


if(front==-1){
    front=0;
    arr[rear++]= obj;
}
else{
arr[rear++]= obj;
}

}
public int dequeue() {
    int x=0;
    if(isEmpty()){
        System.out.println("queue is empty");
    return -1;
    }
    else { 
        int[] temp=new int[arr.length-1];
        x= arr[front];
       System.arraycopy(arr, 1, temp, 0, arr.length-1);
       arr=temp;
       rear--;
    }
return x;
}
public boolean isEmpty(){
    if(rear==0) return true;
//implement
return false;
}
public int size(){
//implement
return rear;
}
 private void resize(){
//implement
   
    
   Arrays.copyOf(arr, arr.length*2);
}
 
 public String toString(){
     
     StringBuilder  sb=new StringBuilder();
 
    for(int i=front;i<=rear-1;i++){
    
        sb.append(arr[i]+",");
    }
 return sb.toString();
 }
}