package gr.aueb.cf.ch18.mobilecontacts.service;

import gr.aueb.cf.ch18.mobilecontacts.dto.MobileContactInsertDTO;
import gr.aueb.cf.ch18.mobilecontacts.dto.MobileContactUpdateDTO;
import gr.aueb.cf.ch18.mobilecontacts.model.MobileContact;
import gr.aueb.cf.ch18.mobilecontacts.service.exceptions.ContactNotFoundException;
import gr.aueb.cf.ch18.mobilecontacts.service.exceptions.PhoneNumberAlreadyExistsException;
import gr.aueb.cf.ch18.mobilecontacts.service.exceptions.UserIdAlreadyExistsException;

import java.util.List;

public interface IMobileContactService {
    MobileContact insertMobileContact(MobileContactInsertDTO dto)
        throws PhoneNumberAlreadyExistsException, UserIdAlreadyExistsException;

    MobileContact updateMobileContact(long id, MobileContactUpdateDTO dto)
        throws PhoneNumberAlreadyExistsException, UserIdAlreadyExistsException, ContactNotFoundException;

    void deleteMobileContactById(long id) throws ContactNotFoundException;

    void deleteMobileContactByPhoneNumber(String phoneNumber) throws ContactNotFoundException;

    MobileContact getMobileContactById(long id) throws ContactNotFoundException;

    MobileContact getMobileContactByPhoneNumber(String phoneNumber) throws  ContactNotFoundException;

    List<MobileContact> getAllMobileContacts();
}
