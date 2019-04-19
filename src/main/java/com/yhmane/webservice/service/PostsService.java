package com.yhmane.webservice.service;

import com.yhmane.webservice.domain.posts.Posts;
import com.yhmane.webservice.domain.posts.PostsRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@AllArgsConstructor
@Service
public class PostsService {

    private PostsRepository postsRepository;

    @Transactional
    public void save(Posts entity) {
        postsRepository.save(entity);
    }
}
