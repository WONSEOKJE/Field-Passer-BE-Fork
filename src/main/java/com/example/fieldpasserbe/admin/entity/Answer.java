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
@Table(name = "ANSWER")
public class Answer {

    @Id
    @GeneratedValue
    @Column(name = "RESPONSE_ID")
    private int responseId;

    @ManyToOne
    @JoinColumn(name = "ID")
    @Column(name = "ID")
    private Member admin;

    @OneToOne
    @JoinColumn(name = "QUESTION_ID")
    @Column(name = "QUESTION_ID")
    private Question question;

    @Column(name = "TITLE")
    private String title;

    @Column(name = "CONTENT")
    private String content;

    @Column(name = "REGISTER_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime registerDate;
}
