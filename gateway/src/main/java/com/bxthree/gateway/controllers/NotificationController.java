package com.bxthree.gateway.controllers;

import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class NotificationController {

    private final StreamBridge streamBridge;

    public NotificationController(StreamBridge streamBridge) {
        this.streamBridge = streamBridge;
    }

    @PostMapping("/notification")
    public ResponseEntity<String> postNotification(@RequestParam String message) {
        streamBridge.send("notification-topic", message);
        return ResponseEntity.ok(message);
    }
}
