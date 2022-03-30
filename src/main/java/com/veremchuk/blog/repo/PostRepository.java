package com.veremchuk.blog.repo;

import com.veremchuk.blog.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {
}
