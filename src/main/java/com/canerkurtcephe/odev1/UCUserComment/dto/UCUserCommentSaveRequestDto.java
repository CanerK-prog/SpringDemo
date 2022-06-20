package com.canerkurtcephe.odev1.UCUserComment.dto;

import com.canerkurtcephe.odev1.Usr.entity.UsrUser;
import lombok.Data;

import java.util.Date;

@Data
public class UCUserCommentSaveRequestDto {
    private String comment;
    private Long productId;
    private Long userId;
}
