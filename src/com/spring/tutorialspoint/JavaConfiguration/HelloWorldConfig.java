package com.spring.tutorialspoint.JavaConfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorldConfig {
    @Bean
    public HelloWorld helloWorld(){
        return new HelloWorld();
    }
    /*Equivalent definition on xml based configuration
    <beans>
        <bean id = "helloWorld" class = "com.tutorialspoint.HelloWorld" />
     </beans>
     */
}