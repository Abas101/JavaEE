package sabakikvidze.task4.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@Configuration
public class SwaggerConfig {

    private static final String SWAGGER_API_VERSION = "1.0";
    private static final String LICENSE_TEXT = "Saba Kikvidze";
    private static final String title = "Java quiz 4";
    private static final String description = "Movie REST API";

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder().version(SWAGGER_API_VERSION).license(LICENSE_TEXT).title(title).description(description).build();
    }

    @Bean
    public Docket movieApi() {
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo()).pathMapping("/").select().paths(PathSelectors.regex("/api.*")).build();
    }
}
