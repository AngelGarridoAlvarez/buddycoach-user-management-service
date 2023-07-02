package com.buddycoach.usermanagerservice.repository;

import com.buddycoach.usermanagerservice.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
