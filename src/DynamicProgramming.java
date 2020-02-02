public class DynamicProgramming {
    public static void main(String[] args) {
       // System.out.println(tripleStep(5));
        System.out.println(multiply(20, 14));
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

    //Q2 Recursive multiply
    public static int multiply(int m, int n) {
        if(m==1) return n;
        if(n==1) return m;
        if(m<n) return n+multiply(m-1, n);
        return m+multiply(m, n-1);
    }


}
