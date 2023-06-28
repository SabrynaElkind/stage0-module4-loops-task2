package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int res =0;

        while (res<=multiplyByAndToInclusive){

            int result = res*multiplyByAndToInclusive;
            System.out.println(result);

            res++;
        }
    }
}
