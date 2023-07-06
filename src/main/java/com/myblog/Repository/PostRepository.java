package com.myblog.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.myblog.Entity.Post;

@Repository
public interface PostRepository extends JpaRepository<Post,Integer>{

}
