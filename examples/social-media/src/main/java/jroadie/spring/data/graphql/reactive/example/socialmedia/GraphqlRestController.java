package jroadie.spring.data.graphql.reactive.example.socialmedia;

import jroadie.spring.data.graphql.reactive.example.socialmedia.content.Post;
import jroadie.spring.data.graphql.reactive.example.socialmedia.content.PostRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/graphql/v1")
public class GraphqlRestController {

    private PostRepository postRepository;

    public GraphqlRestController(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @PostMapping
    public Flux<Post> graphqlApi(@RequestBody Map graphqlQuery) {
        return postRepository.findAll();
    }

}
