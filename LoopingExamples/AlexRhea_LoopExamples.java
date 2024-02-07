package LoopingExamples;

public class AlexRhea_LoopExamples {
    // JTO Creating a whileLoop method to break at index 3
    public static int whileLoop(int[] numbers)
    {
        // JTO Instantiate counter and index variables
        int counter = 0;
        int index = 0;
        // JTO Loop through a passed in array
        while(index < numbers.length)
        {
            // JTO Perform any desired operation inside the loop
            // JTO For this example, we'll just increment the count & index
            //break when counter = 3
            if(counter == 3)
            {
                break;
            }
            counter++;
            index++;
        }
        // JTO once loop is broken then return the iteration count
        return index;
    }
     // JTO Create a method to do a for loop and break at 100
    public static void forLoop()
    {
        int counter = 0;
        // JTO Create the for loop to loop up to 1000 times
        for(int i = 0; i<1000; i++)
        {
            // JTO Break the loop when counter reaches 100
            if(counter == 100)
            {
                //JTO Output the user we found 100 iterations and break the loop
                System.out.println("We found 100 iterations");
                break;
            }
            counter++;
        }
    }
    // JTO Main to call the loop methods
    public static void main(String[] args)
    {
         // JTO Instantiate a basic array of integers 
        int[] i = new int[]{1,2,3,4,5,6,7,8,9,0};
        // JTO Call the method with while loop
        System.out.println(whileLoop(i));
        // JTO Call the method with for loop
        forLoop();


    }
    
}
