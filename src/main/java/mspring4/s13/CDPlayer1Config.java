package mspring4.s13;

import mspring4.s11.SgtPeppersConfig;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan
@Import(SgtPeppersConfig.class)
public class CDPlayer1Config {
}
