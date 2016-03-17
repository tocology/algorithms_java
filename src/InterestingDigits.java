import java.util.ArrayList;

/**
 * Created by JunHo on 2016. 3. 17..
 */
public class InterestingDigits {

    public static int[] digits(int base){

        ArrayList<Integer> list = new ArrayList<>();

        for(int i=2; i<base; ++i){
            if((base-1) % i == 0){
                list.add(i);
            }
        }

        int[] arr = new int[list.size()];
        for(int i=0; i<list.size(); ++i) arr[i] = list.get(i);

        return arr;
    }

    public static void main(String[] argv){

    }
}
