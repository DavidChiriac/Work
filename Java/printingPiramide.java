public static void printingPiramid(int levels){
    for(int i=1;i<levels;++i){
        for(int j=0;j<i;++j){
            System.out.print("* ");
        }
        System.out.print("\n");
    }
}