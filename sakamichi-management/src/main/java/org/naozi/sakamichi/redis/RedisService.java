package org.naozi.sakamichi.redis;

import org.naozi.sakamichi.dao.domain.ResultBean;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class RedisService {

    @Resource
    private RedisTemplate<String, String> redisTemplate;

    public ResultBean set(String key, String value){
        if(key == null || key.equals("")){
            return ResultBean.failed("key cannot be null or empty");
        }
        try {
            this.redisTemplate.opsForValue().set(key,value);
            return ResultBean.success("set success");
        } catch (Exception e){
            e.printStackTrace();
            return ResultBean.failed("set failed");
        }
    }

    public ResultBean get(String key){
        if(key == null || key.equals("")){
            return ResultBean.failed("key cannot be null or empty");
        }
        try {
            if(!this.redisTemplate.hasKey(key)){
                return ResultBean.none("have no value with key:" + key);
            }
            else{
                Object value = this.redisTemplate.opsForValue().get(key);
                return ResultBean.success("get success", value);
            }
        } catch (Exception e){
            e.printStackTrace();
            return ResultBean.failed("get failed");
        }
    }

    public ResultBean delete(String key){
        if(key == null || key.equals("")){
            return ResultBean.failed("key cannot be null or empty");
        }
        try{
            if(!this.redisTemplate.hasKey(key)){
                return ResultBean.none("have no value with key:" + key);
            }
            else{
                this.redisTemplate.delete(key);
                return ResultBean.success("delete success");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return ResultBean.failed("delete failed");
        }
    }
}
