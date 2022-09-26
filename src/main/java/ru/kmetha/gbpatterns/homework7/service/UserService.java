package ru.kmetha.gbpatterns.homework7.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ru.kmetha.gbpatterns.homework7.dao.UserDao;
import ru.kmetha.gbpatterns.homework7.entity.User;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class UserService {

    private final UserDao userDao;

    public List<User> findAll() {
        return userDao.findAll();
    }
}
