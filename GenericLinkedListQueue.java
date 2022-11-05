
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericlinkedlistqueue;

/**
 *
 * @author apple
 */
public class GenericLinkedListQueue<Type> {
    Node<Integer> first,last;
    int size;

    public GenericLinkedListQueue() {
        size = 0;
        first = null;
        last = null;
    }
    public boolean isEmpty() {
        return first == null;
    }
    public void enqueue(Type item) {
        Node<Type> newNode = new Node(item);
        if(isEmpty()) {
            first = (Node<Integer>) newNode;
            last = (Node<Integer>) newNode;
        }
        last.next = (Node<Integer>) newNode;
        last = (Node<Integer>) newNode;
        size++;
    }
    public Node<Type> dequeue() {
        if(isEmpty()) {
            throw new IllegalArgumentException("There is no element in the linkedlist!");
        }
        Node<Type> deletedItem = (Node<Type>) first;
        first = first.next;
        deletedItem.next = null;
        size--;
        return deletedItem;
    }
    public Node<Type> peek() {
        return (Node<Type>) first;
    }
    public int getMax() {
        int max = first.item;
        Node<Integer> temp = first;
        while(temp != null) {
            if(temp.item > max) {
                max = temp.item;
            }
            temp = temp.next;
        }
        return max;
    }
    public void printQueue() {
        if(isEmpty()) {
            return;
        }
        Node<Type> temp = (Node<Type>) first;
        while(temp != null) {
            System.out.println(temp.item + " -> ");
           temp = temp.next; 
        }
        System.out.println("");
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
