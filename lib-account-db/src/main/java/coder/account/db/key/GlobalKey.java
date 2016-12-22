package coder.account.db.key;

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
@Table(name = "`global_keys`")
public class GlobalKey extends BaseEntity{

    @Column(name = "global_key")
    private String globalKey;
}
