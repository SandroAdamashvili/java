package task_2;

import java.io.Serializable;
import java.util.List;

public class UserQuestions implements Serializable {
    List<String> questions;
    public UserQuestions(List<String> questions){
        this.questions = questions;
    }
}
