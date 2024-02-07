package LoopingExamples;
public class EthanStandridge_LoopExample {
    private static int whileLoop(int[] array) {
    // JTO Creating a whileLoop method to break at index 3
        int i=0;
        while (i<=3) {
            array[i]++;
            i++;
        }
        return i;
    }

    private static void forLoop() {
        for (int i=0; i<100; i++) {
            if (i==100) {
                break;
            }
        }
        System.out.println("I counted to 100");
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println("" + whileLoop(arr));
        forLoop();
    }
}
