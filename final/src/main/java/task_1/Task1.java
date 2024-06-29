package task_1;

public class Task1 {
    public static void main(String[] args) {
        StringManipulation stringManipulation = new StringManipulation();
        stringManipulation.setStr1("I am Sandro");
        stringManipulation.setStr2("I am Nika");
        String str1 = stringManipulation.getStr1();
        String str2 = stringManipulation.getStr2();

        stringManipulation.method1(str1, str2);
        stringManipulation.method2(str1, str2);
        stringManipulation.method3(str1, str2);
        stringManipulation.method4(str1);
        stringManipulation.method5();
    }
}
