import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/events")
public class EventController {
    @Autowired
    private EventService eventService;

    @PostMapping("/create")
    public CollegeEvent createEvent(@RequestBody Event event) {
        return eventService.createEvent(event);
    }

    @GetMapping("/list")
    public ListEvent<Event> getAllEvents() {
        return eventService.getAllEvents();
    }
}
