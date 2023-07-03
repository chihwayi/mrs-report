package zw.gov.mrs.report.dto2;

import java.util.ArrayList;
import java.util.List;

public class AgeRange {
    private String ageRange;
    private List<GenderCount> genderCount;

    public AgeRange(){
        this.genderCount = new ArrayList<>();
    }

    public String getAgeRange() {
        return ageRange;
    }

    public void setAgeRange(String ageRange) {
        this.ageRange = ageRange;
    }

    public List<GenderCount> getGenderCount() {
        return genderCount;
    }

    public void setGenderCount(List<GenderCount> genderCount) {
        this.genderCount = genderCount;
    }

    public void addGenderCount(GenderCount genderCount){
        this.genderCount.add(genderCount);
    }

    public static class GenderCount{
        private String gender;
        private int count;

        public GenderCount() {
        }

        public GenderCount(String gender, int count) {
            this.gender = gender;
            this.count = count;
        }

        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }
    }
}
