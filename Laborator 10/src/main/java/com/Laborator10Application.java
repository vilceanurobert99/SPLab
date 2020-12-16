package com;

import com.components.ClientComponent;
import com.components.SingletonComponent;
import com.components.TransientComponent;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Laborator10Application {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(Laborator10Application.class, args);
        TransientComponent transientBean = applicationContext.getBean(TransientComponent.class);
        transientBean.operation();
        transientBean = applicationContext.getBean(TransientComponent.class);
        transientBean.operation();

        SingletonComponent singletonBean = applicationContext.getBean(SingletonComponent.class);
        singletonBean.operation();
        singletonBean = applicationContext.getBean(SingletonComponent.class);
        singletonBean.operation();
        ClientComponent c = applicationContext.getBean(ClientComponent.class);

        c.operation();
        c = (ClientComponent)applicationContext.getBean("clientComponent");
        c.operation();

    }

}
