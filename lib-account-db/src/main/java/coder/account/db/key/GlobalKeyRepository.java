package coder.account.db.key;

import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

/**
 * Created by Pelin on 17/1/29.
 */
public interface GlobalKeyRepository extends PagingAndSortingRepository<GlobalKey, Integer> {

    List<GlobalKey> findByName(String name);
}