package com.canerkurtcephe.odev1.UCUserComment.converter;


import com.canerkurtcephe.odev1.UCUserComment.dto.UCUserCommentDto;
import com.canerkurtcephe.odev1.UCUserComment.dto.UCUserCommentSaveRequestDto;
import com.canerkurtcephe.odev1.UCUserComment.dto.UCUserCommentUpdateRequestDto;
import com.canerkurtcephe.odev1.UCUserComment.entity.UCUserComment;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface UCUserCommentMapper {

    UCUserCommentMapper INSTANCE = Mappers.getMapper(UCUserCommentMapper.class);

    UCUserCommentDto converToUCUserCommentDto(UCUserComment ucUserComment);

    List<UCUserCommentDto> convertToUCUserCommentDtoList(List<UCUserComment> ucUserCommentList);

    UCUserComment convertToUCUserComment(UCUserCommentSaveRequestDto ucUserCommentSaveRequestDto);

    UCUserComment convertToUCUserComment(UCUserCommentUpdateRequestDto ucUserCommentUpdateRequestDto);


}
