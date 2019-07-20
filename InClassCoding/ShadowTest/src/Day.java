public enum Day {
    SUNDAY;

    public String getDayString() {
        if(this == Day.SUNDAY){
            return "SUNDAY";
        } else {
            return "Wrong input";
        }
    }
}
