public class Person {
    private int number;
    private String fullName;
    private String position;
    private boolean mark;

    public void setNumber(int number) {
        this.number = number;
    }

    public boolean isMark() {
        return mark;
    }

    public String getPosition() {
        return position;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setMark(boolean mark) {
        this.mark = mark;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getFullName() {
        return fullName;
    }
    public int getNumber() {
        return number;
    }

    public Person(int number, String fullName, String position, boolean mark){
        this.setMark(mark);
        this.setFullName(fullName);
        this.setNumber(number);
        this.setPosition(position);
    }
    public String toString(){
        return(this.getNumber()+" "+this.getFullName()+" "+this.getPosition()+" "+this.isMark());
    }

}
