public class TrancheAge {
    
    private int code;
    private int ageMin;
    private int ageMax;

    public TrancheAge(int pCode, int pAgeMin, int pAgeMax) {
        code = pCode;
        ageMin = pAgeMin;
        ageMax = pAgeMax;
    }

    public int getCode() {
        return this.code;
    }

    public int getAgeMin() {
        return this.ageMin;
    }

    public int getAgeMax() {
        return this.ageMax;
    }
}
