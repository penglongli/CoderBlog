package coder.lib.core.bean;

import lombok.Data;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * Created by Pelin on 17/1/28.
 */
@Data
public class BaseBean implements Serializable {

    private Integer id;

    private Timestamp createdAt;

    private Timestamp updatedAt;

    @Override
    public boolean equals(Object object) {
        return null != id && getClass().equals(object.getClass()) && id.equals(((BaseBean) object).getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getClass().getName(), id);
    }
}
