package school.mjc.stage0.loops.task2;

public class EvenNumbersPrinter {
    public void printEvenNumbers(int printTillInclusive) {
        int res =0;
        while (res<=printTillInclusive ){
            if (res%2==0)
            System.out.println(res);
            res++;
        }
    }
}
