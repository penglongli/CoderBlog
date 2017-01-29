package coder.lib.sso.app.key;

import coder.account.db.key.GlobalKey;
import coder.account.db.key.GlobalKeyRepository;
import coder.lib.sso.exception.BadRequestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Pelin on 17/1/29.
 */
@Service
public class GlobalKeyService {

    @Autowired
    private GlobalKeyRepository globalKeyRepository;

    public GlobalKey save(GlobalKey globalKey) throws BadRequestException {
        boolean isExist = exists(globalKey.getName());
        if (isExist) {
            throw new BadRequestException("register.global.key.existed");
        }

        return globalKeyRepository.save(globalKey);
    }

    /**
     * 判断 global_key 是否存在
     * @param name
     * @return
     */
    private boolean exists(String name) {
        List<GlobalKey> list = globalKeyRepository.findByName(name);

        return list != null && list.size() > 0;
    }
}
