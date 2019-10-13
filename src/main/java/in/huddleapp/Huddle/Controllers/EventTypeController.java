package in.huddleapp.Huddle.Controllers;

import in.huddleapp.Huddle.Models.DatabaseModels.MajorEventType;
import in.huddleapp.Huddle.Models.DatabaseModels.MinorEventType;
import in.huddleapp.Huddle.Models.DatabaseModels.User;
import in.huddleapp.Huddle.Repository.MajorEventTypeRepository;
import in.huddleapp.Huddle.Repository.MinorEventTypeRepository;
import in.huddleapp.Huddle.Repository.UserRepository;
import in.huddleapp.Huddle.Utility.UrlConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(UrlConstants.EVENT_TYPE_BASE_URL)
public class EventTypeController {
    @Autowired
    private MajorEventTypeRepository majorEventTypeRepository;
    @Autowired
    private MinorEventTypeRepository minorEventTypeRepository;

    @PostMapping(path = UrlConstants.MAJOR_ADD)
    public @ResponseBody
    Boolean addNewMajorType(@RequestParam String name) {
        MajorEventType majorEventType = new MajorEventType(name);
        majorEventTypeRepository.save(majorEventType);
        return true;
    }

    @GetMapping(path = UrlConstants.MAJOR_ALL)
    public @ResponseBody
    Iterable<MajorEventType> getAllMajorEntityTypes() {
        return majorEventTypeRepository.findAll();
    }

    @PostMapping(path = UrlConstants.MINOR_ADD)
    public @ResponseBody
    Boolean addNewMinorType(@RequestParam Integer majorTypeId, @RequestParam String name) {
        Optional<MajorEventType> majorEventType = majorEventTypeRepository.findById(majorTypeId);

        if (majorEventType == null) {
            throw new InternalError("Major event id not found");
        }

        MinorEventType minorEventType = new MinorEventType(name, majorEventType.get());
        minorEventTypeRepository.save(minorEventType);
        return true;
    }

    @GetMapping(path = UrlConstants.MINOR_ALL)
    public @ResponseBody
    Iterable<MinorEventType> getAllMajorEntityTypes(@RequestParam Integer majorTypeId) {
        Optional<MajorEventType> majorEventType = majorEventTypeRepository.findById(majorTypeId);

        if (majorEventType == null) {
            throw new InternalError("Major event id not found");
        }

        return minorEventTypeRepository.findByMajorEventType(majorEventType.get());
    }
}
