package aop.example.argument;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@ComponentScan
@EnableAspectJAutoProxy
public class ArgumentAdviceApplication {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ArgumentAdviceApplication.class);
        ClusterManager clusterManager = context.getBean(ClusterManager.class);
        clusterManager.setClusterSize(13);
        clusterManager.setClusterSize(7);
        clusterManager.setClusterSize(21);
    }
}
