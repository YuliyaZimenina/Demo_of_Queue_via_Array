package queue_for_double;

public class QueueForDouble {
    double[] doubles; // // Array storing queue data
    int putIndex, deriveIndex; // Indexes for positions of placing and retrieving queue elements

    //The constructor of the QueueForInt class creates an array of the specified size
    QueueForDouble(int size) {
        doubles = new double[size]; // Allocating memory for the queue
        putIndex = deriveIndex = 0;
    }

    //Method for putting a number into queue
    void putElement(double d) {
        if (putIndex == doubles.length) {
            System.out.println(" - The queue is overcrowded.");
            return;
        }
        doubles[putIndex++] = d;
    }
    //Method to extract a number from queue
    double deriveElement(){
        if (deriveIndex == putIndex){
            System.out.println("- The queue is empty");
            return 0;
        }
        return doubles[deriveIndex++];
    }
}
