package PastStudentUploads;

public class CSC345Notes {
    public static void main(String[] args) {

        {
            int[] arr = { 5647, 9869, 93339, 23, 45, 3221, 5565, 33 };
            System.out.println(Search(arr, 23));
            System.out.println(Search(arr, 45));
            System.out.println(Search(arr, 3221));
        }
    }

    // algorithim, linear search, goes through one at a time
    public static int Search(int[] values, int key)
    // return index of the key value, or negative 1 if not found
    {
        for (int i = 0; i < values.length; i++)// declaring i, assignig 0 to i, less than operator
            // i++ = 2 operations doing two thing because adding one and returning result.
            if (values[i] == key)// comparison operation and index i
                return i;// operation
        return -1;// operation
        // box around i < values.length and lines 18 and 19.
        // n= values.length, the block repeats n times.
        // f(n)= 3 + n(6)
        // = 6n + 3
        // could do best case analysis but use worse case analysis.
        // defining best or wrose case of n
        // best case of scenario, int i, i<values, Values[i], ==key,return i
        // B(n)=6
        // if doesnt exist at all it maximises repeated runs.
        // W(n)=6n+3
        // B(n)=6
        // no best or worse becomes and every case scenario.
    }

}

// n = size the problem, use growth function, f(n)= 10n squared + 10n + 2.
// use number of operations for generic exucution time
// growth function relationship b/w problem sis4 and number of operations
// identify all operations for growth function
// draw a block or a circle around repeated ops
// translate notation to fucntion
