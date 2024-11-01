public class QueueDemo {
    public static void main(String[] args) {
        Queue bigQueue = new Queue(100);
        Queue smallQueue = new Queue(4);
        char ch;
        int i;

        System.out.println("Using bigQueue to store the alphabet");
        // Placing letter codes in bigQueue
        for (i = 0; i < 26; i++)
            bigQueue.putElement((char) ('A' + i));

        //Extract and displaying elements of bigQueue
        System.out.println("Contents of bigQueue: ");
        for (i = 0; i < 26; i++) {
            ch = bigQueue.extractElement();
            if (ch != (char) 0) System.out.print(ch + " ");
        }
        System.out.println("\n");

        System.out.println("Using smallQueue to generate errors.");
        for (i = 0; i < 5; i++){
            System.out.print("Attempt to save: " + (char)('Z' - i));
            smallQueue.putElement((char) ('Z' - i));
            System.out.println();
        }
        //Additional bugs in smallQueue
        System.out.println("Contents of smallQueue: ");
        for (i = 0; i < 5; i++){
            ch = smallQueue.extractElement();
            if (ch != (char) 0) System.out.print(ch);
        }
    }
}