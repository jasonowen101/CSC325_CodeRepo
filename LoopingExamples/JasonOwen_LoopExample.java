package LoopingExamples;

public class JasonOwen_LoopExample {
// JTO Creating a whileLoop method to break at index 3
    public static int whileLoopWithBreak(int[] arr) {
        // JTO Instantiate counter and index variables
        int count = 0;
        int index = 0;
            // JTO Loop through a passed in array
        while (index < arr.length) {
            // Break the loop when index #3 is reached
            if (index == 3) {
                break;
            }

            // Perform any desired operation inside the loop
            // For this example, we'll just increment the count
            count++;
            index++;
        }
        // JTO once loop is broken then return the iteration count
        return count;
    }
    // JTO Create a method to do a for loop and break at 100
    public static void forLoopWithBreak() {
        // JTO Create the for loop to loop up to 1000 times
        for (int i = 1; i <= 1000; i++) {
            // Break the loop when counter reaches 100
            if (i == 100) {
                //JTO Output the user we found 100 iterations and break the loop
                System.out.println("I counted to 100");
                break;
            }
        }
    }
        // JTO Main to call the loop methods
    public static void main(String[] args) {
        // JTO Instantiate a basic array of integers 
        int[] arr = {1, 2, 3, 4};

        // Call the method with while loop
        int countWhileLoop = whileLoopWithBreak(arr);
        System.out.println("Iterations through the while loop: " + countWhileLoop);

        // Call the method with for loop
        forLoopWithBreak();
    }
}

