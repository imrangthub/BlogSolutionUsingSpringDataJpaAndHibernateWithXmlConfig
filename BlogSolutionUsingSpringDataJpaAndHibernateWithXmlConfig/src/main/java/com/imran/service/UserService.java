package com.imran.service;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.imran.dao.UserDao;
import com.imran.model.User;


@Service
@Transactional
public class UserService {
	


	@Autowired
	UserDao userDao;
	



}