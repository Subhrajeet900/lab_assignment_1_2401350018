public class Task4Recurrence {

    static int count1 = 0;
    static int count2 = 0;

    public static int recurrence1(int n){
        count1++;
        if(n<=1)
            return 1;
        return recurrence1(n/2) + n;
    }

    public static int recurrence2(int n){
        count2++;
        if(n<=1)
            return 1;
        return recurrence2(n/2) + recurrence2(n/2) + n;
    }

    public static void main(String args[]){

        int n = 16;

        long start,end;

        start=System.nanoTime();
        recurrence1(n);
        end=System.nanoTime();
        System.out.println("T(n)=T(n/2)+n Calls: "+count1+" Time:"+ (end-start));

        start=System.nanoTime();
        recurrence2(n);
        end=System.nanoTime();
        System.out.println("T(n)=2T(n/2)+n Calls: "+count2+" Time:"+ (end-start));
    }
}
