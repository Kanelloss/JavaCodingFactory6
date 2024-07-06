package gr.aueb.cf.ch19.AccountAppHashMap.accountapp.service;


import gr.aueb.cf.ch19.AccountAppHashMap.accountapp.dto.AccountDto;

import java.util.List;

public interface IAccountService {
        void createAccount(AccountDto accountDto);
        AccountDto getAccount(Long id);
        void updateAccount(AccountDto accountDto);
        void deleteAccount(Long id);
        List<AccountDto> listAccounts();
    }
