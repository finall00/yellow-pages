package com.fatec.yellowpages.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;


@RestController
@RequestMapping("/v1/home")
@Tag(name = "Home", description = "The endpoint retorne the home")
public class HomeController {


    @Operation(summary = "Home",
        responses = {
            @ApiResponse(description = "Hello", responseCode = "200", content = @Content(
                    mediaType = MediaType.APPLICATION_JSON_VALUE,
                    schema = @Schema(implementation = String.class)
            ))
        }
    )

    @GetMapping
    public ResponseEntity<Map<String, String>>  home() {

        Map<String, String> response = Map.of(
                "message", "Ola",
                "status", "ta rodando pai"
        );

        return ResponseEntity.ok(response);
    }
}
