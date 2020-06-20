package cn.edu.lsu.demo.utils;

public final class ReflectsUtils {

    private ReflectsUtils() {}

    public static <T> T newInstance(Class<T> clazz) {
        try {
            return clazz.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            throw new RuntimeException("Status实现类生成失败", e);
        }
    }
}
