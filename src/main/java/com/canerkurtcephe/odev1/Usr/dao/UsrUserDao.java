package com.canerkurtcephe.odev1.Usr.dao;

import com.canerkurtcephe.odev1.Usr.entity.UsrUser;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UsrUserDao extends JpaRepository<UsrUser, Long> {
}
