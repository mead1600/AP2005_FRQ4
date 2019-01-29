public class StudentRecord {

    private int[] scores;

    public StudentRecord(int[] scores){
        this.scores = scores;
    }

    private double average(int first, int last){
        int sum = 0;
        int nums = 0;
        for(int i = first; i < last; i++){
            sum += scores[i];
            nums += 1;
        }
        return sum/nums;
    }

    private boolean hasImproved(){
        for(int i = 0; i < scores.length - 1; i++){
            if(scores[i+1] < scores[i]){
                return false;
            }
        }
        return true;
    }

    public double finalAverage(){
        if(hasImproved()){
            return average(scores.length/2, scores.length);
        }
        return average(0,scores.length);
    }
}
