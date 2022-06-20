package com.canerkurtcephe.odev1.UCUserComment.converter;


import com.canerkurtcephe.odev1.UCUserComment.dto.UCUserCommentDto;
import com.canerkurtcephe.odev1.UCUserComment.dto.UCUserCommentSaveRequestDto;
import com.canerkurtcephe.odev1.UCUserComment.entity.UCUserComment;
import com.canerkurtcephe.odev1.Usr.service.entityservice.UsrUserEntityService;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import org.springframework.beans.factory.annotation.Autowired;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public abstract class UCUserCommentMapperAbstract {


    @Autowired
    UsrUserEntityService usrUserEntityService;

    @Mapping(
            target = "userId",
            expression = "java(ucUserComment.getUser().getID())"
    )
    public abstract UCUserCommentDto converToUCUserCommentDto(UCUserComment ucUserComment);

    @Mapping(
            target = "user",
            expression = "java(usrUserEntityService.findById(ucUserCommentSaveRequestDto.getUserId()))"
    )
    public abstract UCUserComment convertToUCUserComment(UCUserCommentSaveRequestDto ucUserCommentSaveRequestDto);
}
