package LoopingExamples;

public class AJSchulte_LoopExample {
    public static int whileLoopExample(int[] arr) {
        int counter = 0;
        int index = 0;
        while (index < arr.length) {
            if (index == 3)
                break;
            counter++;
            index++;
        }
        return counter;
    }

    public static void forLoopExample() {
        for (int i = 0; i < 1000; i++) {
            if (i == 100) {
                System.out.println("I counted to 100");
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };

        System.out.println(whileLoopExample(arr));
        forLoopExample();

    }
}
