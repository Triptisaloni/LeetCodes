import java.util.*;
class LRUCache {

    class Node
    {
        int key;
        int value;
        
        Node prev;
        Node next;
        
        public Node(){}
        
        public Node(int key, int value)
        {
            this.key=key;
            this.value = value;
        }
    }
    
    HashMap<Integer, Node> cache;
    int capacity;
    Node head;
    Node tail;
    
    public LRUCache(int capacity) 
    {
        this.capacity = capacity;
        cache = new HashMap<>();
        head = new Node();
        tail = new Node();
        
        head.next=tail;
        tail.prev = head;
        
    }
    
    public int get(int key) {
        
        if(cache.containsKey(key))
        {
            Node found = cache.get(key);
            remove(found);
            addFirst(found);
            
            return found.value;
        }
        else
            return -1;
    }
    
    public void put(int key, int value) 
    {
        if(cache.containsKey(key))
        {
            Node found = cache.get(key);
            
            remove(found);               
            found.value = value;
            addFirst(found);
      
            cache.put(key, found);
        }
        else
        {
            if(capacity == cache.size())
            {
                Node lru = tail.prev;
                remove(lru);
                cache.remove(lru.key);
            }
            
            Node newNode = new Node(key, value);
            addFirst(newNode);
            cache.put(key, newNode);
        }
    }
    
    public void addFirst(Node node)
    {
        Node fwd= head.next;
        
        head.next =node;
        node.next = fwd;
        fwd.prev = node;
        node.prev=head;
    }
    
    public void remove(Node node)
    {
        Node back = node.prev;
        Node fwd= node.next;
        
        back.next = fwd;
        fwd.prev = back;
        
        node.prev= null;
        node.next = null;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */