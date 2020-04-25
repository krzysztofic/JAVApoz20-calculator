package pl.sda.spring.exeption;

public class DivisionByZeroException extends ArithmeticException {

    public DivisionByZeroException(){
        super("Nie dziel przez 0!!");
    }
}
