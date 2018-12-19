package com.yczn.repository.dc;

import com.yczn.pojo.dc.DcDishStyle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created with IntelliJ IDEA.
 *
 * @description:
 * @author: yz
 * @date: 2018-12-18
 * @time: 18:14
 */
@Repository
public interface DcDishStyleRepository extends JpaRepository<DcDishStyle, Long> {
}
