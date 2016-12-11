package coder.blog.db.category;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by Pelin on 16/12/11.
 */
@Data
@Entity
@EqualsAndHashCode(callSuper = false)
@Table(name = "`coder_categories`")
public class CoderCategory {
}
