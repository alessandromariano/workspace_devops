package com.siriuslog.businesspartner.api.controller;

import com.siriuslog.commons.utils.dto.UserDTO;
import com.siriuslog.commons.utils.exception.AuthJWTException;
import com.siriuslog.commons.utils.handler.AuthJWTHandler;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.Date;

@Slf4j
@RestController
public class TesteController {

    AuthJWTHandler authJWTHandler = new AuthJWTHandler();

    @GetMapping("/ping")
    public ResponseEntity<String> ping(@RequestHeader("Authorization") String token) throws AuthJWTException {


        UserDTO userDTO = authJWTHandler.decodeSoftToken(token);

        log.info(userDTO.getName());

        System.out.println(new Date());
        System.out.println(new Date().toInstant().atOffset(ZoneOffset.UTC));
        System.out.println(OffsetDateTime.now());
        
        return ResponseEntity.ok("Ping OK");
    }
}
