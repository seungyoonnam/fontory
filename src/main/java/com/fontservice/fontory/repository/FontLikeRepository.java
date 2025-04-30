package com.fontservice.fontory.repository;

import com.fontservice.fontory.domain.FontLike;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FontLikeRepository extends JpaRepository<FontLike, Integer> {
    boolean existsByUserIdAndFontId(String userId, Integer fontId);
}
