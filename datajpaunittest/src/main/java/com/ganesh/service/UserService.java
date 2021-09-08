package com.ganesh.service;

/*
 * @created: 03/03/2021 - 12:47 PM
 * @author: Ganesh
 */


import com.ganesh.model.User;
import com.ganesh.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserService {

    @Autowired
    private UserRepository repo;

    public boolean isUniqueEmailViolated(Integer id, String email) {
        boolean isUniqueEmailViolated = false;

        User userByEmail = repo.getUserByEmail(email);
        boolean isCreatingNew = (id == null || id == 0);
        if(isCreatingNew){
            if(userByEmail != null) isUniqueEmailViolated = true;
        }else{
            if(userByEmail.getId() != id){
                isUniqueEmailViolated = true;
            }
        }
        return  isUniqueEmailViolated;
    }
}
