package com.javayh.mem.guard.configuration.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Data;

/**
 * <p>
 * 自定义配置类
 * </p>
 *
 * @author hai ji
 * @version 1.0.0
 * @since 2024-01-23
 */
@Data
@ConfigurationProperties(prefix = "mem.guard")
public class MemGuardProperties {

    public MemGuardProperties() {
        this.enabled = true;
        this.locations = "classpath:db/migration";
        this.table = "mem_guard_schema_history";
        this.baselineOnMigrate = true;
        this.cleanDisabled = true;
    }

    /**
     * 是否开启
     */
    private boolean enabled;

    /**
     * 是否在迁移时进行基线迁移
     */
    private boolean baselineOnMigrate;

    /**
     * 禁用数据库清理操作
     */
    private boolean cleanDisabled;

    /**
     * 需要迁移的位置，默认{classpath:db/migration}
     */
    private String locations;

    /**
     * 迁移记录的表名
     */
    private String table;

}
