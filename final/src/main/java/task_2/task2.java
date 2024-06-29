package task_2;

import java.util.ArrayList;
import java.util.List;

public class task2 {
    public static void main(String[] args) {
        List<String> questions = new ArrayList<>();
        questions.add("What is Java?");
        questions.add("How does serialization work?");
        questions.add("What is the main method in Java?");
        UserQuestions userQuestions = new UserQuestions(questions);
        CollectionsOperations col = new CollectionsOperations();
        col.addQuestionsIntoList("How old are you?", userQuestions.questions);
        col.getRandomQuestionsAndDeleteFromList(userQuestions);
        col.saveObject(userQuestions);
    }
}
