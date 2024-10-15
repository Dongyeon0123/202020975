package com.mysite.sbb;

import java.time.LocalDateTime;
import org.junit.jupiter.api.Test;  // JUnit 5 애노테이션
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.mysite.sbb.question.Question;
import com.mysite.sbb.question.QuestionRepository;
import com.mysite.sbb.question.QuestionService;

@SpringBootTest
class SbbApplicationTests {
    @Autowired
    private QuestionService questionService;

    @Test
    void testJpa() {
    	for(int i=1; i<=300; i++) {
    		String subject = String.format("테스트 데이터입니다:[%03d]", i);
    		String content = "내용 없음";
    		this.questionService.create(subject, content);
    	}
    }
}