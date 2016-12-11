package coder.blog.db.draft;

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
@Table(name = "`coder_drafts`")
public class CoderDraft {
}
