package com.group2.sprint.Onlineshoppingapp.Repository;

import com.group2.sprint.Onlineshoppingapp.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginRepository extends JpaRepository<User,String> {
}
