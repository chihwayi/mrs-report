package zw.gov.mrs.report.repository;


import zw.gov.mrs.report.domain.ReportD24DataView;

import java.util.List;

public interface ReportD24DataViewRepository extends ReadOnlyRepository<ReportD24DataView,String>{
    @Override
    List<ReportD24DataView> findAll();

    List<ReportD24DataView> findByAgeGreaterThanEqualAndAgeLessThanEqual(int greater, int less);
}
