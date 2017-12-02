package jroadie.spring.data.graphql.reactive.example.socialmedia.content;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Post {

    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
