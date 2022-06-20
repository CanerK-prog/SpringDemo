package com.canerkurtcephe.odev1.Usr.converter;

import com.canerkurtcephe.odev1.Usr.dto.UsrUserDto;
import com.canerkurtcephe.odev1.Usr.dto.UsrUserSaveRequestDto;
import com.canerkurtcephe.odev1.Usr.dto.UsrUserUpdateRequestDto;
import com.canerkurtcephe.odev1.Usr.entity.UsrUser;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface UsrUserMapper {

    UsrUserMapper INSTANCE = Mappers.getMapper(UsrUserMapper.class);

    UsrUserDto convertToUsrUserDto(UsrUser usrUser);

    List<UsrUserDto> convertToUsrUserDtoList(List<UsrUser> usrUserList);

    UsrUser convertToUsrUser(UsrUserUpdateRequestDto usrUserUpdateRequestDto);

    UsrUser convertToUsrUser(UsrUserSaveRequestDto usrUserSaveRequestDto);
}
