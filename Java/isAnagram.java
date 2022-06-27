public static boolean isAnagram(String str1, String str2){
    boolean ok=false;
    str1 = str1.toLowerCase();
    str2 = str2.toLowerCase();
    if(str1.length()==str2.length()){
        for (int i=0;i<str1.length()-1;++i){
            if(str2.indexOf(str1.charAt(i))!=-1){
                if(str2.indexOf(str1.charAt(i)) != str1.charAt(i)){
                    ok=true;
                }
            }
            else{
                return false;
            }
        }
    }
    if (ok) {
        return true;
    }
    return false;
}