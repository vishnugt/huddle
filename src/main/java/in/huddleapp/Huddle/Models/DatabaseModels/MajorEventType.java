package in.huddleapp.Huddle.Models.DatabaseModels;

import javax.persistence.*;
import java.util.List;

@Entity
public class MajorEventType {

    public MajorEventType(String name) {
        this.name = name;
    }

    public MajorEventType() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer majorEventTypeId;

    private String name;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL,mappedBy = "majorEventType")
    private List<MinorEventType> minorEventTypeList;

    public Integer getMajorEventTypeId() {
        return majorEventTypeId;
    }

    public void setId(Integer majorEventTypeId) {
        this.majorEventTypeId = majorEventTypeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<MinorEventType> getMinorEventTypeList()
    {
        return minorEventTypeList;
    }
}