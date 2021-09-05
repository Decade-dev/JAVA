package com.mr;

public class List {
//头指针节点
	private Node head;
//尾指针节点	
	private Node last;
//链表实际长度
	private int size = 0;
	/*
	 *链表实际长度
	 *@param data 插入元素
	 *@param index 插入元素 
	 */
	public void insert(int data,int index) throws Exception
	{
		if(index < 0 || index > size)
		{
			throw new IndexOutOfBoundsException("超出链表节点范围"); 
		}
		Node insertedNode = new Node(data);
		if(size == 0)
		{
			head = insertedNode;
			last = insertedNode;
		}
		else if(size == index)
		{
			last.next = insertedNode;
			last = insertedNode;
		}
		else
		{
			Node prevNode = get(index - 1);
			Node nextNode = prevNode.next;
			prevNode.next = insertedNode;
			insertedNode.next = nextNode;
		}
		size++;
	}
	/*
	 * 链表删除元素
	 * @param index 
	 */
	public Node remove(int index) throws Exception
	{
		if(index < 0 || index >= size)
		{
			throw new IndexOutOfBoundsException("超出链表节点范围");
		}
		Node removedNode = null;
		if(index == 0)
		{
			removedNode = head;
			head = head.next;
		}
		else if(index == size - 1)
		{
			Node prevNode = get(index - 1);
			removedNode = prevNode.next;
			prevNode.next = null;
			last = prevNode;
		}
		else
		{
			Node prevNode = get(index - 1);
			Node nextNode = prevNode.next.next;
			removedNode = prevNode.next;
			prevNode.next = nextNode;
		}
		size--;
		return removedNode;
	}
	/*
	 * 链表查找元素
	 * @param index 查找的位置
	 */
	public Node get(int index) throws Exception
	{
		if(index < 0 || index >= size)
		{
			throw new IndexOutOfBoundsException("超出链表节点范围");
		}
		Node temp = head;
		for(int i = 0; i < index; i++)
		{
			temp = temp.next;
		}
		return temp;
	}
	/*
	 * 输出链表
	 */
	public void output()
	{
		Node temp = head;
		while(temp != null)
		{
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	/*
	 * 链表节点
	 */
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		List list = new List();
		list.insert(3, 0);
		list.insert(4, 1);
		list.insert(5, 2);
		list.insert(6, 3);
		list.insert(7, 4);
		list.remove(0);
		list.output();

	}

}
class Node
{
	int data;
	Node next;
	Node(int data)
	{
		this.data = data;
		next = null;
	}
}
