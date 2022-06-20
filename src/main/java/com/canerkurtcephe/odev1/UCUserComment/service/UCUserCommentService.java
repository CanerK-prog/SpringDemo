package com.canerkurtcephe.odev1.UCUserComment.service;


import com.canerkurtcephe.odev1.UCUserComment.converter.UCUserCommentMapper;
import com.canerkurtcephe.odev1.UCUserComment.dto.UCUserCommentDto;
import com.canerkurtcephe.odev1.UCUserComment.dto.UCUserCommentSaveRequestDto;
import com.canerkurtcephe.odev1.UCUserComment.dto.UCUserCommentUpdateRequestDto;
import com.canerkurtcephe.odev1.UCUserComment.entity.UCUserComment;
import com.canerkurtcephe.odev1.UCUserComment.service.entityservice.UCUserCommentEntityService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UCUserCommentService {

    private final UCUserCommentEntityService ucUserCommentEntityService;

    public List<UCUserCommentDto> findAll() {
        List<UCUserComment> ucUserCommentList = ucUserCommentEntityService.findAll();
        List<UCUserCommentDto> ucUserCommentDtoList = UCUserCommentMapper.INSTANCE.convertToUCUserCommentDtoList(ucUserCommentList);
        return ucUserCommentDtoList;
    }

    public UCUserCommentDto save(UCUserCommentSaveRequestDto ucUserCommentSaveRequestDto) {
        UCUserComment ucUserComment = UCUserCommentMapper.INSTANCE.convertToUCUserComment(ucUserCommentSaveRequestDto);
        ucUserComment.setCommentDate(new Date());
        ucUserComment = ucUserCommentEntityService.save(ucUserComment);
        UCUserCommentDto ucUserCommentDto = UCUserCommentMapper.INSTANCE.converToUCUserCommentDto(ucUserComment);
        return ucUserCommentDto;
    }

    public void delete(Long id) {
        UCUserComment ucUserComment = ucUserCommentEntityService.findById(id);
        ucUserCommentEntityService.delete(ucUserComment); //Direkt id ile silme işlemi de mümkün yalnızca dönüşüm alıştırması için bu şekilde yapıldı.
    }

    public UCUserCommentDto update(UCUserCommentUpdateRequestDto ucUserCommentUpdateRequestDto) {

        boolean isExist = ucUserCommentEntityService.isExist(ucUserCommentUpdateRequestDto.getId());
        if (!isExist){
            throw  new RuntimeException("COMMENT DOES NOT EXISTS");
        }

        UCUserComment ucUserComment = UCUserCommentMapper.INSTANCE.convertToUCUserComment(ucUserCommentUpdateRequestDto);
        ucUserComment = ucUserCommentEntityService.save(ucUserComment);
        UCUserCommentDto ucUserCommentDto = UCUserCommentMapper.INSTANCE.converToUCUserCommentDto(ucUserComment);
        return ucUserCommentDto;
    }
}
