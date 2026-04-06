function initList() {
  return {
    head: null,
    length: 0
  };
}

function isEmpty(list) {
  return list.length === 0;
}

function add(list, element) {
  const node = { element, next: null };

  if (isEmpty(list)) {
    list.head = node;
  } else {
    let current = list.head;
    while (current.next !== null) {
      current = current.next;
    }
    current.next = node;
  }

  list.length++;
}

function remove(list, element) {
  let previous = null;
  let current = list.head;

  while (current !== null && current.element !== element) {
    previous = current;
    current = current.next;
  }

  if (current === null) return;

  if (previous !== null) {
    previous.next = current.next;
  } else {
    list.head = current.next;
  }

  list.length--;
}

function contains(list, element) {
  let current = list.head;
  while (current !== null) {
    if (current.element === element) {
      return true;
    }
    current = current.next;
  }
  return false;
}

function getAt(list, index) {
  // Check for invalid index or empty list
  if (index < 0 || index >= list.length || list.head === null) {
    return undefined;
  }
  
  let current = list.head;
  let currentIndex = 0;
  
  while (current !== null && currentIndex < index) {
    current = current.next;
    currentIndex++;
  }
  
  return current !== null ? current.element : undefined;
}

function insertAt(list, index, element) {
  // Check for invalid index
  if (index < 0 || index > list.length) {
    return;
  }
  
  const node = { element, next: null };
  
  // Insert at the beginning
  if (index === 0) {
    node.next = list.head;
    list.head = node;
  } else {
    let current = list.head;
    let currentIndex = 0;
    
    // Traverse to the node before the insertion point
    while (current !== null && currentIndex < index - 1) {
      current = current.next;
      currentIndex++;
    }
    
    if (current !== null) {
      node.next = current.next;
      current.next = node;
    }
  }
  
  list.length++;
}

function removeAt(list, index) {
  // Check for invalid index or empty list
  if (index < 0 || index >= list.length || list.head === null) {
    return;
  }
  
  // Remove from the beginning
  if (index === 0) {
    list.head = list.head.next;
  } else {
    let current = list.head;
    let currentIndex = 0;
    
    // Traverse to the node before the one to remove
    while (current !== null && currentIndex < index - 1) {
      current = current.next;
      currentIndex++;
    }
    
    if (current !== null && current.next !== null) {
      current.next = current.next.next;
    }
  }
  
  list.length--;
}

function clear(list) {
  list.head = null;
  list.length = 0;
}
