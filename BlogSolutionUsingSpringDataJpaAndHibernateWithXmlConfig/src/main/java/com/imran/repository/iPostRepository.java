package com.imran.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.imran.model.Post;


public interface iPostRepository extends JpaRepository<Post, Long>{

}
