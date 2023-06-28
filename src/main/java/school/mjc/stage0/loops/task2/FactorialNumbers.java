package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int res = 1;

        if (printToInclusive<=0){
            System.out.println(1);
        }
        while (res<=printToInclusive){
            for (int i=1;i<=printToInclusive;i++){
                res=res*i;
                System.out.println(res);

            }
            res++;
        }
    }

}
