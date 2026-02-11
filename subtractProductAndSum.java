class subtractProductAndSum {
    public int Sol(int n) {
        int prod = 1;
        int sum = 0;
        while (n != 0) {
            int lastDigit = n % 10;
            prod = prod * lastDigit;
            sum = sum + lastDigit;
            n = n / 10;
        }
        return (prod - sum);
    }

    public static void main(String[] args) {
        subtractProductAndSum obj = new subtractProductAndSum();
        int num = 234;
        System.out.println("Result: " + obj.Sol(num));
    }
}