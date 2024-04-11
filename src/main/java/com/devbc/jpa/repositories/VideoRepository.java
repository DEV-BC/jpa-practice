package com.devbc.jpa.repositories;

import com.devbc.jpa.models.Video;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideoRepository extends JpaRepository<Video, Integer> {
}
