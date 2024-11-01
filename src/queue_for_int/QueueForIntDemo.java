package queue_for_int;

public class QueueForIntDemo {
    public static void main(String[] args) {
        QueueForInt bigIntQueue = new QueueForInt(100);
        QueueForInt smallIntQueue = new QueueForInt(4);
        int num;
        int i;

        System.out.println("Using bigIntQueue to store numbers");
        for (i = 0; i < 100; i++)
            bigIntQueue.putElement(i + 1);

        System.out.println("Contents of bigIntQueue: ");
        for (i = 0; i < 100; i++) {
            num = bigIntQueue.extractElement();
            if (num != 0) System.out.print(num + " ");
        }
        System.out.println("\n");
        System.out.println("Using smallIntQueue to generate errors.");
        for (i = 0; i < 5; i++) {
            System.out.print("Attempt save: " + (100 - i));
            smallIntQueue.putElement(100 - i);
            System.out.println();
        }
        //Additional bugs in smallItnQueue
        System.out.print("Contents of smallIntQueue: ");
        for (i = 0; i < 5; i++){
            num = smallIntQueue.extractElement();
            if (num != 0) System.out.print(num + " ");
        }
    }
}
