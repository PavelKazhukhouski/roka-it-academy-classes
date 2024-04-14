package pl.roka.it.lesson12.task_12_2;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Придумать и написать собственную аннотацию @Version, которая бует хранить информацию о версии
 * класса сервиса (поле обязательное) MyService и кодовое название версии (поле не обязательное) -
 * (например номер версии = 7.1, а кодовое название версии = Nougat).
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Version {
    double versionOfMyService();
    String codeName();

}
