package be.ucll.spamapp.domain;

public class DomainException extends RuntimeException {
    public DomainException() {
        super();
    }

    public DomainException(String s) {
        super(s);
    }
}
