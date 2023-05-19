

public class Warmup1SumDouble {

    public int sumDouble(int a, int b) {
        // first you have to declare the variable, since it is a number an int is used follow by the name.
        // then wrote out the addition statement,
        int sum = a + b;

        //to find if the integers are the same, an if statement is used.
        //in the condition, a double equal sign is used to compare liked variables
        //if the variables are the same, multiply the sum by 2
        if (a == b) {
            sum = sum * 2;
        }
        // to finish off this method, a return statement must be used.

        return sum;


    }

}
