package com.Coding_Blocks;

import java.io.OptionalDataException;

public class stack {
    protected int[] arr;
    protected int tos;

    public stack(){
        this.arr=new int[5];
        this.tos=-1;
    }
    public stack(int capa){
        this.arr=new int[capa];
        this.tos=-1;
    }
    public void push(int item) throws Exception {
        if(isfull()){
            throw new Exception("stack is full");
        }
        tos++;
        this.arr[tos]=item;
    }
    public int pop() throws Exception{
        if(isempty()){
            throw new Exception("stack is empty");
        }
        int temp = arr[tos];
        tos--;
        return temp;
    }
    public int peek(){
        return arr[tos];
    }
    public int size(){
        return tos+1;
    }
    public boolean isfull(){
        return size()==arr.length;
    }
    public boolean isempty(){
        return size()==0;
    }
    public void disp(){
        int temp1=tos;
        while(temp1>=0){
            System.out.print(arr[temp1]+" ");
            temp1--;
        }
        System.out.println();
    }

    public static void main(String[] args) throws Exception {
        stack st = new stack();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.disp();
        st.pop();
        st.disp();

    }
}
