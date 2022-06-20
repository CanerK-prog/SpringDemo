package com.canerkurtcephe.odev1.Usr.dto;


import com.canerkurtcephe.odev1.Usr.enums.EnumUsrUserStatus;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
public class UsrUserUpdateRequestDto {

    private Long id;
    private String name;
    private String surname;
    private String email;
    private String phone;
    private Date birthDate;
}
