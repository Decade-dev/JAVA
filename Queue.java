package com.mr;

public class Queue {
	private int [] array;
	private int front;
	private int rear;
	public Queue(int capacity)
	{
		this.array = new int[capacity];
	}
	/*
	 * ���
	 * @param element ��ӵ�Ԫ��
	 */
	public void enQueue(int element)throws Exception
	{
		if((rear+1) % array.length == front)
		{
			throw new Exception("�������");
		}
		array[rear] = element;
		rear = (rear + 1)%array.length;
	}
	/*
	 * ����
	 */
	public int deQueue()throws Exception
	{
		if(rear == front)
		{
			throw new Exception("�����ѿ�");
		}
		int deQueueelement = array[front];
		front = (front + 1)%array.length;
		return deQueueelement;
	}
	/*
	 * �������
	 */
	public void output()
	{
		for(int i = front; i != rear; i = (i + 1)%array.length)
		{
			System.out.println(array[i]);
		}
		System.out.println();
	}
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		Queue queue = new Queue(5);
		queue.enQueue(1);
		queue.enQueue(2);
		queue.enQueue(3);
		queue.enQueue(4);
		queue.deQueue();
		queue.deQueue();
		queue.deQueue();
		queue.enQueue(99);
		queue.output();
	}

}
