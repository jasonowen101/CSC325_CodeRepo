import java.util.function.Function;

public class LambdaTest {
    
    public static Function<Integer, Integer> squareLambda = (number) -> number * number;

    public static Function<String, Integer> stringLengthLambda = (str) -> str.length();

    public static void main(String[] args){
        String input = "Welcome Back from Spring Break";
        int squareResult = squareLambda.apply(25);
        int lengthResult = stringLengthLambda.apply(input);

        System.out.println("squareLambda: " + squareResult);
        System.out.println("lengthLambda: " + lengthResult);
    }

}
