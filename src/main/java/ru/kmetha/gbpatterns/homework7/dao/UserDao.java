package ru.kmetha.gbpatterns.homework7.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.kmetha.gbpatterns.homework7.entity.User;

public interface UserDao extends JpaRepository<User, Long> {
}
