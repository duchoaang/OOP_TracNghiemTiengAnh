import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class User {
    private int id;
    private static int dem;

    private String name;
    private String address;
    private String gioiTinh;
    private String ngaySinh;
    private Date ngayGiaNhap;
    private List<Diem> dsDiem;
    private USER_ROLE role;


    {
        id = ++dem;
        setNgayGiaNhap(new Date());

        setDsDiem(new ArrayList<>());
    }
    public User(){

    }
    public User(String name, String address, String gioiTinh, String ngaySinh){
        this.setName(name);
        this.setAddress(address);
        this.setGioiTinh(gioiTinh);
        this.ngaySinh = ngaySinh;
        this.setRole(USER_ROLE.User);
    }
    public User(String name, String address, String gioiTinh, String ngaySinh, USER_ROLE role){
        this.setName(name);
        this.setAddress(address);
        this.setGioiTinh(gioiTinh);
        this.ngaySinh = ngaySinh;
        this.setRole(role);
    }

    public static int getDem() {
        return dem;
    }

    public static void setDem(int dem) {
        User.dem = dem;
    }

    public void hienThi(){
        System.out.printf("Mã học viên : %02d\nHo ten: %s\nGioi tinh: %s\nQue quan: %s\nNgay sinh: %s\nNgay gia nhap: %s\n", this.getId(), this.getName(), this.getGioiTinh(), this.getAddress(), this.getNgaySinh(), CAUHINH.f.format(getNgayGiaNhap()));
//        System.out.printf("Ho ten: " + this.hoTen);
//        System.out.println("Gioi tinh : " + this.gioiTinh);
//        System.out.println("Ngay sinh : " + this.ngaySinh);
//        System.out.println("Que quan: " + this.queQuan);
//        System.out.println("Ngay Gia Nhap: " + f.format(ngayGiaNhap));
        System.out.println("");
    }
    public void hienThiDiem(){
        this.dsDiem.forEach(d -> d.hienThi());
    }
    public void ghiDiem(Diem d){
        this.dsDiem.add(d);
    }
    public void capNhap(){
        System.out.println("Nhap ten moi: ");
        this.name = CAUHINH.sc.nextLine();
        System.out.println("Nhap gioi tinh moi: ");
        this.gioiTinh = CAUHINH.sc.nextLine();
        System.out.println("Nhap que quan moi: ");
        this.address = CAUHINH.sc.nextLine();
        System.out.println("Nhap ngay sinh moi: ");
        this.ngaySinh = CAUHINH.sc.nextLine();
    }
    public void capNhapAdmin(){
        System.out.println("Nhap quyền mới: (1.User / 2. Admin) ");
        int temp = Integer.parseInt(CAUHINH.sc.nextLine());
        if(temp == 1){
            this.role = USER_ROLE.User;
        }
        if (temp==2) {
            this.role = USER_ROLE.Admin;
        }

    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public Date getNgayGiaNhap() {
        return ngayGiaNhap;
    }

    public void setNgayGiaNhap(Date ngayGiaNhap) {
        this.ngayGiaNhap = ngayGiaNhap;
    }

    public List<Diem> getDsDiem() {
        return dsDiem;
    }

    public void setDsDiem(List<Diem> dsDiem) {
        this.dsDiem = dsDiem;
    }

    public USER_ROLE getRole() {
        return role;
    }

    public void setRole(USER_ROLE role) {
        this.role = role;
    }
}
