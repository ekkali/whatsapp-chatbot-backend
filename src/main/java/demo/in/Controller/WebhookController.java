package demo.in.Controller;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import demo.in.Model.IncomingMessage;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/webhook")
public class WebhookController {

    // Initialize the logger to meet the "Log all incoming messages" requirement
    private static final Logger logger = LoggerFactory.getLogger(WebhookController.class);

   

    @PostMapping
    public ResponseEntity<Map<String, String>> receiveMessage(@RequestBody IncomingMessage message) {
        // 1. Log the incoming message (Mandatory Requirement)
        logger.info("Received message from {}: {}", message.getSender(), message.getText());

        // 2. Determine the predefined reply
        String replyText = generateReply(message.getText());

        // 3. Construct the JSON response
        Map<String, String> response = new HashMap<>();
        response.put("reply", replyText);

        return ResponseEntity.ok(response);
        
    }
    

    private String generateReply(String incomingText) {
        if (incomingText == null) {
            return "I didn't catch that.";
        }
        
        // Convert to lowercase to handle "Hi", "HI", "hi", etc.
        switch (incomingText.trim().toLowerCase()) {
            case "hi":
                return "Hello";
            case "bye":
                return "Goodbye";
            default:
                return "I only understand 'Hi' and 'Bye' right now.";
        }
    


    }
    
    
    
    
    }
