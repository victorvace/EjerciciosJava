package poo;

class BinaryArray {

    private String str;

    public BinaryArray(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }
}

public class Actividad1 {
    public static void main(String[] args) {

        String str = "FTTF";
        boolean[] booleanArray = new boolean[4];

        BinaryArray binaryArray = new BinaryArray(str);

        char[] charArray = binaryArray.getStr().toCharArray();

        for (int i = 0; i < charArray.length; i++){
            System.out.println(charArray[i]);
            if (charArray[i] == 'F'){
                booleanArray[i] = false;
            } else {
                booleanArray[i] = true;
            }
            System.out.println(booleanArray[i]);
        }

    }

}
