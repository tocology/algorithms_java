/**
 * Created by JunHo on 2016. 3. 15..
 */
public class KiwiJuiceEasy {

    public static int[] thePouring(int[] capacities, int[] bottles, int[] fromId, int[] toId){

        for(int i=0; i<fromId.length; ++i){
            int from = fromId[i];
            int to = toId[i];

            if(capacities[to] >= bottles[to] + bottles[from]){
                bottles[to] += bottles[from];
                bottles[from] = 0;
            }
            else {
                int remains = bottles[to] + bottles[from] - capacities[to];
                bottles[from] = remains;
                bottles[to] = capacities[to];
            }
        }

        return bottles;
    }

    public static void main(String[] argv){

        int[] capacities = {700000,800000,900000,1000000};
        int[] bottles = {478478, 478478, 478478, 478478};
        int[] fromId = {2,3,2,0,1};
        int[] toId = {0,1,1,3,2};

        int[] result = thePouring(capacities, bottles, fromId, toId);

        for(int i=0; i<result.length; ++i){
            System.out.println(result[i] + " ");
        }
    }
}
