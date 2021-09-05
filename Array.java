package com.mr;

public class Array {
private int [] array;
private int size;
public Array(int capacity)
{
	this.array = new int[capacity];
	size = 0;
}
/*
 * �������Ԫ��
 * @param element �����Ԫ��
 * @param index �����λ��
 */
public void insert(int element,int index)throws Exception
{
	//�жϷ����±��Ƿ񳬳���Χ
	if(index < 0 || index > size)
	{
		throw new IndexOutOfBoundsException("��������ʵ��Ԫ�ط�Χ");
	}
	if(size >= array.length)
	{
		resize();
	}
	for(int i = size - 1; i >= index; i--)
	{
		array[i + 1] = array[i];
	}
	array[index] = element;
	size++;
}
/*
 * ����ɾ��Ԫ��
 * @param index ɾ����λ��
 */
public int delete(int index)throws Exception
{
	if(index < 0 || index >= size)
	{
		throw new IndexOutOfBoundsException("��������ʵ��Ԫ�ط�Χ");
	}
	int val = array[index];
	for(int i = index; i < size - 1; i++)
	{
		array[i] = array[i + 1];
	}
	size--;
	return val;
}
/*
 * ��������
 */
public void resize()
{
	int [] arrayNew = new int [array.length + 1];
	//�Ӿ����鸴�Ƶ�������
	System.arraycopy(array, 0, arrayNew, 0, array.length);
	array = arrayNew;
}
/*
 * �������
 */
public void output()
{
	for(int i = 0; i < size; i++)
	{
		System.out.println(array[i]);
	}
}
	public static void main(String[] args) throws Exception{
		Array array = new Array(5);
		array.insert(1, 0);
		array.insert(2, 1);
		array.insert(3, 2);
		array.insert(4, 3);
		array.insert(5, 4);
		array.insert(6, 5);
		System.out.println(array.delete(5));
		array.output();
	}
}