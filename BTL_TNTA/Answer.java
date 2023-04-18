import java.util.List;

public class Answer {
    private List<String> answer;
    private String true_answer;
    public Answer(){

    }
    public Answer(List<String> ans, String trueAns){
        this.setAnswer(ans);
        this.true_answer = trueAns;
    }



    public String getTrue_answer() {
        return true_answer;
    }

    public void setTrue_answer(String true_answer) {
        this.true_answer = true_answer;
    }

    public List<String> getAnswer() {
        return answer;
    }

    public void setAnswer(List<String> answer) {
        this.answer = answer;
    }
}
