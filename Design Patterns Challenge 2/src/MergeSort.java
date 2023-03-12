import java.util.Arrays;

public class MergeSort implements SortingStrategy{

    void merge(Integer[] arr, int l, int m, int r){

        int n1 = m - l + 1;
        int n2 = r - m;

        int L[] = new int[n1];
        int R[] = new int[n2];

        for(int i = 0; i < n1; ++i)
            L[i] = arr[l + i];

        for(int i = 0; i < n2; ++i)
            R[i] = arr[m + i + 1];

        int i = 0, j = 0;

        int k = l;
            while (i < n1 && j < n2){
                if(L[i] <= R[j]){
                    arr[k] = L[i];
                    i++;
                }else{
                    arr[k] = R[j];
                    j++;
                }

                k++;
            }

            while (i < n1){
                arr[k] = L[i];
                i++;
                k++;
            }

            while (j < n2){
                arr[k] = R[j];
                j++;
                k++;
            }
    }

    public void sort(Integer[] list){

        if (list.length < 2) {
            return;
        }

        int mid = list.length/2;
        Integer[] left = Arrays.copyOfRange(list, 0, mid);
        Integer[] right = Arrays.copyOfRange(list, mid, list.length);

        sort(left);
        sort(right);

        merge(list);

    }
}
