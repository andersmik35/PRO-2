package opgave1;

public class Opgave1 {

    public int method1(int n){
        int result = 0;
        for (int i = 0; i<n ; i++){
            for (int j = 1; j < n; j = j*2){
                result++;
            }
        }
        return result;
    }

    // Tmethod1 = O(n^2)



}
