package lt.mt.core.spring;

import lt.mt.annotation.LtMapperScan;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

import java.util.Map;

/**
 * @Description TOTO
 * Author lutao
 * Date 2022/6/22 4:28 下午
 * Version 1.0
 **/
public class LtMapperImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {

    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {

        Map<String, Object> annotationAttributes = importingClassMetadata.getAnnotationAttributes(LtMapperScan.class.getName());
        String path = (String) annotationAttributes.get("value");

        LtMapperBeanDefinitionScanner ltBeanDefinitionScanner = new LtMapperBeanDefinitionScanner(registry);
        ltBeanDefinitionScanner.scan(path);

    }
}
