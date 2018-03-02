package org.cord4handai.circlemikke.model;

import java.io.Serializable;
import java.util.List;



/**
 * Created by ryosuke on 2018/03/02.
 */

public class Circle  implements Serializable{

    private String activityContent;
    private List<String> actionDates;
    private List<String> populationScale;
    private List<String> ganle;
    private String place;

    public String getActivityContent() {
        return activityContent;
    }

    public List<String> getActionDates() {
        return actionDates;
    }

    public List<String> getPopulationScale() {
        return populationScale;
    }

    public List<String> getGanle() {
        return ganle;
    }

    public String getPlace() {
        return place;
    }

    public void setActivityContent(String activityContent) {
        this.activityContent = activityContent;
    }

    public void setActionDates(List<String> actionDates) {
        this.actionDates = actionDates;
    }

    public void setPopulationScale(List<String> populationScale) {
        this.populationScale = populationScale;
    }

    public void setGanle(List<String> ganle) {
        this.ganle = ganle;
    }

    public void setPlace(String place) {
        this.place = place;
    }
}
