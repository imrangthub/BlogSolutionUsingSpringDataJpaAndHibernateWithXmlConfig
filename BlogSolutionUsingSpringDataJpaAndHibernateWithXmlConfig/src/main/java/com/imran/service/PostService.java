package com.imran.service;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;


import com.imran.model.Post;
import com.imran.repository.*;

@Service
public  class PostService implements iPostService{
	
	 @Resource
	 private iPostRepository iPostRepository;


	public List<Post> findAll() {   	
    	return iPostRepository.findAll();
	}




}
