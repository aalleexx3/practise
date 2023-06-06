package Tree;

import java.util.Locale;

public class Main {


        enum SearchType{
            SUFIX,PREFIX
    }
        public static void WordReversal(String word){
        for(int i=word.length()-1;i>-1;i--){
            System.out.print(word.charAt(i));
        }
        System.out.println("");
    }
        public static String FindWordinSentence(String word,int position){
        String[] splittedwords=word.split(" ");
        if(position-1>0&&position<splittedwords.length){
            return splittedwords[position-1];
        }
        else return "invalid input";
    }

        public static boolean WordSearch(String sentence,String seaarchWord,boolean caseSensitive){
        String[] splittedsentence;
        if(caseSensitive){
           splittedsentence=sentence.split(seaarchWord);
       }
        else {
            splittedsentence=sentence.toLowerCase(Locale.ROOT).split(seaarchWord.toLowerCase(Locale.ROOT));
       }
        if(splittedsentence[0].equals(sentence))
           return false;

        return true;

    }
        public static String anagrams(String first,String second){
        int count=0;
        for(int i=0;i<first.length();i++){
            for(int j=0;j<first.length();j++){
                if(first.charAt(i)==second.charAt(j))
                    count++;
            }
        }
        if(count==first.length()){
            return "Anagrams";
        }
        return "Not Anagrams";
    }

    public static boolean isPrefixOrSuffix(String word,String searchText,SearchType searchType){
            String compare="";
            if(searchType.name().equals("SUFIX")){
                for(int i=word.length()-searchText.length();i<word.length();i++)
                    compare+=word.charAt(i);
                if(compare.equals(searchText))
                    return true;

            }
            else if(searchType.name().equals("PREFIX")){
                for(int i=0;i<searchText.length();i++)
                    compare+=word.charAt(i);
                if(compare.equals(searchText))
                    return true;
            }

            return false;
    }





        public static void main(String[] args) {
        


    }
}
