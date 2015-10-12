package com.letsball.entity;

import java.util.Date;

public class TTeamFootball {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_team_football.TID
     *
     * @mbggenerated Mon Oct 12 20:40:44 CST 2015
     */
    private Long tid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_team_football.TEAM_NAME
     *
     * @mbggenerated Mon Oct 12 20:40:44 CST 2015
     */
    private String teamName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_team_football.TEAM_CITY
     *
     * @mbggenerated Mon Oct 12 20:40:44 CST 2015
     */
    private String teamCity;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_team_football.TEAM_CREATE_DATE
     *
     * @mbggenerated Mon Oct 12 20:40:44 CST 2015
     */
    private Date teamCreateDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_team_football.TEAM_CAPTAIN
     *
     * @mbggenerated Mon Oct 12 20:40:44 CST 2015
     */
    private Long teamCaptain;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_team_football.TEAM_POINTS
     *
     * @mbggenerated Mon Oct 12 20:40:44 CST 2015
     */
    private Long teamPoints;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_team_football.INPUT_NAME
     *
     * @mbggenerated Mon Oct 12 20:40:44 CST 2015
     */
    private String inputName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_team_football.INPUT_DATE
     *
     * @mbggenerated Mon Oct 12 20:40:44 CST 2015
     */
    private Date inputDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_team_football.UPDATE_NAME
     *
     * @mbggenerated Mon Oct 12 20:40:44 CST 2015
     */
    private String updateName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_team_football.UPDATE_DATE
     *
     * @mbggenerated Mon Oct 12 20:40:44 CST 2015
     */
    private Date updateDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_team_football.DELSIGN
     *
     * @mbggenerated Mon Oct 12 20:40:44 CST 2015
     */
    private Short delsign;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_team_football.TID
     *
     * @return the value of t_team_football.TID
     *
     * @mbggenerated Mon Oct 12 20:40:44 CST 2015
     */
    public Long getTid() {
        return tid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_team_football.TID
     *
     * @param tid the value for t_team_football.TID
     *
     * @mbggenerated Mon Oct 12 20:40:44 CST 2015
     */
    public void setTid(Long tid) {
        this.tid = tid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_team_football.TEAM_NAME
     *
     * @return the value of t_team_football.TEAM_NAME
     *
     * @mbggenerated Mon Oct 12 20:40:44 CST 2015
     */
    public String getTeamName() {
        return teamName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_team_football.TEAM_NAME
     *
     * @param teamName the value for t_team_football.TEAM_NAME
     *
     * @mbggenerated Mon Oct 12 20:40:44 CST 2015
     */
    public void setTeamName(String teamName) {
        this.teamName = teamName == null ? null : teamName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_team_football.TEAM_CITY
     *
     * @return the value of t_team_football.TEAM_CITY
     *
     * @mbggenerated Mon Oct 12 20:40:44 CST 2015
     */
    public String getTeamCity() {
        return teamCity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_team_football.TEAM_CITY
     *
     * @param teamCity the value for t_team_football.TEAM_CITY
     *
     * @mbggenerated Mon Oct 12 20:40:44 CST 2015
     */
    public void setTeamCity(String teamCity) {
        this.teamCity = teamCity == null ? null : teamCity.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_team_football.TEAM_CREATE_DATE
     *
     * @return the value of t_team_football.TEAM_CREATE_DATE
     *
     * @mbggenerated Mon Oct 12 20:40:44 CST 2015
     */
    public Date getTeamCreateDate() {
        return teamCreateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_team_football.TEAM_CREATE_DATE
     *
     * @param teamCreateDate the value for t_team_football.TEAM_CREATE_DATE
     *
     * @mbggenerated Mon Oct 12 20:40:44 CST 2015
     */
    public void setTeamCreateDate(Date teamCreateDate) {
        this.teamCreateDate = teamCreateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_team_football.TEAM_CAPTAIN
     *
     * @return the value of t_team_football.TEAM_CAPTAIN
     *
     * @mbggenerated Mon Oct 12 20:40:44 CST 2015
     */
    public Long getTeamCaptain() {
        return teamCaptain;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_team_football.TEAM_CAPTAIN
     *
     * @param teamCaptain the value for t_team_football.TEAM_CAPTAIN
     *
     * @mbggenerated Mon Oct 12 20:40:44 CST 2015
     */
    public void setTeamCaptain(Long teamCaptain) {
        this.teamCaptain = teamCaptain;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_team_football.TEAM_POINTS
     *
     * @return the value of t_team_football.TEAM_POINTS
     *
     * @mbggenerated Mon Oct 12 20:40:44 CST 2015
     */
    public Long getTeamPoints() {
        return teamPoints;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_team_football.TEAM_POINTS
     *
     * @param teamPoints the value for t_team_football.TEAM_POINTS
     *
     * @mbggenerated Mon Oct 12 20:40:44 CST 2015
     */
    public void setTeamPoints(Long teamPoints) {
        this.teamPoints = teamPoints;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_team_football.INPUT_NAME
     *
     * @return the value of t_team_football.INPUT_NAME
     *
     * @mbggenerated Mon Oct 12 20:40:44 CST 2015
     */
    public String getInputName() {
        return inputName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_team_football.INPUT_NAME
     *
     * @param inputName the value for t_team_football.INPUT_NAME
     *
     * @mbggenerated Mon Oct 12 20:40:44 CST 2015
     */
    public void setInputName(String inputName) {
        this.inputName = inputName == null ? null : inputName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_team_football.INPUT_DATE
     *
     * @return the value of t_team_football.INPUT_DATE
     *
     * @mbggenerated Mon Oct 12 20:40:44 CST 2015
     */
    public Date getInputDate() {
        return inputDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_team_football.INPUT_DATE
     *
     * @param inputDate the value for t_team_football.INPUT_DATE
     *
     * @mbggenerated Mon Oct 12 20:40:44 CST 2015
     */
    public void setInputDate(Date inputDate) {
        this.inputDate = inputDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_team_football.UPDATE_NAME
     *
     * @return the value of t_team_football.UPDATE_NAME
     *
     * @mbggenerated Mon Oct 12 20:40:44 CST 2015
     */
    public String getUpdateName() {
        return updateName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_team_football.UPDATE_NAME
     *
     * @param updateName the value for t_team_football.UPDATE_NAME
     *
     * @mbggenerated Mon Oct 12 20:40:44 CST 2015
     */
    public void setUpdateName(String updateName) {
        this.updateName = updateName == null ? null : updateName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_team_football.UPDATE_DATE
     *
     * @return the value of t_team_football.UPDATE_DATE
     *
     * @mbggenerated Mon Oct 12 20:40:44 CST 2015
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_team_football.UPDATE_DATE
     *
     * @param updateDate the value for t_team_football.UPDATE_DATE
     *
     * @mbggenerated Mon Oct 12 20:40:44 CST 2015
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_team_football.DELSIGN
     *
     * @return the value of t_team_football.DELSIGN
     *
     * @mbggenerated Mon Oct 12 20:40:44 CST 2015
     */
    public Short getDelsign() {
        return delsign;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_team_football.DELSIGN
     *
     * @param delsign the value for t_team_football.DELSIGN
     *
     * @mbggenerated Mon Oct 12 20:40:44 CST 2015
     */
    public void setDelsign(Short delsign) {
        this.delsign = delsign;
    }
}