package gr.aueb.cf.ch15.bankapp.exceptions;

public class SsnNotValidException extends Exception{

    private static final long serialVersionUID = 223443L;

    public SsnNotValidException(String ssn) {
        super("Ssn: " + ssn + " not valid");
    }
}
