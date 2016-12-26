package coder.account.db.log;

import coder.account.db.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by Pelin on 16/12/21.
 */
@Data
@Entity
@EqualsAndHashCode(callSuper = false)
@Table(name = "`login_logs`")
public class LoginLog extends BaseEntity{

    @Column(name = "account_id")
    private Integer accountId;

    @Column(name = "ip")
    private String ip;

    @Column(name = "user_agent")
    private String user_agent;
}
