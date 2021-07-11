package com.Coding_Blocks;

public class dynamic_queue extends queue {
    @Override
    public void enqueue(int item) throws Exception {
        if (isfull()) {
            int[] new_arr = new int[arr.length * 2];
            for (int i = 0; i < size; i++) {
                new_arr[i] = arr[(front + i) % arr.length];
            }
            front = 0;
            arr = new_arr;
        }
        super.enqueue(item);
    }

    public static void main(String[] args) throws Exception {
        dynamic_queue a = new dynamic_queue();
        a.enqueue(10);
        a.enqueue(20);
        a.enqueue(30);
        a.enqueue(40);
        a.enqueue(50);
        a.enqueue(60);
        a.disp();
        a.dequeue();
        a.dequeue();
        a.enqueue(10);
        a.enqueue(20);
        a.disp();
    }

}