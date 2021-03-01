public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int n = 8;
        long startTime = System.nanoTime();
        System.out.println(fibRe(n));//Recursive
        long endTime = System.nanoTime();
        long duration = (endTime -startTime);
        System.out.println(duration);

        startTime = System.nanoTime();
        System.out.println(fibIter(n));//Iterative
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println(duration);

    }
    
    //Recurssion
    public static int fibRe(int n){
        if(n == 0) {
            return 0;
        }
        if(n == 1) {
            return 1;
        }
        else {
            return fibRe(n-1) + fibRe(n-2);
        }
    }

    //iterative
    public static int fibIter(int n) {
        int current = 1, previous =0, further;

        for (int i=1; i < n; i++){

            further = previous;
            previous = current;
            current = previous + further;

        }

        return current;
    }
}
