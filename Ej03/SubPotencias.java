public class SubPotencias {
    public boolean potenciasRestringidas(int n, int[] arr, int obj){
        int[] temp = new int[n];
        int ntemp = 0;
        for (int i = 0; i < n; i++) {
            if (esPotenciaDos(arr[i])) {
                temp[ntemp] = arr[i];
                ntemp++;
            }
            if (arr[i] % 5 == 0) {
                if (arr[i + 1] % 2 != 0) {
                    temp[ntemp] = arr[i];
                    ntemp++;
                }
            }
        }
        return false;
    }

    public boolean esPotenciaDos(int num) {
        while (num % 2== 0) {
            num /= 2;
        }
        return num == 1;
    }
    public static void main(String[] args) {

    }
}