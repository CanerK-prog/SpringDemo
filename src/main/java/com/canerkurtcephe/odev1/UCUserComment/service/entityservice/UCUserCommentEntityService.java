package com.canerkurtcephe.odev1.UCUserComment.service.entityservice;


import com.canerkurtcephe.odev1.UCUserComment.dao.UCUserCommentDao;
import com.canerkurtcephe.odev1.UCUserComment.entity.UCUserComment;
import com.canerkurtcephe.odev1.gen.service.BaseEntityService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
public class UCUserCommentEntityService extends BaseEntityService<UCUserComment, UCUserCommentDao> {

    public UCUserCommentEntityService(UCUserCommentDao dao) {
        super(dao);
    }
}
