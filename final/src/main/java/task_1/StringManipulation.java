package task_1;

import java.util.Random;

public class StringManipulation extends EnhancedStringManipulation {
    private String str1;
    private String str2;
    public StringManipulation(){
        System.out.println("Greetings");
    }

    public String getStr1() {
        return str1;
    }

    public String getStr2() {
        return str2;
    }

    public void setStr1(String str1) {
        this.str1 = str1;
    }

    public void setStr2(String str2) {
        this.str2 = str2;
    }

    public void method1(String str1, String str2) {
        System.out.println("\nMethod 1");
        System.out.println("First String: " + str1);
        System.out.println("Second String: " + str2);
    }

    public void method2(String str1, String str2){
        System.out.println("\nMethod 2");
        System.out.print("ხმოვანი ასოები str1-ში: ");
        char[] charArray1 = str1.replaceAll("\\s", "").toCharArray();
        for (char c : charArray1) {
            if (isVowel(c)){
                System.out.print(c + " ");
            }
        }
        System.out.print("\nთანხმოვანი ასოები str2-ში: ");
        char[] charArray2 = str2.replaceAll("\\s", "").toCharArray();
        for (char c : charArray2) {
            if (!isVowel(c)){
                System.out.print(c + " ");
            }
        }
    }

    public void method3(String str1, String str2){
        System.out.println("\nMethod 3");
        if (str1.length() == str2.length()) {
            System.out.println("equals");
        } else {
            System.out.println("not equals");
        }
    }

    public void method4(String str){
        System.out.println("\nMethod 4");
        String[] strArr = str.split(" ");
        String randomWord = strArr[(int) Math.floor(Math.random() * strArr.length)];
        System.out.println(randomWord);
    }

    private boolean isVowel(char letter){

        return letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u' ||
                letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U';
    }

    @Override
    public void method5() {
        System.out.println("\nMethod 5");
        Random random = new Random();
        int randomNum = random.nextInt(126 - 33 + 1) + 33;
        char ch = (char) randomNum;
        setStr3(ch);
        System.out.println("Random symbol: " + getStr3());
    }
}
