package module_11_hashing;

import java.util.Objects;

public class VoterHashTableSeparateChaining {

    private Node<Voter>[] hashTable;
    private int tableSize;

    public VoterHashTableSeparateChaining(int size) {
        hashTable = (Node<Voter>[]) new Node[size];
        tableSize = size;
    }

    public int getHashLocation(int voterID) {
        return voterID % tableSize;
    }

    public boolean addVoter(Voter voterToAdd) {
        int location = getHashLocation(voterToAdd.getId());
        Node<Voter> currentNode = hashTable[location];
        if (currentNode == null) {
            hashTable[location] = new Node(voterToAdd);
            return true;
        }
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = new Node(voterToAdd);
        return true;
    }

    public Voter getVoter(int voterID) {
        int location = getHashLocation(voterID);
        Voter foundVoter = null;
        if (hashTable[location] == null) {
            return null;
        }
        Node<Voter> currentNode = hashTable[location];
        while (currentNode != null) {
            Voter currentVoter = currentNode.getData();
            if (currentVoter != null && currentVoter.getId() == voterID) {
                foundVoter = currentVoter;
                break;
            }
            currentNode = currentNode.next;
        }
        return foundVoter;
    }

    public void printTable() {
        for (int i = 0; i < tableSize; i++) {
            if (hashTable[i] != null) {
                System.out.print(i + ": ");
                Node<Voter> current = hashTable[i];
                while (current != null && current.next != null) {
                    System.out.print(current.data.getName() + " -> ");
                    current = current.next;
                }
                System.out.println(current.data.getName());
            }
        }
    }

}
