package lt.mt.annotation;

import lt.mt.core.spring.LtMapperImportBeanDefinitionRegistrar;
import org.springframework.context.annotation.Import;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Import(LtMapperImportBeanDefinitionRegistrar.class)
public @interface LtMapperScan {


    String value();
}
