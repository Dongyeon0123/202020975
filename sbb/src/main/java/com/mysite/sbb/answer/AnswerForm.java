package com.mysite.sbb.answer;

import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;
import jakarta.validation.constraints.NotBlank;


public class AnswerForm {
    @NotBlank(message = "답변 내용은 필수항목입니다.")
    private String content;

    // getter와 setter 메서드
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
