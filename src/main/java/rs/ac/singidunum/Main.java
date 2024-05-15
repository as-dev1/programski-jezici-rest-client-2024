package rs.ac.singidunum;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        String token = Files.readString(Paths.get("token.txt"), StandardCharsets.UTF_8)
                .replaceAll("\n", "");
        List<Question> questions = QuestionService.getInstance().getQuestions(token);
        questions.stream().map(Question::getText).forEach(System.out::println);
    }
}