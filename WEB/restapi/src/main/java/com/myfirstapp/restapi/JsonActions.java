package com.myfirstapp.restapi;
import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class JsonActions {
  public static Post[] addPost(String title, String content) throws IOException {
    ObjectMapper objectMapper = new ObjectMapper().enable(SerializationFeature.INDENT_OUTPUT);
    Post[] oldPosts = objectMapper.readValue(new File("src/main/resources/static/data.json"), Post[].class);
    Post[] newPosts = new Post[oldPosts.length + 1];
    for (int i = 0; i < oldPosts.length; i++) {
      newPosts[i] = new Post(oldPosts[i].id, oldPosts[i].title, oldPosts[i].content);
    }
    newPosts[oldPosts.length] = new Post(1, title, content);
    objectMapper.writeValue(new File("src/main/resources/static/data.json"), newPosts);
    return newPosts;
  }

 
}
