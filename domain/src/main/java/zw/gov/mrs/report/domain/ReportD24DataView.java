package zw.gov.mrs.report.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Immutable;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "report_d24dataview")
@Immutable
public class ReportD24DataView implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private String artId;

    private String artCohortNumber;
    private String artNumber;
    private LocalDate birthDate;
    private LocalDate dateEnrolled;
    private String personId;
    private String sex;
    private int year;
    private String adverseEventStatusId;
    private String adverseEventStatus;
    private LocalDate date;
    private int month;
    private String reasonId;
    private String reason;
    private String reasonForRegimenSubstitutionId;
    private String reasonForRegimenSubstitution;
    private String regimenId;
    private String regimen;
    private String treatmentFailureReasonId;
    private String treatmentFailureReason;
    private int age;
    private int count;
}
