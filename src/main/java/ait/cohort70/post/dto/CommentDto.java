package ait.cohort70.post.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CommentDto {
    private String user;
    private String message;
    private LocalDateTime dateCreated;
    private Integer likes;
}
