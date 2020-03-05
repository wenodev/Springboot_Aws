package com.weno.book.web.dto;

import com.weno.book.domain.posts.Posts;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class PostsListResponseDto {

    private Long id;
    private String title;
    private String author;
    private LocalDateTime modifiedDate;

    public PostsListResponseDto(Posts entiy){
        this.id = entiy.getId();
        this.title = entiy.getTitle();
        this.author = entiy.getAuthor();
        this.modifiedDate = entiy.getModifiedDate();
    }


}
