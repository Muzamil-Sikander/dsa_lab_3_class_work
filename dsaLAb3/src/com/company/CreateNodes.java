package com.company;
class Node
{
    int data;
    Node next;

    Node(int data)
    {
        this.data = data;
        this.next = null;


    }
}

class LinkedListOperations
{
    Node head;


    void print(){
        Node curr = head;
        System.out.println(curr.next);
        while(curr!=null)

        {
            System.out.println(curr.data);
            System.out.println(curr.next);
            curr = curr.next;

        }
    }

    public void pushAtFirst(int new_data){
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;

    }
    public void pushAtLast(int new_data){
        Node lastNode = new Node(new_data);
        Node last = head;
        while(last.next != null){
            last = last.next;

        }
        last.next = lastNode;
    }
    public void insertNum(int index, int new_data)
    {
        Node curr = head;
        Node tempNode = new Node(new_data);
        int count = 0;
        while(count < index - 1)
        {
            curr = curr.next;
            count++;
        }
        tempNode.next = curr.next;
        curr.next = tempNode;
    }

}
public class CreateNodes {

    public static void main(String []args)
    {
        LinkedListOperations obj = new LinkedListOperations();
        Node p1 = new Node(10);
        Node p2 = new Node(20);
        Node p3 = new Node(30);
        Node p4 = new Node(40);
        Node p5 = new Node(50);


        p1.next = p2;
        p2.next = p3;
        p3.next = p4;
        p4.next = p5;
        obj.head = p1;
        obj.pushAtFirst(100);
        obj.pushAtLast(200);
        obj.insertNum(3,69);
        obj.insertNum(5,99);

        obj.print();



    }

}