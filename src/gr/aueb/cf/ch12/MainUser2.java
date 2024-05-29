package gr.aueb.cf.ch12;

import gr.aueb.cf.ch12.model.User2;
import gr.aueb.cf.ch12.model.UserCredentials;

public class MainUser2 {

    public static void main(String[] args) {
        User2 walter = new User2(1, "Walter", "W.");
        UserCredentials cred = new UserCredentials(2345543L, "White", "123456JP");


                System.out.println("{User Id: " + walter.getId() + ", Firstname: " + walter.getFirstname() + ", Lastname: " + walter.getLastname() + "}");

                System.out.println("{User id: " + cred.getId() + ", Username: " + cred.getUsername() + ", Password: " + cred.getPassword() + "}");
    }
}
