package gr.aueb.cf.ch19.AccountAppHashMap.accountapp.dto;

import gr.aueb.cf.ch19.AccountAppHashMap.accountapp.model.Account;

// AccountMapper.java
public class AccountMapper {
    public static AccountDto toDto(Account account) {
        return new AccountDto(account.getId(), account.getIban(), account.getFirstname(), account.getLastname(), account.getSsn(), account.getBalance());
    }

    public static Account toEntity(AccountDto accountDTO) {
        return new Account(accountDTO.getId(), accountDTO.getIban(), accountDTO.getFirstname(), accountDTO.getLastname(), accountDTO.getSsn(), accountDTO.getBalance());
    }
}

