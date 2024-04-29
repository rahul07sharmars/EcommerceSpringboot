package com.ecom.ecommercebackend.model.dao;

import com.ecom.ecommercebackend.model.LocalUser;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface LocalUserDao extends CrudRepository<LocalUser, UUID> {

}
