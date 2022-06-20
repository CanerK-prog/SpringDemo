package com.canerkurtcephe.odev1.Usr.service;


import com.canerkurtcephe.odev1.Usr.converter.UsrUserMapper;
import com.canerkurtcephe.odev1.Usr.dto.UsrUserDto;
import com.canerkurtcephe.odev1.Usr.dto.UsrUserSaveRequestDto;
import com.canerkurtcephe.odev1.Usr.dto.UsrUserUpdateRequestDto;
import com.canerkurtcephe.odev1.Usr.entity.UsrUser;
import com.canerkurtcephe.odev1.Usr.enums.EnumUsrUserStatus;
import com.canerkurtcephe.odev1.Usr.service.entityservice.UsrUserEntityService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UsrUserService {

    private final UsrUserEntityService usrUserEntityService;

    public List<UsrUserDto> findAll(){
        List<UsrUser> usrUserList = usrUserEntityService.findAll();
        List<UsrUserDto> usrUserDtoList = UsrUserMapper.INSTANCE.convertToUsrUserDtoList(usrUserList);
        return usrUserDtoList;
    }

    public UsrUserDto findById(Long id){
        UsrUser usrUser = usrUserEntityService.findById(id);
        UsrUserDto usrUserDto = UsrUserMapper.INSTANCE.convertToUsrUserDto(usrUser);
        return usrUserDto;
    }


    public UsrUserDto save(UsrUserSaveRequestDto usrUserSaveRequestDto) {
        UsrUser usrUser = UsrUserMapper.INSTANCE.convertToUsrUser(usrUserSaveRequestDto);
        usrUser.setStatus(EnumUsrUserStatus.ACTIVE);
        usrUser = usrUserEntityService.save(usrUser);
        UsrUserDto usrUserDto = UsrUserMapper.INSTANCE.convertToUsrUserDto(usrUser);
        return usrUserDto;
    }

    public UsrUserDto update(UsrUserUpdateRequestDto usrUserUpdateRequestDto){
        UsrUser usrUser = UsrUserMapper.INSTANCE.convertToUsrUser(usrUserUpdateRequestDto);
        usrUser.setStatus(EnumUsrUserStatus.ACTIVE);
        usrUser = usrUserEntityService.save(usrUser);
        UsrUserDto usrUserDto = UsrUserMapper.INSTANCE.convertToUsrUserDto(usrUser);
        return usrUserDto;
    }

    public void makePassive(Long id){
        UsrUser usrUser = usrUserEntityService.findById(id);
        usrUser.setStatus(EnumUsrUserStatus.PASSIVE);
        usrUserEntityService.save(usrUser);
    }

}
