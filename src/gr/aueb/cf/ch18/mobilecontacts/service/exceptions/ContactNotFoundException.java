package gr.aueb.cf.ch18.mobilecontacts.service.exceptions;

import gr.aueb.cf.ch18.mobilecontacts.model.MobileContact;

public class ContactNotFoundException extends Exception {
    private static final long serialVersionUID = 1L;

    public ContactNotFoundException(String phoneNumber) {
        super("Mobile contact with phone number: " + phoneNumber + " not found");
    }

    public ContactNotFoundException(long id) {
        super("Mobile contact with id: " + id + " not found");
    }

    public ContactNotFoundException(MobileContact mobileContact) {
        super("Mobile contact with id: " + mobileContact.getId() + " and phone number: " + mobileContact.getPhoneNumber() + " not found");
    }
}
