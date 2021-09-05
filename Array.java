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
 * 数组插入元素
 * @param element 插入的元素
 * @param index 插入的位置
 */
public void insert(int element,int index)throws Exception
{
	//判断访问下表是否超出范围
	if(index < 0 || index > size)
	{
		throw new IndexOutOfBoundsException("超出数组实际元素范围");
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
 * 数组删除元素
 * @param index 删除的位置
 */
public int delete(int index)throws Exception
{
	if(index < 0 || index >= size)
	{
		throw new IndexOutOfBoundsException("超出数组实际元素范围");
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
 * 数组扩容
 */
public void resize()
{
	int [] arrayNew = new int [array.length + 1];
	//从旧数组复制到新数组
	System.arraycopy(array, 0, arrayNew, 0, array.length);
	array = arrayNew;
}
/*
 * 输出数组
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