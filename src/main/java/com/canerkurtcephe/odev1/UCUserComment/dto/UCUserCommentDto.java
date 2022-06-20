package com.canerkurtcephe.odev1.UCUserComment.dto;


import com.canerkurtcephe.odev1.Usr.entity.UsrUser;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
public class UCUserCommentDto {

    private Long id;
    private String comment;
    private Date commentDate;
    private Long productId;
    private Long userId;
}
