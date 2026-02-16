
package com.apis.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.apis.entity.User;
public interface UserRepository extends JpaRepository<User,Long>{}
