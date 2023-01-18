package hackertoeicvocabulary;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Controller {
    public static List<Word> readFile(String path){
        System.out.println(path);
        List<Word> words=new ArrayList<>();
        try {
            Scanner scanner=new Scanner(new File(path));
            while (scanner.hasNext()){
                String E=scanner.nextLine().trim().toLowerCase();
                while(E.equals("")) E=scanner.nextLine().toLowerCase().trim();

                String V=scanner.nextLine().trim().toLowerCase();
                while(V.equals("")) V=scanner.nextLine().toLowerCase().trim();
                Word word=new Word(E,V);
                words.add(word);
            }
        }
        catch (Exception exception){System.out.println("Read error");}
        return words;
    }
    public static void writeFile(List<Word> words,String path){
        try {
            PrintWriter printWriter=new PrintWriter(new File(path));
            for (Word word:words){
                printWriter.println(word.getE());
                printWriter.println(word.getV());
                printWriter.println("\n");
            }
            printWriter.close();
        }
        catch (Exception exception){
            System.out.println("Write error"+ exception.getMessage());
        }

    }

    public static String reduceWord(String s){
        String result="";
        for(int i=0;i<s.length();i++){
            Character c=s.charAt(i);
            if(c>='a'&&c<='z') result=result+c;
            if(c>='A'&&c<='Z') result=result+c;
        }
        return result;
    }

    public static boolean compareWord(String original,String checked){
        String newOriginal=reduceWord(original);
        String newChecked=reduceWord(checked);
//        System.out.println(newOriginal+"<->"+newChecked);
        if(newChecked==null||newChecked.trim().equals("")) return false;
        return newOriginal.equals(newChecked);
    }

    public static List<Word> randomList(List<Word> words){
        List<Word> randomWords=new ArrayList<>();
        while (words.size()!=0){
            Random random=new Random();
            int index=random.nextInt(words.size());
            randomWords.add(words.get(index));
            words.remove(index);
        }
        return randomWords;
    }
}
