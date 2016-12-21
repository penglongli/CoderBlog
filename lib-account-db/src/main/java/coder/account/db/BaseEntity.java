package coder.account.db;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import java.sql.Timestamp;
import java.util.Date;

/**
 * Created by Pelin on 16/12/21.
 */
@MappedSuperclass
@Data
public abstract class BaseEntity {
    public static final Timestamp DELETE_AT = Timestamp.valueOf("1970-01-01 00:00:00.0");

    @Id
    @GeneratedValue
    protected Integer id;

    @Column(name = "`created_at`")
    protected Timestamp createdAt;

    @Column(name = "`updated_at`")
    protected Timestamp updatedAt;

    @Column(name = "`deleted_at`")
    protected Timestamp deletedAt;

    @PrePersist
    void onCreate() {
        this.createdAt = new Timestamp((new Date().getTime()));
        this.updatedAt = this.createdAt;
        this.deletedAt = DELETE_AT;
    }

    @PreUpdate
    void onUpdate() {
        this.updatedAt = new Timestamp((new Date().getTime()));
    }
}
