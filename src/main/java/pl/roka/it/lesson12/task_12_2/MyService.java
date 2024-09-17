package pl.roka.it.lesson12.task_12_2;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

/**
 * Класс MyService должен иметь переменные c private модификаторами, конструктор по умолчанию,
 * get и set методы, переопределенные методы equals и hashcode, а так же private метод
 * (private thisClassInfo), который будет просто печатать данные о самом классе
 * (данные любые на ваш выбор), в котором он определен.
 */
@Version(versionOfMyService = 0.1, codeName = "alfa")
public class MyService {
    private double versionOfMyService;
    private String codeName;

    public double getVersionOfMyService() {
        return versionOfMyService;
    }

    public void setVersionOfMyService(double versionOfMyService) {
        this.versionOfMyService = versionOfMyService;
    }

    public String getCodeName() {
        return codeName;
    }

    public void setCodeName(String codeName) {
        this.codeName = codeName;
    }

    private void thisClassInfo() {
        System.out.println("versionOfMyService = " + versionOfMyService);
        System.out.println("codeName = " +  codeName);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyService myService = (MyService) o;
        return Double.compare(versionOfMyService, myService.versionOfMyService) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(versionOfMyService);
    }
    List<String> k = new LinkedList<>();


}
