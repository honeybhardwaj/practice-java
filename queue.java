package com.Coding_Blocks;

public class queue {
    protected int[] arr;
    protected int front;
    protected int size;

    public queue(){
        arr= new int[5];
        front=0;
        size=0;
    }
    public queue(int capa){
        arr=new int[capa];
        front=0;
        size=0;
    }
    public int getfront(){
        return  arr[front];
    }
    public boolean isfull(){
        return size == arr.length;
    }
    public boolean isempty(){
        return size == 0;
    }
    public void enqueue(int item) throws Exception{
        if(isfull()){
            throw new Exception("Queue is full");
        }
        arr[(front+size)%arr.length]=item;
        size++;
    }
    public int dequeue() throws Exception{
        if(isempty()){
            throw new Exception("Queue is empty");
        }
        int temp=arr[front];
        size--;
        front=(front+1)%arr.length;
        return temp;
    }
    public void disp(){
        for(int i=0;i<size;i++){
            System.out.print(arr[(i+front)%arr.length]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) throws Exception{
        queue qq= new queue();
        qq.enqueue(10);
        qq.enqueue(20);
        qq.enqueue(30);
        qq.enqueue(40);
        qq.enqueue(50);
        qq.disp();
        qq.dequeue();
        qq.disp();
        qq.enqueue(10);
        qq.disp();
    }
}
