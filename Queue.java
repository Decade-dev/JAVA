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
	 * 入队
	 * @param element 入队的元素
	 */
	public void enQueue(int element)throws Exception
	{
		if((rear+1) % array.length == front)
		{
			throw new Exception("入队已满");
		}
		array[rear] = element;
		rear = (rear + 1)%array.length;
	}
	/*
	 * 出队
	 */
	public int deQueue()throws Exception
	{
		if(rear == front)
		{
			throw new Exception("队列已空");
		}
		int deQueueelement = array[front];
		front = (front + 1)%array.length;
		return deQueueelement;
	}
	/*
	 * 输出队列
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
