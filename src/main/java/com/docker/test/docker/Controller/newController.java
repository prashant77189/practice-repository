package com.docker.test.docker.Controller;

import com.docker.test.docker.Entity.UserPreferences;
import com.docker.test.docker.repository.UserPreferencesRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class newController {

    private final RestTemplate restTemplate;

    @Autowired
    UserPreferencesRepository userPreferencesRepository;

    @GetMapping("/api")
    public ResponseEntity<?> getNEwmAppjing() {
        try {
            List<String> newList = List.of("ndgkwsb", "hgj");
            return ResponseEntity.status(HttpStatus.OK).body(newList);
        } catch (Exception ex) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(ex.getMessage());
        }
    }

    @GetMapping(value = "/api/prices")
    public ResponseEntity<Object> getNewPrices() {
        ResponseEntity<Object> response = null;
        try {

            String url = UriComponentsBuilder.fromHttpUrl("https://b2c-iot-vehicles-be-stage-7moo3c5kdq-el.a.run.app/api/v1/eps/customer" + "/region-prices/" + "NO1")
                    .queryParam("offset", "UTC").build().toString();

            response = restTemplate.exchange(url, HttpMethod.GET, null, Object.class);

            return response;
        } catch (Exception ex) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(ex.getMessage());
        }
    }

    @GetMapping("api/bucket/{caseId}")
    public ResponseEntity<Object> getBYRunSerial(@PathVariable Integer caseId) {
        List<UserPreferences> userPreferences = userPreferencesRepository.findAllByCaseId(caseId);
        return ResponseEntity.status(HttpStatus.OK).body(userPreferences);

    }

}
