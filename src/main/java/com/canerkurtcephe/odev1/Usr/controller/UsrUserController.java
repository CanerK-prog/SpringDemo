package com.canerkurtcephe.odev1.Usr.controller;

import com.canerkurtcephe.odev1.Usr.dto.UsrUserDto;
import com.canerkurtcephe.odev1.Usr.dto.UsrUserSaveRequestDto;
import com.canerkurtcephe.odev1.Usr.dto.UsrUserUpdateRequestDto;
import com.canerkurtcephe.odev1.Usr.service.UsrUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
public class UsrUserController {

    private final UsrUserService usrUserService;

    @GetMapping
    public List<UsrUserDto> findAll(){
        List<UsrUserDto> usrUserDtoList = usrUserService.findAll();
        return usrUserDtoList;
    }

    @GetMapping("/{id}")
    public UsrUserDto findById(@PathVariable Long id){
        UsrUserDto usrUserDto = usrUserService.findById(id);
        return usrUserDto;
    }

    @PostMapping
    public UsrUserDto save(@RequestBody UsrUserSaveRequestDto usrUserSaveRequestDto){
        UsrUserDto usrUserDto = usrUserService.save(usrUserSaveRequestDto);
        return usrUserDto;
    }

    @PutMapping
    public UsrUserDto update(@RequestBody UsrUserUpdateRequestDto usrUserUpdateRequestDto){
        UsrUserDto usrUserDto = usrUserService.update(usrUserUpdateRequestDto);
        return  usrUserDto;
    }

    @PatchMapping("/cancel/{id}")
    public void makePassive(@PathVariable Long id){
        usrUserService.makePassive(id);
    }

}
