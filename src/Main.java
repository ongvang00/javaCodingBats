public class Main {

    //warmup 1
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
//Array-1
    public int sum3(int[] nums) {
            // to find the sum of all the elements
        // int was ued to declare the sum variable,
        //the sum variable is made to equal each element when added together
        int sum = nums[0] + nums[1] + nums[2];
        //finish the method off with a return statement
        return sum;
    }
//String-1
public String helloName(String name) {
            //to return "Hello Bob!", a return statement was used
    //with the return the string "Hello was added then the name that is being passed
    //lastly an exclamation point to finish it off.
    return "Hello " + name + "!";
}

//logic-1
public boolean love6(int a, int b) {
            // started off the method with an if else statement
    //in the if statement a condition was written
    //This is my first time using the || and i love it
    //if the conditions were correct the return will be true otherwise it will be false
    if(a == 6 || b == 6 || (a - b) == 6 || a + b == 6) {
        return true;
    } else
    {
        return false;
    }

    //logic-2

    public int loneSum(int x, int y, int z){
        //this would require multiple if statements
        //first if statement, if x is the same as y AND vice versa return 0
        if (x == y && y == z) return 0;
        //second if statement, if only x is the same as y return z
        if (x == y) return z;
        //third if statement, if only y is the same as z return x
        if (y == z) return x;
        //fourth if statement, if only x is the same as z return y
        if (x == z) return y;

        //these if statement will make sure each value are different
        //once that is completed, the final return statement will be the total of those values
        return x + y + z;
    }

    //functional -1
//this exercise ask to uas lambdas expressions
    public List<Integer> doubling(List<Integer> nums) {
        //the function ask to return all the integer multiply by 2
        //to do this the replaceAll is the lambdas expression that was used
    //in the parathese the equation of single integer n was change to n *2
        nums.replaceAll(n -> n * 2);
        //finally the new array was return
        return nums;
    }

    //Array-2
    public int countEvens(int[] nums) {

        //first, we would declare the variable count with int,
        //we want to start that off at zero
        int count = 0;
        //then follow by a for loop to iterate through the nums array
        for(int i: nums) {
            //in order to receive the even numbers, the number must be divisible by 2
            //then increase by 1
            if(i % 2 == 0) {
                count++;
            }
        }
        //finally returning the values
        return count;
    }
    }
//functional-2
public List<Integer> noNeg(List<Integer> nums) {
            //using lambdas expression to remove negative numbers
    //removeIf is the expression we will be using
    //within the parathesis n is change to n less than 0
    nums.removeIf(n -> n < 0);
    //lastly a return statement is used to return the new array without negative numbers
    return nums;
}

}

