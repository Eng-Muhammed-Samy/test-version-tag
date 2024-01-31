package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.info.BuildProperties;
import org.springframework.stereotype.Component;

@Component
public class VersionInfo {

    @Autowired
    public VersionInfo(BuildProperties buildProperties) {
        System.out.println("Version: " + buildProperties.getVersion());
        System.out.println("Build Time: " + buildProperties.getTime());
    }
}
