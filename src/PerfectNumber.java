public class PerfectNumber {
    public static boolean isPerfectNumber(int number){
        if(number < 1){
            return false;
        }
        // A variable for adding all factors of a number
        int sum = 0;
        // A variable factor that will be incremented in a while-loop
        int factor = 1;

        // In a while-loop all factors will be added
        // If number is divisible by factor equally
        while(factor <= number / 2){
            if(number % factor == 0){
                sum += factor;
            }
            factor++;
        }

        // A method returns true only if the sum of all factors (excluding the number itself)
        // equals the inserted number
        return sum == number;

    }
}
