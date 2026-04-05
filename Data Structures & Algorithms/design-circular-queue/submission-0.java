class MyCircularQueue {

    int[] circularArray;
    int front;
    int rear;
    int items;
    int size;

    public MyCircularQueue(int k) {
        circularArray = new int[k];
        this.size = k;
        items = 0;
        front = 0;
        rear = 0;
    }
    
    public boolean enQueue(int value) {
        if(items < size) {
            circularArray[rear] = value;
            rear = (rear + 1 )%size;
            items += 1;
            return true;
        }
        return false;
    }
    
    public boolean deQueue() {
       if(items > 0) {
        front = (front + 1) % size;
        items -= 1;
        return true;
       }
       return false;
    }
    
    public int Front() {
        return circularArray[front];
    }
    
    public int Rear() {
        return circularArray[(rear-1 + size)%size];
    }
    
    public boolean isEmpty() {
        return items == 0;
    }
    
    public boolean isFull() {
        return items == size;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */