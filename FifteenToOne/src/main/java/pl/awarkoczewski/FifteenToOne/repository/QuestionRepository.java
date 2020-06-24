package pl.awarkoczewski.FifteenToOne.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.awarkoczewski.FifteenToOne.entity.Question;

import java.util.Optional;

public interface QuestionRepository extends JpaRepository<Question, Long> {

    Optional<Question> getQuestionById(Long id);
}
