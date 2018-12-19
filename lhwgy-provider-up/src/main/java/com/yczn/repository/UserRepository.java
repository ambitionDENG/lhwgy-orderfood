package com.yczn.repository;

import com.yczn.pojo.dc.DcDishStyleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<DcDishStyleEntity,Long> {
}
