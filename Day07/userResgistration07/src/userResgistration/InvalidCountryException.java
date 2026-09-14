package userResgistration;

public class InvalidCountryException extends Exception {

    InvalidCountryException() {
        super();
    }

    InvalidCountryException(String message) {
        super(message);
    }
}