package com.Coding_Blocks;

public class dynamic_stack extends stack{
    @Override
    public void push(int item) throws Exception{
        if(isfull()){
            int[] temp = new int[arr.length*2];
            for(int i=0;i<=tos;i++){
                temp[i]=arr[i];
            }
            arr=temp;
        }
        super.push(item);
    }

    public static void main(String[] args) throws Exception {
        dynamic_stack a = new dynamic_stack();
        a.push(10);
        a.push(20);
        a.push(30);
        a.push(40);
        a.push(50);
        a.disp();
        a.push(60);
        a.disp();
    }
}

