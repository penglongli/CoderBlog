package coder.lib.core.bean;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.sql.Date;
import java.sql.Timestamp;

/**
 * Created by Pelin on 17/1/28.
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class User extends BaseBean {

    private Timestamp lastLoginAt;

    private String status;

    private String role;

    private String globalKey;

    private String sex;

    private Date birthday;

    private Boolean emailValidation;

    private Boolean phoneValidation;


}
