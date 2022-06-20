package com.canerkurtcephe.odev1.UCUserComment.entity;

import com.canerkurtcephe.odev1.Usr.entity.UsrUser;
import com.canerkurtcephe.odev1.gen.entity.BaseEntity;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "UC_USER_COMMENT")
@Data
public class UCUserComment extends BaseEntity {

    @Id
    @SequenceGenerator(name = "UCUserComment", sequenceName = "UC_USER_COMMENT_ID_SEQ")
    @GeneratedValue(generator = "UCUserComment")
    private Long id;

    @Column(name = "COMMENT", length = 500)
    private String comment;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "COMMENT_DATE")
    private Date commentDate;

    @Column(name = "PRODUCT_ID")
    private Long productId;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UsrUser user;

    @Override
    public Long getID() {
        return id;
    }
}
