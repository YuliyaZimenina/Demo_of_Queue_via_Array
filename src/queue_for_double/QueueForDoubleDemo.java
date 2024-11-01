package queue_for_double;

public class QueueForDoubleDemo {
    public static void main(String[] args) {
        QueueForDouble bigDoubleQueue = new QueueForDouble(100);
        QueueForDouble smallDoubleQueue = new QueueForDouble(4);
        double d;
        int i;

        System.out.println("Using bigDoubleQueue to store numbers");
        // Заполняем bigDouble значениями
        for (i = 0; i < 100; i++)
            bigDoubleQueue.putElement(1.45 + i);

        // Извлекаем элементы bigDouble
        System.out.println("Contents of bigIntQueue: ");
        for (i = 0; i < 100; i++){
            d = bigDoubleQueue.deriveElement();
            if (d != 0) System.out.print(d + " / ");
        }
        System.out.println("\n");
        System.out.println("Using smallIntQueue to generate errors.");
        for (i = 0; i < 5; i++){
            System.out.print("Attempt save: " + (1.45 + i));
            smallDoubleQueue.putElement(1.45 - i);
            System.out.println();
        }
        ////Additional bugs in smallDoubleQueue
        System.out.print("Contents smallDoubleQueue: ");
        for (i = 0; i < 5; i++){
            d = smallDoubleQueue.deriveElement();
            if (d != 0) System.out.print(d + " / ");
        }

    }
}
