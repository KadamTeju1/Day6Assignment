import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
public class CouponNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give size of distinct coupons:");
        int distinctCoupons = scanner.nextInt();

        int totalNumbersNeeded = generateDistinctCoupons(distinctCoupons);
        System.out.println("Total random numbers needed to have all distinct coupons: " + totalNumbersNeeded);
    }

    private static int generateDistinctCoupons(int distinctCoupons) {
        Set<Integer> generatedCoupons = new HashSet<>();
        Random random = new Random();
        int totalNumbersGenerated = 0;

        while (generatedCoupons.size() < distinctCoupons) {
            int randomNumber = random.nextInt(distinctCoupons) + 1;
            totalNumbersGenerated++;

            generatedCoupons.add(randomNumber);
        }

        return totalNumbersGenerated;
    }
}
