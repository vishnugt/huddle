package in.huddleapp.Huddle.Repository;

import in.huddleapp.Huddle.Models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Integer>
{

}
