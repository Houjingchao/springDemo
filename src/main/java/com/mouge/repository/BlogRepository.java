package com.mouge.repository;

import com.mouge.model.BlogEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by jaf on 16/8/8.
 */
public interface BlogRepository extends JpaRepository<BlogEntity, Integer> {
}
