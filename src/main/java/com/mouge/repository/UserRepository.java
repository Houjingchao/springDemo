package com.mouge.repository;

import com.mouge.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by jaf on 16/8/8.
 */
public interface UserRepository extends JpaRepository<UserEntity,Integer>{
}
