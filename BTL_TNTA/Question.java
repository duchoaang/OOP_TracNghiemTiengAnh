import java.util.ArrayList;
import java.util.List;

public class Question {
    private int id;
    private static int dem;
    private String context;
    private String question;
    private Answer ans;

    private DANH_MUC danhMuc;
    private MUC_DO mucDo;
    private QUESTION_ROLE ques_role;
    private String giaiThich;
    {
        id = ++dem;
    }
    public Question(){

    }

    public Question(String question, Answer ans, DANH_MUC danhMuc, MUC_DO mucdo, QUESTION_ROLE ques_role, String giaiThich){
        this.context = " ";
        this.setId(id);
        this.question = question;
        this.ans = ans;
        this.setDanhMuc(danhMuc);
        this.mucDo = mucdo;
        this.ques_role = ques_role;
        this.giaiThich = giaiThich;
    }
    public Question(String context, String question, Answer ans,DANH_MUC danhMuc, MUC_DO mucdo, QUESTION_ROLE ques_role, String giaiThich){
        this.context = context;
        this.setId(id);
        this.question = question;
        this.ans = ans;
        this.setDanhMuc(danhMuc);
        this.mucDo = mucdo;
        this.ques_role = ques_role;
        this.giaiThich = giaiThich;
    }


    public static int getDem() {
        return dem;
    }

    public static void setDem(int dem) {
        Question.dem = dem;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public Answer getAns() {
        return ans;
    }

    public void setAns(Answer ans) {
        this.ans = ans;
    }
    public boolean checkDapAn(String choice){
        if(choice.equals(getAns().getTrue_answer()))
            return true;
        else
            return false;
    }

    public void hienThi(){
        System.out.println();
        System.out.println(this.context);
        System.out.println(this.question);
        List<String> choices = this.getAns().getAnswer();
        for (int i = 0; i < choices.size(); i++) {
            System.out.printf("%s. %s%n", (char) ('A' + i), choices.get(i));
        }
//        switch (danhMuc.getId()){
//            case 1:
//                System.out.println(danhMuc.DANH_TU.getName());
//                break;
//            case 2:
//                System.out.println(danhMuc.DONG_TU.getName());
//                break;
//            case 3:
//                System.out.println(danhMuc.TINH_TU.getName());
//                break;
//        }
//        switch (mucDo.getId()){
//            case 1:
//                System.out.println(mucDo.DE);
//                break;
//            case 2:
//                System.out.println(mucDo.TRUNG_BINH);
//                break;
//            case 3:
//                System.out.println(mucDo.KHO);
//                break;
//        }
//        switch (ques_role.getId()){
//            case 1:
//                System.out.println(ques_role.Multiple_Choice);
//                break;
//            case 2:
//                System.out.println(ques_role.Incomplete);
//                break;
//            case 3:
//                System.out.println(ques_role.Conversation);
//                break;
//        }

    }
    public void hienThiContext(){
        System.out.println();
        System.out.printf("Context: %s",this.context);
    }
    public DANH_MUC getDanhMuc() {
        return danhMuc;
    }

    public void setDanhMuc(DANH_MUC danhMuc) {
        this.danhMuc = danhMuc;
    }

    public MUC_DO getMucDo() {
        return mucDo;
    }

    public void setMucDo(MUC_DO mucDo) {
        this.mucDo = mucDo;
    }

    public QUESTION_ROLE getQues_role() {
        return ques_role;
    }

    public void setQues_role(QUESTION_ROLE ques_role) {
        this.ques_role = ques_role;
    }

    public String getGiaiThich() {
        return giaiThich;
    }

    public void setGiaiThich(String giaiThich) {
        this.giaiThich = giaiThich;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }
}


