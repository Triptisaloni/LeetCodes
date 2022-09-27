class MyCircularQueue 
{
    int arr[];
    int front; int rear; int len;

    public MyCircularQueue(int k) {
        arr = new int[k];
        front = 0; rear =-1;
        len = 0;
    }
    
    public boolean enQueue(int value) 
    {
        if(!isFull())
        {
            rear = (rear+1)%arr.length;
            arr[rear]= value;
            len++;
            return true;
        }
        return false;
    }
    
    public boolean deQueue() 
    {
        if(isEmpty())
            return false;
        
        front = (front+1)%arr.length;
        len--;
        return true;
    }
    
    public int Front() 
    {
        if(isEmpty())
            return -1;
        
        return arr[front];
    }
    
    public int Rear() 
    {
        if(isEmpty())
            return -1;
        return arr[rear];
    }
    
    public boolean isEmpty() 
    {
        return len==0;
    }
    
    public boolean isFull()
    {
        return (len == arr.length);
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