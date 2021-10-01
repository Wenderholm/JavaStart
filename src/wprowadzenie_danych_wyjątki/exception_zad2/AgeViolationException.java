package wprowadzenie_danych_wyjątki.exception_zad2;

public class AgeViolationException extends RuntimeException{
   private final int ageRequired;


    public AgeViolationException(int ageRequired) {
        this.ageRequired = ageRequired;
    }

    public int getAgeRequired() {
        return ageRequired;
    }
}
