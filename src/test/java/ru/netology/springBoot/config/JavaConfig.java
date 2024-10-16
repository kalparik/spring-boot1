package ru.netology.springBoot.config;

import org.springframework.context.annotation.Bean;
import ru.netology.springBoot.profile.DevProfile;
import ru.netology.springBoot.profile.ProductionProfile;
import ru.netology.springBoot.profile.SystemProfile;

public class JavaConfig {

    @Bean
    public SystemProfile devProfile() {
        return new DevProfile();
    }

    @Bean
    public SystemProfile prodProfile() {
        return new ProductionProfile();
    }
}
