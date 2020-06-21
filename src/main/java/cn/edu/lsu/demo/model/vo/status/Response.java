package cn.edu.lsu.demo.model.vo.status;

import cn.edu.lsu.demo.model.vo.status.impl.Ok;
import cn.edu.lsu.demo.utils.ReflectsUtils;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class Response<T> {

    private Meta meta;

    private T data;

    public static <T>Response<T> success() {
        return pack(Ok.class, null);
    }

    public static <T>Response<T> success(T data) {
        return pack(Ok.class, data);
    }


    public static <T>Response<T> pack(Class<? extends Status> clazz) {
        return pack(clazz, null);
    }

    public static <T>Response<T> pack(Class<? extends Status> clazz, T data) {
        Status status = ReflectsUtils.newInstance(clazz);
        return pack(status.getCode(), status.getIntroduce(), data);
    }

    private static <T>Response<T> pack(Integer code, String msg, T data) {
        Response<T> response = new Response<>();
        response.setMeta(new Meta(code, msg));
        response.setData(data);
        return response;
    }

    @Data
    @AllArgsConstructor
    public static class Meta {
        private Integer code;
        private String msg;
    }
}
