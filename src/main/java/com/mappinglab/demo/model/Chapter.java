package com.mappinglab.demo.model;


import jakarta.persistence.*;

import java.util.List;
import java.util.Objects;

@Entity
@Table(name="chapter")

public class Chapter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @OneToMany(mappedBy = "chapter")
    private List<Member> member;

    @OneToOne
    @JoinColumn(name = "president_id")
    private Member presidentMember;
    public Chapter(String name, String district, List<Member> member, Member presidentMember) {
        this.name = name;
        this.district = district;
        this.member = member;
        this.presidentMember = presidentMember;
    }

    public Integer getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Chapter chapter = (Chapter) o;
        return Objects.equals(id, chapter.id) && Objects.equals(name, chapter.name) && Objects.equals(district, chapter.district) && Objects.equals(member, chapter.member) && Objects.equals(presidentMember, chapter.presidentMember);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, district, member, presidentMember);
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public List<Member> getMember() {
        return member;
    }

    public void setMember(List<Member> member) {
        this.member = member;
    }

    public Member getPresidentMember() {
        return presidentMember;
    }

    public void setPresidentMember(Member presidentMember) {
        this.presidentMember = presidentMember;
    }

    private String name;
    private String district;


}
