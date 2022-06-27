public static char firstNonRepeatingCharacter(String str){
    Hashtable<Character,Integer> apps = new Hashtable<Character, Integer>();
    for(int i=0;i<str.length();++i){
        Integer nr = (apps.get(str.charAt(i)) == null) ? 1 : apps.get(str.charAt(i))+1 ;
        apps.put(str.charAt(i),nr);
    }
    for(int i=0;i<str.length();++i){
        Integer nr = apps.get(str.charAt(i));
        if (nr==1){
            return str.charAt(i);
        }
    }
    return ' ';
}