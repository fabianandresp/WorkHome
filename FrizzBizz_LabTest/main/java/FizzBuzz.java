public class FizzBuzz {

    static String verifyFizz(double number){
        String result = "";
        if(number % 3 == 0){
            result = "Fizz";
        }
        else if (number % 5 == 0){
            result = "Buzz";
        }

        if (number % 3 == 0 && number % 5 == 0 ){
            result = "FizzBuzz";
        }
        return result;
    }
}
