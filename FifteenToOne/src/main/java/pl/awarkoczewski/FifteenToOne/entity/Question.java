package pl.awarkoczewski.FifteenToOne.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Question {

    private Long id;
    private String content;
    private String answer;

}
