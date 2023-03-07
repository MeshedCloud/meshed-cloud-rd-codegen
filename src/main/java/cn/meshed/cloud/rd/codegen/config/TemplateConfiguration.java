package cn.meshed.cloud.rd.codegen.config;

import cn.meshed.cloud.rd.codegen.factory.TemplateFactory;
import freemarker.cache.ClassTemplateLoader;
import freemarker.template.Configuration;
import org.springframework.context.annotation.Bean;

/**
 * <h1></h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
public class TemplateConfiguration {

    @Bean
    public Configuration configuration(){
        Configuration configuration = new Configuration(Configuration.DEFAULT_INCOMPATIBLE_IMPROVEMENTS);
        configuration.setDefaultEncoding("UTF-8");
        configuration.setTemplateLoader(new ClassTemplateLoader(TemplateConfiguration.class,"/templates/"));
        return configuration;
    }

    @Bean
    public TemplateFactory templateFactory(){
        return new TemplateFactory();
    }

}
