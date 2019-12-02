package core.basesyntax;

public class BinaryString {

    /**
     * Напишите метод toBinaryString(), который принимает на вход целое число value,
     * а возвращает String с представлением этого числа в двоичном виде.
     */
    public String toBinaryString(int value) {
        int div;
        String bin = "";
        while(value !=0){
            div = value%2;
            bin = div + bin;
            value = value/2;}
        return bin;
    }
}
