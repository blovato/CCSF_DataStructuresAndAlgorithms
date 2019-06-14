package project_e;

import java.util.*;

public class BinarySearchTreeWithDups<T extends Comparable<? super T>> extends BinarySearchTree<T>
        implements SearchTreeInterface<T>, java.io.Serializable {

    public BinarySearchTreeWithDups() {
        super();
    }

    public BinarySearchTreeWithDups(T rootEntry) {
        super(rootEntry);
        setRootNode(new BinaryNode<T>(rootEntry));
    }

    @Override
    public T add(T newEntry) {
        T result = newEntry;
        if (isEmpty()) {
            setRootNode(new BinaryNode<T>(newEntry));
        } else {
            addEntryHelperNonRecursive(newEntry);
        }
        return result;
    }

    // YOUR CODE HERE! THIS METHOD CANNOT BE RECURSIVE.
    private void addEntryHelperNonRecursive(T newEntry) {
        boolean entryAdded = false;
        BinaryNode<T> currentNode = getRootNode();
        
        while (!entryAdded) {
            int comparison = newEntry.compareTo(currentNode.getData());
            if (comparison == 0 || comparison < 0) {
                if (currentNode.hasLeftChild()) {
                    currentNode = currentNode.getLeftChild();
                } else {
                    currentNode.setLeftChild(new BinaryNode<>(newEntry));
                    entryAdded = true;
                }
            }
            if (comparison > 0) {
                if (currentNode.hasRightChild()) {
                    currentNode = currentNode.getRightChild();
                } else {
                    currentNode.setRightChild(new BinaryNode<>(newEntry));
                    entryAdded = true;
                }
            }
        }
    }

    // YOUR CODE HERE! THIS METHOD CANNOT BE RECURSIVE.
    // MAKE SURE TO TAKE ADVANTAGE OF THE SORTED NATURE OF THE BST!
    public int countEntriesNonRecursive(T target) {
        // this initial code is meant as a suggestion to get your started- use it or delete it!
        int count = 0;
        boolean end = false;
        BinaryNode<T> currentNode = getRootNode();

        while(!end) {
            int comparison = target.compareTo(currentNode.getData());
            if (comparison == 0) count++;
            if (comparison <= 0) {
                if (currentNode.hasLeftChild()) {
                    currentNode = currentNode.getLeftChild();
                } else {
                    end = true;
                }
            }
            if (comparison > 0) {
                if (currentNode.hasRightChild()) {
                    currentNode = currentNode.getRightChild();
                } else {
                    end = true;
                }
            }
        }

        return count;
    }

    // YOUR CODE HERE! MUST BE RECURSIVE! YOU ARE ALLOWED TO CREATE A PRIVATE HELPER.
    // MAKE SURE TO TAKE ADVANTAGE OF THE SORTED NATURE OF THE BST!
    public int countGreaterRecursive(T target) {
        // this initial code is meant as a suggestion to get your started- use it or delete it!
        int count = 0;
        BinaryNode<T> rootNode = getRootNode();
        return countGreaterHelperRecursive(rootNode, target, count);
    }
    
    private int countGreaterHelperRecursive(BinaryNode<T> currentNode, T target, int count) {
        int leftTreeCount = 0;
        int rightTreeCount = 0;
        int comparison = target.compareTo(currentNode.getData());

        if (currentNode.hasLeftChild() && comparison <= 0) {
            leftTreeCount = countGreaterHelperRecursive(
                currentNode.getLeftChild(),
                target,
                count
            );
        }
        if (currentNode.hasRightChild()) {
            rightTreeCount = countGreaterHelperRecursive(
                currentNode.getRightChild(),
                target,
                count
            );
        }

        if (comparison < 0) count++;

        return count + leftTreeCount + rightTreeCount;
    }

    // YOUR CODE HERE! MUST USE A STACK!! MUST NOT BE RECURSIVE! 
    // MAKE SURE TO TAKE ADVANTAGE OF THE SORTED NATURE OF THE BST!
    public int countGreaterWithStack(T target) {
        int count = 0;
        BinaryNode<T> rootNode = getRootNode();
        Stack<BinaryNode<T>> nodeStack = new Stack<BinaryNode<T>>();
        nodeStack.push(rootNode);
        
        while (!nodeStack.isEmpty()) {
            BinaryNode<T> currentNode = nodeStack.pop();
            int comparison = target.compareTo(currentNode.getData());
            
            if (currentNode.hasLeftChild() && comparison < 0) {
                nodeStack.push(currentNode.getLeftChild());
            }
            if (currentNode.hasRightChild()) {
                nodeStack.push(currentNode.getRightChild());
            }

            if (comparison < 0) count++;
        }
        return count;
    }

    // YOUR EXTRA CREDIT CODE HERE! THIS METHOD MUST BE O(n). 
    // YOU ARE ALLOWED TO USE A HELPER METHOD. THE METHOD CAN BE ITERATIVE OR RECURSIVE. 
    public int countUniqueValues() {
        HashMap<T, Boolean> uniqueHash = new HashMap<>();

        BinaryNode<T> rootNode = getRootNode();
        Stack<BinaryNode<T>> nodeStack = new Stack<BinaryNode<T>>();
        nodeStack.push(rootNode);
        
        while (!nodeStack.isEmpty()) {
            BinaryNode<T> currentNode = nodeStack.pop();
            T key = currentNode.getData();
            
            uniqueHash.put(key, true);
            
            if (currentNode.hasLeftChild()) {
                nodeStack.push(currentNode.getLeftChild());
            }
            if (currentNode.hasRightChild()) {
                nodeStack.push(currentNode.getRightChild());
            }
        }
        
        return uniqueHash.size();
    }

    public int getLeftHeight() {
        BinaryNode<T> rootNode = getRootNode();
        if (rootNode == null) {
            return 0;
        } else if (!rootNode.hasLeftChild()) {
            return 0;
        } else {
            return rootNode.getLeftChild().getHeight();
        }
    }

    public int getRightHeight() {
        BinaryNode<T> rootNode = getRootNode();
        if (rootNode == null) {
            return 0;
        } else if (!rootNode.hasRightChild()) {
            return 0;
        } else {
            return rootNode.getRightChild().getHeight();
        }
    }

}
