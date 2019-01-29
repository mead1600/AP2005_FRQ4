import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        int[] vals = {10,20,30,40,50,60};
        StudentRecord numbers = new StudentRecord(vals);
        System.out.println("First list of scores: "+ Arrays.toString(vals));
        System.out.println("Average of First list of Scores: "+numbers.finalAverage());

        int[] vals2 = {60,50,40,30,20,10};
        StudentRecord numbers2 = new StudentRecord(vals2);
        System.out.println("\n Second list of scores: "+ Arrays.toString(vals2));
        System.out.println("Average of Second list of Scores: "+numbers2.finalAverage());
    }
}
