package in.huddleapp.Huddle.Repository;

import in.huddleapp.Huddle.Models.DatabaseModels.MajorEventType;
import in.huddleapp.Huddle.Models.DatabaseModels.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MajorEventTypeRepository extends CrudRepository<MajorEventType, Integer>
{
}
