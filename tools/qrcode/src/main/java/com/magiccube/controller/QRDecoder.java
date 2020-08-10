package com.magiccube.controller;

import com.magiccube.qrcode.QRCodeUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author zhangbro
 */
@RestController
@RequestMapping("/")
@Api(value = "Controller")
public class QRDecoder {
    @ApiImplicitParams({@ApiImplicitParam()})
    @RequestMapping(value = "decode", method = RequestMethod.POST)
    public String filesUpload(@RequestParam("file") MultipartFile file) {
        // 判断文件是否为空
        if (!file.isEmpty()) {
            String result = "";
            try {
                result = QRCodeUtil.decode(file.getInputStream());
                return result;
            } catch (Exception e) {
                e.printStackTrace();
                return e.getMessage();
            }
        } else {
            return "空文件";
        }
    }
    
    @RequestMapping("ger")
    public String ger() {
        try {
            QRCodeUtil.encode("I LOVE YOU", "code/test");
        } catch (Exception e) {
            return e.getMessage();
        }
        return "OK";
    }
    
}
