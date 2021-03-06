package nl.finan.jbehave.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="JBEHAVE_LOG_SCENARIO")
public class ScenarioLog  extends Log{

    @ManyToOne
    @JoinColumn
    @JsonBackReference
    private StoryLog storyLog;

    @ManyToOne
    @JoinColumn
    private Scenario scenario;

    @OneToMany(mappedBy = "scenarioLog")
    @LazyCollection(LazyCollectionOption.FALSE)
    private List<StepLog> stepLogs;

    public Scenario getScenario() {
        return scenario;
    }

    public void setScenario(Scenario scenario) {
        this.scenario = scenario;
    }

    public List<StepLog> getStepLogs() {
        return stepLogs;
    }

    public void setStepLogs(List<StepLog> stepLogs) {
        this.stepLogs = stepLogs;
    }

    public StoryLog getStoryLog() {
        return storyLog;
    }

    public void setStoryLog(StoryLog storyLog) {
        this.storyLog = storyLog;
    }
}
