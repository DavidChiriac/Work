public static String reverseWordsOfSentence(String sentence){
    String[] words = sentence.split(" ");
    String reverse = "";
    for(int i=words.length-1;i>0;--i){
        reverse += words[i]+" ";
    }
    reverse+=words[0];
    return reverse;
}