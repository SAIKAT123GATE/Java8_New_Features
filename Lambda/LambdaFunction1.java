package Lambda;

import java.util.function.Function;

public class LambdaFunction1 {
    private static void square(int a){
        System.out.println("Calling Square method "+a*a);
    }
    public static void main(String[] args) {
        System.out.println("Calling from main method");
        //Calling Method
        square(5);

        //Calling Lambda function with functional Interface
        Function<Integer,Integer> f=(a)->a*a;
        System.out.println("Calling Lambda "+f.apply(5));

    }
}
