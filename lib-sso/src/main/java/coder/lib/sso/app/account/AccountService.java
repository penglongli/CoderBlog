package coder.lib.sso.app.account;

import coder.account.db.account.Account;
import coder.account.db.account.AccountRepository;
import coder.lib.core.bean.User;
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

    public Account save(Account account, String globalKey) {
        String email = account.getEmail();
        if (!"".equals(email) && emailExists(email)) {
            throw new BadRequestException("register.email.is.exists");
        }

        String phone = account.getPhone();
        if (!"".equals(phone) && phoneExists(phone)) {
            throw new BadRequestException("register.phone.is.exists");
        }

        String password = account.getPassword();
        account.setPassword(
                DigestUtils.sha512Hex(
                        password + "." + globalKey
                )
        );

        return accountRepository.save(account);
    }

    public User transAccountToUser(Account account, String globalKey) {
        User user = new User();

        user.setLastLoginAt(account.getLastLoginAt());
        user.setStatus(AccountStatus.getMsg(account.getStatus()));
        user.setGlobalKey(globalKey);

        return user;
    }

    private boolean emailExists(String email) {
        List<Account> list = accountRepository.findByEmail(email);

        return list != null && list.size() > 0;
    }

    private boolean phoneExists(String phone) {
        List<Account> list = accountRepository.findByPhone(phone);

        return list != null && list.size() > 0;
    }
}
