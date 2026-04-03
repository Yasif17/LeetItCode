class MyCircularDeque {
    // static final int max = 2000;
    int capacity;
    int arr[];
    int front,rear;

    public MyCircularDeque(int k) {
         capacity = k;
        arr = new int[capacity];
        front = rear =-1;
    }

     
    
    public boolean insertFront(int value) {
        if(front==0 && rear==capacity-1 || front==rear+1) return false;

        if(front==-1){
            front = rear = 0;
        }else if(front==0){
            front = capacity-1;
        }else{
            front = front-1;
        }
        arr[front] = value;
        return true;
    }
    
    public boolean insertLast(int value) {
        if(front==0 && rear==capacity-1 || front==rear+1) return false;

        if(front==-1){
            front = rear = 0;
        }else if(rear == capacity-1){
            rear = 0;
        }else{
            rear = rear+1;
        }
        arr[rear] = value;
        return true;
    }
    
    public boolean deleteFront() {
        if(front==-1) return false;

        int value = arr[front];

        if(front==rear){
            front = rear = -1;
        }else if(front == capacity-1){
            front = 0;
        }else{
            front = front+1;
        }
        return true;
    }
    
    public boolean deleteLast() {
        if(front==-1) return false;

        if(front == rear){
            front = rear = -1;
        }else if(rear == 0){
            rear = capacity-1;
        }else{
            rear = rear-1;
        }
        return true;
    }
    
    public int getFront() {
        if(front==-1) return -1;
        return arr[front];
    }
    
    public int getRear() {
        if(front==-1) return -1;
        return arr[rear];
    }

    public boolean isEmpty() {
        return front==-1;
    }
    
    public boolean isFull() {
        return front==0 && rear==capacity-1 || front==rear+1;
    }
    
   
}

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */