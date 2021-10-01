package wprowadzenie_danych_wyjątki.exception_zad2;

public class DuplicateException extends RuntimeException{
    private final Participant participant;

    public DuplicateException(Participant participant) {
        this.participant = participant;
    }

    public Participant getParticipant() {
        return participant;
    }
}
