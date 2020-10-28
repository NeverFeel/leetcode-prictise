package com.ilidan.linkedlist;

/**
 * 单链表
 * <p>
 * 单链表反转√
 * 链表中环的检测√
 * 两个有序的链表合并√
 * 删除链表倒数第 n 个结点√
 * 求链表的中间结点√
 */
public class SingleLinkedList<T> {

    private Node<T> head = new Node<>(null);

    /**
     * 合并有序的单链表
     * @param node1 有序的单链表1
     * @param node2 有序的单链表2
     */
    public Node<Integer> mergeSortedSingleLinkedList(Node<Integer> node1, Node<Integer> node2) {
        Node<Integer> mergeNode = null;

        if (node1 == null && node2 == null) {
            return mergeNode;
        }
        if (node1 == null) {
            return  node2;
        }

        if (node2 == null) {
            return node1;
        }

        Integer data1 = node1.getData();
        Integer data2 = node2.getData();

        //决定首个结点
        if (data1 <= data2) {
            mergeNode =  node1;
            node1 = node1.getNext();
        } else {
            mergeNode =  node2;
            node2 = node2.getNext();
        }

        Node<Integer> currentNode = mergeNode;
        //自己画个图，特别简单
        while (node1 != null && node2 != null) {
            data1 = node1.getData();
            data2 = node2.getData();
            if (data1 <= data2) {
                currentNode.setNext(node1);
                node1 = node1.getNext();
            } else {
                currentNode.setNext(node2);
                node2 = node2.getNext();
            }
            currentNode = currentNode.getNext();
        }

        //兜底
        if (node2 == null) {
            currentNode.setNext(node1);
        } else {
            currentNode.setNext(node2);
        }

        return mergeNode;
    }

    /**
     * 判断当前节点是否有环（快慢指针法）
     * @param node 当前节点
     * @return true：有环，false：无环
     */
    public boolean hasLoop(Node<T> node){
        if (node == null) {
            return false;
        }

        Node<T> slowNode = node;
        Node<T> fastNode = node.getNext();
        if (fastNode == null) {
            return false;
        }

        while (fastNode != null && fastNode.getNext() != null) {
            fastNode = fastNode.getNext().getNext();
            slowNode = slowNode.getNext();
            if (slowNode == fastNode) {
                return true;
            }
        }

        return false;

    }

    /**
     * 链表反转
     */
    public void reverse(){
        Node<T> sentinelNode = this.head;
        Node<T> preNode = sentinelNode.getNext();
        if (preNode == null) {
            return;
        }
        Node<T> currentNode = preNode.getNext();
        if (currentNode == null) {
            return;
        }
        preNode.setNext(null);
        while (currentNode.getNext() != null) {
            Node<T> tempNode = currentNode.getNext();
            currentNode.setNext(preNode);
            preNode = currentNode;
            currentNode = tempNode;
        }
        currentNode.setNext(preNode);
        this.head.setNext(currentNode);

    }

    /**
     * 获取中间结点
     */
    public Node<T> getCenterNode(){
        Node<T> fastNode = this.head;
        Node<T> slowNode = this.head;
        while (fastNode != null && fastNode.getNext() != null) {
            fastNode = fastNode.getNext().getNext();
            slowNode = slowNode.getNext();
        }
        return slowNode;
    }

    /**
     * 添加
     * @param data 元素
     */
    public void addLast(T data) {
        Node<T> next = this.head;
        while (next.getNext() != null) {
            next = next.getNext();
        }
        next.setNext(new Node<>(data));
    }

    /**
     * 删除最后一个元素
     */
    public T deleteLast() {
        return deleteLast(1);
    }


    /**
     * 删除倒数第i个结点
     */
    public T deleteLast(int i){
        if (i<=0) {
            throw new UnsupportedOperationException("索引i值不能小于等于0");
        }
        //先让指针移动i个位置
        Node<T> next = this.head;
        int index = 0;
        while (next != null) {
            if (index == i) {
                break;
            }
            next = next.getNext();
            index++;
        }
        if (next == null) {
            return null;
        }

        Node<T> beforeNode = this.head;
        //当next结点到达链表的最后一个结点时，此时的beforeNode即为要删除结点的前一个结点
        while (next.getNext() != null) {
            next = next.getNext();
            beforeNode = beforeNode.getNext();
        }

        Node<T> deleteNode = beforeNode.getNext();
        if (deleteNode == null){
            return null;
        }

        beforeNode.setNext(deleteNode.getNext());
        return deleteNode.getData();
    }

    /**
     * 数据打印
     */
    public void print() {
        Node<T> currentNode = this.head;
        while (currentNode != null) {
            T data = currentNode.getData();
            if (data != null) {
                System.out.println(data);
            } else {
                System.out.println("哨兵节点");
            }
            currentNode = currentNode.getNext();
        }
    }


    public Node<T> getHead() {
        return head;
    }

    public static class Node<T> {

        private T data;

        private Node<T> next;

        Node(T data) {
            this.data = data;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }

        public Node<T> getNext() {
            return next;
        }

        public void setNext(Node<T> next) {
            this.next = next;
        }
    }

}
