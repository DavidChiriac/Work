public static void printingStar(int levels){
    for (int i = 0; i < levels; i++) {
        for (int j = 0; j < levels - i; j++) {
            System.out.print(" ");
        }
        for (int k = 0; k <= i; k++) {
            System.out.print("* ");
        }
        System.out.println();
    }
}