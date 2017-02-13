package coder.lib.common.redis;

import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.validation.Valid;

/**
 * Created by Pelin on 17/2/13.
 */
@Data
@Component
public class RedisSettings {

    @Valid
    @NotBlank
    @Value("${redis.host:127.0.0.1}")
    private String host;

    @Valid
    @NotEmpty
    @Value("${redis.port:6379}")
    private Integer port;

    @Valid
    @NotEmpty
    @Value("${redis.max.active:256}")
    private Integer maxActive;

    @Valid
    @NotEmpty
    @Value("${redis.time.out:2000}")
    private Integer timeOut;

    @Valid
    @NotBlank
    @Value("${redis.password:123456}")
    private String password;
}
