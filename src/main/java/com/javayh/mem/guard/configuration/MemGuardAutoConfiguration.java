package com.javayh.mem.guard.configuration;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * <p>
 * 自动化配置
 * </p>
 *
 * @author hai ji
 * @version 1.0.0
 * @since 2024-01-23
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
@Configuration
@Import({FlywayCustomizerAutoConfiguration.class})
public @interface MemGuardAutoConfiguration {
}
