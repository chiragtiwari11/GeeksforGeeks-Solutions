class GFG {
    static void printGfg(int n) {
        if (n == 0) {
            return;
        }

        System.out.print("GFG");

        if (n > 1) {
            System.out.print(" ");
        }

        printGfg(n - 1);
    }

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();

        printGfg(n);
    }
}