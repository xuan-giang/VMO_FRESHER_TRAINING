import java.util.Arrays;

public class ArrIntManager {
    private int[] a;
    int n;

    public ArrIntManager() {
        a = new int[]{1, 2, 3, 5, 4, 1, 3, 4, 5, 4, 5, 9, 7, 0, 11, 13, 10, 23};
    }

    public ArrIntManager(int[] a, int n) {
        this.a = a;
        this.n = n;
    }

    public int getSum()
    {
        return Arrays.stream(a).sum();
    }

    private boolean isPrime(int n)
    {
        if (n <= 1)
            return false;
        else if (n == 2)
            return true;
        else if (n % 2 == 0)
            return false;
        for (int i = 3; i <= Math.sqrt(n); i += 2)
        {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public int getSumOfPrimeNumber()
    {
        int sum = 0;
        for (int value : a) {
            if(isPrime(value))
            {
                sum += value;
            }
        }
        return sum;
    }
}
