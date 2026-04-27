public static int friendsPairing(int n) {

    //  Base Case 
    if (n == 1 || n == 2) {
        return n;
    }

    // single
    int fnm1 = friendsPairing(n - 1);

    // pair
    int fnm2 = friendsPairing(n - 2);
    int pairWays = (n - 1) * fnm2;

    // total
    int totWays = fnm1 + pairWays;
    return totWays;
}
