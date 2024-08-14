package pl.roka.it.postprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.logging.Logger;

public class LoggingCreationBeanPostProcessor implements BeanPostProcessor {
    public static final Logger LOGGER = Logger.getLogger(LoggingCreationBeanPostProcessor.class.getName());

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (bean.getClass().isAnnotationPresent(LoggingCreation.class)) {
            printFieldValues(bean);
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (bean.getClass().isAnnotationPresent(LoggingCreation.class)) {
            printFieldValues(bean);
        }
        return bean;
    }

    private void printFieldValues(Object bean) {
        Field[] fields = bean.getClass().getDeclaredFields();

        for (Field field : fields) {
            try {
                field.setAccessible(true);
                Object value = field.get(bean);
                LOGGER.info("Field: " + field.getName() + " Value: " + value);
            } catch (IllegalAccessException e) {
                LOGGER.severe("Failed to access field " + field.getName() + ": " + e.getMessage());
            }
        }
    }
}