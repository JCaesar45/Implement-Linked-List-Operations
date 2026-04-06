public class LinkedList<T> {
    private Node<T> head;
    private int length;
    
    public LinkedList() {
        this.head = null;
        this.length = 0;
    }
    
    public static class Node<T> {
        T element;
        Node<T> next;
        
        public Node(T element) {
            this.element = element;
            this.next = null;
        }
    }
    
    public boolean isEmpty() {
        return length == 0;
    }
    
    public void add(T element) {
        Node<T> node = new Node<>(element);
        
        if (isEmpty()) {
            head = node;
        } else {
            Node<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = node;
        }
        
        length++;
    }
    
    public void remove(T element) {
        Node<T> previous = null;
        Node<T> current = head;
        
        while (current != null && !current.element.equals(element)) {
            previous = current;
            current = current.next;
        }
        
        if (current == null) return;
        
        if (previous != null) {
            previous.next = current.next;
        } else {
            head = current.next;
        }
        
        length--;
    }
    
    public boolean contains(T element) {
        Node<T> current = head;
        while (current != null) {
            if (current.element.equals(element)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }
    
    public T getAt(int index) {
        if (index < 0 || index >= length || head == null) {
            return null;
        }
        
        Node<T> current = head;
        int currentIndex = 0;
        
        while (current != null && currentIndex < index) {
            current = current.next;
            currentIndex++;
        }
        
        return current != null ? current.element : null;
    }
    
    public void insertAt(int index, T element) {
        if (index < 0 || index > length) {
            return;
        }
        
        Node<T> node = new Node<>(element);
        
        if (index == 0) {
            node.next = head;
            head = node;
        } else {
            Node<T> current = head;
            int currentIndex = 0;
            
            while (current != null && currentIndex < index - 1) {
                current = current.next;
                currentIndex++;
            }
            
            if (current != null) {
                node.next = current.next;
                current.next = node;
            }
        }
        
        length++;
    }
    
    public void removeAt(int index) {
        if (index < 0 || index >= length || head == null) {
            return;
        }
        
        if (index == 0) {
            head = head.next;
        } else {
            Node<T> current = head;
            int currentIndex = 0;
            
            while (current != null && currentIndex < index - 1) {
                current = current.next;
                currentIndex++;
            }
            
            if (current != null && current.next != null) {
                current.next = current.next.next;
            }
        }
        
        length--;
    }
    
    public void clear() {
        head = null;
        length = 0;
    }
    
    // Getters for testing
    public Node<T> getHead() {
        return head;
    }
    
    public int getLength() {
        return length;
    }
}
