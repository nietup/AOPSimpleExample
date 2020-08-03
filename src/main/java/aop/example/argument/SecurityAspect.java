package aop.example.argument;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class SecurityAspect {
    private Integer securitySpace = 0;

    @Pointcut("execution(* aop.example.argument.ClusterManager.setClusterSize(Integer))" +
            "&& args(clusterSize)")
    public void clusterSizeChange(Integer clusterSize) {}

    @Before("clusterSizeChange(clusterSize)")
    public void adjustSecuritySpace(Integer clusterSize) {
        if (securitySpace < clusterSize) {
            securitySpace = clusterSize;
            System.out.println("Increasing security space to " + securitySpace);
        }
        else
            System.out.println("Security space is big enough, ignoring...");
    }
}
