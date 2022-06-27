public static String reverseString(String str){
    String newString = "";
    for(int i=0;i<str.length();++i){
        newString += str.charAt(str.length()-i-1);
    }
    return newString;
}