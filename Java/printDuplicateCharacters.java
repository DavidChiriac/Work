public static void printDublicateCharacters(String str){
    for(int i=0;i<str.length()-1;++i){
        int index=str.indexOf(str.charAt(i),i+1);
        int counter=1;
        try {
            do {
                str = str.substring(0, index) + str.substring(index + 1, str.length());
                index = str.indexOf(str.charAt(i), index);
                counter++;
            } while (index != -1);
            if (counter>1)
                System.out.println(str.charAt(i) + ": " + counter);
        }catch (StringIndexOutOfBoundsException e){

        }
    }
}
