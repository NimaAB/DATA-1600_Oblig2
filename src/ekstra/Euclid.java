package ekstra;

public class Euclid {
    public static void gcd(int a,int b){
        int r = 1;
        while(r != 0){
            r=a%b;
            a=b;
            b=r;
        }
        System.out.println("gcd = "+ a);
    }
    // TODO:make Euclid by recursion:
/**
    static int gcdR(int a,int b){
        if(b == 0){
            return 1;
        }
        return gcdR(a,a%b);
    }
*/
}
