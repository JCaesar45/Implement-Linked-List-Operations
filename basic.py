 class Node:
    def __init__(self, element):
        self.element = element
        self.next = None


class LinkedList:
    def __init__(self):
        self.head = None
        self.length = 0
    
    def is_empty(self):
        return self.length == 0
    
    def add(self, element):
        node = Node(element)
        
        if self.is_empty():
            self.head = node
        else:
            current = self.head
            while current.next is not None:
                current = current.next
            current.next = node
        
        self.length += 1
    
    def remove(self, element):
        previous = None
        current = self.head
        
        while current is not None and current.element != element:
            previous = current
            current = current.next
        
        if current is None:
            return
        
        if previous is not None:
            previous.next = current.next
        else:
            self.head = current.next
        
        self.length -= 1
    
    def contains(self, element):
        current = self.head
        while current is not None:
            if current.element == element:
                return True
            current = current.next
        return False
    
    def get_at(self, index):
        if index < 0 or index >= self.length or self.head is None:
            return None
        
        current = self.head
        current_index = 0
        
        while current is not None and current_index < index:
            current = current.next
            current_index += 1
        
        return current.element if current is not None else None
    
    def insert_at(self, index, element):
        if index < 0 or index > self.length:
            return
        
        node = Node(element)
        
        if index == 0:
            node.next = self.head
            self.head = node
        else:
            current = self.head
            current_index = 0
            
            while current is not None and current_index < index - 1:
                current = current.next
                current_index += 1
            
            if current is not None:
                node.next = current.next
                current.next = node
        
        self.length += 1
    
    def remove_at(self, index):
        if index < 0 or index >= self.length or self.head is None:
            return
        
        if index == 0:
            self.head = self.head.next
        else:
            current = self.head
            current_index = 0
            
            while current is not None and current_index < index - 1:
                current = current.next
                current_index += 1
            
            if current is not None and current.next is not None:
                current.next = current.next.next
        
        self.length -= 1
    
    def clear(self):
        self.head = None
        self.length = 0
