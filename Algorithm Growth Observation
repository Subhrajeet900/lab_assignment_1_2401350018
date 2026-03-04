public class Task1Growth {

    public static void constantTime(int n){
        int x = n * 2;
    }

    public static void linearTime(int n){
        int sum = 0;
        for(int i=0;i<n;i++){
            sum += i;
        }
    }

    public static void quadraticTime(int n){
        int count = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                count++;
            }
        }
    }

    public static void logarithmicTime(int n){
        int i = 1;
        while(i < n){
            i *= 2;
        }
    }

    public static void main(String[] args){

        int[] sizes = {10,100,500,1000};

        System.out.println("Algorithm Growth Observation");

        for(int n : sizes){

            long start = System.nanoTime();
            constantTime(n);
            long end = System.nanoTime();
            System.out.println("O(1) n="+n+" Time:"+ (end-start));

            start = System.nanoTime();
            linearTime(n);
            end = System.nanoTime();
            System.out.println("O(n) n="+n+" Time:"+ (end-start));

            start = System.nanoTime();
            quadraticTime(n);
            end = System.nanoTime();
            System.out.println("O(n^2) n="+n+" Time:"+ (end-start));

            start = System.nanoTime();
            logarithmicTime(n);
            end = System.nanoTime();
            System.out.println("O(log n) n="+n+" Time:"+ (end-start));

            System.out.println();
        }
    }
}
