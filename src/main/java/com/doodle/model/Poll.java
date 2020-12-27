package com.doodle.model;

import com.doodle.enums.*;

import java.util.List;

public class Poll {

    String id;

    String adminKey;

    Long latestChange;

    Long initiated;

    Integer participantsCount;

    Integer inviteesCount;

    Type type;

    boolean hidden;

    PreferencesType preferencesType;

    State state;

    String locale;

    String title;

    String description;

    User initiator;

    List<Option> options;

    String optionsHash;

    List<Participant> participants;

    List<User> invitees;

    Device device;

    Levels levels;

    Location location;

    boolean multiDay;

    Integer columnConstraint;

    boolean dateText;

    boolean timeZone;

    Integer rowConstraint;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAdminKey() {
        return adminKey;
    }

    public void setAdminKey(String adminKey) {
        this.adminKey = adminKey;
    }

    public Long getLatestChange() {
        return latestChange;
    }

    public void setLatestChange(Long latestChange) {
        this.latestChange = latestChange;
    }

    public Long getInitiated() {
        return initiated;
    }

    public void setInitiated(Long initiated) {
        this.initiated = initiated;
    }

    public Integer getParticipantsCount() {
        return participantsCount;
    }

    public void setParticipantsCount(Integer participantsCount) {
        this.participantsCount = participantsCount;
    }

    public Integer getInviteesCount() {
        return inviteesCount;
    }

    public void setInviteesCount(Integer inviteesCount) {
        this.inviteesCount = inviteesCount;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Boolean getHidden() {
        return hidden;
    }

    public void setHidden(Boolean hidden) {
        this.hidden = hidden;
    }

    public PreferencesType getPreferencesType() {
        return preferencesType;
    }

    public void setPreferencesType(PreferencesType preferencesType) {
        this.preferencesType = preferencesType;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public User getInitiator() {
        return initiator;
    }

    public void setInitiator(User initiator) {
        this.initiator = initiator;
    }

    public List<Option> getOptions() {
        return options;
    }

    public void setOptions(List<Option> options) {
        this.options = options;
    }

    public String getOptionsHash() {
        return optionsHash;
    }

    public void setOptionsHash(String optionsHash) {
        this.optionsHash = optionsHash;
    }

    public List<Participant> getParticipants() {
        return participants;
    }

    public void setParticipants(List<Participant> participants) {
        this.participants = participants;
    }

    public List<User> getInvitees() {
        return invitees;
    }

    public void setInvitees(List<User> invitees) {
        this.invitees = invitees;
    }

    public Device getDevice() {
        return device;
    }

    public void setDevice(Device device) {
        this.device = device;
    }

    public Levels getLevels() {
        return levels;
    }

    public void setLevels(Levels levels) {
        this.levels = levels;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public boolean isHidden() {
        return hidden;
    }

    public void setHidden(boolean hidden) {
        this.hidden = hidden;
    }

    public boolean isMultiDay() {
        return multiDay;
    }

    public void setMultiDay(boolean multiDay) {
        this.multiDay = multiDay;
    }

    public Integer getColumnConstraint() {
        return columnConstraint;
    }

    public void setColumnConstraint(Integer columnConstraint) {
        this.columnConstraint = columnConstraint;
    }

    public boolean isDateText() {
        return dateText;
    }

    public void setDateText(boolean dateText) {
        this.dateText = dateText;
    }

    public boolean getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(boolean timeZone) {
        this.timeZone = timeZone;
    }

    public boolean isTimeZone() {
        return timeZone;
    }

    public Integer getRowConstraint() {
        return rowConstraint;
    }

    public void setRowConstraint(Integer rowConstraint) {
        this.rowConstraint = rowConstraint;
    }
}
