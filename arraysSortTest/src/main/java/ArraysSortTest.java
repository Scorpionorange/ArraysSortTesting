import java.util.Arrays;
/**
 * Created by ScorpionOrange on 2016/08/21.
 */
public class ArraysSortTest {
    public static void main(String[] args){

        int[] A = new int[]{3, 2, 1, 4, 5};
        int[] B = new int[A.length];
        for(int i = 0; i < A.length; i++){
            B[i] = A[i];
        }
        System.out.print("A: ");
        for(int i : A){
            System.out.print(i + "  ");
        }
        System.out.println();
        System.out.print("B: ");
        for(int i : B){
            System.out.print(i + "  ");
        }
        System.out.println();
        Arrays.sort(B);
        System.out.println("将数组B排列后：");
        System.out.print("A: ");
        for(int i : A){
            System.out.print(i + "  ");
        }
        System.out.println();
        System.out.print("B: ");
        for(int i : B){
            System.out.print(i + "  ");
        }
        System.out.println();
        System.out.println("可见，数组A并未被影响。");
    }
}
