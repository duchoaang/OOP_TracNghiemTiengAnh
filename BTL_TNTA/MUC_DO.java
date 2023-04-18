public enum MUC_DO {
    DE(1),
    TRUNG_BINH(2),
    KHO(3);
    private int id;
    MUC_DO(int id){
        this.setId(id);
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
