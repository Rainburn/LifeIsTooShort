public class Test {
    static boolean isSameArray(int[] states, int[] copystates) {
        int i;
        boolean same = true;
        for (i = 0; i < states.length; i++) {
            if (states[i] != copystates[i]) {
                same = false;
            }
        }
        return same;
    }

    public static void main(String[] args) {
        int[] a = new int[3];
        int[] b = new int[3];
        a[0] = 0;
        a[1] = 5;
        a[2] = 0;

        b[0] = 0;
        b[1] = 5;
        b[2] = 10;

        if (isSameArray(a, b)) {
            System.out.println("sama bray");
        }
        else {
            System.out.println("Beda bray");
        }
    
    }   


}