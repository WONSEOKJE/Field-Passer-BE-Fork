package com.example.fieldpasserbe.support.entity;


import com.example.fieldpasserbe.member.entity.Member;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;


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
    private Member adminId;

    @OneToOne
    @JoinColumn(name = "QUESTION_ID")
    private Question question;

    @Column(name = "TITLE")
    private String title;

    @Column(name = "CONTENT")
    private String content;

    @Column(name = "REGISTER_DATE")
    private LocalDateTime registerDate;
}