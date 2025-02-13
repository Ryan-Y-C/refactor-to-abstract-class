package com.github.hcsp.polymorphism;

public class 清炒菜心 extends 菜 {
//    public void 做个清炒菜心() {
//        System.out.println("洗炒锅");
//        System.out.println("倒一点点油");
//        System.out.println("放青菜");
//        System.out.println("炒啊炒啊炒");
//        System.out.println("放酱油");
//        System.out.println("放盐");
//        System.out.println("香喷喷的清炒菜心出锅啦");
//    }

    @Override
    public void 洗锅() {
        super.洗锅("炒");
    }

    @Override
    public void 倒油() {
        super.倒油("一点点");
    }

    @Override
    public void 开始烹饪() {
        System.out.println("放青菜");
        System.out.println("炒啊炒啊炒");

    }

    @Override
    public void 放佐料() {
        System.out.println("放酱油");
        super.放佐料();
    }

    @Override
    public void 出锅() {
        super.出锅("清炒菜心");
    }
}
