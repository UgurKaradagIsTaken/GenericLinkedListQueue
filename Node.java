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
public class Node<Type> {
    Node<Type> next;
    Type item;

    public Node(Type item) {
        this.item = item;
        next = null;
    }
    
}
