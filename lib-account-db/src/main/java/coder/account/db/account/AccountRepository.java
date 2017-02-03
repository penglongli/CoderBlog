package coder.account.db.account;

import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

/**
 * Created by Pelin on 17/1/29.
 */
public interface AccountRepository extends PagingAndSortingRepository<Account, Integer> {

    List<Account> findByEmail(String email);

    List<Account> findByPhone(String phone);
}
