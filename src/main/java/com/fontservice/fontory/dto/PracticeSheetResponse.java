package com.fontservice.fontory.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class PracticeSheetResponse {
    private Integer sheetId;
    private String imageUrl;
}
