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

    @Column(name = "name")
    private String name;

    public GlobalKey() {}

    public GlobalKey(String name) {
        this.name = name;
    }
}
