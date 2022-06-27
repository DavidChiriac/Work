public static double squareRoot(double n, double l) {
    double x = n;
    double root;
    int count = 0;
    while (true)
    {
        count++;
        root = 0.5 * (x + (n / x));
        if (Math.abs(root - x) < l)
            break;
        x = root;
    }
    return root;
}