package coder.account.db.account;

import lombok.Getter;
import org.apache.commons.lang3.StringUtils;

/**
 * Created by Pelin on 17/1/28.
 */
public class AccountConst {
    public static final short STATUS_NORMAL = 1;
    public static final short STATUS_BLOCKED = 2;

    public enum AccountStatus {
        NORMAL(STATUS_NORMAL, "STATUS_NORMAL"),
        BLOCKED(STATUS_BLOCKED, "STATUS_BLOCKED");

        @Getter
        private short code;
        @Getter
        private String msg;

        AccountStatus(short code, String msg) {
            this.code = code;
            this.msg = msg;
        }

        public static String getMsg(short code) {
            for (AccountStatus status : AccountStatus.values()) {
                if (code == status.code) {
                    return status.msg;
                }
            }
            return StringUtils.EMPTY;
        }
    }
}
