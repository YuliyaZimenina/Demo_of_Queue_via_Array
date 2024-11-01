package queue_for_int;

public class QueueForInt {
    int[] queueArrInt; // Array storing queue data
    int putIndex, extractIndex; // Indexes for positions of placing and retrieving queue elements

    //The constructor of the QueueForInt class creates an array of the specified size
    QueueForInt(int size) {
        queueArrInt = new int[size]; // Allocating memory for the queue
        putIndex = extractIndex = 0;
    }

    //Method for putting a number into queue
    void putElement(int num){
        if (putIndex == queueArrInt.length){
            System.out.println(" - The queue is overcrowded");
            return;
        }
        queueArrInt[putIndex++] = num;
    }

    int extractElement(){
        if (putIndex == extractIndex){
            System.out.println(" - The queue is empty");
            return 0;
        }
        return queueArrInt[extractIndex++];
    }
}
