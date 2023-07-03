package zw.gov.mrs.report.dto2;


import java.util.ArrayList;
import java.util.List;

public class ReportData {
    private String dataPoint;
    private List<AgeRange> ageRange;

    public ReportData(){
        this.ageRange = new ArrayList<>();
    }

    public String getDataPoint() {
        return dataPoint;
    }

    public void setDataPoint(String dataPoint) {
        this.dataPoint = dataPoint;
    }

    public List<AgeRange> getAgeRange() {
        return ageRange;
    }

    public void setAgeRange(List<AgeRange> ageRange) {
        this.ageRange = ageRange;
    }

    public void addAgeRange(AgeRange ageRange){
        this.ageRange.add(ageRange);
    }
}
