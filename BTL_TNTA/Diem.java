import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Diem {
    private double soDiem;
    private Date ngayLam;
    private QUESTION_ROLE ques_role;
    private List<Integer> dsIdQuestion = new ArrayList<>(); // luu nhung cau da lam
    {
        ngayLam = new Date();
    }
    public double getSoDiem() {
        return soDiem;
    }

    public void setSoDiem(double soDiem) {
        this.soDiem = soDiem;
    }

    public Date getNgayLam() {
        return ngayLam;
    }

    public void setNgayLam(Date ngayLam) {
        this.ngayLam = ngayLam;
    }

    public QUESTION_ROLE getQues_role() {
        return ques_role;
    }

    public void setQues_role(QUESTION_ROLE ques_role) {
        this.ques_role = ques_role;
    }

    public List<Integer> getId_question() {
        return dsIdQuestion;
    }

    public void setId_question(List<Integer> id_question) {
        this.dsIdQuestion = id_question;
    }
    public Diem(){
    }
    public Diem(double soDiem, QUESTION_ROLE ques_role, List<Integer> id){
        this.dsIdQuestion = id;
        this.soDiem = soDiem;
        this.ques_role = ques_role;

    }
    public boolean checkCauHoiDaLam(int id){
        for(int i : dsIdQuestion)
        {
            if(i == id){
                return true;
            }
        }
        return false;

    }
    public void hienThi(){
        System.out.printf("So diem: %s", this.soDiem);
    }
}
