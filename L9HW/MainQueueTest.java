/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L9HW;

/**
 *
 * @author asus
 */
public class MainQueueTest {
    public static void main(String []args){
    
    ArrayQueueImpl myQueue= new ArrayQueueImpl();
    
    myQueue.enqueue(12);
    System.out.println("queue value" + myQueue.peek());
    myQueue.dequeue();
      System.out.println("queue value" + myQueue.isEmpty());
       myQueue.enqueue(12);
        myQueue.enqueue(13);
         myQueue.enqueue(14);
         System.out.println("queue value" + myQueue.size());
          myQueue.dequeue();
            System.out.println("queue value" + myQueue.peek());
    System.out.println("queue value" + myQueue);
  
    }
}
