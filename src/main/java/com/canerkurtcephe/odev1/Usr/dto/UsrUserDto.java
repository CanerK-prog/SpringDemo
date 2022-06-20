package com.canerkurtcephe.odev1.Usr.dto;


import com.canerkurtcephe.odev1.Usr.enums.EnumUsrUserStatus;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
public class UsrUserDto {

    private Long id;
    private String name;
    private String surname;
    private EnumUsrUserStatus status;
}
