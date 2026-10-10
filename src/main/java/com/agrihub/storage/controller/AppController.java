package com.agrihub.storage.controller;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @GetMapping(value = {"/", "/index.html"}, produces = MediaType.TEXT_HTML_VALUE)
    public ResponseEntity<String> index() {
        String html = """
                <!doctype html>
                <html lang=\"en\">
                <head>
                    <meta charset=\"UTF-8\" />
                    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />
                    <title>Cold Storage Logistics</title>
                </head>
                <body style=\"font-family: Arial, sans-serif; margin: 3rem; color: #0f172a;\">
                    <h1>Cold Storage Logistics</h1>
                    <p>The backend is running correctly.</p>
                    <p>Use the frontend app for the UI, or call the API endpoints under /api.</p>
                </body>
                </html>
                """;

        return ResponseEntity.ok(html);
    }
}
