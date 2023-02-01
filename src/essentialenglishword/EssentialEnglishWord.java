package essentialenglishword;


public class EssentialEnglishWord {
    public static void main(String[] args) {

        for(int i=1;i<=6;i++){
            for(int j=1;j<=30;j++){
                String ori1="essentialenglishword/4000_0"+i+"/"+"4000_0"+i+"_0"+j+".txt";
                String des1="essentialenglishword/json/4000_"+i+"_"+j+".json";
                String des11="C:\\Users\\Admin\\Documents\\english\\learnenglish\\src\\essentialenglishword\\4000_"+i+"_"+j+".json";
                if(j>=10){
                    ori1="essentialenglishword/4000_0"+i+"/"+"4000_0"+i+"_"+j+".txt";
                }
                Controller.writeFileJson(Controller.readFile(ori1),des11);
            }
        }

    }
}
