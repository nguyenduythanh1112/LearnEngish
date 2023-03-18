package hackertoeicvocabulary;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        for(int i=6;i<=7;i++){
            String ori="viu2/origin/"+i+".txt";
            String des="C:\\Users\\Admin\\Documents\\english\\learnenglish\\src\\viu2\\"+i+".json";
            Controller.writeFileJson(Controller.readFile(ori),des);
//            String ori1="hackertoeicvocabulary/original/"+i+"_CB.txt";
//            String ori2="hackertoeicvocabulary/original/"+i+"_800_1.txt";
//            String ori3="hackertoeicvocabulary/original/"+i+"_800_2.txt";
//            String ori4="hackertoeicvocabulary/original/"+i+"_900.txt";
//
//            String des1="hackertoeicvocabulary/json/"+i+"_CB.json";
//            String des2="hackertoeicvocabulary/json/"+i+"_800_1.json";
//            String des3="hackertoeicvocabulary/json/"+i+"_800_2.json";
//            String des4="hackertoeicvocabulary/json/"+i+"_900.json";
//
//            String des11="C:\\Users\\Admin\\Documents\\english\\learnenglish\\src\\hackertoeicvocabulary\\"+i+"_CB.json";
//            String des22="C:\\Users\\Admin\\Documents\\english\\learnenglish\\src\\hackertoeicvocabulary\\"+i+"_800_1.json";
//            String des33="C:\\Users\\Admin\\Documents\\english\\learnenglish\\src\\hackertoeicvocabulary\\"+i+"_800_2.json";
//            String des44="C:\\Users\\Admin\\Documents\\english\\learnenglish\\src\\hackertoeicvocabulary\\"+i+"_900.json";
//
//            Controller.writeFileJson(Controller.readFile(ori1),des1);
//            Controller.writeFileJson(Controller.readFile(ori2),des2);
//            Controller.writeFileJson(Controller.readFile(ori3),des3);
//            Controller.writeFileJson(Controller.readFile(ori4),des4);
//
//            Controller.writeFileJson(Controller.readFile(ori1),des11);
//            Controller.writeFileJson(Controller.readFile(ori2),des22);
//            Controller.writeFileJson(Controller.readFile(ori3),des33);
//            Controller.writeFileJson(Controller.readFile(ori4),des44);
        }
    }
}
