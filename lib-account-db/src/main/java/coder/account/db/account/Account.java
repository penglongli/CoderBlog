package coder.account.db.account;

import coder.account.db.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Timestamp;

/**
 * Created by Pelin on 16/12/21.
 */
@Data
@Entity
@EqualsAndHashCode(callSuper = false)
@Table(name = "`accounts`")
public class Account extends BaseEntity{

    @Column(name = "password")
    private String password;

    @Column(name = "status")
    private Short status;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    @Column(name = "avatar")
    private String avatar;

    @Column(name = "location")
    private String location;

    @Column(name = "intro")
    private String intro;

    @Column(name = "html_intro")
    private String htmlIntro;

    @Column(name = "company")
    private String company;

    @Column(name = "last_login_at")
    private Timestamp lastLoginAt;
}
