package rs.ac.singidunum;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        String token = "3076dbc4-aca5-4073-9e58-1e72587f4170";
        List<Question> questions = QuestionService.getInstance().getQuestions(token);
        questions.stream().map(Question::getText).forEach(System.out::println);
    }
}