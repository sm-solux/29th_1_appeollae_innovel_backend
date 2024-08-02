package com.solux.innovel.post.postSave;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PostSaveDTO {
    private Long userId;
    private String title;
    private String genre;
    private String content;
}
