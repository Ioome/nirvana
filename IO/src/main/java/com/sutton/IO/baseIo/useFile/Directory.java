package com.sutton.IO.baseIo.useFile;

import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description:
 * @author: Mr.wang.sutton
 * @create: 2022-10-23 16:23
 **/
public final class Directory {


    /**
     * 传递正则表达式
     *
     * @param dir
     * @param regex
     * @return
     */
    public static File[] local(File dir, final String regex) {
        return dir.listFiles(new FilenameFilter() {

            /**
             * 表达式
             */
            Pattern pattern = Pattern.compile(regex);

            /**
             * 回调接口
             * @param dir    the directory in which the file was found.
             * @param name   the name of the file.
             * @return
             */
            @Override
            public boolean accept(File dir, String name) {
                //校验文件目录名称是否与表达式相同
                return pattern.matcher(new File(name).getName()).matches();
            }
        });
    }

    /**
     * 方法封装
     *
     * @param path
     * @param regex
     * @return
     */
    public static File[] local(String path, final String regex) {
        return local(new File(path), regex);
    }


    /**
     * 静态内部类
     */
    public static class TreeInfo implements Iterable<File> {

        /**
         * 文件集合
         */
        public List<File> files = new ArrayList<>();

        /**
         * 目录集合
         */
        public List<File> dirs = new ArrayList<>();


        /**
         * @return 文件的迭代器
         */
        @Override
        public Iterator<File> iterator() {
            return files.iterator();
        }

        void addAll(TreeInfo treeInfo) {
            files.addAll(treeInfo.files);
            files.addAll(treeInfo.dirs);
        }

        public String toString() {
            return dirs.toString() + " files" + files.toString();
        }


    }


    public static TreeInfo walk(String start, String regex) {
        return recurseDirs(new File(start), regex);
    }

    public static TreeInfo walk(File start, String regex) {
        return recurseDirs(start, regex);
    }

    public static TreeInfo walk(File start) {
        return recurseDirs(start, "*");
    }

    static TreeInfo recurseDirs(File startDir, String regex) {
        TreeInfo result = new TreeInfo();
        for (File item : startDir.listFiles()) {
            if (item.isDirectory()) {
                result.dirs.add(item);
                result.addAll(recurseDirs(item, regex));
            } else {
                if (item.getName().matches(regex)) {
                    result.files.add(item);
                }
            }
        }
        return result;
    }


    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println(walk(new File(".")));
        } else {
            for (String arg : args) {
                System.out.println(walk(new File(arg)));
            }
        }
    }
}
