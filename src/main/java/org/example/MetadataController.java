package org.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MetadataController {

    @GetMapping("/metadata")
    public String getMetadata(@RequestParam String url1) {
        return url1;
    }
}

