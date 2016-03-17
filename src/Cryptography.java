import java.util.Arrays;

/**
 * Created by JunHo on 2016. 3. 17..
 */
public class Cryptography {

    public static long encrypt(int[] numbers){

        long ans = 0;

        for(int i=0; i<numbers.length; ++i){
            long temp = 1;
            for(int j=0; j<numbers.length; ++j){
                if(i == j) {
                    temp *= (numbers[i] + 1);
                } else {
                    temp *= numbers[j];
                }
            }
            ans = Math.max(ans, temp);
        }

        return ans;
    }

    public static long encrypt2(int[] numbers){

        long ret = 1;
        Arrays.sort(numbers);
        numbers[0]++;
        for(int i=0; i<numbers.length; ++i){
            ret *= numbers[i];
        }

        return ret;
    }

    public static void main(String[] argv){


    }
}
