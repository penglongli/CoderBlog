package coder.lib.sso.app.account;

import coder.account.db.account.Account;
import coder.account.db.account.AccountRepository;
import coder.lib.sso.app.bean.User;
import coder.lib.sso.exception.BadRequestException;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static coder.account.db.account.AccountConst.*;

/**
 * Created by Pelin on 17/2/3.
 */
@Service
public class AccountService {

    @Autowired
    private AccountRepository accountRepository;

    public Account save(Account account) {
        String email = account.getEmail();
        if (emailExists(email)) {
            throw new BadRequestException("register.email.is.exists");
        }

        String password = account.getPassword();
        account.setPassword(
                DigestUtils.sha512Hex(
                        password + "." + account.getName()
                )
        );

        return accountRepository.save(account);
    }

    public User transAccountToUser(Account account) {
        User user = new User();

        user.setLastLoginAt(account.getLastLoginAt());
        user.setStatus(
                AccountStatus.getMsg(account.getStatus())
        );
        return user;
    }

    private boolean emailExists(String email) {
        List<Account> list = accountRepository.findByEmail(email);

        return list != null && list.size() > 0;
    }
}
