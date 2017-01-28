package coder.account.db.account;

import lombok.Getter;

/**
 * Created by Pelin on 17/1/28.
 */
public class AccountConst {
    public static final String TYPE_EMAIL = "TYPE_EMAIL";
    public static final String TYPE_PHONE = "TYPE_PHONE";

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
}
