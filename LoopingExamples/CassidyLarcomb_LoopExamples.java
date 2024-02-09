public class CassidyLarcomb_LoopExamples {
        
        
        
    public static void main (String[] args) {
        int[] arr = {1, 2, 3, 4};
        whileLoopEx(arr);
        forLoopEx();
    }



    public static int whileLoopEx(int[] array) {
        int i = 0;
        int count = 0;
        while (i < 3)
        {
            System.out.println(i);
            count++;
        }
        i++;
        return count;
    }

    public static void forLoopEx() {
        for(int i = 1; i <= 1000 ; i++)
        {
            System.out.println(i);
            if (i == 100){
                System.out.println("I counted to 100");
                break;
            }
        }
    }
}