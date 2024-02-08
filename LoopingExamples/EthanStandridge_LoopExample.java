package LoopingExamples;
public class EthanStandridge_LoopExample {
    // JTO Creating a whileLoop method to break at index 3
    private static int whileLoop(int[] array) {
        // JTO Instantiate counter and index variables
        int i=0;
        int count=0;
        while (i<array.length) { // JTO Loop through a passed in array
            if (i==3) { // Break the loop when index #3 is reached
                break;
            }
            // Perform any desired operation inside the loop
            // For this example, we'll just increment the count
            count++;
            i++;
        }
        return count;
    }

    // JTO Create a method to do a for loop and break at 100
    private static void forLoop() {
        for (int i=0; i<1000; i++) { // JTO Create the for loop to loop up to 1000 times
            if (i==100) { // Break the loop when counter reaches 100
                System.out.println("I counted to 100");  // JTO Output the user we found 100 iterations and break the loop
                break;
            }
        }
    }

    // JTO Main to call the loop methods
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};   // JTO Instantiate a basic array of integers 
        System.out.println("Iterations: " + whileLoop(arr)); // Call the method with while loop
        forLoop(); // Call the method with for loop
    }
}
