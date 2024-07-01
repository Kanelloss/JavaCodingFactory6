//// AccountService.java
//import java.util.List;
//import java.util.stream.Collectors;
//
//public class AccountService {
//    private AccountDAO accountDAO;
//
//    public AccountService(AccountDAO accountDAO) {
//        this.accountDAO = accountDAO;
//    }
//
//    public AccountDTO createAccount(int id, String iban, String firstname, String lastname, String ssn, double balance) {
//        Account account = new Account(id, iban, firstname, lastname, ssn, balance);
//        accountDAO.createAccount(account);
//        return AccountMapper.toDTO(account);
//    }
//
//    public AccountDTO getAccount(int id) {
//        Account account = accountDAO.getAccount(id);
//        return account != null ? AccountMapper.toDTO(account) : null;
//    }
//
//    public void updateAccount(int id, String iban, String firstname, String lastname, String ssn, double balance) {
//        Account account = accountDAO.getAccount(id);
//        if (account != null) {
//            account.setIban(iban);
//            account.setFirstname(firstname);
//            account.setLastname(lastname);
//            account.setSsn(ssn);
//            account.setBalance(balance);
//            accountDAO.updateAccount(account);
//        }
//    }
//
//    public void deleteAccount(int id) {
//        accountDAO.deleteAccount(id);
//    }
//
//    public List<AccountDTO> listAccounts() {
//        return accountDAO.listAccounts().stream()
//                .map(AccountMapper::toDTO)
//                .collect(Collectors.toList());
//    }
//}
