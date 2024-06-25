package gr.aueb.cf.ch18.mobilecontacts.service;

import gr.aueb.cf.ch18.mobilecontacts.dao.IMobileContactDAO;
import gr.aueb.cf.ch18.mobilecontacts.dto.MobileContactInsertDTO;
import gr.aueb.cf.ch18.mobilecontacts.dto.MobileContactUpdateDTO;
import gr.aueb.cf.ch18.mobilecontacts.dto.UserDetailsInsertDTO;
import gr.aueb.cf.ch18.mobilecontacts.model.MobileContact;
import gr.aueb.cf.ch18.mobilecontacts.model.UserDetails;
import gr.aueb.cf.ch18.mobilecontacts.service.exceptions.ContactNotFoundException;
import gr.aueb.cf.ch18.mobilecontacts.service.exceptions.PhoneNumberAlreadyExistsException;
import gr.aueb.cf.ch18.mobilecontacts.service.exceptions.UserIdAlreadyExistsException;

import java.util.List;

public class MobileContactServiceImpl implements IMobileContactService{
    private final IMobileContactDAO dao;

    public MobileContactServiceImpl(IMobileContactDAO dao) {
        this.dao = dao;
    }

    @Override
    public MobileContact insertMobileContact(MobileContactInsertDTO dto) throws PhoneNumberAlreadyExistsException, UserIdAlreadyExistsException {
        MobileContact mobileContact;

        try {
            mobileContact = mapMobileContactFromInsertDTO(dto);

            if (dao.phoneNumberExists(mobileContact.getPhoneNumber())) {
                throw new PhoneNumberAlreadyExistsException(mobileContact);
            }
            if (dao.userIdExists(mobileContact.getId())) {
                throw new UserIdAlreadyExistsException(mobileContact);
            }
            return dao.insert(mobileContact);

        } catch (PhoneNumberAlreadyExistsException | UserIdAlreadyExistsException e) {
            e.printStackTrace();
            throw e;
        }
    }

    private MobileContact mapMobileContactFromInsertDTO(MobileContactInsertDTO dto) {
        return new MobileContact(dto.getId(), mapUserDetailsFromInsertDTO(dto.getUserDetailsInsertDTO()), dto.getPhoneNumber());
    }

    private UserDetails mapUserDetailsFromInsertDTO(UserDetailsInsertDTO dto) {
        return new UserDetails(dto.getId(), dto.getFirstname(), dto.getLastname());
    }

    private MobileContact mapMobileContactFromUpdateDTO(MobileContactUpdateDTO dto) {
        UserDetails userDetails = mapUserDetailsFromUpdateDTO(dto.getUserDetailsUpdateDTO());
        return new MobileContact(dto.getId(), userDetails, dto.getPhoneNumber());
    }

    private UserDetails mapUserDetailsFromUpdateDTO(UserDetailsUpdateDTO dto) {
        return new UserDetails(dto.getId(), dto.getFirstname(), dto.getLastname());
    }

    @Override
    public MobileContact updateMobileContact(long id, MobileContactUpdateDTO dto)
            throws PhoneNumberAlreadyExistsException, UserIdAlreadyExistsException, ContactNotFoundException {

        MobileContact mobileContact;

        try {
            mobileContact = mapMobileContactFromUpdateDTO(dto);

            if (!dao.userIdExists(id)) {
                throw new ContactNotFoundException(id);
            }
            if (dao.phoneNumberExists(mobileContact.getPhoneNumber())) {
                throw new PhoneNumberAlreadyExistsException(mobileContact);
            }
            if (dao.userIdExists(mobileContact.getId())) {
                throw new UserIdAlreadyExistsException(mobileContact);
            }
            return dao.update(id, mobileContact);
        } catch (PhoneNumberAlreadyExistsException | UserIdAlreadyExistsException | ContactNotFoundException e) {
            e.printStackTrace();
            throw e;
        }
    }

    @Override
    public void deleteMobileContactById(long id) throws ContactNotFoundException {

    }

    @Override
    public void deleteMobileContactByPhoneNumber(String phoneNumber) throws ContactNotFoundException {

    }

    @Override
    public MobileContact getMobileContactById(long id) throws ContactNotFoundException {
        return null;
    }

    @Override
    public MobileContact getMobileContactByPhoneNumber(String phoneNumber) throws ContactNotFoundException {
        return null;
    }

    @Override
    public List<MobileContact> getAllMobileContacts() {
        return List.of();
    }
}
