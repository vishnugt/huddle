package in.huddleapp.Huddle.Repository;

import in.huddleapp.Huddle.Models.DatabaseModels.MajorEventType;
import in.huddleapp.Huddle.Models.DatabaseModels.MinorEventType;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MinorEventTypeRepository extends CrudRepository<MinorEventType, Integer>
{
    List<MinorEventType> findByMajorEventType(MajorEventType majorEventType);
}
