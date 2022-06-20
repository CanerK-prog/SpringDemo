package com.canerkurtcephe.odev1.UCUserComment.dto;

import lombok.Data;

import java.util.Date;

@Data
public class UCUserCommentUpdateRequestDto {
    private Long id;
    private String comment;
}
