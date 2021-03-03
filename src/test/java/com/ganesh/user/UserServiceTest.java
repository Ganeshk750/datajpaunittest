package com.ganesh.user;

/*
 * @created: 03/03/2021 - 12:55 PM
 * @author: Ganesh
 */


import com.ganesh.model.User;
import com.ganesh.repository.UserRepository;
import com.ganesh.service.UserService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(MockitoExtension.class) // For run with Mockito f/w
@ExtendWith(SpringExtension.class) //  For run with Mockito f/w
public class UserServiceTest {

    @MockBean
    private UserRepository repo;

    @InjectMocks
    private UserService service;

    @Test
    public void testUniqueEmailWhenCreatingNewUser(){
        Integer userId = null;
        String userEmail = "jhon@gmail.com";

        Mockito.when(repo.getUserByEmail(userEmail)).thenReturn(null);

        boolean result = service.isUniqueEmailViolated(userId, userEmail);
        assertFalse(result);
    }

    @Test
    public void testEmailAllreadyExistsNotUnique(){
        Integer userId = null;
        String userEmail = "jhon@gmail.com";

        User user = new User();
        user.setEmail(userEmail);
        user.setId(1);
        Mockito.when(repo.getUserByEmail(userEmail)).thenReturn(user);

        boolean result = service.isUniqueEmailViolated(userId, userEmail);
        assertTrue(result);
    }

}
