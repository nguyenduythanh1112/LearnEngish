package essentialenglishword;

import java.util.ArrayList;
import java.util.Random;

public class Word {
    private String E;
    private String V;

    public Word(String e, String v) {
        E = e;
        V = v;
    }

    public String getE() {

        return E;
    }

    public String getV() {
        return V;
    }

    public void setE(String e) {
        E = e;
    }

    public void setV(String v) {
        V = v;
    }

    public String generateHint(){
        ArrayList<Integer> viTriRandom=new ArrayList<>();
        ArrayList<Integer> viTriTu=new ArrayList<>();
        for(int i=0;i<E.length();i++) {
            Character character=Character.toUpperCase(E.charAt(i));
            if(character>='A'&&character<='Z') viTriTu.add(i);
        }
        int soChuGoiY=viTriTu.size()/4;
        Random random=new Random();
        while(viTriRandom.size()!=soChuGoiY){
            int viTri=random.nextInt(viTriTu.size());
            viTriRandom.add(viTriTu.get(viTri));
            viTriTu.remove(viTri);
        }
        String tuGoiY=" ";
        for(int i=0;i<E.length();i++){
            if(viTriRandom.contains(i)){
                tuGoiY=tuGoiY+E.charAt(i)+" ";
            }
            else if(Character.toUpperCase(E.charAt(i))<'A'||
                    Character.toUpperCase(E.charAt(i))>'Z'){
                tuGoiY=tuGoiY+E.charAt(i)+" ";
            }
            else tuGoiY=tuGoiY+"_ ";
        }
        return tuGoiY;
    }

    @Override
    public String toString() {
        return E+" "+V;
    }

    @Override
    public int hashCode() {
        return E.hashCode();
    }
}
