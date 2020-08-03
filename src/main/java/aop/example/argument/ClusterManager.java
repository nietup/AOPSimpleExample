package aop.example.argument;

import org.springframework.stereotype.Component;

@Component
public class ClusterManager {
    private Integer clusterSize;

    public Integer getClusterSize() {
        return clusterSize;
    }

    public void setClusterSize(Integer clusterSize) {
        this.clusterSize = clusterSize;
    }
}
