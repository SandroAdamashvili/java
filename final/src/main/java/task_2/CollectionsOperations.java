package task_2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.List;
import java.util.Random;

public class CollectionsOperations implements Serializable {
    public void addQuestionsIntoList(String question, List<String> questions){
        questions.add(question);
        System.out.println("questions: " + questions);
    }

    public void getRandomQuestionsAndDeleteFromList(UserQuestions bookStore){
        Random random = new Random();
        List<String> questions = bookStore.questions;
        int randomNum = random.nextInt(questions.size());
        System.out.println("Random question: " + questions.get(randomNum));
        questions.remove(randomNum);
        System.out.println("questions array updated: " + questions);
    }

    public void saveObject(UserQuestions bookStore){
        try {
            FileOutputStream fileOut = new FileOutputStream("bookStore.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(bookStore);
            out.close();
            fileOut.close();
            System.out.println("Serialized data is saved in bookStore.ser");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
