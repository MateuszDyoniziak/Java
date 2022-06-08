// umożliwiaja wykonwywanie podsawowych operacji matematycznych
public class OperatoryMatematyczne {
    public static void main(String[] args) {
        int firstNumber = 4;
        int secondNumber = 6;
        float thirdNumber = 4.0F;

        int addition = firstNumber + secondNumber;
        int subtraction = firstNumber - secondNumber;
        int multiplication = firstNumber * secondNumber;
        float division = thirdNumber/secondNumber;
        int mod = secondNumber%firstNumber;

        /*System.out.println("Wynik dodawania" + addition);
        System.out.println("Odejmowanie" + subtraction);
        System.out.println("Dzielenie" + multiplication);
        System.out.println("Mnożenie" + division);
        System.out.println("Modulo" + mod); */

        firstNumber+=secondNumber; //firstNumber = firstNumber + secondNumber
        System.out.println("po dodaniu" + firstNumber); //10
        firstNumber-=secondNumber; //firstNumber - secondNumber
        System.out.println("Po odejmowaniu:" + firstNumber); //4
        firstNumber*=secondNumber; //firstNumber * secondNumber
        System.out.println("Po mnożeniu: " + firstNumber); //24
        firstNumber/=secondNumber; // firstNumber / secondNumber
        System.out.println("Po dzieleniu: " +firstNumber); // 4
        firstNumber%=secondNumber; // firstNumber % secondNumber
        System.out.println("Po modulo: " +firstNumber); //4

    }
}
