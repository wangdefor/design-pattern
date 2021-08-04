package build;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wangyong
 * @Classname Product
 * @Description 产品类
 * @Date 2021/8/4 9:44
 */
@Slf4j
public class Product {

    /**
     * 部件
     */
    List<String> parts = new ArrayList<String>();


    /**
     * 增加部件
     *
     * @param part 部件
     */
    public void add(String part){
        parts.add(part);
    }

    public void show(){
        log.info("产品创建");
        parts.forEach(part -> {
            log.info(part);
        });
    }


}
