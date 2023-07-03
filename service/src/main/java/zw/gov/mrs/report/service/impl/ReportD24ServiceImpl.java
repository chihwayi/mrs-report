package zw.gov.mrs.report.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zw.gov.mrs.report.domain.ReportD24DataView;
import zw.gov.mrs.report.dto.AgeRange;
import zw.gov.mrs.report.dto.Gender;
import zw.gov.mrs.report.dto.Report;
import zw.gov.mrs.report.dto2.ReportData;
import zw.gov.mrs.report.repository.ReportD24DataViewRepository;
import zw.gov.mrs.report.service.api.ReportD24Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
public class ReportD24ServiceImpl implements ReportD24Service {

    @Autowired
    private ReportD24DataViewRepository reportD24DataViewRepository;

    @Override
    public int[] getTotalMalesAndFemalesInEachAgeRange(List<ReportD24DataView> list, int lowerAge, int upperAge) {
        int[] counter = new int[2];
        for(ReportD24DataView c : list){
            int years = c.getAge();
            String sex = c.getSex();

            if (years >= lowerAge && years < upperAge) {
                if (!Objects.isNull(sex)) {
                    if (sex.startsWith("M") || sex.startsWith("m")) {
                        counter[0]++;
                    } else if (sex.startsWith("F") || sex.startsWith("f")) {
                        counter[1]++;
                    }
                }
            }
        }
        return counter;
    }

    @Override
    public List<Report> getReportWithData() {
        List<Report> reportList = new ArrayList<>();
        Report report = new Report();

        AgeRange ageRangeFiveToTen = new AgeRange();
        AgeRange ageRangeTenToFifteen = new AgeRange();
        AgeRange ageRangeFifteenToTwenty = new AgeRange();

        List<AgeRange> listRange = new ArrayList<>();
        List<AgeRange> listRangeFiveToTen = new ArrayList<>();
        List<AgeRange> listRangeTenToFifteen = new ArrayList<>();
        List<AgeRange> listRangeFifteenToTwenty = new ArrayList<>();

        Gender genderFiveToTen = new Gender();
        Gender genderTenToFifteen = new Gender();
        Gender genderFifteenToTwenty = new Gender();

        List<Gender> genderListFiveToTen = new ArrayList<>();
        List<Gender> genderListTenToFifteen = new ArrayList<>();
        List<Gender> genderListFifteenToTwenty = new ArrayList<>();

        int [] fiveToTen = getTotalMalesAndFemalesInEachAgeRange(reportD24DataViewRepository.findAll(),5,10);
        int [] tenToFifteen = getTotalMalesAndFemalesInEachAgeRange(reportD24DataViewRepository.findAll(),10,15);
        int [] fifteenToTwenty = getTotalMalesAndFemalesInEachAgeRange(reportD24DataViewRepository.findAll(),15,20);
        int [] twentyToTwentyFive = getTotalMalesAndFemalesInEachAgeRange(reportD24DataViewRepository.findAll(),20,25);
        int [] twentyFiveToThirty = getTotalMalesAndFemalesInEachAgeRange(reportD24DataViewRepository.findAll(),25,30);
        int [] thirtyToThirtyFive = getTotalMalesAndFemalesInEachAgeRange(reportD24DataViewRepository.findAll(),30,35);
        int [] thirtyFiveToForty = getTotalMalesAndFemalesInEachAgeRange(reportD24DataViewRepository.findAll(),35,40);
        int [] fortyToFortyFive = getTotalMalesAndFemalesInEachAgeRange(reportD24DataViewRepository.findAll(),40,45);
        int [] fortyFiveToFifty = getTotalMalesAndFemalesInEachAgeRange(reportD24DataViewRepository.findAll(),45,50);
        int [] overFifty = getTotalMalesAndFemalesInEachAgeRange(reportD24DataViewRepository.findAll(),50,500);

        ageRangeFiveToTen.setAgeRange("5 - 10");
        ageRangeTenToFifteen.setAgeRange("10 - 15");
        ageRangeFifteenToTwenty.setAgeRange("15 - 20");

        genderFiveToTen.setMaleCount(fiveToTen[0]);
        genderFiveToTen.setFemaleCount(fiveToTen[1]);

        genderTenToFifteen.setMaleCount(tenToFifteen[0]);
        genderTenToFifteen.setFemaleCount(tenToFifteen[1]);

        genderFifteenToTwenty.setMaleCount(fifteenToTwenty[0]);
        genderFifteenToTwenty.setFemaleCount(fifteenToTwenty[1]);

        genderListFiveToTen.add(genderFiveToTen);
        genderListTenToFifteen.add(genderTenToFifteen);
        genderListFifteenToTwenty.add(genderFifteenToTwenty);

        ageRangeFiveToTen.setGender(genderListFiveToTen);
        ageRangeTenToFifteen.setGender(genderListTenToFifteen);
        ageRangeFifteenToTwenty.setGender(genderListFifteenToTwenty);

        listRangeFiveToTen.add(ageRangeFiveToTen);
        listRangeTenToFifteen.add(ageRangeTenToFifteen);
        listRangeFifteenToTwenty.add(ageRangeFifteenToTwenty);

        report.setDataPoint("Number of Patients doing what what");

        listRange.add(ageRangeFiveToTen);
        listRange.add(ageRangeTenToFifteen);
        listRange.add(ageRangeFifteenToTwenty);

        report.setAgeRange(listRange);


        reportList.add(report);



        return reportList;
    }

    @Override
    public List<ReportData> getReport() {

        int [] fiveToTen = getTotalMalesAndFemalesInEachAgeRange(reportD24DataViewRepository.findAll(),5,10);
        int [] tenToFifteen = getTotalMalesAndFemalesInEachAgeRange(reportD24DataViewRepository.findAll(),10,15);
        int [] fifteenToTwenty = getTotalMalesAndFemalesInEachAgeRange(reportD24DataViewRepository.findAll(),15,20);

        List<ReportData> reportDataList = new ArrayList<>();
        ReportData reportData = new ReportData();
        reportData.setDataPoint("Number of Patients doing what what");

        zw.gov.mrs.report.dto2.AgeRange ageRange1 = new zw.gov.mrs.report.dto2.AgeRange();
        ageRange1.setAgeRange("5 - 10");
        ageRange1.addGenderCount(new zw.gov.mrs.report.dto2.AgeRange.GenderCount("male",fiveToTen[0]));
        ageRange1.addGenderCount(new zw.gov.mrs.report.dto2.AgeRange.GenderCount("female",fiveToTen[1]));

        zw.gov.mrs.report.dto2.AgeRange ageRange2 = new zw.gov.mrs.report.dto2.AgeRange();
        ageRange2.setAgeRange("10 - 15");
        ageRange2.addGenderCount(new zw.gov.mrs.report.dto2.AgeRange.GenderCount("male",tenToFifteen[0]));
        ageRange2.addGenderCount(new zw.gov.mrs.report.dto2.AgeRange.GenderCount("female",tenToFifteen[1]));

        zw.gov.mrs.report.dto2.AgeRange ageRange3 = new zw.gov.mrs.report.dto2.AgeRange();
        ageRange3.setAgeRange("15 - 20");
        ageRange3.addGenderCount(new zw.gov.mrs.report.dto2.AgeRange.GenderCount("male",fifteenToTwenty[0]));
        ageRange3.addGenderCount(new zw.gov.mrs.report.dto2.AgeRange.GenderCount("female",fifteenToTwenty[1]));

        reportData.addAgeRange(ageRange1);
        reportData.addAgeRange(ageRange2);
        reportData.addAgeRange(ageRange3);

        reportDataList.add(reportData);

        return reportDataList;
    }

}
