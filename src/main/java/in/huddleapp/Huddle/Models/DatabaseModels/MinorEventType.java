package in.huddleapp.Huddle.Models.DatabaseModels;

import javax.persistence.*;
import java.util.Optional;

@Entity
public class MinorEventType {
    public MinorEventType(String name, MajorEventType majorEventType)
    {
        this.name = name;
        this.majorEventType = majorEventType;
    }

    public MinorEventType()
    {
    }

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer minorEventTypeId;

    private String name;

    @ManyToOne
    @JoinColumn(name = "majorEventTypeId")
    private MajorEventType majorEventType;

    public Integer getMinorEventTypeId() {
        return minorEventTypeId;
    }

    public void setMinorEventTypeId(Integer minorEventTypeId) {
        this.minorEventTypeId = minorEventTypeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MajorEventType getMajorEventType()
    {
        return majorEventType;
    }

    public void SetMajorEventType(MajorEventType majorEventType)
    {
        this.majorEventType = majorEventType;
    }
}