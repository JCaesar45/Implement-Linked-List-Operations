# Linked List Visualizer

An interactive, real-time visualization engine for singly linked list data structures. Built with vanilla JavaScript, featuring cyberpunk aesthetics, smooth animations, and comprehensive operation support.

## Features

### Core Operations
- **Add** - Append nodes to tail with O(n) traversal visualization
- **Insert At** - Insert at any valid index with pointer manipulation display  
- **Remove** - Delete by value with search traversal highlighting
- **Remove At** - Delete by index with boundary checking
- **Contains** - Search with index return and visual feedback
- **Get At** - Random access with bounds validation
- **Clear** - Instant list reset with memory cleanup

### Visual Features
- Real-time node rendering with pointer visualization
- Animated transitions for all operations
- Console logging with timestamps and color coding
- Statistics dashboard (length, head, nodes, operations)
- Hover tooltips showing node structure
- Responsive grid layout
- CRT noise and scanline effects
- Glitch text animations

### Technical Stack
- Pure HTML5/CSS3/JavaScript (no dependencies)
- CSS Grid & Flexbox layouts
- CSS animations and keyframes
- Event-driven architecture
- Object-oriented design pattern

## Usage

Open `index.html` in any modern browser. No build step or server required.

### Keyboard Shortcuts
- Press `Enter` in any input field to execute the associated operation

### Operation Details

| Operation | Time Complexity | Description |
|-----------|----------------|-------------|
| Add | O(n) | Traverses to tail, appends new node |
| Insert At | O(n) | Traverses to index, rewires pointers |
| Remove | O(n) | Searches by value, removes first match |
| Remove At | O(n) | Direct index access with bounds check |
| Contains | O(n) | Linear search with early exit |
| Get At | O(n) | Index-based retrieval |

## Browser Support

- Chrome 90+
- Firefox 88+
- Safari 14+
- Edge 90+

## License

MIT License - Feel free to use for educational or commercial projects.
