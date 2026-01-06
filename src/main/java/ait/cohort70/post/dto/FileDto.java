package ait.cohort70.post.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FileDto {
    private long id;
    private String fileName;
    private String contentType;
    private byte[] content;
}
