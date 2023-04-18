public enum QUESTION_ROLE {
    Multiple_Choice(1),
    Incomplete(2),
    Conversation(3);
    private int id;
    QUESTION_ROLE(int id){
        this.setId(id);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
