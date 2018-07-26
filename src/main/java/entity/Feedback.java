/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Temporal;

/**
 *
 * @author pdhssp
 */
@Entity
public class Feedback implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    String position;
    Gender gender;
    Integer age;
    Integer service_Period;
    Integer institution_Service_Period;
    Place place;
    Likert increments;
    Likert environment;
    Likert cleanliness;
    Likert arrangement;
    Likert groupWork;
    Likert leadership;
    Likert training;
    Likert evaluation;
    Likert welfare;
    Likert discipline;
    Likert communication;
    Likert discussions;
    Likert requirementIdentification;
    Likert qualityService;
    Likert expectationAchievement;
    @Lob
    String suggestions;
    @Lob
    String expectingFacilitiesNew;
    

    @Temporal(javax.persistence.TemporalType.DATE)
    Date feedbackDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getService_Period() {
        return service_Period;
    }

    public void setService_Period(Integer service_Period) {
        this.service_Period = service_Period;
    }

    public Integer getInstitution_Service_Period() {
        return institution_Service_Period;
    }

    public void setInstitution_Service_Period(Integer institution_Service_Period) {
        this.institution_Service_Period = institution_Service_Period;
    }

    public Place getPlace() {
        return place;
    }

    public void setPlace(Place place) {
        this.place = place;
    }

    public Likert getIncrements() {
        return increments;
    }

    public void setIncrements(Likert increments) {
        this.increments = increments;
    }

    public Likert getEnvironment() {
        return environment;
    }

    public void setEnvironment(Likert environment) {
        this.environment = environment;
    }

    public Likert getCleanliness() {
        return cleanliness;
    }

    public void setCleanliness(Likert cleanliness) {
        this.cleanliness = cleanliness;
    }

    public Likert getArrangement() {
        return arrangement;
    }

    public void setArrangement(Likert arrangement) {
        this.arrangement = arrangement;
    }

    public Likert getGroupWork() {
        return groupWork;
    }

    public void setGroupWork(Likert groupWork) {
        this.groupWork = groupWork;
    }

    public Likert getLeadership() {
        return leadership;
    }

    public void setLeadership(Likert leadership) {
        this.leadership = leadership;
    }

    public Likert getTraining() {
        return training;
    }

    public void setTraining(Likert training) {
        this.training = training;
    }

    public Likert getEvaluation() {
        return evaluation;
    }

    public void setEvaluation(Likert evaluation) {
        this.evaluation = evaluation;
    }

    public Likert getWelfare() {
        return welfare;
    }

    public void setWelfare(Likert welfare) {
        this.welfare = welfare;
    }

    public Likert getDiscipline() {
        return discipline;
    }

    public void setDiscipline(Likert discipline) {
        this.discipline = discipline;
    }

    public Likert getCommunication() {
        return communication;
    }

    public void setCommunication(Likert communication) {
        this.communication = communication;
    }

    public Likert getDiscussions() {
        return discussions;
    }

    public void setDiscussions(Likert discussions) {
        this.discussions = discussions;
    }

    public Likert getRequirementIdentification() {
        return requirementIdentification;
    }

    public void setRequirementIdentification(Likert requirementIdentification) {
        this.requirementIdentification = requirementIdentification;
    }

    public Likert getQualityService() {
        return qualityService;
    }

    public void setQualityService(Likert qualityService) {
        this.qualityService = qualityService;
    }

    public Likert getExpectationAchievement() {
        return expectationAchievement;
    }

    public void setExpectationAchievement(Likert expectationAchievement) {
        this.expectationAchievement = expectationAchievement;
    }

    public String getSuggestions() {
        return suggestions;
    }

    public void setSuggestions(String suggestions) {
        this.suggestions = suggestions;
    }

    public String getExpectingFacilitiesNew() {
        return expectingFacilitiesNew;
    }

    public void setExpectingFacilitiesNew(String expectingFacilitiesNew) {
        this.expectingFacilitiesNew = expectingFacilitiesNew;
    }

    public Date getFeedbackDate() {
        if(feedbackDate==null){
            feedbackDate = new Date();
        }
        return feedbackDate;
    }

    public void setFeedbackDate(Date feedbackDate) {
        this.feedbackDate = feedbackDate;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Feedback)) {
            return false;
        }
        Feedback other = (Feedback) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Feedback[ id=" + id + " ]";
    }

}
