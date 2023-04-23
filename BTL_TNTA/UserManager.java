import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class UserManager {
    private List<User> ds = new ArrayList<>();

    public List<User> getDs() {
        return ds;
    }

    public void setDs(List<User> ds) {
        this.ds = ds;
    }
    public UserManager(){

    }
    public void themUser(User u){
        this.ds.add(u);
    }
    public void hienThi(){
        this.ds.forEach(u -> u.hienThi());
    }
    // tim kiem theo ten, gioi tinh, ngay sinh, que quan
    public List<User> timKiem(String kw){
        return this.ds.stream().filter(u -> u.getName().equals(kw) || u.getGioiTinh().equals(kw)
                || u.getNgaySinh().equals(kw)|| u.getAddress().equals(kw)).collect(Collectors.toList());
    }
    public User timKiem(int id){
        return this.ds.stream().filter(u -> u.getId() == id).findFirst().get();
    }
    public User timKiemTonTai(int id){
        Optional<User> result = this.ds.stream().filter(u -> u.getId() == id).findFirst();
        return result.isPresent() ? result.get() : null;
    }

    public void xoaUser(int id){
        this.ds.removeIf(u -> u.getId() == id);
    }
    // cap nhap theo id
    public void capNhap(int id){
        for(User u : ds){
            if(u.getId() == id){
                u.capNhap();
            }
        }
    }
    public void capNhapAdmin(int id){
        for(User u : ds){
            if(u.getId() == id){
                u.capNhapAdmin();
            }
        }
    }
}
