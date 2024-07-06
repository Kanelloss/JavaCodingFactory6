package gr.aueb.cf.ch19.AccountAppHashMap.accountapp.service;

import gr.aueb.cf.ch19.AccountAppHashMap.accountapp.dao.IAccountDao;
import gr.aueb.cf.ch19.AccountAppHashMap.accountapp.dto.AccountDto;
import gr.aueb.cf.ch19.AccountAppHashMap.accountapp.dto.AccountMapper;
import gr.aueb.cf.ch19.AccountAppHashMap.accountapp.model.Account;

import java.util.List;
import java.util.stream.Collectors;

public class AccountServiceImpl implements IAccountService {
    private final IAccountDao accountDao;

    public AccountServiceImpl(IAccountDao accountDao) {
        this.accountDao = accountDao;
    }

    @Override
    public void createAccount(AccountDto accountDto) {
        Account account = AccountMapper.toEntity(accountDto);
        accountDao.createAccount(account);
    }

    @Override
    public AccountDto getAccount(Long id) {
        Account account = accountDao.getAccount(id);
        return AccountMapper.toDto(account);
    }

    @Override
    public void updateAccount(AccountDto accountDto) {
        Account account = AccountMapper.toEntity(accountDto);
        accountDao.updateAccount(account);
    }

    @Override
    public void deleteAccount(Long id) {
        accountDao.deleteAccount(id);
    }

    @Override
    public List<AccountDto> listAccounts() {
        return accountDao.listAccounts().stream()
                .map(AccountMapper::toDto)
                .collect(Collectors.toList());
    }
}
