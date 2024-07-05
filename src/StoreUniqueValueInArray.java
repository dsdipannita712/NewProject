public class StoreUniqueValueInArray {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 1, 4, 3, 2};
        int i, j=0, k=0;
        int[] b = new int[10];
        for (i = 0; i < a.length; i++) {
            for(j = 1; j < a[i+1]; j++,k++) {
                if(a[i]!=a[j])
                    b[k] = a[i];
            }
        }

System.out.println(b[i]);
    }
}
