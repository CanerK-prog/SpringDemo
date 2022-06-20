package com.canerkurtcephe.odev1.UCUserComment.controller;


import com.canerkurtcephe.odev1.UCUserComment.dto.UCUserCommentDto;
import com.canerkurtcephe.odev1.UCUserComment.dto.UCUserCommentSaveRequestDto;
import com.canerkurtcephe.odev1.UCUserComment.dto.UCUserCommentUpdateRequestDto;
import com.canerkurtcephe.odev1.UCUserComment.service.UCUserCommentService;
import lombok.Data;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/user-comments")
@Data
public class UCUserCommentController {

    private final UCUserCommentService ucUserCommentService;

    @GetMapping
    public List<UCUserCommentDto> findAll(){
        List<UCUserCommentDto> ucUserCommentDtoList = ucUserCommentService.findAll();
        return ucUserCommentDtoList;
    }

    @PostMapping
    public UCUserCommentDto save(@RequestBody UCUserCommentSaveRequestDto ucUserCommentSaveRequestDto){
        UCUserCommentDto ucUserCommentDto = getUcUserCommentService().save(ucUserCommentSaveRequestDto);
        return ucUserCommentDto;
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        ucUserCommentService.delete(id);
    }

    @PutMapping
    public UCUserCommentDto update(@RequestBody UCUserCommentUpdateRequestDto ucUserCommentUpdateRequestDto){
        UCUserCommentDto ucUserCommentDto = getUcUserCommentService().update(ucUserCommentUpdateRequestDto);
        return ucUserCommentDto;
    }
}
