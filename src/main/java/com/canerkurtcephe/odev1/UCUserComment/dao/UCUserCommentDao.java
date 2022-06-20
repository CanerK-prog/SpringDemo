package com.canerkurtcephe.odev1.UCUserComment.dao;

import com.canerkurtcephe.odev1.UCUserComment.entity.UCUserComment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UCUserCommentDao extends JpaRepository<UCUserComment, Long> {
}
