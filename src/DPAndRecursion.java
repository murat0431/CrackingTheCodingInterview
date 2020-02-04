import java.util.Arrays;

public class DPAndRecursion {
    public static void main(String[] args) {
       // System.out.println(tripleStep(5));
       System.out.println(multiply(13, 26));
    }

    //Q1 with the tabular solution
    public static int tripleStep(int n) {
        if(n<3) return n;
        int[] tab = new int[n+1];
        tab[0]=1;tab[1]=1;tab[2]=2;
        for(int i=3;i<=n;i++) {
            tab[i] = tab[i-1]+tab[i-2]+tab[i-3];
        }
        return tab[n];
    }

    //Q2 Recursive Multiply with Memoization
    //TODO:Revise it by choosing the smaller integer as b
    public static int multiply(int a, int b) {
        int[] memo = new int[b+1];
        Arrays.fill(memo, -1);
        memo[0] = 0;
        return multiplyHelper(a, b, memo);
    }

    public static int multiplyHelper(int a, int b, int[] memo) {
        if (b==1) return a;
        if(memo[b] != -1) return memo[b];
        int result = b%2==1 ? a + multiplyHelper(a, b-1, memo) : multiplyHelper(a, b/2, memo) +
                        multiplyHelper(a, b/2, memo);

        return result;
    }



}
