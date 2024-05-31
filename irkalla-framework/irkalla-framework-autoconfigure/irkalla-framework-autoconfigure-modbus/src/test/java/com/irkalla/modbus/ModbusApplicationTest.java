package com.irkalla.modbus;

import com.irkalla.framework.modbus.ModbusTemplate;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author fanscat
 * @createTime 2024/5/29 16:19
 */
@Slf4j
@SpringBootApplication
public class ModbusApplicationTest {
    public static void main(String[] args) throws Exception {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(ModbusApplicationTest.class, args);
        applicationContext.getBean(ModbusTemplate.class).subscribeItem(ModbusTest.CLIENT_NAME, ModbusTest.SLAVE_ID, ModbusTest.START_OFFSET, ModbusTest.NUMBER_OF_REGISTERS);
    }
}
