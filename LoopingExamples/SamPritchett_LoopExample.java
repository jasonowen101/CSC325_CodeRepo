package LoopingExamples;

public class SamPritchett_LoopExample {

    public static void main(String[] args) {
        int[] listnumbers = { 0, 1, 2, 3 };

        whileLoop(listnumbers);
        forLoop();
    }

    public static void whileLoop(int[] listnumbers) {
        int i = 0;
        while (i < listnumbers.length) {
            System.out.println(listnumbers[i]);
            if (i == listnumbers.length) {
                break;
            }
            i++;
        }
        System.out.println("whileLoop iterated " + i + " times");
    }

    public static void forLoop() {
        for (int i = 0; i <= 1000; i++) {
            if (i == 100) {
                System.out.println("100 is the right number to break the loop!");
                break;
            }
        }
    }

}