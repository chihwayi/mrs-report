package zw.gov.mrs.report.dto;

public class Gender {
    private int maleCount;
    private int femaleCount;

    public Gender(int maleCount, int femaleCount) {
        this.maleCount = maleCount;
        this.femaleCount = femaleCount;
    }

    public Gender() {
    }

    public int getMaleCount() {
        return maleCount;
    }

    public void setMaleCount(int maleCount) {
        this.maleCount = maleCount;
    }

    public int getFemaleCount() {
        return femaleCount;
    }

    public void setFemaleCount(int femaleCount) {
        this.femaleCount = femaleCount;
    }
}
