package com.javayh.mem.guard.configuration;

import org.flywaydb.core.Flyway;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.flyway.FlywayConfigurationCustomizer;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.javayh.mem.guard.configuration.properties.MemGuardProperties;

/**
 * @author haiji
 */
@Configuration
@ConditionalOnClass(Flyway.class)
@EnableConfigurationProperties(MemGuardProperties.class)
public class FlywayCustomizerAutoConfiguration {

    /**
     * 自定义自定义配置
     *
     * @param properties {@link MemGuardProperties} 配置类
     * @return {@link FlywayConfigurationCustomizer} 自定义配置实现
     */
    @Bean
    public FlywayConfigurationCustomizer flyway(final MemGuardProperties properties) {
        return configuration -> configuration.table(properties.getTable())
            .locations(properties.getLocations())
            .baselineOnMigrate(properties.isBaselineOnMigrate())
            .cleanDisabled(properties.isCleanDisabled());
    }
}
