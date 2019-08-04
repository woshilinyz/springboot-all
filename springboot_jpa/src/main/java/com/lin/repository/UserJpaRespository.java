package com.lin.repository;

import com.lin.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * @author: Mr.Lin
 * @create: 2019-08-04 09:36:38
 **/
public interface UserJpaRespository  extends JpaRepository<User,Integer> {
    @Query(nativeQuery = true,value = "select * from t_user where name=:name")
    User queryByName(@Param("name") String name);

    @Query("from User where name=:name")
    User queryByHql(@Param("name") String name);
}