package jroadie.spring.data.graphql.reactive.example.socialmedia.content;

import org.springframework.data.repository.reactive.ReactiveSortingRepository;

public interface PostRepository extends ReactiveSortingRepository<Post, String> {
}
