package com.mr;

public class List {
//ͷָ��ڵ�
	private Node head;
//βָ��ڵ�	
	private Node last;
//����ʵ�ʳ���
	private int size = 0;
	/*
	 *����ʵ�ʳ���
	 *@param data ����Ԫ��
	 *@param index ����Ԫ�� 
	 */
	public void insert(int data,int index) throws Exception
	{
		if(index < 0 || index > size)
		{
			throw new IndexOutOfBoundsException("��������ڵ㷶Χ"); 
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
	 * ����ɾ��Ԫ��
	 * @param index 
	 */
	public Node remove(int index) throws Exception
	{
		if(index < 0 || index >= size)
		{
			throw new IndexOutOfBoundsException("��������ڵ㷶Χ");
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
	 * �������Ԫ��
	 * @param index ���ҵ�λ��
	 */
	public Node get(int index) throws Exception
	{
		if(index < 0 || index >= size)
		{
			throw new IndexOutOfBoundsException("��������ڵ㷶Χ");
		}
		Node temp = head;
		for(int i = 0; i < index; i++)
		{
			temp = temp.next;
		}
		return temp;
	}
	/*
	 * �������
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
	 * ����ڵ�
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
