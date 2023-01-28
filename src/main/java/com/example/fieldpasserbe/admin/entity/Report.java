package com.example.fieldpasserbe.admin.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Builder
@Entity
@Table(name = "Report")
public class Report {

    @Id
    @GeneratedValue
    @Column(name = "REPORT_ID")
    private int reportId;

    @ManyToOne
    @JoinColumn(name = "ID")
    @Column(name = "REPOTER_ID")
    private Member reporterMember;

    @ManyToOne
    @JoinColumn(name = "ID")
    @Column(name = "TARGET_ID")
    private Member targetMember;

    @Column(name = "CATEGORY")
    @Enumerated(EnumType.STRING)
    private RCategory reportCategory;

    @Column(name = "REPORT_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime reportDate;

    @Column(name = "PROCCESS")
    @Enumerated(EnumType.STRING)
    private ReportProcess reportProcess;
}
