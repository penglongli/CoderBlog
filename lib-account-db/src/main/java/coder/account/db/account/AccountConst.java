package coder.account.db.account;

import lombok.Getter;
import org.apache.commons.lang3.StringUtils;

/**
 * Created by Pelin on 17/1/28.
 */
public class AccountConst {
    public static final String TYPE_EMAIL = "TYPE_EMAIL";
    public static final String TYPE_PHONE = "TYPE_PHONE";
    public static final String STATUS_NORMAL = "STATUS_NORMAL";
    public static final String STATUS_BLOCKED = "STATUS_BLOCKED";

    public enum AccountType {
        EMAIL(1, TYPE_EMAIL),
        PHONE(2, TYPE_PHONE);

        @Getter
        private int code;
        @Getter
        private String msg;

        AccountType(int code, String msg) {
            this.code = code;
            this.msg = msg;
        }

        public static int getCode(String msg) {
            for (AccountType type : AccountType.values()) {
                if (type.getMsg().equals(msg)) {
                    return type.code;
                }
            }
            return 0;
        }
    }

    public enum AccountStatus {
        NORMAL(1, STATUS_NORMAL),
        BLOCKED(2, STATUS_BLOCKED);

        @Getter
        private int code;
        @Getter
        private String msg;

        AccountStatus(int code, String msg) {
            this.code = code;
            this.msg = msg;
        }

        public static String getMsg(int code) {
            for (AccountType type : AccountType.values()) {
                if (type.getCode() == code) {
                    return type.getMsg();
                }
            }
            return StringUtils.EMPTY;
        }
    }
}
