package ie.atu.y3_lab4_part3_notifserv;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotificationController {
    @PostMapping("/confirm-notification")
    @ResponseStatus(HttpStatus.CREATED)
    public String registrationRequest(@RequestBody UserDetails userDetails){
        String notification = String.format("User %s (%s) has been successfully registered.",
                userDetails.getName(), userDetails.getEmail());
        return notification;
    }
}