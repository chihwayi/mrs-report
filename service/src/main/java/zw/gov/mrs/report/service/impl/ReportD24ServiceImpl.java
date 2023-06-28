package zw.gov.mrs.report.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zw.gov.mrs.report.domain.ReportD24DataView;
import zw.gov.mrs.report.repository.ReportD24DataViewRepository;
import zw.gov.mrs.report.service.api.ReportD24Service;

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

            if (years >= lowerAge && years <= upperAge) {
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

}
