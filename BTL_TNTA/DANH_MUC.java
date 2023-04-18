public enum DANH_MUC {
    DANH_TU(1, "Danh tu"),
    DONG_TU(2, "Dong tu"),
    TINH_TU(3, "Tinh tu");
    private int id;
    private String name;
    DANH_MUC(int id, String name){
        this.setId(id);
        this.setName(name);
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
}
