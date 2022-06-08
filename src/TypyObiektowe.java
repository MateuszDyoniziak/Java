public class TypyObiektowe {



    public static void main(String[] args) {
        // liczby stałoprzecinkowe
        byte firstNumber = 127; //1bajt -128 do 127
        short secondNumber = 32689; // 2 bajty -32767 do 32767
        int thirdNumber = 32768999; // 4 bajty -2 147 383 647 do 2 147 483 657
        long fourthNumber = 2148000L; // 8 bajtów -2^63 do (2^63)-1

        //liczy zmiennoprzecinkowe
        float fifthNumber = 4.99934F; // 4 bajty - max ok 6-7 liczb po przcienku
        double sixthNumber = 3.9999999999999999D; // bajtów - max ok 15 cyfr po przecinku

        //wartość logiczna
        boolean prawda = true;
        boolean falsz = false;

        //pojedyńczy znak
        Character letter = 'A';

        //ciagi znaków
        String hello = "hello";

        System.out.println(hello.charAt(0));

    }
}
