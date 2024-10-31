public class Queue {
    char[] queueArray; // Array storing queue data
    int putLoc, getLoc; // Indexes for positions of placing and retrieving queue elements

    //The constructor of the Queue class creates an array of the specified size
    Queue (int size){
        queueArray = new char[size]; // Allocating memory for the queue
        putLoc = getLoc = 0;
    }

    //Method that puts a character into a queue
    void putElement(char ch){
        if (putLoc == queueArray.length){
            System.out.println(" - The queue is overcrowded");
            return;
        }
        queueArray[putLoc++] = ch;
    }

    //Remove a character from the queue
    char getElement(){
        if (getLoc == putLoc){
            System.out.println(" - The queue is empty");
            return (char) 0;
        }
        return queueArray[getLoc++];
    }
}
