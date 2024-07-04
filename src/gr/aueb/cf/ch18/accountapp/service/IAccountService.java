package gr.aueb.cf.ch18.accountapp.service;


import gr.aueb.cf.ch18.accountapp.dto.AccountDto;

import java.util.List;

public interface IAccountService {
        void createAccount(AccountDto accountDto);
        AccountDto getAccount(int id);
        void updateAccount(AccountDto accountDto);
        void deleteAccount(int id);
        List<AccountDto> listAccounts();
    }
