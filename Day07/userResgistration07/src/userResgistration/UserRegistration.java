package userResgistration;

public class UserRegistration {

    void registerUser(String username, String userCountry)
            throws InvalidCountryException {

        if (!userCountry.equals("India")) {

            throw new InvalidCountryException("User Outside India cannot be registered");
        }

        System.out.println("User registration done successfully");
    }
}