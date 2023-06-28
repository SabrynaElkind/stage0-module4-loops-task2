package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {

        if (power<0){
            System.out.println( "too much power");
        }

        int res = 0;
        int result = 1;
        while (res<=power){
            System.out.println(result);
            result*=2;
            res++;
        }
    }


    }

