import java.util.Random;

public class RandomNumbers {
    int max = 0;
    int min = 50;

    public void findRandomNumberFromRange() {
        Random random = new Random();


        int sum = 0;
        while (sum < 5000) {
            int randomNumber = random.nextInt(30);
            getMax(randomNumber);
            getMin(randomNumber);

            sum += randomNumber;
            System.out.println(sum);
            System.out.println(max);
            System.out.println(min);
        }
    }

    private int getMax(int randomNumber) {
        if (randomNumber > max) {
            max = randomNumber;
        }
        return max;
    }

    private int getMin(int randomNumber) {
        if (randomNumber < min) {
            min = randomNumber;
        }
        return min;
    }

    public static void main(String[] args) {
        RandomNumbers randomNumbers = new RandomNumbers();
        randomNumbers.findRandomNumberFromRange();
    }
}
