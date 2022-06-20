package com.canerkurtcephe.odev1.Usr.entity;


import com.canerkurtcephe.odev1.Usr.enums.EnumUsrUserStatus;
import com.canerkurtcephe.odev1.gen.entity.BaseEntity;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "USR_USER")
@Data
public class UsrUser extends BaseEntity {

    @Id
    @SequenceGenerator(name = "UsrUser", sequenceName = "USR_USER_ID_SEQ")
    @GeneratedValue(generator = "UsrUser")
    private Long id;

    @Column(name = "NAME", length = 50)
    private String name;

    @Column(name = "SURNAME", length = 50)
    private String surname;

    @Column(name = "EMAIL", length = 50)
    private String email;

    @Column(name = "PHONE", length = 15)
    private String phone;

    @Temporal(TemporalType.DATE)
    @Column(name = "BIRTH_DATE")
    private Date birthDate;

    @Enumerated(EnumType.STRING)
    @Column(name = "STATUS", length = 30)
    private EnumUsrUserStatus status;

    @Override
    public Long getID() {
        return id;
    }
}
