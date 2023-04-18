import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.SQLOutput;
import java.util.*;

public class main {


    public static QuestionManager dsCauHoi = new QuestionManager();
    public static UserManager dsUser = new UserManager();
    public static List<Integer> dsNhungCauDaTraLoiMultipleChoice = new ArrayList<>();

    public static Double DIEM_TONG = (double) 0;


    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(CAUHINH.filePath);
        Scanner sc = new Scanner(fileInputStream);
        while (sc.hasNextLine()) {
            DANH_MUC danhMuc = null;
            MUC_DO mucDo = null;
            List<String> dsAns = new ArrayList<>();
            Answer ans = null;
            String question = sc.nextLine();
            if (question.contains("?")) {
                while (sc.hasNextLine()) {
                    String line = sc.nextLine();
                    if (line.equals("-")) {
                        break;
                    }
                    dsAns.add(line);
                }
                String true_ans = sc.nextLine();
                ans = new Answer(dsAns, true_ans);
                String tenDm = sc.nextLine();
                danhMuc = DANH_MUC.valueOf(tenDm);
                String muc_Do = sc.nextLine();
                mucDo = MUC_DO.valueOf(muc_Do);
                String giaiThich = sc.nextLine();
                Question q = new Question(question, ans, danhMuc, mucDo, QUESTION_ROLE.Multiple_Choice, giaiThich);
                dsCauHoi.addQuestion(q);
            }
        }
        sc.close();                                                                                                                                                                                                                                                                                         
        FileInputStream fileInputStream2 = new FileInputStream(CAUHINH.filePath2);
        Scanner sc2 = new Scanner(fileInputStream2);
        while (sc2.hasNextLine()) {
            DANH_MUC danhMuc = null;
            MUC_DO mucDo = null;
            String context;
            int dem = 0;
            while (sc2.hasNextLine()) {
                if (dem == 0) {
                    context = sc2.nextLine();
                    Answer ans = null;
                    List<String> dsAns = new ArrayList<>();
                    if (context.contains(".")) {
                        String muc_Do = sc2.nextLine();
                        mucDo = MUC_DO.valueOf(muc_Do);
                        String tenDm = sc2.nextLine();
                        danhMuc = DANH_MUC.valueOf(tenDm);
                        String question = "";
                        String giaiThich = "";
                        String true_ans = "";
                        ans = new Answer(dsAns, true_ans);
                        Question q = new Question(context, question, ans, danhMuc, mucDo, QUESTION_ROLE.Conversation, giaiThich);
                        dsCauHoi.addQuestion(q);
                        dem++;
                    }
                }
                else {
                    Answer ans = null;
                    List<String> dsAns = new ArrayList<>();
                    String question = sc2.nextLine();
                    if (question.contains("?")) {
                        while (sc2.hasNextLine()) {
                            String line = sc2.nextLine();
                            if (line.equals("-")) {
                                break;
                            }
                            dsAns.add(line);
                        }
                        String true_ans = sc2.nextLine();
                        ans = new Answer(dsAns, true_ans);
                        String tenDm = sc2.nextLine();
                        danhMuc = DANH_MUC.valueOf(tenDm);
                        String muc_Do = sc2.nextLine();
                        mucDo = MUC_DO.valueOf(muc_Do);
                        String giaiThich = sc2.nextLine();
                        Question q = new Question(question, ans, danhMuc, mucDo, QUESTION_ROLE.Conversation, giaiThich);
                        dsCauHoi.addQuestion(q);

                    }
                    if(question.contains("5")){
                        dem = 0;
                    }
                }
            }
        }
            sc2.close();

        FileInputStream fileInputStream3 = new FileInputStream(CAUHINH.filePath3);
        Scanner sc3 = new Scanner(fileInputStream3);
        while (sc3.hasNextLine()) {
            DANH_MUC danhMuc = null;
            MUC_DO mucDo = null;
            String context;
            int dem = 0;
            while (sc3.hasNextLine()) {
                if (dem == 0) {
                    context = sc3.nextLine();
                    Answer ans = null;
                    List<String> dsAns = new ArrayList<>();
                    if (context.contains(".")) {
                        String muc_Do = sc3.nextLine();
                        mucDo = MUC_DO.valueOf(muc_Do);
                        String tenDm = sc3.nextLine();
                        danhMuc = DANH_MUC.valueOf(tenDm);
                        String question = "";
                        String giaiThich = "";
                        String true_ans = "";
                        ans = new Answer(dsAns, true_ans);
                        Question q = new Question(context, question, ans, danhMuc, mucDo, QUESTION_ROLE.Incomplete, giaiThich);
                        dsCauHoi.addQuestion(q);
                        dem++;
                    }
                }
                else {
                    Answer ans = null;
                    List<String> dsAns = new ArrayList<>();
                    String question = sc3.nextLine();
                    if (question.contains("?")) {
                        while (sc3.hasNextLine()) {
                            String line = sc3.nextLine();
                            if (line.equals("-")) {
                                break;
                            }
                            dsAns.add(line);
                        }
                        String true_ans = sc3.nextLine();
                        ans = new Answer(dsAns, true_ans);
                        String tenDm = sc3.nextLine();
                        danhMuc = DANH_MUC.valueOf(tenDm);
                        String muc_Do = sc3.nextLine();
                        mucDo = MUC_DO.valueOf(muc_Do);
                        String giaiThich = sc3.nextLine();
                        Question q = new Question(question, ans, danhMuc, mucDo, QUESTION_ROLE.Incomplete, giaiThich);
                        dsCauHoi.addQuestion(q);

                    }
                    if(question.contains("5")){
                        dem = 0;
                    }
                }
            }
        }

            User u1 = new User("Hoang", "Dak Lak", "Nam", "20/05/2002");
            User u2 = new User("Phat", "Dong Nai", "Nam", "24/06/2002");
            dsUser.themUser(u1);
            dsUser.themUser(u2);
        Menu();
        }


        public static void Menu () {
            int chon;
            boolean flag = true;
            while (flag) {
                System.out.println("===== Menu ====");
                System.out.println("Các chức năng của hệ thống  ");
                System.out.println(
                        "1.Thêm học viên \n"
                                + "2.Xem danh sách người dùng \n"
                                + "3.Tra cứu người dùng \n"
                                + "4.Cập nhập người dùng \n"
                                + "5.Xóa người dùng \n"
                                + "6.Xem danh sách câu hỏi \n"
                                + "7.Tìm câu hỏi \n"
                                + "8.Luyện tập \n"
                                + "9.Thống kê kết quả học tập\n"
//                                + "10.Thêm điểm cho học viên\n"
                                + "0.Thoát chương trình\n"

                );
                System.out.println("Bạn chọn chức năng : ");
                chon = Integer.parseInt(CAUHINH.sc.nextLine());
                switch (chon) {
                    case 1:
                        System.out.println("=== Them nguoi dung ===");
                        System.out.println("Nhap ten nguoi dung: ");
                        String name = CAUHINH.sc.nextLine();
                        System.out.println("Nhap dia chi nguoi dung: ");
                        String address = CAUHINH.sc.nextLine();
                        System.out.println("Nhap gioi tinh nguoi dung: ");
                        String sex = CAUHINH.sc.nextLine();
                        System.out.println("Nhap ngay sinh cua nguoi dung: ");
                        String birth = CAUHINH.sc.nextLine();
                        User u = new User(name, address, sex, birth);
                        dsUser.themUser(u);
                        System.out.println("=== Them nguoi dung thanh cong ! ===");
                        dsUser.hienThi();
                        break;
                    case 2:
                        System.out.println("=== Danh sach nguoi dung ===");
                        dsUser.hienThi();
                        System.out.println("===");
                        break;
                    case 3:
                        System.out.println("=== Tra cuu nguoi dung ===");
                        System.out.println("Nhap thong tin nguoi dung ma ban muon tim kiem(ten/dia chi/gioi tinh/ngay sinh): ");
                        String kw = CAUHINH.sc.nextLine();
                        if (dsUser.timKiem(kw).size() != 0) {
                            System.out.println("Tim thay nguoi dung!");
                            List<User> ds2 = dsUser.timKiem(kw);
                            ds2.forEach(u1 -> u1.hienThi());
                        } else {
                            System.out.println("Khong tim thay nguoi dung hop le!");
                        }

                        break;
                    case 4:
                        System.out.println("=== Cap nhap nguoi dung ===");
                        System.out.println("Nhap id nguoi dung ma ban muon cap nhap: ");
                        int id = Integer.parseInt(CAUHINH.sc.nextLine());
                        dsUser.capNhap(id);
                        System.out.println("=== Cap nhap nguoi dung thanh cong");
                        break;
                    case 5:
                        System.out.println("=== Xoa nguoi dung ===");
                        System.out.println("Nhap id nguoi dung ma ban muon xoa: ");
                        int temp = Integer.parseInt(CAUHINH.sc.nextLine());
                        User user = dsUser.timKiemTonTai(temp);
                        if(user != null){
                            dsUser.xoaUser(temp);
                            System.out.println("Xoa nguoi dung thanh cong!");
                        }
                        else{
                            System.out.println("Khong co nguoi dung phu hop");
                        }

                        break;
                    case 6:
                        System.out.println("=== Chọn loại câu hỏi mà bạn muốn xem ===\n" +
                                "1.Multiple choice\n"
                                + "2.Incomplete \n"
                                + "3.Conversation\n");
                        int chon1 = Integer.parseInt(CAUHINH.sc.nextLine());
                        while (chon1 > 3 || chon1 < 0){
                            System.out.println("Chon khong hop le hay chon lai: ");
                            System.out.println("=== Chọn loại câu hỏi mà bạn muốn xem ===\n" +
                                    "1.Multiple choice\n"
                                    + "2.Incomplete \n"
                                    + "3.Conversation\n");
                            chon1 = Integer.parseInt(CAUHINH.sc.nextLine());
                        }
                        switch (chon1) {
                            case 1:
                                dsCauHoi.timCauHoiTheoRole(QUESTION_ROLE.Multiple_Choice.getId()).forEach(q -> q.hienThi());
                                break;
                            case 2:

                                dsCauHoi.timCauHoiTheoRole(QUESTION_ROLE.Incomplete.getId()).forEach(q -> q.hienThi());
                                break;
                            case 3:

                                dsCauHoi.timCauHoiTheoRole(QUESTION_ROLE.Conversation.getId()).forEach(q -> q.hienThi());
                                break;
                            default:
                                break;
                        }

                        break;
                    case 7:
                        System.out.println("=== Chọn loại tìm kiếm bạn muốn tìm ===\n" +
                                "1.Tìm theo nội dung câu hỏi\n"
                                + "2.Tìm theo danh mục câu hỏi \n"
                                + "3.Tìm theo mức độ câu hỏi\n");
                        int chonTimKiem = Integer.parseInt(CAUHINH.sc.nextLine());
                        while (chonTimKiem > 3 || chonTimKiem < 0){
                            System.out.println("Chon khong hop le hay chon lai: ");
                            System.out.println("=== Chọn loại tìm kiếm bạn muốn tìm ===\n" +
                                    "1.Tìm theo nội dung câu hỏi\n"
                                    + "2.Tìm theo danh mục câu hỏi \n"
                                    + "3.Tìm theo mức độ câu hỏi\n");
                            chonTimKiem = Integer.parseInt(CAUHINH.sc.nextLine());
                        }
                        switch (chonTimKiem) {
                            case 1:
                                String chonNoiDung;
                                System.out.println("Nhap noi dung ban muon tim kiem: ");
                                chonNoiDung = CAUHINH.sc.nextLine();
                                if (dsCauHoi.timCauHoi(chonNoiDung).size() == 0) {
                                    System.out.println("Khong co cau nao phu hop");
                                } else {
                                    System.out.println("=== Cac cau hoi ban chon === ");
                                    dsCauHoi.timCauHoi(chonNoiDung).forEach(q -> q.hienThi());
                                }
                                break;
                            case 2:
                                System.out.println("=== Chọn loại danh muc bạn muốn tìm ===\n" +
                                        "1.Danh tu\n"
                                        + "2.Dong tu\n"
                                        + "3.Tinh tu\n");
                                int chonDanhMuc = Integer.parseInt(CAUHINH.sc.nextLine());
                                switch (chonDanhMuc) {
                                    case 1:
                                        dsCauHoi.timCauHoiTheoDanhMuc(DANH_MUC.DANH_TU.getId()).forEach(q -> q.hienThi());
                                        break;
                                    case 2:
                                        dsCauHoi.timCauHoiTheoDanhMuc(DANH_MUC.DONG_TU.getId()).forEach(q -> q.hienThi());
                                        break;
                                    case 3:
                                        dsCauHoi.timCauHoiTheoDanhMuc(DANH_MUC.TINH_TU.getId()).forEach(q -> q.hienThi());
                                        break;
                                    default:
                                        System.out.println("Loai danh muc khong hop le!");
                                        break;
                                }
                                break;
                            case 3:
                                System.out.println("=== Chọn loại muc do bạn muốn tìm ===\n" +
                                        "1.De\n"
                                        + "2.Trung binh\n"
                                        + "3.Kho\n");
                                int chonMucDo = Integer.parseInt(CAUHINH.sc.nextLine());
                                switch (chonMucDo) {
                                    case 1:
                                        dsCauHoi.timCauHoiTheoMucDo(MUC_DO.DE.getId()).forEach(q -> q.hienThi());
                                        break;
                                    case 2:
                                        dsCauHoi.timCauHoiTheoMucDo(MUC_DO.TRUNG_BINH.getId()).forEach(q -> q.hienThi());
                                        break;
                                    case 3:
                                        dsCauHoi.timCauHoiTheoMucDo(MUC_DO.KHO.getId()).forEach(q -> q.hienThi());
                                        break;
                                    default:
                                        System.out.println("Muc do khong hop le");
                                }
                                break;

                        }
                        break;
                    case 8:
                        System.out.println("=== Luyen tap ===");
                        luyenTap();
                        break;
                    case 9:
                        System.out.println("=== Thong ke === ");
                        thongKe();
                        break;
                    default:
                        System.out.println("Chuc nang ban chon khong hop le!");
                }
                int chon2;
                do{
                    System.out.println("Ban co muon tiep tuc khong?\n" +
                            "1. Co\n" +
                            "2. Khong\n");
                     chon2= Integer.parseInt(CAUHINH.sc.nextLine());
                    if(chon2 >2 || chon2 <=0){
                        System.out.println("Chon khong hop le, vui long chon lai!");
                    }
                }while (chon2 >2 || chon2 <= 0);
                if (chon2 == 2) {
                    flag = false;
                }
            }
        }



    public static void thongKe(){
        System.out.println("Nhap ma so cua ban: ");
        int id = Integer.parseInt(CAUHINH.sc.nextLine());
        int temp = 0;
        double diemTong = 0;
        if(dsUser.timKiem(id) !=null){
            User user = dsUser.timKiem(id);
            System.out.printf("Ten nguoi dung: %s\n", user.getName());
            System.out.println("So lan kiem tra: " + user.getDsDiem().size());
            for(Diem i : user.getDsDiem()){
                System.out.printf("Diem lan " + (temp+1) + " == ");
                i.hienThi();
                System.out.println("");
                temp++;
            }
            double diemTrungBinh = DIEM_TONG/user.getDsDiem().size();
            String diemTrungBinhFormatted = CAUHINH.df.format(diemTrungBinh); // Định dạng số điểm với đối tượng DecimalFormat.
            System.out.println("Diem trung binh trong thang: " + diemTrungBinhFormatted);

        }
    }
    public static void luyenTap(){
        System.out.println("Nhap ma so cua ban: ");
        int id = Integer.parseInt(CAUHINH.sc.nextLine());
        if(dsUser.timKiem(id) !=null){
            Diem d = null;
            User user = dsUser.timKiem(id);
            System.out.println("=== Dang nhap thanh cong ===");
            System.out.println("Cac dang cau hoi hien tai:\n1.Multiple choice\n2.Incomplete\n3.Conversation\n");
            System.out.println("Ban chon: ");
            int choices = Integer.parseInt(CAUHINH.sc.nextLine());
            int temp = 0;
            String your_choices;

            if(choices == QUESTION_ROLE.Multiple_Choice.getId()){
                List<String> dsAns = new ArrayList<>();
                List<Integer> dsId = new ArrayList<>();
                int tempDiem = 0;
                System.out.println("Ban muon bao nhieu cau:");
                temp = Integer.parseInt(CAUHINH.sc.nextLine());
                int temp2 = 0;
                boolean flag = false;
                List<Question> ds = dsCauHoi.luyenTapMultipleChoice();
                for(Question q : ds){
                    for(int i = 0; i< dsNhungCauDaTraLoiMultipleChoice.size(); i++){
                        if(dsNhungCauDaTraLoiMultipleChoice.get(i) == q.getId()){
                            flag = true;
                        }
                    }
                    if(flag == false){
                        q.hienThi();
                        System.out.println("Nhap dap an:");
                        your_choices = CAUHINH.sc.nextLine();
                        your_choices = your_choices.toUpperCase();
                        dsAns.add(your_choices);
                        dsNhungCauDaTraLoiMultipleChoice.add(q.getId());
                        if(q.checkDapAn(your_choices)){
                            ++tempDiem;
                        }
                        temp2++;
                        if(temp2 == temp){
                            temp2 = 0;
                            break;
                        }
                    }
                    flag = false;

                }
                double diemTong = tempDiem*CAUHINH.SO_DIEM;
                d = new Diem(diemTong, QUESTION_ROLE.Multiple_Choice, dsId);
                DIEM_TONG +=diemTong;
                user.getDsDiem().add(d);
                int check = 0;
                int temp3 = 0;
                for(Question u : ds){
                    u.hienThi();
                    System.out.println("Dap an dung la: " + u.getAns().getTrue_answer());
                    System.out.println("Dap an ban chon: " + dsAns.get(check));
                    if(dsAns.get(check).equals(u.getAns().getTrue_answer())){
                        System.out.println("Ban lam dung!");
                    }
                    else {
                        System.out.println("Ban lam sai!");
                    }
                    check++;
                    temp3++;
                    if(temp3 == temp){
                        break;
                    }
                }
                System.out.println("So diem ban vua dat duoc la: " + diemTong);
                System.out.println("So lan lam kiem tra: "+ user.getDsDiem().size());

            }
            else if(choices == QUESTION_ROLE.Incomplete.getId() || choices == QUESTION_ROLE.Conversation.getId()){
                int tempDiem = 0;
                int chon1;
                System.out.println("Chon muc do ban muon:\n1.De\n2.Trung binh\n3.Kho");
                System.out.println("Ban chon: ");
                chon1 = Integer.parseInt(CAUHINH.sc.nextLine());
                if(choices == QUESTION_ROLE.Incomplete.getId()){
                    int tempDiem2 = 0;
                    List<String> dsAns = new ArrayList<>();
                    List<Integer> dsId = new ArrayList<>();
                    List<Question> ds = dsCauHoi.luyenTap(QUESTION_ROLE.Incomplete.getId(), chon1);
                    int check1 = 0;

                    for(Question q : ds){
                        if(check1 == 0){
                            q.hienThiContext();
                            check1++;
                        }
                        else {
                            dsId.add(q.getId());
                            q.hienThi();
                            System.out.println("Nhap dap an:");
                            your_choices = CAUHINH.sc.nextLine();
                            your_choices = your_choices.toUpperCase();
                            dsAns.add(your_choices);
                            if(q.checkDapAn(your_choices)){
                                ++tempDiem2;
                            }
                        }
                    }
                    double diemTong = tempDiem2* CAUHINH.SO_DIEM;
                    d = new Diem(diemTong, QUESTION_ROLE.Incomplete, dsId);
                    DIEM_TONG +=diemTong;
                    user.getDsDiem().add(d);
                    int check = 0;
                    int check2 = 0;
                    for(Question u : ds){
                        if(check2 == 0){
                            check2++;
                            continue;
                        }
                        else {
                            u.hienThi();
                            System.out.println("Dap an dung la: " + u.getAns().getTrue_answer());
                            System.out.println("Dap an ban chon: " + dsAns.get(check));
                            check++;
                        }
                    }
                    System.out.println("So diem ban vua dat duoc la: " + diemTong);
                }
                else if(choices == QUESTION_ROLE.Conversation.getId()){

                    int tempDiem2 = 0;
                    List<String> dsAns = new ArrayList<>();
                    List<Integer> dsId = new ArrayList<>();
                    List<Question> ds = dsCauHoi.luyenTap(QUESTION_ROLE.Conversation.getId(), chon1);
                    int check1 = 0;

                    for(Question q : ds){
                        if(check1 == 0){
                            q.hienThiContext();
                            check1++;
                        }
                        else {
                            dsId.add(q.getId());
                            q.hienThi();
                            System.out.println("Nhap dap an:");
                            your_choices = CAUHINH.sc.nextLine();
                            your_choices = your_choices.toUpperCase();
                            dsAns.add(your_choices);
                            if(q.checkDapAn(your_choices)){
                                ++tempDiem2;
                            }
                        }
                    }
                    double diemTong = tempDiem2* CAUHINH.SO_DIEM;
                    d = new Diem(diemTong, QUESTION_ROLE.Conversation, dsId);
                    DIEM_TONG +=diemTong;
                    user.getDsDiem().add(d);
                    int check = 0;
                    int check2 = 0;
                    for(Question u : ds){
                        if(check2 == 0){
                            check2++;
                            continue;
                        }
                        else {
                            u.hienThi();
                            System.out.println("Dap an dung la: " + u.getAns().getTrue_answer());
                            System.out.println("Dap an ban chon: " + dsAns.get(check));
                            check++;
                        }
                    }
                    System.out.println("So diem ban vua dat duoc la: " + diemTong);

                }
            }
            else{
                System.out.println("Khong co dang cau hoi phu hop!");
            }
        }
        else{
            System.out.println("Ma so khong ton tai!");
        }

    }

}

