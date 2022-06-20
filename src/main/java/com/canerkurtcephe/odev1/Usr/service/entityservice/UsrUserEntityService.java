package com.canerkurtcephe.odev1.Usr.service.entityservice;


import com.canerkurtcephe.odev1.Usr.dao.UsrUserDao;
import com.canerkurtcephe.odev1.Usr.entity.UsrUser;
import com.canerkurtcephe.odev1.Usr.enums.EnumUsrUserStatus;
import com.canerkurtcephe.odev1.gen.service.BaseEntityService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class UsrUserEntityService extends BaseEntityService<UsrUser, UsrUserDao> {

    public UsrUserEntityService(UsrUserDao dao) {
        super(dao);
    }
}
