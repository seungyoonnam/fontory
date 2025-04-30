package com.fontservice.fontory.dto;

import lombok.Getter;

@Getter
public class PracticeSheetRequest {
    private String userId;
    private Integer fontId;
    private Integer backgroundId;
    private String phrase;
}
