package com.ilidan.linkedlist;

import org.junit.Test;

/**
 * 单链表测试
 */ 
public class SingleLinkedListTest {

    @Test
    public void testAddLast(){

        SingleLinkedList<String> singleLinkedList = new SingleLinkedList<>();
        singleLinkedList.addLast("hello");
        singleLinkedList.addLast("world");
        singleLinkedList.addLast("elims");

    }

    @Test
    public void testGetCenterNode(){

        SingleLinkedList<String> singleLinkedList = new SingleLinkedList<>();
        singleLinkedList.addLast("hello");
        singleLinkedList.addLast("world");
        singleLinkedList.addLast("elims");
        singleLinkedList.addLast("Y");
        singleLinkedList.addLast("X");

        SingleLinkedList.Node<String> centerNode = singleLinkedList.getCenterNode();

        System.out.println(centerNode.getData());

    }


    @Test
    public void testReverse(){

        SingleLinkedList<String> singleLinkedList = new SingleLinkedList<>();
        singleLinkedList.addLast("hello");
        singleLinkedList.addLast("world");
//        singleLinkedList.addLast("elims");
//        singleLinkedList.addLast("Y");
//        singleLinkedList.addLast("X");

        singleLinkedList.print();
        System.out.println("---------");
        singleLinkedList.reverse();
        singleLinkedList.print();
        System.out.println("----------");
        singleLinkedList.reverse();
        singleLinkedList.print();

    }


    @Test
    public void testHasLoop() {

        SingleLinkedList<String> stringSingleLinkedList = new SingleLinkedList<>();

        SingleLinkedList.Node<String> node1 = new SingleLinkedList.Node<>("123");
        SingleLinkedList.Node<String> node2 = new SingleLinkedList.Node<>("456");
        SingleLinkedList.Node<String> node3 = new SingleLinkedList.Node<>("789");
        SingleLinkedList.Node<String> node4 = new SingleLinkedList.Node<>("101112");
        SingleLinkedList.Node<String> node5 = new SingleLinkedList.Node<>("131415");
        SingleLinkedList.Node<String> node6 = new SingleLinkedList.Node<>("161718");

        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);
        node4.setNext(node5);
        node5.setNext(node6);

        boolean b = stringSingleLinkedList.hasLoop(node1);
        System.out.println(b);


    }

    @Test
    public void mergeSortedSingleLinkedList() {

        SingleLinkedList.Node<Integer> node1 = new SingleLinkedList.Node<>(1);
        node1.setNext(new SingleLinkedList.Node<>(3));


        SingleLinkedList.Node<Integer> node2 = new SingleLinkedList.Node<>(1);
        node2.setNext(new SingleLinkedList.Node<>(1));
        SingleLinkedList<Integer> singleLinkedList = new SingleLinkedList<>();

        SingleLinkedList.Node<Integer> node = singleLinkedList.mergeSortedSingleLinkedList(node1, node2);

        while (node !=null) {
            System.out.println(node.getData());
            node = node.getNext();
        }

    }
}
