package com.wxun.photomanager.repository;

import com.wxun.photomanager.entity.User;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface UserRepository extends PagingAndSortingRepository<User,String>{
}
