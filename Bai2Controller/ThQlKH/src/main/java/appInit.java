import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class appInit extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{appConfig.class};
    }
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{};
    }
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}