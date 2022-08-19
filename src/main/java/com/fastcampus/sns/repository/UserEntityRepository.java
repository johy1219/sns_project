package com.fastcampus.sns.repository;

import com.fastcampus.sns.model.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserEntitiyRepository extends JpaRepository<UserEntity,Integer>{
}
