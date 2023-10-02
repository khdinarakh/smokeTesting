package com.boots.smokeTesting;

import com.boots.entity.User;
import com.boots.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

@SpringBootTest
public class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void testFindUserByUsername() {
        User user = new User();
        user.setUsername("khdinosh");
        user.setPassword("password");
        userRepository.save(user);

        User foundUser = userRepository.findByUsername("existinguser");

        assert (foundUser != null);
    }
}

