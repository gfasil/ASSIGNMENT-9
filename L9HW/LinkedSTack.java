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
public class LinkedSTack {
        Node header;
        int count;
        LinkedSTack() {
		header = null;
	}

	

// Implement the code

	public void push(String item) {
		if (header == null)
			header = new Node(null, item, null);
		else {
                        Node temp=peek();
			Node n = new Node(temp, item,null );
		    	temp.next = n;
		    	
		}
                count++;
	}
        public Node peek() {
		if (header == null)
			return null;
		else {
			Node temp = header;
			while (temp.next != null)
				temp = temp.next;
			return temp;
		}
	}
        public boolean pop(){
        Node temp=peek();
        if(temp==null) return false;
        temp.previous.next=null;
        temp.previous=null;
        count--;
        return true;
        
        }
        public int size(){
        
        return count;
        }
       
    public class Node {
		String value=null;
		Node next=null;
		Node previous=null;

		Node(Node previous, String value, Node next) {
			this.previous = previous;
			this.value = value;
			this.next = next;
		}

		public String toString() {
			return value;
		}
	}
    
}
