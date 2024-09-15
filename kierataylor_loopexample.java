import java.util.Random;
import java.util.Scanner;
public class kierataylor_loopexample {
 
    public static void main(String[] args)
    {
        int x=0;
        while (x==0) {
            kierataylor_loopexample obj = new kierataylor_loopexample();
            Scanner scn = new Scanner(System.in);
            
            System.out.println("Heads or Tails?");
            String userinput = scn.nextLine();
            
            int result = obj.flipacoin(userinput);

            switch(result)
            {
            case 0:
            System.out.println("invalid input.");
            break;

            case 1:
            System.out.println("you win!");
            x++;
            break;
            
            case -1:
            System.out.println("nope :( try again.");
            break;

            case 2:
            System.out.println("SECRET ENDING: fuck you carson. I love you though");
            x++;
            break;
            }
        }
    }

    public int flipacoin(String input)
    {
        Random rand = new Random();
        int coinflip = rand.nextInt(2);
       
        if(input.equals("Heads"))
        {
            if(coinflip == 0)
            {
                return 1;
            }
            else
            return -1;
        }

        if(input.equals("Tails"))
        {
            if(coinflip == 1)
            {
                return 1;
            }
            else
            return -1;
        }

        if(input.equals("both :D"))
        {
            return 2;
        }
        return 0;
    }
}
