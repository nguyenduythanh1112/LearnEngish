package destinationb1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class DestinationB1 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        List<Word> words= Controller.readFile(Constant.filePath);
        words=Controller.randomList(words);
        HashSet<Word> errorWords=new HashSet<>();

        for(int i=0;i<words.size();i++){
            Word word=words.get(i);
            System.out.println("=====================================================================================");
            System.out.println(word.getV() +"\n"+"("+word.generateHint()+")");
            String result="";
            do {
                result=scanner.nextLine().trim().toLowerCase();
                if(result.trim().equals("")) {
                    System.out.println("Result:" + word.getE());
                    System.out.println("Please enter again !");
                    errorWords.add(word);
                }
                else if(Controller.compareWord(word.getE(),result)) System.out.println("YES ("+ (i+1) +"/"+words.size()+") ["+word.getE()+"]");
                else {System.out.println("=>NO");errorWords.add(word);}
            }
            while (!Controller.compareWord(word.getE(),result));
        }


        System.out.println("\n==========================================================================");
        System.out.println("Number of error word: "+errorWords.size());
        System.out.println("Number of correct word: "+ (words.size() - errorWords.size()));
        System.out.println("Percent correct: "+(words.size()-errorWords.size())*1.0/ words.size()*100+"%");

        List<Word> errorWordList=new ArrayList<>();
        for(Word word:errorWords) errorWordList.add(word);
        Controller.writeFile(errorWordList, Constant.notedFilePath);
    }
}
