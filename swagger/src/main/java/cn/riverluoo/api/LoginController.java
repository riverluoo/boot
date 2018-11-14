package cn.riverluoo.api;

import cn.riverluoo.model.param.LoginParam;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @author wangyang
 * @projectName springboot
 * @description:
 * @sence 2018/10/24 8:24 PM
 */


public class LoginController {

    private static final Logger logger = LoggerFactory.getLogger(LoginController.class);

    @ApiOperation(value = "登陆接口")
    public Object login(@ApiParam(value = "登陆参数")
                        @RequestBody LoginParam loginParam){

        logger.info("登陆");
        return "ok";

    }



}
