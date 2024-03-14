import java.util.Arrays;

public class Sum_large_two{
    public static void main(String[] args) {
        int[] num = {10, 51, 53, 39, 47, 44, 21};
        Arrays.sort(num);
        int second_Large = num[num.length - 2];
        int third_Large = num[num.length - 3];
        int sum = second_Large + third_Large;
        System.out.println(sum);
    }
}
