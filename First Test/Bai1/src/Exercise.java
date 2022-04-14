public class Exercise {
    private double x;
    private int n;

    public Exercise() {
    }

    public Exercise(double x, int n) {
        this.x = x;
        this.n = n;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public double getResult(double x, int n)
    {
        double result = x;

        for(int i = 1; i <= n; i++)
        {
            result += Math.pow(x, i);
        }

        return result;
    }
}
