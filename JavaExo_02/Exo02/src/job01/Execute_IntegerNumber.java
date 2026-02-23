package job01;

public class Execute_IntegerNumber {
   static void main(String[] args) {
//1.instance deux objets
        IntegerNumber integerNumber = new IntegerNumber(2);
        IntegerNumber integerNumber2 = new IntegerNumber(3);
        integerNumber.printNumber();
        integerNumber2.printNumber();

//2.modifier et verifier les valuers des objets instanciés en appellant le method
        integerNumber.integerNumber=10;
        integerNumber2.integerNumber=20;

        integerNumber.printNumber();
        integerNumber2.printNumber();

    }
}
