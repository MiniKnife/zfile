package im.zhaojun.zfile.model.support;

import im.zhaojun.zfile.model.support.Jvm;
import im.zhaojun.zfile.model.support.Mem;
import im.zhaojun.zfile.model.support.Sys;
import lombok.Data;

import java.io.Serializable;

/**
 * @author zhaojun
 */
@Data
public class SystemMonitorInfo implements Serializable {

    /**
     * 服务器基本信息
     */
    private Sys sys;

    /**
     * JVM 信息
     */
    private Jvm jvm;

    /**
     * 系统内存
     */
    private Mem mem;

    public SystemMonitorInfo() {
        this.jvm = new Jvm();
        this.sys = new Sys();
        this.mem = new Mem();
    }

}
