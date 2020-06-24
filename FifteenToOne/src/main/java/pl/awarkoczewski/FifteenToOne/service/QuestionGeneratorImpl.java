package pl.awarkoczewski.FifteenToOne.service;

import pl.awarkoczewski.FifteenToOne.entity.Question;
import pl.awarkoczewski.FifteenToOne.repository.QuestionRepository;

import java.util.Optional;

public class QuestionGeneratorImpl implements QuestionGenerator {

    private Long questionNumber = 0L;
    private final QuestionRepository questionRepository;

    public QuestionGeneratorImpl(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }

    @Override
    public String nextQuestion(Long questionNumber) {
        Optional<Question> nextQuestion = questionRepository.getQuestionById(questionNumber);

        return nextQuestion.get().getContent();
    }
}
