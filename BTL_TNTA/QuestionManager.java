import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class QuestionManager {
    private List<Question> ds;

    public List<Question> getDs() {
        return ds;
    }

    public void setDs(List<Question> ds) {
        this.ds = ds;
    }

    public QuestionManager() {
        ds = new ArrayList<>();
    }

    public void addQuestion(Question q) {
        this.ds.add(q);
    }

    public void hienThi() {
        this.ds.forEach(q -> q.hienThi());
    }

    public List<Question> timCauHoi(String kw) {
        return ds.stream().filter(q -> q.getQuestion().contains(kw) && q.getQues_role() == QUESTION_ROLE.Multiple_Choice).collect(Collectors.toList());
    }
    public List<Question> timCauHoiTheoRole(int id) {
        return ds.stream().filter(q -> q.getQues_role().getId() == id).collect(Collectors.toList());
    }

    public List<Question> timCauHoiTheoDanhMuc(int id) {
        return ds.stream().filter(q -> q.getDanhMuc() != null && q.getDanhMuc().getId() == id).collect(Collectors.toList());
    }

    public List<Question> timCauHoiTheoMucDo(int id) {
        return ds.stream().filter(q -> q.getMucDo().getId() == id).collect(Collectors.toList());
    }

    public List<Question> luyenTap(int ques_role, int mucDo) {
        return ds.stream().filter(q -> q.getQues_role().getId() == ques_role && q.getMucDo().getId() == mucDo).collect(Collectors.toList());
    }
    public List<Question> luyenTapMultipleChoice(){
        return ds.stream().filter(q -> q.getQues_role().getId() == QUESTION_ROLE.Multiple_Choice.getId()).collect(Collectors.toList());
    }

}
//    public List<Question> luyenTapMutipleChoice(int soCau){
//        Random rd = new Random();
//        int tam = 0;
//        for(int i = 0; i < soCau; i++){
//            tam = rd.nextInt(ds.size());
//            ds1[i].hienThi();
//        }
//    }

