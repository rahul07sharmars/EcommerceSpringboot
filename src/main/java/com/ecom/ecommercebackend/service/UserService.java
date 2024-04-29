package com.ecom.ecommercebackend.service;

import com.ecom.ecommercebackend.api.model.RegistrationBody;
import com.ecom.ecommercebackend.model.LocalUser;
import com.ecom.ecommercebackend.model.dao.LocalUserDao;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private LocalUserDao localUserDao;

    public UserService(LocalUserDao localUserDao) {
        this.localUserDao = localUserDao;
    }

    public LocalUser registerUser(RegistrationBody registerBody) {
        LocalUser user = new LocalUser();
        user.setEmail(registerBody.getEmail());
        user.setFirstName(registerBody.getFirstName());
        user.setLastName(registerBody.getLastName());
        user.setUsername(registerBody.getUsername());
        //TODO: encrypt password and then store
        user.setPassword(registerBody.getPassword());
        return localUserDao.save(user);
    }
}
